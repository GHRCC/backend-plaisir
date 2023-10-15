//DTO é data transfer object, vou passar isso para o banco
package com.br.plaisir.backend.web.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class ProductDTO {
    private String name;
    private String price;
    private String details;
    private String color;


    //código autogerado por control + enter. Nesse caso, escolhi a opção control + enter e getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
