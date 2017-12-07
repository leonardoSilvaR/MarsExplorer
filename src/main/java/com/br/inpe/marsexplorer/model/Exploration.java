package com.br.inpe.marsexplorer.model;

import com.br.inpe.marsexplorer.enumerator.CardinalPoint;
import java.io.Serializable;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @param <T>
 */
public interface Exploration<T> extends Serializable {

    T initialLocation();

    T move(int move);
    
    T changeCardinal(CardinalPoint cardinalPoint);

}
