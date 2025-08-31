package com.example.ecommerce.Inventory_Tracking.service;

import com.example.ecommerce.Inventory_Tracking.dto.ProductDto;
import com.example.ecommerce.Inventory_Tracking.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {


    ProductDto createProduct(ProductDto productDto);

    List<ProductDto> getAllProducts();

    ProductDto getProductById(Long styleId);

    ProductDto updateProduct(Long styleId, ProductDto productDto);

    void deleteProduct(Long styleId);

}
