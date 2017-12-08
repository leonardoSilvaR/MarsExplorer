package com.br.inpe.marsexplorer.resource;

import com.br.inpe.marsexplorer.model.Kepler186F;
import com.br.inpe.marsexplorer.service.impl.Kepler186FServiceImpl;
import com.br.inpe.marsexplorer.validator.Validator;
import javax.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class exposes exploration features
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 07/12/2017
 * @version 1.0
 */
@RestController
@RequestMapping("/api")
public class ExplorerResource {

    @Autowired
    private Kepler186FServiceImpl service;

    /**
     * Return the final destiny of robot explorer
     *
     * @param command some command based at M, L e R
     * @return coordinates and cardinal point
     */
    @RequestMapping(value = "/explore/{command}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity finalDestiny(@PathVariable("command") String command) {
        if (service.getExploration(command) != null) {
            return new ResponseEntity(service.getExploration(command), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST);
    }

}
