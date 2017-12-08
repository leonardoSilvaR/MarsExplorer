package com.br.inpe.marsexplorer.validator;

/**
 * This class defines validations used in application
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 07/12/2017
 * @version 1.0
 */
public class Validator {

    private static final String R = "R";
    private static final String L = "L";
    private static final String M = "M";

    /**
     * Validates request param
     *
     * @param req request param
     * @return true if is valid
     */
    public static Boolean validator(String req) {
        return (req != null && !req.isEmpty() && (req.contains(M) || req.contains(R) || req.contains(L)));
    }

}
