package arithmatic_operators;

import java.util.Scanner;

public class Arithmatic_operators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Addition:"+(num1+num2));
        System.out.println("Substraction:"+(num1-num2));
        System.out.println("Multiplication:"+(num1*num2));
        System.out.println("Division:"+(num1/num2));
        System.out.println("Modulus:"+(num1%num2));
	}

}
