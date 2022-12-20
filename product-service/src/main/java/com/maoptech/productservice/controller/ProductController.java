package com.maoptech.productservice.controller;

import com.maoptech.productservice.dto.ProductRequest;
import com.maoptech.productservice.dto.ProductResponce;
import com.maoptech.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest)
    {
        productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponce> getAllProducts()
    {
        return productService.getAllProducts();
    }

}






















//@RestController
//@RequiredArgsConstructor
//@RequestMapping("api/product")
//public class ProductController {
//
//    private final ProductService productService;
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public void createProduct(@RequestBody ProductRequest productRequest)
//    {
//        productService.createProduct(productRequest);
//    }
//
//    @GetMapping
//    @ResponseStatus(HttpStatus.OK)
//    public List<ProductResponce> getAllProducts()
//    {
//        return productService.getAllProducts();
//    }

//
//}
