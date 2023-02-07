package com.todoapp.controller;

import com.todoapp.TaskConfigurationProperties;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class InfoController {
    private DataSourceProperties dataSourceProperties;
    private TaskConfigurationProperties myProp;

    @GetMapping("/info/url")
    String url() {
        return dataSourceProperties.getUrl();
    }

    @GetMapping("/info/prop")
    boolean myProp() {
        return myProp.isAllowMultipleTaskFromTemplate();
    }
}
