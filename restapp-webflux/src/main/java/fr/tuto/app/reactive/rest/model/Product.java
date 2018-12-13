package fr.tuto.app.reactive.rest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Product {

    private Integer id;
    private String name;
    private String ref;


}
