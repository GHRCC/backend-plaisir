package com.br.plaisir.backend.service;

import com.br.plaisir.backend.data.ProductRepository;
import com.br.plaisir.backend.data.model.Product;
import com.br.plaisir.backend.web.model.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductDTO getProduct(){ //passando a responsabilidade para a camada de serviço de retornar o produto
        ProductDTO celular = new ProductDTO(); //instanciando/criar um produto
        celular.setName("iphone");
        celular.setDetails("x");
        celular.setColor("prata");
        celular.setPrice("10");
        return celular;
    }

    public void createProduct(ProductDTO productDTO) {
        Product celular = new Product();
        celular.setColor(productDTO.getColor());
        celular.setDetails(productDTO.getName());
        celular.setPrice(productDTO.getPrice());
        celular.setName(productDTO.getName());
        productRepository.save(celular);

    }
}
