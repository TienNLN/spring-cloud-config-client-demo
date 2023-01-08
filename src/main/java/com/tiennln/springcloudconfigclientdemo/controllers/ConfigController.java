package com.tiennln.springcloudconfigclientdemo.controllers;

import com.tiennln.springcloudconfigclientdemo.configs.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TienNLN on 08/01/2023
 */
@RestController
@RequestMapping("/configs")
public class ConfigController {

    @Autowired
    AppConfig appConfig;

    @GetMapping(value = "/databaseName", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getDatabaseUsername() {
        String databaseUsername = appConfig.getDatabaseUsername();
        return String.format("This is database username : " + databaseUsername);
    }
}
