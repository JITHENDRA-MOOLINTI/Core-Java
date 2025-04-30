package tenkcoders;

class Calculator{
	public static int add(int a,int b) {
		return a+b;
	}
	public static int subtract(int a,int b) {
		return a-b;
	}
}

class TemperatureConverter{
	public static double convertToFahrenheit(double celsius) {
		return (celsius*9/5)+32;
	}
}

class Geometry{
	public static double areaOfRectangle(double length,double width) {
		return length*width;
	}
}

class TravelCoverter{
	public static double kmToMiles(double km) {
		return km*0.621371;
	}
}

class CircleCalculator{
	public static double calculateArea(double radius) {
		return 3.1416*radius*radius;
	}
}
class CurrencyConverter{
	public static double rupeesToUSD(double rupees) {
		return rupees/83.0;
	}
}
class BillCalculator{
	public static double calculatorTotalWithTax(double amount,double taxPercent) {
		return amount+(amount*taxPercent/100);
	}
}
class StringUtility{
	public static int getLength(String input) {
		return input.length();
	}
}
class TimeConverter{
	public static int hoursToMinutes(int hours) {
		return hours*60;
	}
}
class ShapeCalculator{
	public static double calculatePerimeter(double length,double width) {
		return 2*(length+width);
	}
}
public class StaticMethodsReturnType {

	public static void main(String[] args) {
		
		System.out.println(Calculator.add(10,5));
		System.out.println(Calculator.subtract(10, 5));
		System.out.println(TemperatureConverter.convertToFahrenheit(25));
		System.out.println(Geometry.areaOfRectangle(5.0, 3.0));
		System.out.println(TravelCoverter.kmToMiles(10));
		System.out.println(CircleCalculator.calculateArea(7));
		System.out.println(CurrencyConverter.rupeesToUSD(8300));
		System.out.println(BillCalculator.calculatorTotalWithTax(1000, 18));
		System.out.println(StringUtility.getLength("Hello"));
		System.out.println(TimeConverter.hoursToMinutes(2));
		System.out.println(ShapeCalculator.calculatePerimeter(5.0, 3.0));
		
	}

}
