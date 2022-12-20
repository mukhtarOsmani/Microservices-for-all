package com.maoptech.productservice.service;

import com.maoptech.productservice.dto.ProductRequest;
import com.maoptech.productservice.dto.ProductResponce;
import com.maoptech.productservice.model.Product;
import com.maoptech.productservice.repository.ProductRespository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRespository productRespository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .description(productRequest.getDescription())
                .build();
        productRespository.save(product);
        log.info("Product with id {} is successfully saved" + product.getId());

    }

    public List<ProductResponce> getAllProducts() {
        List<Product> products = productRespository.findAll();
        return products.stream().map(this:: mapToProductResponce).toList();
    }

    private ProductResponce mapToProductResponce(Product product) {

        return  ProductResponce.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription())
                .build();
    }
}









//
//
//@Service
//@RequiredArgsConstructor
//@Slf4j
//public class ProductService {
//
//    private final ProductRespository productRespository;
//    public void createProduct(ProductRequest productRequest) {
//        Product product = Product.builder()
//                .name(productRequest.getName())
//                .description(productRequest.getDescription())
//                .price(productRequest.getPrice()).build();
//
//        productRespository.save(product);
//        log.info("The product with {} is successfully saved" + product.getId());
//    }
//
//    public List<ProductResponce> getAllProducts() {
//
//        List<Product> products = productRespository.findAll();
//        return products.stream().map(this:: mapToProductResponce).toList();
//
//    }
//
//    private ProductResponce mapToProductResponce(Product product) {
//
//        return    ProductResponce.builder()
//                .id(product.getId())
//                .name(product.getName())
//                .description(product.getDescription())
//                .price(product.getPrice())
//                .build();
//    }
//}