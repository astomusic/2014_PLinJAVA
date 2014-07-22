package hw2;

import java.util.ArrayList;

public class SumPrice {
	Company company;
	
	public SumPrice(Company company) {
		this.company = company;
	}
	
	public int getSumPrice() {
		ArrayList<Car> tempList = company.getCarList();
		int sum = 0;
		
		for(Car car : tempList) {
			sum += car.getPrice();
		}
		
		return sum;
	}
}
