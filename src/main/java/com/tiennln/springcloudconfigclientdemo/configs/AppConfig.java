package com.tiennln.springcloudconfigclientdemo.configs;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author TienNLN on 08/01/2023
 */
@Configuration
@Data
@RefreshScope
public class AppConfig {

    @Value("${database.username}")
    private String databaseUsername;
}
