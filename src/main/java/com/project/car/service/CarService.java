package com.project.car.service;

import com.project.car.bean.Car;

import java.util.List;

public interface CarService {
    public List<Car> getProducts();
    public void saveProducts(Car car);
    public Car updateProduct(Integer id, Car car);
    public Car getProductbyid(int id);
    public void deleteproduct(int id);
}
