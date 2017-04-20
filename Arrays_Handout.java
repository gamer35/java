/******************************************************************************
*******************************************************************************
*******************************************************************************

			                  ID INFORMATION

	Programmer       	      		:		Daimeon Rodriguez
	Assignment #	   	      	        :		
	Assignment Name		      		:		
	Course # and Title		        :		CISC 190 - Java
	Class Meeting Time	     	 	:		TTH 1:00 - 4:05
	Instructor		            	:		Professor Forman
/	Hours			               	:		1. 1
	Difficulty		             	:		1. 1
	Completion Date		     	 	:		04/20/17
	File Name		            	:	      	Arrays_Handout

*******************************************************************************
*******************************************************************************

				            PROGRAM DESCRIPTION
	
   

*******************************************************************************
*******************************************************************************

				           CUSTOM-DEFINED METHODS
	

*******************************************************************************
*******************************************************************************
*******************************************************************************
*******************************************************************************

                                     MEDIA

                https://media.giphy.com/media/FRRK3vMJ4no52/giphy.gif


*******************************************************************************
********************************************************************************/
import javax.swing.*;
import java.util.*;

public class Arrays_Handout
{
	public static void main(String[] args)
	{
      Arrays_Handout object = new Arrays_Handout();
   
		int[] numbers;
		//Declares a reference variable called "numbers" that points to an array of integers.
	   
		numbers = new int[3];
		//Create an array of 3 integers and assign its address to the "numbers" reference variable.
	   
		//The previous 2 lines can also be executed at the same time, like below:
      //int[] numbers = new int[3];
      
      //Note that "numbers" without the [] only holds the address of the array.
		//Brackets must be used to access the values stored in the array.
		
		numbers[0] = 4;
		//The number inside the brackets is called the subscript. The value 4 was just assigned to the
		//first element of the array.
		//The first element of an array is always subscript 0.
		//The last element of an array is the array size - 1.
		
		int x = 10;
		numbers[1] = x;
		//Variables can also be assigned to array elements. The 2nd element now holds the value 10.
		
		int i = 2;
		numbers[i] = 7;
		//The subscript can also be a variable, as long as it's an int between 0 and the array size - 1.
		//The third element, numbers[2], now holds the value 7.
		
		object.displayIntArray(numbers);
		//Send numbers array to display method.
		
		int[] moreNumbers = {1, 2, 3, 4, 5, 6};
		//Arrays can be initialized with values. Here we created an array of ints called "moreNumbers".
		//The numbers inside the {} are the values to initialize the array way. Since we entered 6 ints,
		//the array will be given a size of 6.
		
		object.displayIntArray(moreNumbers);
		//Send moreNumbers array to display method.
      
      int size = 5;
      int[] evenMoreNumbers = new int[size];
      evenMoreNumbers = object.returnIntArray(size);
		object.displayIntArray(evenMoreNumbers);
      //Methods can also return arrays, making them useful for returning multiple values at once.
      //Here we create a new empty array and deploy a method to fill it with values, and then display it.


		
		
		object.showArrayListsExample();
		
		
// 			   	// what yvans wants to do, the very very basics
// 		str[1] = "Is";
// 		num[0] = 100;
// 		num[1] = 200;
// 	
// 	   
// 		 String[] str = {"Java","Isn't","Awesome"};
// 	
// 		int[] num = new int[3]
//         
// 		JOptionPane.showMessageDialog(null,
// 				      "The string list is " + str.length + " words long \n"    // should say 3
// 				     +"The integer list is " + num.length + "numbers long \n"  // should say 3
// 				     + num[0] + "," +num[1] + "," +num[2] +"\n"  //should say 100, 200, 0
// 				     + str[0] + str[1] + str[2]);  //shoud say java is awesome
		object.array_examples();
		
		
	}
   

	/*****************************************************************************/
	/*************************START CUSTOM	DEFINED METHODS************************/
	/*****************************************************************************/
   
   public void displayIntArray(int[] array)
	{
		//This basic for loop steps through each element of the array, displaying the element number and value.
		//It will continue until the index is no longer < the array size, which indicates the end of the array.
		
		for(int i = 0; i < array.length; i++)
		{
			JOptionPane.showMessageDialog(null, "Element: " + i + " Value: " + array[i]);
		}
	}

   public int[] returnIntArray(int size)
   {
      int[] newArray = new int[size];
		//This methods creates an array of the size sent in the argument.
      
      for(int i = 0; i < size; i++)
      {
         newArray[i] = i * 2;
      }
      //The for loop goes through each element and assigns twice the element number to the value of that element.
      
      return newArray;
      //Return works just like any other variable, you just need to make sure the array type matches
      //the method declaration.
   }
   
   public void showArrayListsExample()
   {
      ArrayList<String> list = new ArrayList<String>();
      JFrame frame = new JFrame();
      frame.setSize(500,500);
      frame.setVisible(true);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //list.add(34);
      String element;
      JOptionPane.showMessageDialog(frame, "Adding as many elements as you want to the ArrayList");
      while(true)
      {
         element = JOptionPane.showInputDialog(frame, "Enter anything(Type close to stop adding elements)):");
         if (element.equalsIgnoreCase("close"))
         {
            break;
         }
         list.add(element);
      }
      JOptionPane.showMessageDialog(frame, "Displaying the values stored in the ArrayList");
      for(int x=0; x<list.size();x++)
      {
         JOptionPane.showMessageDialog(frame,"Element #"+(x+1)+": "+list.get(x));
      }
      
   }
    //*********************************************************************************************** 
    //NAME: array_list_array_examples 
    //DESCRIPTION: Displays all types of arrays
    //BY: Daimeon Rodriguez
    //*********************************************************************************************** 
   public void array_examples(){
       
       //As mentioned above in the method return int array
       // you can determine the size of a array before hand 
       // or you can also have the user initailize the size of 
       // any array by getting input
       String input = 
                      (String) JOptionPane.showInputDialog(null, "k", "How Big?", 
                               JOptionPane.INFORMATION_MESSAGE,null,null, "5");
                               int size = Integer.parseInt(input);
       
       
       //Here are the diffrent typed of arrays with all primitive data values
       
       
            //byte array stores integers from values -128 to 127
                byte[] byte_array = new byte[size];
                
                
            //Short array stores integers from values of -32,769 to 32,767
                short[] short_array = new short[size];
                
                
            // int array stores integers from vales of -2,147,483,648 to -2,147,483,687
                int[] int_array = new int[size];
                
                
            //long array stores integers from values of -9,223,372,036,854 to 9,223,372,036,853
                long[] long_array = new long[size];
                
                
            //float array stores integers from values of 3.4 X 10^-38 to 3.4 10^38
            // Note float has a 7 digit accuracy
                float[] float_array = new float[size];
                
                
            //double array stores integers from values of -1.7 X 10^-308 to 1.7 X 10^308
            // Note double has a 15 digit accuracy
                double[] double_array = new double[size];
                
                
        //Here are arrays that store alphabetic chracters 
                
            //Char values are Characters only store one character per subscript
                char[] char_array = new char[size];
                
                
            //String array stores String type data
                String[] string_array = new String[size];
                
                
            //Array List has no preset determination on size.
                ArrayList<String> int_array_list = new ArrayList<>();
                

        //Here you can do something crazy by nesting a JOptionPane within a 
        //Integer Parse, that has a nested JOptionPane that's casted to a String
        Icon icon1 = new ImageIcon("what.gif");
        
        
        //Creates a new String array and initalized the size of the array By getting information from the user by prompting for size
        String[] crazy = new String[Integer.parseInt((String) JOptionPane.showInputDialog(null, "Enter Number:", "Enter Number", JOptionPane.INFORMATION_MESSAGE,icon1,null, "5"))];
        
        
       
   /*****************************************************************************/
	/**************************END CUSTOM DEFINED METHODS*************************/
	/*****************************************************************************/	
}
