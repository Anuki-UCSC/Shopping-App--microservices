package com.anukiscode.orderservice.item.controller;

import com.anukiscode.orderservice.item.entity.Item;
import com.anukiscode.orderservice.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item/api")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/addItem")
    public ResponseEntity addItem(@RequestBody Item item){
        List<String> response = itemService.addItem(item);

        if(response.isEmpty()){
           return ResponseEntity.ok("Item add success.");
        }
        return ResponseEntity.unprocessableEntity().body(response);
    }
}
