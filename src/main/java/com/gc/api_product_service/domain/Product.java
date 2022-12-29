package com.gc.api_product_service.domain;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotBlank
    @Size(min = 0, max = 30)
    private String name;
    private  String description;

    @NotBlank
    private  Long categoryId;
}
