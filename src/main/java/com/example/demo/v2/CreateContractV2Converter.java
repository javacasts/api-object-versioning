package com.example.demo.v2;

import java.util.UUID;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.example.demo.v1.CreateContractV1;

@Component
public class CreateContractV2Converter implements Converter<CreateContractV1, CreateContractV2> {

  @Override
  public CreateContractV2 convert(final CreateContractV1 source) {
    return CreateContractV2.builder().contract(source.getContract()).customer(source.getCustomer())
        .id(UUID.randomUUID()).build();
  }

}
