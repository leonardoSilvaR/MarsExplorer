package com.br.inpe.marsexplorer.control;

import com.br.inpe.marsexplorer.enumerator.CardinalPoint;

/**
 * Defines rotation based at its own axis
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 07/12/2017
 * @version 1.0
 */
public class RotationLeft {

    /**
     * Rotates to left on it owns axis
     *
     * @param cardinalPoint the current cardinal point
     * @return new cardinal point
     */
    public static CardinalPoint rotation(CardinalPoint cardinalPoint) {
        switch (cardinalPoint) {
            case N:
                cardinalPoint = CardinalPoint.W;
                break;
            case W:
                cardinalPoint = CardinalPoint.S;
                break;
            case S:
                cardinalPoint = CardinalPoint.E;
                break;
            case E:
                cardinalPoint = CardinalPoint.N;
                break;
        }

        return cardinalPoint;
    }

}
