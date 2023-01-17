package com.anukiscode.orderservice.item.repo;

import com.anukiscode.orderservice.item.entity.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepo extends MongoRepository<Item,String> {

}
