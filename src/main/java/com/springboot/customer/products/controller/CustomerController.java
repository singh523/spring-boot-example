package com.springboot.customer.products.controller;

import com.springboot.customer.products.model.Products;
import javax.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CustomerController {

  @RequestMapping("/products/{id}")
  public Products getCustomerProducts(@PathVariable @NotNull String id){

    log.info("Customer Products for {}", id);
    return Products.builder().id(id).code("code").name("name").price("100").build();


  }


}
