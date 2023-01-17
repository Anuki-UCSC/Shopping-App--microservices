package com.anukiscode.orderservice.item.service;

import com.anukiscode.orderservice.item.entity.Item;
import com.anukiscode.orderservice.item.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;

    public List<String> addItem(Item item){
        List<String> errors = new ArrayList<>();

        if(item.getName().isEmpty() || item.getStock()==0 || item.getSellingPrice()==0 || item.getUnitCost()==0){
            errors.add("Reqiured details are missing.");
        }
        item.setSoldCount(0);
        itemRepo.save(item);
        return errors;
    }
}
