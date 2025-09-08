/**********************************************************************
  
  Program Title : Demonstrating Type Conversion in Java
  File Name: "TypeConversion.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 04 September 2025
  
 **********************************************************************/
 
public class TypeConversion {
    public static void main(String[] args) {
        
        // Widening (Implicit Conversion)
        int intVar1 = 100;           // int (4 bytes)
        double doubleVar1 = intVar1 + 2.00;
        
        System.out.println("Widening (Implicit Conversion):");
        System.out.println("Integer value: " + intVar1);
        System.out.println("intVar1 variable data size : " + Integer.SIZE);

        System.out.println("Result after implicit conversion from int to double: " + doubleVar1);
        System.out.println("doubleVar1 variable data size : " + Double.SIZE);


        // Narrowing (Explicit Conversion / Type Casting)
        double doubleVar2 = 99.99;
        double intVar2 = doubleVar2 + 1;
        int intVar3 = (int) doubleVar2 + 1;
        
        System.out.println("\nNarrowing (Explicit Conversion):");
        System.out.println("Double value: " + doubleVar2);
        System.out.println("Result after calculate without conversion: " + intVar2);
        System.out.println("intVar2 variable data size : " + Double.SIZE);

        System.out.println("Result after explicit conversion from double to int: " + intVar3);
        System.out.println("intVar3 variable data size : " + Integer.SIZE);


        // Conversion between char and int
        char letter = 'A';     // character
        int asciiValue = letter; // implicit conversion (char to int)
        System.out.println("\nChar to Int Conversion:");
        System.out.println("Character: " + letter);
        System.out.println("letter variable data size : " + Character.SIZE);

        System.out.println("ASCII value: " + asciiValue); // ✅ Correctly commented
    }
}
