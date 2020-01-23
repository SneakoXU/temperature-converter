/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Name: Niko Suntay
 * Date: 8/9/19
 * Fahrenheit to Celsius temperature converter
 */
import java.util.Scanner;

public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temperature in Fahrenheit to convert or enter 9999 to exit: ");
        double temp = in.nextDouble();
        boolean done = false;
        

        while (!done)
        {
            if (temp == 9999)
            {
                done = true;
            }
        else
        {
            double celsius = calcCelsius (temp);
            System.out.println("Please enter temperature in Fahrenheit to convert or enter 9999 to exit: ");
            temp = in.nextDouble();
        }    
  
        }
    }

    public static double calcCelsius(double n){
        double celsiusTemp = (n - 32)*5/9;
        System.out.printf("%.2f degrees Fahrenheit converts to %.2f degrees Celsius", n, celsiusTemp);
        System.out.println("");
        return celsiusTemp;
    
    }
    }

