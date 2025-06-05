package com.tuce.template.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError{

  private String type = "";

  private int status;

  private String detail = "";

}
