package main;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Examuno {
    public static void main(String[] args) {
        String firstName = "Efrain";
        String lastName = "Delvalle";
        char[] clothingSize = {'S','M','L'};
        final String EXPIRATION = "September 12,2024";

        System.out.println(printFullName(firstName,lastName));
        getPrice();
        printSizes(clothingSize);
    }
    public static String printFullName(String printFirstName, String printLastName){
        return printFirstName + printLastName;
    }
    public static void getPrice (){
        double min = 5.0;
        double max = 15.0;
        double randomNum = ThreadLocalRandom.current().nextDouble(min, max);
        double randomNumRounded = Math.round(randomNum * 100.0) / 100.0;
        System.out.println(randomNumRounded);
    }
public static void printSizes(char[] sizes){
    System.out.println(sizes.length);
}
public static void printOrder(){
        Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Burger-Joint. Is it true or false that your order will be to go?");
    String answer = scanner.nextLine();
    System.out.println("What type of burger do you want today? Cheese, ham or turkey?");
    String answerTwo = scanner.nextLine();
    System.out.println("Please enter a tip of 0%, 5%,10%, 15% or 20% tip!");
    Double tip = scanner.nextDouble();
    scanner.nextLine()
    System.out.println("What is the name for your order?");
    String name = scanner.nextLine();

}


}
