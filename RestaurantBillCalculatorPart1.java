package part1; 



import javax.swing.BorderFactory; //importing this GUI in order to use borders in the JPanels
import javax.swing.JButton; //importing this GUI in order to create a JButton
import javax.swing.JComboBox; //importing this GUI in order to create JCombo boxes
import javax.swing.JFrame; //importing this GUI in order to create a JFrame
import javax.swing.JLabel; //importing this GUI in order to create JLabels
import javax.swing.JPanel; //importing this GUI in order to create JPanels
import javax.swing.JTextField; //importing this GUI in order to create JText fields
import java.awt.Color; // importing this GUI in order to use color in the borders of the JPanels
import java.awt.Container; // importing this GUI in order to create a content panel
import java.awt.Font; //importing this GUI in order to change the font of the JLabels


public class RestaurantBillCalculatorPart1 extends JFrame { // this class is going to inherit all the methods of the class JFrame 
		//(it means RestaurantBillCalculatorPart1 will be able to use the methods from JFrame class)
	
		
	private Container contentPanel; // declaring a container to place the components of the frame
		
	public RestaurantBillCalculatorPart1 (){ // this is the constructor of the class "RestaurantBillCalculatorPart1"
			
		super ("Restaurant Bill Calculator"); // setting the title of the frame
		contentPanel = getContentPane();// retrieving from the getContentPane the container contentPane to place the components to be displayed in the contentPanel(frame)
		contentPanel.setLayout(null); // Setting setLayout null in order to get an absolute position of the contentPanel
		
		
		JLabel restaurantJLabel = new JLabel ("Restaurant");// Creating a JLabel object restaurant label, this line also declares the variable that refers the object and initialize it
		restaurantJLabel.setBounds(120, 8, 100, 30); // Setting position and size of the JLabel "Restaurant"
		restaurantJLabel.setFont(new Font("TimesNewRoman", Font.PLAIN, 18 )); //Setting the font of the JLabel "restaurant" 
		add (restaurantJLabel); //Adding this component to the frame
		
		
		
		//"Waiter Information":
		
		JLabel tableNumberJLabel = new JLabel("Table number: ");//creating a JLabel object table number, this line also declares the variable (tableNumberJLabel) that refers the object and initialize it
		tableNumberJLabel.setBounds(65, 60, 90, 50); // setting position and size of the table number JLabel
		add (tableNumberJLabel); // adding this component to the frame
		
		
		JTextField tableNumberJTextField = new JTextField(); //Creating a JTextField object table number, this line also declares the variable (tableNumberJTextField) that refers the object and initialize it
		tableNumberJTextField.setBounds(170, 76, 115, 21); // Setting position and size of the Jtextfield
		add (tableNumberJTextField); // Adding this component to the frame
		
		
		JLabel waiterNameJLabel = new JLabel("Waiter name: ");//creating a JLabel object waiter name, this line also declares the variable (waiterNameJLabel) that refers the object and initialize it
		waiterNameJLabel.setBounds(65, 100, 90, 50); // setting position and size of the JLabel waiter name
		add (waiterNameJLabel); // adding this component to the frame
		
		
		JTextField waiterNameJTextField = new JTextField();//Creating a JTextField object waiter name, this line also declares the variable that refers the object and initialize it
		waiterNameJTextField.setBounds(170, 116, 115, 21); //Setting position and size of the JTextField object 
		add (waiterNameJTextField); //Adding this component to the frame
		
		
		JPanel waiterNameJPanel = new JPanel(); //Creating a JPanel object waiter name, this line also declares the variable that refers the object and initialize it
		waiterNameJPanel.setBounds(30, 50, 270, 100); //setting size and position of the panel
		waiterNameJPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));//Creating the border of the panel
		waiterNameJPanel.setBorder(BorderFactory.createTitledBorder("Waiter Information")); //Creating a title in the border of the panel
		add (waiterNameJPanel);//Adding this component to the frame
		
		
		
		//Menu Items:
		
		JLabel beverageJLabel = new JLabel("Beverage: ");//Creating a JLabel object beverage, this line also declares the variable that refers the object and initialize it
		beverageJLabel.setBounds(40, 195, 90, 50);//Setting position and size of the JLabel object
		add (beverageJLabel);//Adding this component to the frame
		
		
		String[] Beverages = {"", "Water", "Spring Water", "Coca Cola", "Sprite"}; //Creating an array of beverages, declaring the String array and assigning values in one single line
		JComboBox beverageJComboBox = new JComboBox(Beverages); //Creating a JCombo box object beverage and it will display the array "Beverages"
		beverageJComboBox.setBounds(125, 210, 160, 21);//Setting position and size of the beverage JComboBox
		add (beverageJComboBox);//Adding this component to the frame
		
		
		JLabel appetizerJLabel = new JLabel("Appetizer: "); // Creating a JLabel object appetizer, this line also declares the variable that refers the object and initialize it
		appetizerJLabel.setBounds(40, 230, 90, 50); //Setting the position and size of the JLabel appetizer
		add(appetizerJLabel); // Adding this component to the frame
		
		
		String[] Appetizers = {" ", "Bruschetta Pomodoro", "Cheese", "Soup of the day", "Guacamole"}; //Creating an array of appetizers, declaring the String array and assigning values in one single line
		JComboBox appetizerJComboBox = new JComboBox(Appetizers); //Creating a JCombo box object appetizer and it will display the array "Appetizers"
		appetizerJComboBox.setBounds(125, 245, 160, 21);//Setting the position and size of the appetizer JComboBox
		add (appetizerJComboBox); // Adding this component to the frame
		
				
		JLabel mainCourseJLabel = new JLabel ("Main Course: "); //Creating a JLabel object main course, this line also declares the variable that refers the object and initialize it
		mainCourseJLabel.setBounds(40, 265, 90, 50);// Setting position and size of the main course JLabel
		add(mainCourseJLabel);//Adding this component to the frame
		
		
		String[] MainCourses = {" ", "Fettuccini", "Italian Irish Breakfast", "Salmon pasta", "Lasagna"}; //Creating an array of Main courses, declaring the String array and assigning values in one single line
		JComboBox mainCourseJComboBox = new JComboBox(MainCourses);//Creating a JCombo box object main course and it will display the array MainCourses
		mainCourseJComboBox.setBounds(125, 280, 160, 21);//Setting position and size of the main course JComboBox
		add (mainCourseJComboBox);// Adding this component to the frame
		
		
		JLabel dessertJLabel = new JLabel("Dessert: "); //Creating a JLabel object dessert, this line also declares the variable that refers the object and initialize it
		dessertJLabel.setBounds(40, 300, 90, 50); // Setting position and size of the dessert JLabel
		add(dessertJLabel);// Adding this component to the frame
		
		
		String[] desserts = {" ", "Cheese Cake", "Ice cream", "Tiramisu", "Chocolate Cake"}; //Creating an array of desserts, declaring the String array and assigning values in one single line
		JComboBox dessertJComboBox = new JComboBox(desserts);//Creating a JCombo box object dessert and it will display the array desserts
		dessertJComboBox.setBounds(125, 315, 160, 21); //Setting position and size of the comboBox
		add (dessertJComboBox);// Adding this component to the frame
		
		
		JPanel menuItemsJPanel = new JPanel();//Creating a JPanel object menu items, this line also declares the variable that refers the object and initialize it
		menuItemsJPanel.setBounds(30, 180, 270, 170);//Setting position and size of the panel
		menuItemsJPanel.setBorder(BorderFactory.createLineBorder(Color.black, 3)); // Setting border, border's color and thickness of the JPanel
		menuItemsJPanel.setBorder(BorderFactory.createTitledBorder("Menu Items"));//Creating a title in the border of the menu items panel
		add(menuItemsJPanel);//Adding this component to the frame
		
		
		JButton calculateBillJButton = new JButton("Calculate Bill"); //Creating a JButton object calculate bill, this line also declares the variable that refers the object and initialize it
		calculateBillJButton.setBounds(110, 370, 110, 21);//Setting position and size of the JButton
		calculateBillJButton.setBorder(BorderFactory.createRaisedBevelBorder()); //Setting the border of the button raised to the background
		add (calculateBillJButton);//Adding this component to the frame
		
		
		JLabel subtotalJLabel = new JLabel("Subtotal: "); //Creating a JLabel object subtotal, this line also declares the variable that refers the object and initialize it
		subtotalJLabel.setBounds(40, 400, 90, 50); //Setting position and size of the JLabel object
		add (subtotalJLabel); //Adding this component to the frame
		
		
		JTextField subtotalJTextField = new JTextField(); //Creating a JTextField object subtotal, this line also declares the variable that refers the object and initialize it
		subtotalJTextField.setBounds(110, 415, 110, 21); //Setting position and size of the Subtotal JTextField object
		subtotalJTextField.setBackground(getBackground()); //Setting the color of the text field, it will be the same like the background
		subtotalJTextField.setBorder(BorderFactory.createLoweredBevelBorder()); //Setting the border of the text field (lowered than the background)
		subtotalJTextField.setEditable(false);
		add (subtotalJTextField); // Adding this component to the frame
		
		
		JLabel taxJLabel = new JLabel("Tax: "); //Creating a tax JLabel object, this line also declares the variable (taxJLabel) that refers the object and initialize it
		taxJLabel.setBounds(40, 435, 90, 50); //Setting position and size of the Tax JLabel object
		add (taxJLabel); //Adding this component to the frame
		
		
		JTextField taxJTextField = new JTextField(); //Creating a JTextField object tax, this line also declares the variable that refers the object and initialize it
		taxJTextField.setBounds(110, 450, 110, 21); //Setting position and size of the JTextField object
		taxJTextField.setBackground(getBackground()); //Setting the color of the Text field, it will be the same like the background
		taxJTextField.setBorder(BorderFactory.createLoweredBevelBorder()); //Setting the border of the text field (lowered than the background)
		taxJTextField.setEditable(false);
		add (taxJTextField); //Adding this component to the frame
		
		
		JLabel totalJLabel = new JLabel("Total: "); //Creating a JLabel object Total, this line also declares the variable (totalJLabel) that refers the object and initialize it
		totalJLabel.setBounds(40, 470, 90, 50); //Setting position and size of the totalJLabel 
		add (totalJLabel); //Adding this component to the frame

		
		JTextField totalJTextField = new JTextField(); //Creating a JTextField object Total, this line also declares the variable (totalJTextField) that refers the object and initialize it
		totalJTextField.setBounds(110, 485, 110, 21); //Setting position and size of the Total TextField
		totalJTextField.setBackground(getBackground()); //Setting the color of the Text field, it will be the same like the background
		totalJTextField.setBorder(BorderFactory.createLoweredBevelBorder()); //Setting the border of the text field (lowered than the background)
		totalJTextField.setEditable(false);
		add (totalJTextField); //Adding this component to the frame
		
					
		} // End of the constructor
	
} // End of the class


