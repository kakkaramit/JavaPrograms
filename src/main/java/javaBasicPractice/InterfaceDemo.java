package javaBasicPractice;

interface Plane{
	String from="New Dehli";
	String to="Mumbai";

	public void display();

	public abstract void door();

	public abstract void planeEngien();

}

class SpiceJet implements Plane{

	String name;
	double number;
	String from;
	String to;

	SpiceJet(String name, double number, String from, String to){

		this.name=name;
		this.number=number;
		this.from=from;
		this.to=to;

	}

	@Override
	public void door() {
		System.out.println("SpiceJet has six doors.");

	}

	@Override
	public void planeEngien() {
		System.out.println("SpiceJet plane has two engiens.");

	}

	public void display() {
		System.out.println("Name of plane is ---->"+name+"    Number of train is ---->"+number+"   Train is from ---->"+from+"    Train is to ---->"+to);
	}

}

class AirIndia implements Plane{

	String name1;
	double number1;
//	String from1;
//	String to1;

	AirIndia(String name, double number){

		this.name1=name;
		this.number1=number;

	}

	@Override
	public void door() {
		System.out.println("AirIndia has 8 doors.");

	}

	@Override
	public void planeEngien() {

		System.out.println("AirIndia plane has four engiens.");
	}

	public void display() {
		System.out.println("Name of train is ---->"+name1+"    Number of train is ---->"+number1+"   Train is from ---->"+from+"    Train is to ---->"+to);
	}

}


class AirExpress extends AirIndia{
	String from;
	String to;

	AirExpress(String name, double number, String from, String to) {
		super(name, number);
		this.from=from;
		this.to=to;

	}

	public void door() {
		System.out.println("AirExpress has two doors.");
	}

	public void planeEngien() {
		System.out.println("AirExperess plane has one engien.");
	}

	public void display() {
		System.out.println("Name of train is ---->"+name1+"    Number of train is ---->"+number1+"   Train is from ---->"+from+"    Train is to ---->"+to);
	}
}

public class InterfaceDemo {

	static Plane p;

	public static void main(String[] args) {

		p=new SpiceJet("Chd-Delhi Spice Jet", 123, "Chandigarh", "Dehli");
		p.display();
		p.door();
		p.planeEngien();

		System.out.println("**************************************");

		p=new AirIndia("Delhi-Mumbai Air Jet", 456);
		p.display();
		p.door();
		p.planeEngien();

		System.out.println("**************************************");
		p=new AirExpress("Chd-Jammu Airexpress Jet", 789, "Chandigarh", "Jammu");
		p.display();
		p.door();
		p.planeEngien();
		System.out.println("**************************************");
	}

}
