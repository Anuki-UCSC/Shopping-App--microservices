package com.anukiscode.userservice.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    private ObjectId id;
    @Indexed(unique = true)
    private String username;
    private String name;
    private String email;
    private Role role;
    private String password;
    private Date createdDate = new Date();


    public enum Role{
        Admin, Customer
    }

}
