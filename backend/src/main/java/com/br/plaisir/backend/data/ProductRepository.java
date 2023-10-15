package com.br.plaisir.backend.data;

import com.br.plaisir.backend.data.model.Product;
import com.br.plaisir.backend.web.model.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
