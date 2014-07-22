package hw2;

public class Main {

	public static void main(String[] args) {
		Company kia = Company.getInstance();
		SumPrice sumPrice = new SumPrice(kia);
		Car sonata = new Sonata();
		Car tico = new Tico();
		
		System.out.println("this car is " + sonata.getName());
		System.out.println("this car is " + tico.getName());
		
		kia.addCar(sonata);
		kia.addCar(tico);
		
		System.out.println("company hava " + kia.countCar() + " cars");
		
		System.out.println("company hava " + sumPrice.getSumPrice() + " won");
	}

}
