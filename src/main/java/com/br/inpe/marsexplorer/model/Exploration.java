package com.br.inpe.marsexplorer.model;

import java.io.Serializable;

/**
 * This interface defines exploration behavior to be implemented
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @param <T> some class
 */
public interface Exploration<T> extends Serializable {

    T initialLocation();

    T move(int move);

}
