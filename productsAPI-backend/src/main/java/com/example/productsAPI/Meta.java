package com.example.productsAPI;

import java.util.Date;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Meta {
    private Date createdAt;
    private Date updatedAt;
    private String barcode;
    private String qrCode;

    // Getters and Setters
}

