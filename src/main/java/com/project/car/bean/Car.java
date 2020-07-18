package com.project.car.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Car {
 
	private int id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	public int getId() {
		return id;
	}

	public Car(int id, String name, String color, double price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public Car()
	{
	}
	
	public void setId(int id) {
		this.id = id;
	}

	private String name;
    private String color;
    private double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
}
