package hw2;

import java.util.ArrayList;

public class SumPrice {
	//별도의 계산을 위한 클래스
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
