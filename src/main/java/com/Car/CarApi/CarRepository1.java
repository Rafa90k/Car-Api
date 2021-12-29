package com.Car.CarApi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository1< ID> extends JpaRepository<Car, ID> {
}