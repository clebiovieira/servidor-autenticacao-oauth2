/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.oauth.resources;

import br.com.oauth.builder.Resposta;
import br.com.oauth.builder.RespostaBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Diego NOTE
 */
@RestController
@RequestMapping(value = "home", produces = MediaType.APPLICATION_JSON_VALUE)
public class HomeRestController {
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Resposta<String>> getHome() {
        Resposta<String> resposta = RespostaBuilder.getBuilder()
                .setResultado("Está é a home e você esta logado").build();
        return new ResponseEntity<>(resposta, HttpStatus.OK);
    }
    
}
