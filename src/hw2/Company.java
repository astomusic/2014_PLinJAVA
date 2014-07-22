package hw2;

import java.util.ArrayList;

public class Company {
	private ArrayList<Car> carList = new ArrayList<Car>();
	
	private static Company instance = new Company();
	
	//싱글톤
	private Company(){}
	public static Company getInstance(){
		if(instance == null){
			instance = new Company();
		}
		return instance;
	}
	
	public void addCar(Car newCar) {
		carList.add(newCar);
	}
	
	public int countCar() {	
		return carList.size();
	}
	
	public ArrayList<Car> getCarList() {
		return carList;
	}
}
