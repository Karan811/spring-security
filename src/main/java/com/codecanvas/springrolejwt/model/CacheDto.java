package com.codecanvas.springrolejwt.model;

public class CacheDto {
    private Long id;
    private String name;

    // Default constructor
    public CacheDto() {
    }

    // Parameterized constructor
    public CacheDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString method (optional, for debugging/logging)
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

