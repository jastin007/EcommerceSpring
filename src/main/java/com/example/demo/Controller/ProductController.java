package com.example.demo.Controller;

import com.example.demo.Services.IProductService;
import com.example.demo.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

       private final IProductService productService;

       public ProductController(IProductService productService) {
        this.productService = productService;
       }
       @GetMapping("/{id}")
       public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id)throws Exception{
               ProductDTO result = this.productService.getProductById(id);
               return ResponseEntity.ok(result);
       }
}
