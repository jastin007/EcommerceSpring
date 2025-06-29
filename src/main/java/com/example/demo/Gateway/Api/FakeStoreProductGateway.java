package com.example.demo.Gateway.Api;

import com.example.demo.dto.FakeStoreProductResponseDTO;
import com.example.demo.dto.ProductDTO;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.http.Path;

import java.io.IOException;
@Component
public class FakeStoreProductGateway implements IProductGateway{
    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi fakeStoreProductApi) {
        this.fakeStoreProductApi = fakeStoreProductApi;
    }

    @Override
    public ProductDTO getProductById(Long id) throws Exception {
       FakeStoreProductResponseDTO response = this.fakeStoreProductApi.getFakeProduct(id).execute().body();
       if(response==null){
           throw new Exception("Product not found");
       }
       return response.getProduct();
    }
}
