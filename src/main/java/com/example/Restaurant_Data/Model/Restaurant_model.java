package com.example.Restaurant_Data.Model;

public class Restaurant_model {

   private Integer id;
   private String restaurant_name;
   private String restaurant_address;

   private String restaurant_number;
   private String restaurant_speciality;
   private Integer totalNo_of_staff;
   private Integer rating;

   public Restaurant_model(Integer id,String restaurant_name, String restaurant_address, String restaurant_number, String restaurant_speciality, Integer totalNo_of_staff, Integer rating) {
     this.id=id;
      this.restaurant_name = restaurant_name;
      this.restaurant_address = restaurant_address;
      this.restaurant_number = restaurant_number;
      this.restaurant_speciality = restaurant_speciality;
      this.totalNo_of_staff = totalNo_of_staff;
      this.rating = rating;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getRestaurant_name() {
      return restaurant_name;
   }

   public void setRestaurant_name(String restaurant_name) {
      this.restaurant_name = restaurant_name;
   }

   public String getRestaurant_address() {
      return restaurant_address;
   }

   public void setRestaurant_address(String restaurant_address) {
      this.restaurant_address = restaurant_address;
   }

   public String getRestaurant_number() {
      return restaurant_number;
   }

   public void setRestaurant_number(String restaurant_number) {
      this.restaurant_number = restaurant_number;
   }

   public String getRestaurant_speciality() {
      return restaurant_speciality;
   }

   public void setRestaurant_speciality(String restaurant_speciality) {
      this.restaurant_speciality = restaurant_speciality;
   }

   public Integer getTotalNo_of_staff() {
      return totalNo_of_staff;
   }

   public void setTotalNo_of_staff(Integer totalNo_of_staff) {
      this.totalNo_of_staff = totalNo_of_staff;
   }

   public Integer getRating() {
      return rating;
   }

   public void setRating(Integer rating) {
      this.rating = rating;
   }

   @Override
   public String toString() {

      return "Restaurant_model{" +
              "restaurant_name='" + restaurant_name + '\'' +
              ", restaurant_address='" + restaurant_address + '\'' +
              ", restaurant_number='" + restaurant_number + '\'' +
              ", restaurant_speciality='" + restaurant_speciality + '\'' +
              ", totalNo_of_staff=" + totalNo_of_staff +
              ", rating=" + rating +
              '}';
   }
}
