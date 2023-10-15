package com.br.plaisir.backend.web.controller;

import com.br.plaisir.backend.service.ProductService;
import com.br.plaisir.backend.web.model.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product") //Product API
public class ProductController {
    @Autowired
    ProductService productService; //injetando dentro do controller a dependência.a partir desse momento, consigo ler os métodos que estão edentro de serviço

    @GetMapping("getProduct") //Endpoit
    private ProductDTO getProduct() {
        return productService.getProduct();
    }

    @PostMapping("createProduct")//Endpoint
    private void createProduct(ProductDTO productDTO){
        productService.createProduct(productDTO);
    }
}


