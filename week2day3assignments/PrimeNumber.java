package week2day3assignments;

public class PrimeNumber {
	public static void main(String[] args) {
		int a=13;
		boolean prime=true;
		for (int i = 2; i < a; i++) {
			if (a%i==0){
				
		
			 prime=false;
			 break;
			}
}

	 if (prime==true) {
		 System.out.println("it is a prime number");
	 }else {
		 System.out.println("it is not a prime number");
	 }
}
}
