package com.example.demo.Configuration;

import com.example.demo.Gateway.Api.FakeStoreCategoryApi;
import com.example.demo.Gateway.Api.FakeStoreProductApi;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {
    @Bean
    public Retrofit retrofit(){
        Dotenv dotenv = Dotenv.load(); // Load .env file
        String baseUrl = dotenv.get("API_URL");
          return new Retrofit.Builder()
//                  .baseUrl("https://fakestoreapi.in/api/").
        .baseUrl(baseUrl).
                  addConverterFactory(GsonConverterFactory.create()).build();

    }
    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit){
            return retrofit.create(FakeStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit){
        return retrofit.create(FakeStoreProductApi.class);
    }
}
