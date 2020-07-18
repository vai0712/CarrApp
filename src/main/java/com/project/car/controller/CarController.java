package com.project.car.controller;

import com.project.car.bean.Car;
import com.project.car.dao.CarDao;
import com.project.car.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CarController {
	
	@Autowired
	private CarService carservice;
	
	@Autowired
	private CarDao cardao;

	@GetMapping("/getproduct")
	public List<Car> handelGetProduct() {
		return carservice.getProducts();
		}
	
	@PostMapping(path="/saveproduct")
	public Car SaveProduct(@RequestBody Car car) {
		 carservice.saveProducts(car);
		 return car;
		}

	@GetMapping("/getproductBYID")
	public Car handelGetProduct(int id) {
		return carservice.getProductbyid(id);
	}

	@PutMapping("/updateproduct/{id}")
  public Car updateProduct(@PathVariable(value = "id") int id, @Valid @RequestBody Car car){
		System.out.print(car.getColor());
		return carservice.updateProduct(id,car);
	}
	
	@DeleteMapping("/DeleteBYID/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable(value = "id") int id){
	carservice.deleteproduct(id);
	return ResponseEntity.ok().build();
	}
}


