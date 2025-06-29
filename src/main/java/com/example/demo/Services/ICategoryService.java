package com.example.demo.Services;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.dto.ProductDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> getAllCategories() throws IOException;

}
