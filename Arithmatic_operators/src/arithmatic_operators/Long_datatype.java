package arithmatic_operators;

import java.util.Scanner;

public class Long_datatype {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long num1,num2;
		System.out.println("Enter two numbers:");
		num1=sc.nextLong();
		num2=sc.nextLong();
		System.out.println("Addition:"+(num1+num2));
        System.out.println("Substraction:"+(num1-num2));
        System.out.println("Multiplication:"+(num1*num2));
        System.out.println("Division:"+(num1/num2));
        System.out.println("Modulus:"+(num1%num2));

	}

}
