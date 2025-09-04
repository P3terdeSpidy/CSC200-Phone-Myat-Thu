/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java
  File Name: "VariableDataTypes.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class VariableDataTypes {
    public static void main(String[] args) {
        System.out.println("Demonstrating Variable Data Types in Java");
        System.out.println("-----------------------------------------\n");

        // Primitive Data Types
        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
        boolean bool = true;

        System.out.println("--- Primitive Data Types ---");
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);

        System.out.println("\n--- Sizes (in BYTES and BITS) ---");
        System.out.println("Size of byte: " + Byte.BYTES + " bytes | " + Byte.SIZE + " bits");
        System.out.println("Size of short: " + Short.BYTES + " bytes | " + Short.SIZE + " bits");
        System.out.println("Size of int: " + Integer.BYTES + " bytes | " + Integer.SIZE + " bits");
        System.out.println("Size of long: " + Long.BYTES + " bytes | " + Long.SIZE + " bits");
        System.out.println("Size of float: " + Float.BYTES + " bytes | " + Float.SIZE + " bits");
        System.out.println("Size of double: " + Double.BYTES + " bytes | " + Double.SIZE + " bits");
        System.out.println("Size of char: " + Character.BYTES + " bytes | " + Character.SIZE + " bits");

        // Note: boolean does not have a fixed size in Java
        System.out.println("Size of boolean: JVM dependent (no fixed size)");

        System.out.println("\n--- Minimum and Maximum Ranges ---");
        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        System.out.println("\n--- Non-Primitive Data Types ---");
        // Non-Primitive Data Types
        String str = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("String value: " + str);
        System.out.print("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // for a clean new line
    }
}
