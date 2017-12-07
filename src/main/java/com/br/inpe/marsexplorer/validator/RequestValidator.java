package com.br.inpe.marsexplorer.validator;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 07/12/2017
 * @version 1.0
 */
public class RequestValidator {

    private static final String R = "R";
    private static final String L = "L";
    private static final String M = "M";

    public static Boolean validator(String req) {
        return (req != null && !req.isEmpty() && (req.contains(M) || req.contains(R) || req.contains(L)));
    }

}
