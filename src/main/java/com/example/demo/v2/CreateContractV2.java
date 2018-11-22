package com.example.demo.v2;

import java.util.UUID;
import com.example.demo.CreateContract;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonTypeName(CreateContractV2.VERSION)
public class CreateContractV2 implements CreateContract {

  public static final String VERSION = "2";

  private UUID id;
  private String customer;
  private String contract;

}
