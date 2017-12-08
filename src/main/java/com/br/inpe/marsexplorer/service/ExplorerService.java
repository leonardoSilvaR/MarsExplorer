package com.br.inpe.marsexplorer.service;

import java.io.Serializable;

/**
 * This interface defines exploration behavior
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 */
public interface ExplorerService<T> extends Serializable {

    Boolean getExploration(String command);
}
