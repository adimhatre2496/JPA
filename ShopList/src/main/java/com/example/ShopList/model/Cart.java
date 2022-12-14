package com.example.ShopList.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart
    {
        private String firstName,lastName;

        private List<Item> items;
    }
