package com.kyj.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyj.InitComponent;

@RestController
public class RestHomeController {
  @Autowired
  private InitComponent initComponent;
  
  @GetMapping("/get")
  public String get() {
    return initComponent.getFirst();
  }
}
