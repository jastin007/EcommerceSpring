package com.example.demo.Gateway;

import com.example.demo.Gateway.Api.FakeStoreCategoryApi;
import com.example.demo.dto.CategoryDTO;
import com.example.demo.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway{

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi){
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }
    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        // Make the http request to the fakestore api to fetch all categories
        FakeStoreCategoryResponseDTO response = this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();
        if(response==null){
            throw new IOException("Failed to fetch categories from fakestore api");
        }
        return response.getCategories().stream().map(category -> CategoryDTO.builder().name(category)
                .build()).toList();
    }
}
