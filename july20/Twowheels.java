package july20;

public class Twowheels {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=5246585955165498l;
	boolean isPunctured=false;
	String bikeName="Royal enfield";
	double runningKm=5622.544;
	public static void main(String[] args) {
		Twowheels vehicle=new Twowheels();
		System.out.println("bikename:"+vehicle.bikeName  );
		System.out.println(vehicle.noOfWheels);
		System.out.println(vehicle.runningKm);
		System.out.println(vehicle.isPunctured);
		System.out.println(vehicle.chassisNumber);
		System.out.println(vehicle.noOfMirrors);
}
}