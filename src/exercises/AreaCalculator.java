package exercises;

import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle in feet: ");
        double length = input.nextDouble();
        System.out.println("Please enter the width of the rectangle in feet: ");
        double width = input.nextDouble();
        double area = length*width;
        System.out.println("The area of the rectangle is " + area + " square feet.");
    }
}
