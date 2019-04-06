package com.phi.service.controller;

import java.sql.Connection;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


import org.springframework.web.bind.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@RestController
public class Controller {

    //private static final Logger logger = LogManager.getLogger();

    @RequestMapping(value = "/v1/user/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable("id") String id) {
        return id;
    }

    /*

    @RequestMapping(value = "'/v1/user/{id}/doc/all'", method = RequestMethod.GET)
    public String getDocAll(@PathVariable("id") String id) {
        return id;
    }


    @RequestMapping(value = "/v1/user/{id}/doc/{id}", method = RequestMethod.GET)
    public String getDocById(@PathVariable("id") String id) {
        return id;
    }


    @RequestMapping(value = "/v1/user/{id}/view/all", method = RequestMethod.GET)
    public String getViewAll(@PathVariable("id") String id) {
        return id;
    }

    @RequestMapping(value = "/v1/user/{id}/view/{id}", method = RequestMethod.GET)
    public String getViewById(@PathVariable("id") String id) {
        return id;
    }

    */

}
