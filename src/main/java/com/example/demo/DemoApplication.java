package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.v2.CreateContractV2;

@RestController
@SpringBootApplication
public class DemoApplication {

  @Autowired
  ConversionService conversionService;

  public static void main(final String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @PostMapping(value = "/")
  public CreateContractV2 bla(@RequestBody final CreateContract action) {
    return conversionService.convert(action, CreateContractV2.class);
  }

}
