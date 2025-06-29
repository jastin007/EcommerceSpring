package com.example.demo.Services;

//import org.springframework.stereotype.Component;
import com.example.demo.Gateway.Api.ICategoryGateway;
import com.example.demo.dto.CategoryDTO;
import com.example.demo.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakestoreCategoryServices implements ICategoryService {
    private final ICategoryGateway categoryGateway;

    FakestoreCategoryServices(ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }


}
