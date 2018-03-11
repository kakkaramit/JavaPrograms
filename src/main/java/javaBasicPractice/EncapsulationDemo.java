package javaBasicPractice;

public class EncapsulationDemo {
	private String name;
	private int age;
	private String sex;
	
	EncapsulationDemo(String name, int age, String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSex() {
		return sex;
	}

	public String toString() {
		return name+"   "+age+"    "+sex;
	}
	
	public void display() {
		System.out.println("Name is--> "+name+"   Age is---> "+age+"   Sex is--> "+sex);
	}
	
	public void display2() {
		System.out.println("using this----Name is--> "+this.getName()+"   Age is---> "+this.getAge()+"   Sex is--> "+this.getSex());
	}
	
	public static void main(String[] args) {
		
		EncapsulationDemo ed=new EncapsulationDemo("Sonu", 25, "Male");
		//System.out.println(ed);
		ed.display2();
	}

}
