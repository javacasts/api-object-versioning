package com.example.demo;

import com.example.demo.v1.CreateContractV1;
import com.example.demo.v2.CreateContractV2;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@version",
    defaultImpl = CreateContractV1.class)
@JsonSubTypes({@JsonSubTypes.Type(name = CreateContractV1.VERSION, value = CreateContractV1.class),
    @JsonSubTypes.Type(name = CreateContractV2.VERSION, value = CreateContractV2.class)})
@JsonNaming(PropertyNamingStrategy.KebabCaseStrategy.class)
public interface CreateContract {
}
