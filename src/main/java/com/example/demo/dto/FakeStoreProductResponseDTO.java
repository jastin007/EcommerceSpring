package com.example.demo.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreProductResponseDTO {
    private ProductDTO product;
    private String message;
    private String status;
}






