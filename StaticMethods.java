package tenkcoders;


class AdditionCalculator{
	public static void addTwoNumbers(int a,int b) {
		System.out.println("sum: "+(a+b));
	}
}

class MultiplicationCalculator{
	public static void multiplyTwoNumbers(int a,int b) {
	    System.out.println("product: "+(a*b));
	}
}

class SquareCalculator{
	public static void squareOfNumber(int n) {
		System.out.println("square: "+(n*n));
	}
}


class AverageCalculator{
	public static void averageOfThreeNumbers(double a,double b,double c) {
		System.out.println("average of three numbers: "+(a+b+c)/3);
	}
}

class SimpleInteresetCalculator{
	public static void calculateSimpleInterest(double principle,double rate,double time) {
		System.out.println("Simple Interest: "+(principle*rate*time)/100);
	}
}

class CubeOfNumber{
	public static void cubeOfNumber(int n) {
		System.out.println("Cube: "+(n*n*n));
	}
}

class RectanglePerimeterCalculator{
	public static void calculatorPerimeter(double length,double breadth) {
		System.out.println("Perimeter: "+(2*(length+breadth)));
	}
}


class VolumeOfCalculator{
	public static void volumeOfCube(double side) {
		System.out.println("Volume: "+(side*side*side));
	}
}


class StringConcatenator{
	public static void concatenateStrings(String str1,String str2) {
		System.out.println("Concatenated String: "+(str1+str2));
	}
}

class StringLengthFinder{
	public static void stringLengthFinder(String str) {
		System.out.println("Length: "+str.length());
	}
}
public class StaticMethods {

	public static void main(String[] args) {
		AdditionCalculator.addTwoNumbers(10, 20);
		MultiplicationCalculator.multiplyTwoNumbers(5, 4);
		SquareCalculator.squareOfNumber(6);
		AverageCalculator.averageOfThreeNumbers(10.0,20.0,30.0);
		SimpleInteresetCalculator.calculateSimpleInterest(1000.0,5.0,2.0);
		CubeOfNumber.cubeOfNumber(3);
		RectanglePerimeterCalculator.calculatorPerimeter(5.0, 3.0);
		VolumeOfCalculator.volumeOfCube(4.0);
		StringConcatenator.concatenateStrings("Hello", "World");
		StringLengthFinder.stringLengthFinder("Java");
	}

}
