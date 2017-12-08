package com.br.inpe.marsexplorer.service.impl;

import com.br.inpe.marsexplorer.control.RotationLeft;
import com.br.inpe.marsexplorer.control.RotationRight;
import com.br.inpe.marsexplorer.model.Kepler186F;
import com.br.inpe.marsexplorer.service.ExplorerService;
import com.br.inpe.marsexplorer.validator.Validator;
import org.springframework.stereotype.Service;

/**
 * Implementation of explorer interface
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 07/12/2017
 * @version 1.0
 */
@Service
public class Kepler186FServiceImpl implements ExplorerService<Kepler186F> {

    /**
     * Return exploration journey of Kepler robot
     *
     * @param command some command
     * @return new Kepler's location
     */
    @Override
    public Kepler186F getExploration(String command) {
        Kepler186F kp = new Kepler186F();
        kp.initialLocation();
        if (Validator.requestValidator(command)) {
            for (Character c : command.toCharArray()) {
                switch (c) {
                    case 'R':
                        kp.setCardinal(RotationRight.rotation(kp.getCardinal()));
                        break;
                    case 'L':
                        kp.setCardinal(RotationLeft.rotation(kp.getCardinal()));
                        break;
                    case 'M':
                        kp.move(1);
                        break;
                }
            }
            if (Validator.groundValidator(kp)) {
                return kp;
            }
        }
        return null;
    }

}
