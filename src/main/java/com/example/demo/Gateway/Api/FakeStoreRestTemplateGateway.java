package com.example.demo.Gateway.Api;

import com.example.demo.Mappers.GetAllCategoriesMapper;
import com.example.demo.dto.CategoryDTO;
import com.example.demo.dto.FakeStoreCategoryResponseDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@Component

public class FakeStoreRestTemplateGateway implements ICategoryGateway{
    private final RestTemplateBuilder restTemplateBuilder;

    public FakeStoreRestTemplateGateway(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        RestTemplate restTemplate = restTemplateBuilder.build();
        String url = "https://fakestoreapi.in/api/products/category";

        ResponseEntity<FakeStoreCategoryResponseDTO> response =
                restTemplate.getForEntity(url, FakeStoreCategoryResponseDTO.class);

        if(response.getBody() ==null){
            throw new IOException("failed to fetch categories from fakeStore api");
        }
//        return response.getBody().getCategories().stream().map(category -> CategoryDTO.builder().name(category)
//                .build()).toList();
        return GetAllCategoriesMapper.toCategoryDto(response.getBody());
    }
}
