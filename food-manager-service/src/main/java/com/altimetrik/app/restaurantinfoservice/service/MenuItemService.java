package com.altimetrik.app.restaurantinfoservice.service;



import java.util.List;

import com.altimetrik.app.restaurantinfoservice.model.MenuItem;

public interface MenuItemService {
    List<MenuItem> findAllByRestaurantId(String rid);
    void createMenuItem(MenuItem menuItem);
    void uploadMenuItems(List<MenuItem> menuItems);
}
