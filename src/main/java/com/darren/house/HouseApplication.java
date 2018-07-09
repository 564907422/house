package com.darren.house;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONWriter;
import com.darren.house.dao.AnjukeRepository;
import com.darren.house.domain.Anjuke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootApplication
public class HouseApplication implements CommandLineRunner {

    @Autowired
    private CustomerRepository repository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private AnjukeRepository anjukeRepository;

    public static void main(String[] args) {
        SpringApplication.run(HouseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        repository.deleteAll();
//
//        // save a couple of customers
//        repository.save(new Customer("Alice", "Smith"));
//        repository.save(new Customer("Bob", "Smith"));
//        mongoTemplate.insert(new Customer("肖中渠","Smith"));
//
//        // fetch all customers
//        System.out.println("Customers found with findAll():");
//        System.out.println("-------------------------------");
//        for (Customer customer : repository.findAll()) {
//            System.out.println(customer);
//        }
//        System.out.println();
//
//        // fetch an individual customer
//        System.out.println("Customer found with findByFirstName('Alice'):");
//        System.out.println("--------------------------------");
//        System.out.println(repository.findByFirstName("Alice"));
//
//        System.out.println("Customers found with findByLastName('Smith'):");
//        System.out.println("--------------------------------");
//        for (Customer customer : repository.findByLastName("Smith")) {
//            System.out.println(customer);
//        }

        List<Anjuke> list = anjukeRepository.findAll();
        list.forEach(a -> System.out.println(JSON.toJSONString(a)));

    }
}
