package com.example.demo.Gateway.Api;

import com.example.demo.dto.ProductDTO;

public interface IProductGateway {
    ProductDTO getProductById(Long id) throws Exception;
}
