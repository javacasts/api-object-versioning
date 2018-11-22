package com.example.demo.v1;

import com.example.demo.CreateContract;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonTypeName(CreateContractV1.VERSION)
public class CreateContractV1 implements CreateContract {

  public static final String VERSION = "1";

  private String customer;
  private String contract;

}
