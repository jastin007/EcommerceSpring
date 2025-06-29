package com.example.demo.Controller;

import com.example.demo.Services.FakestoreCategoryServices;
import com.example.demo.Services.ICategoryService;
import com.example.demo.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    private final ICategoryService categoryServices;

    CategoryController(ICategoryService categoryServices){
        this.categoryServices = categoryServices;
    }
    @PostMapping
    public String getPostCategory(){
        return "Post Electronics";
    }
    @GetMapping("/count")
    public int getCategoryCount(){
         return 7;
    }
    @GetMapping
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryServices.getAllCategories();
    }

}
