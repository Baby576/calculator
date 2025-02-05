/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature: ");
        double temperature = scanner.nextDouble();
        double convertedTemperature = 0;

        switch (choice) {
            case 1:
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println(temperature + " Celsius is " + convertedTemperature + " Fahrenheit.");
                break;
            case 2:
                convertedTemperature = celsiusToKelvin(temperature);
                System.out.println(temperature + " Celsius is " + convertedTemperature + " Kelvin.");
                break;
            case 3:
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println(temperature + " Fahrenheit is " + convertedTemperature + " Celsius.");
                break;
            case 4:
                convertedTemperature = fahrenheitToKelvin(temperature);
                System.out.println(temperature + " Fahrenheit is " + convertedTemperature + " Kelvin.");
                break;
            case 5:
                convertedTemperature = kelvinToCelsius(temperature);
                System.out.println(temperature + " Kelvin is " + convertedTemperature + " Celsius.");
                break;
            case 6:
                convertedTemperature = kelvinToFahrenheit(temperature);
                System.out.println(temperature + " Kelvin is " + convertedTemperature + " Fahrenheit.");
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
