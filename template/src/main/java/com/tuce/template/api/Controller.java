package com.tuce.template.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

  @GetMapping("/get/it/{id}")
  public ResponseEntity<?> getIt(
      @PathVariable(value = "id", required = false) String id,
      @RequestHeader(value = "Authorization", required = false) String authorization) {

    return ResponseEntity.status(HttpStatus.OK).body("OK");
  }

  @PostMapping("/get/it/{id}")
  public ResponseEntity<?> postIt(
      @PathVariable(value = "id", required = false) String id,
      @RequestHeader(value = "Authorization", required = false) String authorization,
      @RequestBody(required = false) String name) {

    return ResponseEntity.status(HttpStatus.OK).body("OK " + id + " " + name);
  }
}
