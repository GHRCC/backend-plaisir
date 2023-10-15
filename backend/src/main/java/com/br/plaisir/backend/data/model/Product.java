//isso é um ORM, que vai representar um objeto que vai ser salvo no banco de dados
package com.br.plaisir.backend.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "product")

public class Product {
    @Id
    private Integer id; //integer é um tipo primitivo que significa número inteiro. Java é uma linguagem fortemente tipada, então tem vários tipos
    private String name;
    private String price;
    private String details;
    private String color;
}
