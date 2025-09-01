package com.example.ecommerce.Inventory_Tracking.controller;

import com.example.ecommerce.Inventory_Tracking.dto.ProductDto;
import com.example.ecommerce.Inventory_Tracking.entity.Product;
import com.example.ecommerce.Inventory_Tracking.service.ProductImpl;
import com.example.ecommerce.Inventory_Tracking.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    public ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

@PostMapping
    public ResponseEntity<ProductDto> createProduct (@RequestBody ProductDto productDto){
        ProductDto savedProduct = productService.createProduct(productDto);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
}
@GetMapping
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        List<ProductDto> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
}
@GetMapping
    public ResponseEntity<ProductDto> getProductByStyleId(@PathVariable Long styleId){
        ProductDto getProductByStyleID = productService.getProductById(styleId);
        return ResponseEntity.ok(getProductByStyleID);
}
}
