/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        double length = input.nextDouble(); //stores length of room
        System.out.println("What is the width of the room in feet?");
        double width=input.nextDouble();    //stores width of room
        System.out.println("You entered dimension of "+length+ " by "+width+ " feet ");

        double area = length * width;   //formula of area
        double conversion=area*0.09290304;    //conversion formula

        System.out.println("The area is ");
        System.out.println(area+" square feet");
        System.out.println(conversion+ " square meters");
    }
}
