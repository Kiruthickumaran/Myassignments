package Assignmentsoops;

public class Axisbank  extends Bank {
       public void deposit() {
    	   System.out.println("Axisbank deposit");
       }
       
       public static void main(String[] args) {
    	   Axisbank bank=new Axisbank();
    	   bank.deposit();
    	   bank.saving();
    	   bank.saving();
	}
}





