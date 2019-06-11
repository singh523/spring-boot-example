package com.springboot.customer.products.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Products {

  private String id;

  private String name;

  private String code;

  private String price;

}
