package com.example.demo.Gateway.Api;

import com.example.demo.dto.CategoryDTO;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component

public class FakeStoreRestTemplateGateway implements ICategoryGateway{
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return List.of();
    }
}
