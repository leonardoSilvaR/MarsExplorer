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

    private Kepler186F kp;

    /**
     * Return exploration journey of Kepler robot
     *
     * @param command some command
     * @return new Kepler's location
     */
    @Override
    public Boolean getExploration(String command) {
        kp = new Kepler186F();
        kp.initialLocation();
        for (Character c : command.toCharArray()) {
            switch (c) {
                case 'R':
                    kp.setCardinal(RotationRight.rotation(kp.getCardinal()));
                    break;
                case 'L':
                    kp.setCardinal(RotationLeft.rotation(kp.getCardinal()));
                    break;
                case 'M':
                    kp.move();
                    break;
            }
        }
        return Validator.groundValidator(kp) && Validator.requestValidator(command);
    }

    public Kepler186F getKp() {
        return kp;
    }

}
