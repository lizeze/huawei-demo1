package com.example;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "test")
@RequestMapping("/t")
public class TestController {

    @GetMapping
    public String test() {

        return "Hello Docker World";
    }
}
