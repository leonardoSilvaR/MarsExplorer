package com.br.inpe.marsexplorer.enumerator;

import java.io.Serializable;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 */
public interface Exploration<T> extends Serializable {

    T initialLocation();

    T move(int move);
    
    T changeCardinal(CardinalPoint cardinalPoint);

}
