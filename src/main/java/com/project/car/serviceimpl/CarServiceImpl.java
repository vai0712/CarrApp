package com.project.car.serviceimpl;

import com.project.car.bean.Car;
import com.project.car.dao.CarDao;
import com.project.car.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao carDao;

	@Override
	public List<Car> getProducts() {
		Iterable<Car> it=carDao.findAll();
		ArrayList<Car> Car = new ArrayList<Car>();
	    it.forEach(e -> Car.add(e));
	    for(Car it1 : Car) {
	    System.out.print(it1);	
	    }
	    return Car;
	}

	@Override
	public void saveProducts(Car car) {
		carDao.save(car);
	}

	@Override
	public Car updateProduct(Integer id, Car cardetails) {
		Car car=carDao.findById(id).get();
		car.setColor(cardetails.getColor());
		car.setName(cardetails.getName());
		car.setPrice(cardetails.getPrice());
		Car updatecar = carDao.save(car);
		return updatecar;
	}

	public Car getProductbyid(int id) {
		return carDao.findById(id).get();
	}

	@Override
	public void deleteproduct(int id) {
		carDao.deleteById(id);
	}
}
