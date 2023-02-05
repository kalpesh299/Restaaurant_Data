package com.example.Restaurant_Data.Controller;

import com.example.Restaurant_Data.Model.Restaurant_model;
import com.example.Restaurant_Data.Service.Restaurant_services;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Restaurant")
public class Restaurant_controller {

    private final Restaurant_services restaurant_service;

    public Restaurant_controller(Restaurant_services restaurant_service) {
        this.restaurant_service = restaurant_service;
    }

    @PostMapping("/addrestaurant")
    public void addRestaurant(@RequestBody Restaurant_model restaurant){

        restaurant_service.add_restaurant(restaurant);

    }

    //http://localhost:8084/api/Restaurant/AllData
    @GetMapping("/AllData")
    public List<Restaurant_model> All_Restaurant_Data(){
        return restaurant_service.all_data();
    }

  //  http://localhost:8084/api/Restaurant/RestaurantByName/restaurant_name/Mahalaxmi
    @GetMapping("/RestaurantByName/restaurant_name/{restaurant_name}")
    public Restaurant_model get_restaurant(@PathVariable String restaurant_name){
        return restaurant_service.get_by_name(restaurant_name);
    }

    //http://localhost:8084/api/Restaurant/RestaurantByName/rating/2
    @GetMapping("RestaurantByName/rating/{rating}")
    public Restaurant_model mappedtodobody(@PathVariable int rating){
        return restaurant_service.findby_rating(rating);
    }




}
