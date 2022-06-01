package seleniumbasics;



class Employee3{
	final int x = 150;

	final void display() {
		//x=50; we can't initialize cos of it is final
		System.out.println("Valur of a is  : "+x);
		
	}
}

final class Employee4{
	
}

class Department3 extends Employee3{
	
	public void show() {
		System.out.println(x);
	}
	
	/*void display() { // we can't override method coz it is a final method
		
		System.out.println("Value of a is  : "+x);
		
	}*/
	
}
/*class Employee5 extends Employee4{ // we can't extends method coz it is final class
	
}*/
public class Finalkeyword {
	public static void main(String[] args) {
		Department3 dp3 = new Department3();
		dp3.show();
	
	}
	
	

}
