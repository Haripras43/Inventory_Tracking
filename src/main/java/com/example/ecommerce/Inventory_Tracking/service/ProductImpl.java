package com.example.ecommerce.Inventory_Tracking.service;

import com.example.ecommerce.Inventory_Tracking.dto.ProductDto;
import com.example.ecommerce.Inventory_Tracking.entity.Product;
import com.example.ecommerce.Inventory_Tracking.mapper.ProductMapper;
import com.example.ecommerce.Inventory_Tracking.repository.ProductRepository;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductImpl implements ProductService {

    private final ProductRepository productRepository;

public ProductImpl(ProductRepository productRepository){
    this.productRepository = productRepository;
}

    @Override
    public ProductDto createProduct(ProductDto productDto){
    Product product = ProductMapper.mapToProduct(productDto);
    Product createProd = productRepository.save(product);
        return ProductMapper.mapToProductDto(createProd);
    }

    @Override
    public List<ProductDto> getAllProducts() {
    List<Product> getAllProd = productRepository.findAll();
        return getAllProd.stream().map(product->ProductMapper.mapToProductDto(product)).collect(Collectors.toList());
    }

    @Override
    public ProductDto getProductById(Long styleId) {
    Product product = productRepository.findById(styleId).orElseThrow(()-> new ConfigDataResourceNotFoundException("Product not available in this styleId "+styleId));
        return ProductMapper.mapToProductDto(product);
    }

    @Override
    public ProductDto updateProduct(Long styleId, ProductDto productDto) {
    Product existingProd = productRepository.findById(styleId).orElseThrow(()->new ConfigDataResourceNotFoundException());
    existingProd.setArticle(productDto.getArticle());
    existingProd.setBrand(productDto.getBrand());
    existingProd.setStyleId(productDto.getStyleId());
    existingProd.setGender(productDto.getGender());
    existingProd.setSize(productDto.getSize());
    existingProd.setReorderLvl(productDto.getReorderLvl());
    existingProd.setStockQty(productDto.getStockQty());
    existingProd.setCategory(productDto.getCategory());
    Product updatedProd = productRepository.save(existingProd);
    return ProductMapper.mapToProductDto(updatedProd);
    }


}
