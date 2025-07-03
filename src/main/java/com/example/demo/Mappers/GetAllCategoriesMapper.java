package com.example.demo.Mappers;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.dto.FakeStoreCategoryResponseDTO;

import java.util.List;

public class GetAllCategoriesMapper {
//    public static FakeStoreCategoryResponseDTO toFakeStore

    public static List<CategoryDTO> toCategoryDto(FakeStoreCategoryResponseDTO dto){
        return dto.getCategories().stream().map(category ->CategoryDTO.builder()
                .name(category).build()).toList();
    }
}
