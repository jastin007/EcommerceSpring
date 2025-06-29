package com.example.demo.Gateway.Api;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {
    List<CategoryDTO> getAllCategories() throws IOException;

}
