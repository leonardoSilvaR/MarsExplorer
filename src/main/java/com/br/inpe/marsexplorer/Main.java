package com.br.inpe.marsexplorer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This class defines the initial point of application
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 06/12/2017
 * @version 1.0
 */
@SpringBootApplication
public class Main {

    /**
     * Spring boot starts application
     *
     * @param args some arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
