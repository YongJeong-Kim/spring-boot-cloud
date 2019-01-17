package com.kyj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/search")
public class SearchRestController {
  @GetMapping("get")
  public String get() {
    return "search get";
  }
}
