package arithmatic_operators;

import java.util.Scanner;

public class Float_data_type {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float num1,num2;
		System.out.println("Enter two numbers:");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		System.out.println("Addition:"+(num1+num2));
        System.out.println("Substraction:"+(num1-num2));
        System.out.println("Multiplication:"+(num1*num2));
        System.out.println("Division:"+(num1/num2));
        System.out.println("Modulus:"+(num1%num2));

	}

}
