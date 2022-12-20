package com.maoptech.productservice.repository;

import com.maoptech.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRespository extends MongoRepository<Product, String> {
}
