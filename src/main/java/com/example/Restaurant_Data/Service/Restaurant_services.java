package com.example.Restaurant_Data.Service;

import com.example.Restaurant_Data.Model.Restaurant_model;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class Restaurant_services {

    private static List<Restaurant_model> model=new ArrayList<>();
    private static int id_=0;
    static{

        model.add(new Restaurant_model(++id_,"Mahalaxmi","kalyan","1234567890","Gulabjamun",20,4) );
        model.add(new Restaurant_model(++id_,"Gurudev","Titwala","9234567890","Dosa",200,2) );
        model.add(new Restaurant_model(++id_,"Taj","Mumbai","2234567890","Vada",150,5) );
        model.add(new Restaurant_model(++id_,"Patil","Kongaon","0234567890","Bhaji",10,3) );
        model.add(new Restaurant_model(++id_,"Deepak","Nashik","7234567890","Kaju kari",250,1) );
        model.add(new Restaurant_model(++id_,"SunInn","Pune","8234567890","Chikan Tikka",500,4) );

    }

   public List<Restaurant_model>all_data(){
        return model;
   }
   public Restaurant_model get_by_name(String name){

       Predicate<? super Restaurant_model> predicate= modell->modell.getRestaurant_name().equals(name);
       Restaurant_model modell=model.stream().filter(predicate).findFirst().get();
       return modell;


   }
    public Restaurant_model findby_rating(int rating){

        Predicate<? super Restaurant_model> predicate= modell->modell.getRating() ==rating;
        Restaurant_model modell=model.stream().filter(predicate).findFirst().get();
        return modell;


    }
    public void add_restaurant(Restaurant_model restaurant){

     model.add(restaurant);

    }

}
