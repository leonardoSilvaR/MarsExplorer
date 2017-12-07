package com.br.inpe.marsexplorer.service;

import com.br.inpe.marsexplorer.control.RotationLeft;
import com.br.inpe.marsexplorer.control.RotationRight;
import com.br.inpe.marsexplorer.model.Kepler186F;
import com.br.inpe.marsexplorer.validator.RequestValidator;
import java.io.Serializable;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 07/12/2017
 * @version 1.0
 */
@Service
public class ExplorerService implements Serializable {
    
    public Kepler186F getExploration(String command) {
        Kepler186F kp = new Kepler186F();
        if (RequestValidator.validator(command)) {
            kp.initialLocation();

            for (Character c : command.toCharArray()) {
                switch (c) {
                    case 'R':
                        kp.changeCardinal(RotationRight.rotation(kp.getCardinal()));
                        break;
                    case 'L':
                        kp.changeCardinal(RotationLeft.rotation(kp.getCardinal()));
                        break;
                    case 'M':
                        kp.move(1);
                        break;
                }
            }
            
            if(kp.getCoordinates().getX() > 5 || kp.getCoordinates().getY() > 5){
                throw new ArithmeticException("Maior que 5 / 5");
            }
        } else {
            throw new IllegalArgumentException();
        }
        return kp;

    }
}
