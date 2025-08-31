package com.example.ecommerce.Inventory_Tracking.mapper;

import com.example.ecommerce.Inventory_Tracking.dto.ProductDto;
import com.example.ecommerce.Inventory_Tracking.entity.Product;
import com.example.ecommerce.Inventory_Tracking.repository.ProductRepository;

public class ProductMapper {
    public static ProductDto mapToProductDto(Product product){
        return new ProductDto(product.getBrand(), product.getStyleId(), product.getArticle(), product.getGender(), product.getSize(), product.getStockQty(), product.getReorderLvl(), product.getCategory());
    }

    public static Product mapToProduct(ProductDto productDto){
        return new Product(productDto.getBrand(), productDto.getStyleId(), productDto.getArticle(), productDto.getGender(), productDto.getSize(), 0.0,productDto.getStockQty(), productDto.getReorderLvl(),productDto.getCategory());
    }

}
