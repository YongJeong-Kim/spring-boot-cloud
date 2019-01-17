package com.kyj.rest;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyj.InitComponent;

@RestController
@RequestMapping("api/v1/book")
public class RestHomeController {
  @Autowired
  private InitComponent initComponent;
  
  @GetMapping(value="/get")
  public Map<String, Object> get() {
    return Stream.of(initComponent.getFirst()).collect(Collectors.toMap(m -> "name", m -> m));
  }
}
