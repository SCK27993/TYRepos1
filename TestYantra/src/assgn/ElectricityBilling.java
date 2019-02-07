package assgn;

import java.util.Scanner;

public class ElectricityBilling {

	public static void main(String[] args) {
		System.out.println(" Enter the Number of Units ");
		Scanner sc=new Scanner(System.in);
	    double units = sc.nextDouble();
	    System.out.println(" Enter the arrears ");
	    double arrears = sc.nextDouble();
	    double amount=0.0,fine=0.0;	
	    if(units<=50) {
	    	amount = units*1.20;
	    }
	    else if(units>50 && units<=100) {
	    	amount = units*2.40;
	    }
	    else if(units>100 && units<=150) {
	    	amount = units*3.60;
	    }
	    else if(units>150) {
	    	 amount = units*4.80;
	    }
	    if  (units>=200) {
	    	 double discount = amount*5/100;
	    	 if (discount>200) {
	    		   amount=amount;
	    	 }
	    	 else {
	    		 amount=amount-discount;
	    	 }
	    }
	    if(arrears>0) {
	    	  fine = arrears*10/100;
	    }
	    double total = amount+arrears+fine;
	    System.out.println("Total consumed amount of Electricity:"+"Rs"+total);
	}
}