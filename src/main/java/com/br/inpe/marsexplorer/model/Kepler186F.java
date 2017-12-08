package com.br.inpe.marsexplorer.model;

import com.br.inpe.marsexplorer.enumerator.CardinalPoint;

/**
 * This class defines the robot Kepler
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 06/12/2017
 * @version 1.0
 */
public class Kepler186F implements Exploration<Kepler186F> {

    private Coordinates coordinates;
    private CardinalPoint cardinal;

    /**
     * Set the initial location of robot
     *
     * @return
     */
    @Override
    public Kepler186F initialLocation() {
        this.coordinates = new Coordinates(0, 0);
        this.cardinal = CardinalPoint.N;
        return this;
    }

    /**
     * Move the robot based at coordinates and move quantity
     *
     * @param move quantity to move
     * @return new position
     */
    @Override
    public Kepler186F move(int move) {

        switch (cardinal) {
            case N:
                this.coordinates.setY(coordinates.getY() + determineMove(move));
                break;
            case S:
                this.coordinates.setY(coordinates.getY() + determineMove(move));
                break;
            case E:
                this.coordinates.setX(coordinates.getX() + determineMove(move));
                break;
            case W:
                this.coordinates.setX(coordinates.getX() + determineMove(move));
                break;
        }
        return this;
    }

    /**
     * Determine positive or negative value
     *
     * @param quantity quantity to move
     * @return move value to increment
     */
    private Integer determineMove(int quantity) {
        if (cardinal.equals(CardinalPoint.S) || cardinal.equals(CardinalPoint.W)) {
            if ((coordinates.getX() != 0 && coordinates.getY() != 0)) {
                quantity = quantity * (-1);
            }
        }
        return quantity;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public CardinalPoint getCardinal() {
        return cardinal;
    }

    public void setCardinal(CardinalPoint cardinal) {
        this.cardinal = cardinal;
    }

    @Override
    public String toString() {
        return "Kepler186F{" + "coordinates=" + coordinates + ", cardinal=" + cardinal + '}';
    }
}
