package tenkcoders;

import java.util.Scanner;

class NeonNumber{
	
	public boolean neonNumber(int n) {
		int num=n*n;
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		if(sum==n) {
			return true;
		}
		return false;
	}
}

class ArmStrongNumber{
	
	public boolean armStrongNumber(int n) {
		int count=0;
		int num=n;
		while(num>0) {
			count++;
			num/=10;
		}
		
		int num1=n;
		int sum=0;
	    while(num1>0) {
	    	int rem=num1%10;
	    	int mul=1;
	    	for(int i=0;i<count;i++) {
	    		mul*=rem;
	    	}
	    	sum+=mul;
	    	num1/=10;
	    }
	    if(sum==n) {
	    	return true;
	    }
	    return false;
	}
}

class Factorial{
	
	public int factorial(int n) {
		int mul=1;
		for(int i=n;i>=1;i--) {
			mul*=i;
		}
		return mul;
	}
}
public class Loops {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		NeonNumber b = new NeonNumber();
		if(b.neonNumber(n)) {
			System.out.println("It is a neon number: "+n);
		}
		else {
			System.out.println("It is not a Neon Number: "+n);
		}
		
		ArmStrongNumber  arm= new ArmStrongNumber();
		if(arm.armStrongNumber(n)) {
			System.out.println("it is a armstrong number: "+n);
		}
		else {
			System.out.println("it is not armstrong number: "+n);
		}
		
		System.out.println("Enter a factorial you want number it is less than 12 \n"
				+ "because it beyond the range of int data type is given");
		int m=sc.nextInt();
		Factorial f = new Factorial();
		System.out.println(f.factorial(m));
	}

}
