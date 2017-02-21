package part1; 

import javax.swing.JFrame; // Importing this GUI tool in order to close the JFrame


public class MainTestPart1 {
	
	public static void main (String[] args){ // This is the main method, the program will run from here, this is the entrance
	
	RestaurantBillCalculatorPart1 restBillCalcuPart1 = new RestaurantBillCalculatorPart1(); // Creating an object of the class RestaurantBillCalculatorPart1
	restBillCalcuPart1.setBounds(500, 80, 345, 580); //Setting position and size of the Frame set in the class object restBillCalc 
	//the first number is the position from the left hand, 2nd one is the position from the top, the other two measures are the size of the frame
	restBillCalcuPart1.setVisible(true); // setting the Frame (which is declare in the object class restBillCalc) visible
	restBillCalcuPart1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closing operation when the frame is closed by pressing X
	
	
	}// End of the main method

}// End of the public class
