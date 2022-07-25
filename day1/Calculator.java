package week2.day1;

public class Calculator {
         public void sub() {
        	 int e=60;
        	 int f=20;
        	 int d=e-f;
        	 System.out.println(d);
        	 
      }
         
         public void add() {
        	 int a=52;
        	 int b=48;
        	 int  c=(a+b);
        	 System.out.println(c);
         
         }
         
         public void multiple() {
        	 double i=10;
        	 double j=10;
        	 double k=i*j;
        	 System.out.println(k);
        	 
         }
         public void divide() {
        	 float x=2500f;
        	 float y=1000f;
        	 float z=x/y;
        	 System.out.println(z);
        	 
         }
        public static void main(String[] args) {
			Calculator cacl=new Calculator();
			cacl.add();
			cacl.divide();
			cacl.multiple();
			cacl.sub();
}
}
        
       
       