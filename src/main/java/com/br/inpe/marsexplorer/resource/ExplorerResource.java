package com.br.inpe.marsexplorer.resource;

import com.br.inpe.marsexplorer.model.Kepler186F;
import com.br.inpe.marsexplorer.service.ExplorerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leonardo S. Rodrigues <leonardo.silva.rodrigues2@gmail.com>
 * @since 07/12/2017
 * @version 1.0
 */
@RestController
@RequestMapping("/api")
public class ExplorerResource {
    @Autowired
    ExplorerService service;

    @RequestMapping(value = "/explore/{command}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Kepler186F> finalDestiny(@PathVariable("command") String command) {
        return new ResponseEntity<>(service.getExploration(command), HttpStatus.OK);
    }

}
