package com.br.inpe.marsexplorer.model;

import com.br.inpe.marsexplorer.enumerator.CardinalPoint;
import com.br.inpe.marsexplorer.enumerator.Exploration;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 06/12/2017
 * @version 1.0
 */
public class Kepler186F implements Exploration<Kepler186F> {

    private Coordinates coordinates;
    private CardinalPoint cardinal;

    @Override
    public Kepler186F initialLocation() {
        this.coordinates = new Coordinates(0, 0);
        this.cardinal = CardinalPoint.N;
        return this;
    }

    @Override
    public Kepler186F move(int move) {

        switch (cardinal) {
            case N:
                this.coordinates.setY(coordinates.getY() + move);
                break;
            case S:
                this.coordinates.setY(coordinates.getY() + move);
                break;

            case E:
                this.coordinates.setX(coordinates.getX() + move);
                break;
            case W:
                this.coordinates.setX(coordinates.getX() + move);
                break;

        }
        return this;
    }

    @Override
    public Kepler186F changeCardinal(CardinalPoint cardinalPoint) {
        this.cardinal = cardinalPoint;
        return this;
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
