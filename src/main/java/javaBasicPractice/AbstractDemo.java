package javaBasicPractice;

abstract class Train{
	String name;
	double number;
	String from;
	String to;

	public void display() {
		System.out.println("Name of train is ---->"+name+"    Number of train is ---->"+number+"   Train is from ---->"+from+"    Train is to ---->"+to);
	}

	public abstract void blowHorn();

	public abstract void trainEngien();


}

class Shatabdi extends Train{

	Shatabdi(String name, double number, String from, String to){

		this.name=name;
		this.number=number;
		this.from=from;
		this.to=to;

	}

	@Override
	public void blowHorn() {
		System.out.println("Shatabdi blow horn.");

	}

	@Override
	public void trainEngien() {
		System.out.println("Shatabdi rack has desiel engien.");

	}



}

class Rajdhani extends Train{

	String name1;
	double number1;

	Rajdhani(String name, double number, String from, String to){

		this.name1=name;
		this.number1=number;
		this.from=from;
		this.to=to;

	}

	@Override
	public void blowHorn() {
		System.out.println("Rajdhani blow horn.");

	}

	@Override
	public void trainEngien() {

		System.out.println("Rajdhani rack has electric engien.");
	}
	
	public void display() {
		System.out.println("Name of train is ---->"+name1+"    Number of train is ---->"+number1+"   Train is from ---->"+from+"    Train is to ---->"+to);
	}

}


class JanShatabdi extends Shatabdi{

	JanShatabdi(String name, double number, String from, String to) {
		super(name, number, from, to);

	}

	public void blowHorn() {
		System.out.println("JanShatabdi blow horn.");
	}

	public void trainEngien() {
		System.out.println("JanShatabdi rack has electric engien.");
	}

	public void display() {
		System.out.println("Name of train is ---->"+name+"    Number of train is ---->"+number+"   Train is from ---->"+from+"    Train is to ---->"+to);
	}
}



public class AbstractDemo {
	
	static Train t;

	public static void main(String[] args) {
		t=new Shatabdi("CHD-NDLS Shatabdi", 12011, "Chandigarh", "New Dehli");
		t.display();
		t.blowHorn();
		t.trainEngien();
		
		System.out.println("************************************************************");

		t=new Shatabdi("Kalka-NDLS Shatabdi", 12005, "Kalka", "New Dehli");
		t.display();
		t.blowHorn();
		t.trainEngien();
		System.out.println("************************************************************");


		t=new Rajdhani("NDLS-Jammu Rajdhani", 12045, "New Dehli", "Jammu");
		t.display();
		t.blowHorn();
		t.trainEngien();
		System.out.println("************************************************************");

		t=new JanShatabdi("Una-NDLS Shatabdi", 12058, "Una", "New Dehli");
		t.display();
		t.blowHorn();
		t.trainEngien();
		
		

	}

}
