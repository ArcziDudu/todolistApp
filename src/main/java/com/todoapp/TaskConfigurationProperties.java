package com.todoapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("task")
@Data
public class TaskConfigurationProperties {
    private boolean allowMultipleTaskFromTemplate;
}
