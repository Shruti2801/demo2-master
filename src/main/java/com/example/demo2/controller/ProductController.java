package com.example.demo2.controller;

import com.example.demo2.model.Product;
import com.example.demo2.model.Student;
import com.example.demo2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/companyProduct")
public class ProductController {


        @Autowired
        private ProductRepository repository;

        @PostMapping
        public Product addProduct(@RequestBody Product product){
            return repository.save(product);

        }

        @GetMapping()
        public List<Product> getAllProduct(){
            return repository.findAll();
        }


    }
