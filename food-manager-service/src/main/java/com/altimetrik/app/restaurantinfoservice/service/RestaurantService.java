package com.altimetrik.app.restaurantinfoservice.service;

import java.util.List;

import com.altimetrik.app.restaurantinfoservice.model.Restaurant;

public interface RestaurantService {
    void createRestaurant(Restaurant restaurant);
    Restaurant getRestaurantByName(String name);
	List<Restaurant> getRestaurantByLocationAndArea(String location, String area);
}
