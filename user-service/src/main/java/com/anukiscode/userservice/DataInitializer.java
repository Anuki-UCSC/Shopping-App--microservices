//package com.anukiscode.userservice;
//
//import com.anukiscode.userservice.user.entity.User;
//import com.anukiscode.userservice.user.repo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DataInitializer {
//
//    @Autowired
//    private UserRepo userRepo;
//
//    @Bean
//    public CommandLineRunner getCommandLineRunner(){
//        return args -> {
//            User admin = new User();
//            admin.setName("Admin");
//            admin.setUsername("admin");
//            admin.setRole(User.Role.Admin);
//            admin.setEmail("admin@gamil.com");
//            admin.setPassword("1234");
//            userRepo.save(admin);
//        };
//    }
//}
