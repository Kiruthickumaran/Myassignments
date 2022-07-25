package july20;


public class Car {
public void applyBrake() {
	System.out.println("applybrake");
}
public void applyGear1() {
	System.out.println("applygear");
	}
	public void switchOnAc() {
		System.out.println("switchonac");
	}
	public void applyAccelrate() {
		System.out.println("applyaccelerate");
	}

public static void main(String[] args) {
	Car obj=new Car();
	obj.applyAccelrate();
	obj.applyBrake();
	obj.applyGear1();
	obj.switchOnAc();
}

}
