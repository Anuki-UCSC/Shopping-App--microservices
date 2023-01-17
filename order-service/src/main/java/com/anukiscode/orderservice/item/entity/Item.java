package com.anukiscode.orderservice.item.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Item")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Item {
    @Id
    private ObjectId id;
    private String name;
    private String image;
    private int stock;
    private int soldCount;
    private Float sellingPrice;
    private Float unitCost;
}
