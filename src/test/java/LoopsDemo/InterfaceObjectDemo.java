package LoopsDemo;

public class InterfaceObjectDemo{

	public static void main(String[] args) {
		
		// creating object of interface.
		InterfaceObject obj = new InterfaceObject() {  //Anonymous inner classes
			@Override
			public void show() {

		System.out.println("Hello show11!");
				
			}
		};

		obj.show();
	}

	

}
