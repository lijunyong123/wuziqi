package com.service.lj2048.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-05-31T08:34:13.586Z")

@RestSchema(schemaId = "lj2048")
@RequestMapping(path = "/LJ2048", produces = MediaType.APPLICATION_JSON)
public class Lj2048Impl {

    @Autowired
    private Lj2048Delegate userLj2048Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userLj2048Delegate.helloworld(name);
    }

}
