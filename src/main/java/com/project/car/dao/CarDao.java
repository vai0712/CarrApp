package com.project.car.dao;

import com.project.car.bean.Car;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CarDao extends CrudRepository<Car, Integer>{
}
