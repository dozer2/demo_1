package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Result {
    String operation;
    String oneParam;
    String twoParam;
    String result;


}
