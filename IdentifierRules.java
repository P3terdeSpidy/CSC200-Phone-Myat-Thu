/**********************************************************************
  
  Program Title : Demonstrating Identifier Rules in Java
  File Name: "IdentifierRules.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 04 September 2025
  
 **********************************************************************/
 
// Intentionally incorrect program to demonstrate invalid Java identifiers.
//class switch{
class Switchdemo{
	String SwitchStatus = "On";
	
}

public class IdentifierRules {
	//public static void 1start() { 
    public static void start1() { 
		System.out.println("Static Method Output");
	}

    public static void main(String[] args) {
        //int 2ndPlace = 2;
        int secondPlace = 2;
        //int first name = 10;
        int firstname = 10;
        //int price# = 99;
        int pricevalue = 99;
        //int user-name = 25;
		int username = 25;
        //int class = 1;
		//int double = 3;
		int classvalue = 1;
		int doublevalue = 3;

        int Score = 10;
        System.out.println(Score);
		
		System.out.println("This program is executed after all errors are rectified.");


        start1();
    }

}