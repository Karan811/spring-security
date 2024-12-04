package com.codecanvas.springrolejwt.service;

import com.codecanvas.springrolejwt.model.CacheDto;
import com.codecanvas.springrolejwt.model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    //@Cacheable(value = "users", key = "#id")
//    public CacheDto getUserById(Long id) {
//        // Simulate a database call
//       // simulateSlowService();
//        return ;
//    }

    @CachePut(value = "users", key = "#user.id")
    public User updateUser(User user) {
        // Simulate updating user in the database
        return user;
    }

    @CacheEvict(value = "users", key = "#id")
    public void deleteUser(Long id) {
        // Simulate deleting user from the database
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
