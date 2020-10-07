package com.corp.labtest01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    int id; // ID
    String title; // 제품이름
    double price; // 제품가격
    int inventory; // 재고수량
}
