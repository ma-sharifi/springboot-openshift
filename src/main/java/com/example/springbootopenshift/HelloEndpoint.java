package com.example.springbootopenshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndpoint
{

  @GetMapping("/")
  public String dayHello(){
    return "HELLO "+System.currentTimeMillis();
  }
}
