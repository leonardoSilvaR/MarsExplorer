package com.br.inpe.marsexplorer.validator;

import com.br.inpe.marsexplorer.model.Kepler186F;

/**
 * This class defines validations used in application
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 07/12/2017
 * @version 1.0
 */
public class Validator {

    private static final String VALID_ARGUMENTS = "[MRL]+";
    private static final Integer MIN_SIZE = 0;
    private static final Integer MAX_SIZE = 5;

    /**
     * Validates request param
     *
     * @param req request param
     * @return true if is valid
     */
    public static Boolean requestValidator(String req) {
        return req.matches(VALID_ARGUMENTS);
    }

    /**
     * Validates ground size
     *
     * @param robot robot
     * @return true if is valid
     */
    public static Boolean groundValidator(Kepler186F robot) {
        return ((robot.getCoordinates().getX() >= MIN_SIZE && robot.getCoordinates().getX() <= MAX_SIZE)
                && (robot.getCoordinates().getY() >= MIN_SIZE && robot.getCoordinates().getY() <= MAX_SIZE));
    }

}
