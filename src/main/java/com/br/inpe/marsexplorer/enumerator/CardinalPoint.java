package com.br.inpe.marsexplorer.enumerator;

/**
 * This enum contains the cardinal points
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 */
public enum CardinalPoint {
    N, S, W, E;

    private CardinalPoint cardinal;

    public CardinalPoint getCardinal() {
        return cardinal;
    }

    public void setCardinal(CardinalPoint cardinal) {
        this.cardinal = cardinal;
    }

}
