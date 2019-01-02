// Sydney Davidson
// Fri- 10:25 Jouse Ruiz
// HW 1 question 3
// This program calculates wind chill with the variables temperature and wind speed.

import java.util.Scanner; // scanner class
import java.lang.Math; // math class 
public class windChill{
	public static void main(String[] args){
		double t; // variable declaration when t is the temperature in Fahrenheit
		double v; // variable declaration when v is wind speed in miles per hour
		double w; // variable declaration when w is wind chill

		Scanner keyboard = new Scanner(System.in); // user input from keyboard
		System.out.println("What's the temperature?"); //dsiplay the question
		t = keyboard.nextDouble();
		System.out.println("What's the wind speed?"); //display the question
		v = keyboard.nextDouble();

		if( t > Math.abs(50)){
			System.out.println("Formula not valid with numbers given");
		}
		if(v > 120 || v < 3){
			System.out.println("Formula not valid with numbers given");
		}

		//calculations
		else{
			w = 35.74 + (0.6215* t ) + ((0.4275 * t) - 35.75)*Math.pow(v, 0.16);
			System.out.println("The wind chill is " + w); //dsiplays wind chill 


		}
		
		}
}