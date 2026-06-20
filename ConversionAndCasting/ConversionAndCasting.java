

public class ConversionAndCasting {
    public static void main(String[] args) {

        System.out.println("=== 1. WIDENING CONVERSION (Automatic) ===");
        int intNum = 45;
        double doubleNum = intNum; // Automatic conversion (4 bytes -> 8 bytes)
        
        System.out.println("Original int value: " + intNum);
        System.out.println("Converted double value: " + doubleNum); // Outputs 45.0
        System.out.println();


        System.out.println("=== 2. NARROWING CASTING (Manual) ===");
        double salary = 85000.75;
        // Truncating the decimal part manually using (int)
        int roundedSalary = (int) salary; 
        
        System.out.println("Original double salary: " + salary);
        System.out.println("Casted int salary: " + roundedSalary); // Outputs 85000 (.75 is lost)
        System.out.println();


        System.out.println("=== 3. THE DANGER ZONE: Data Overflow ===");
        int hugeNumber = 130;
        // A byte can only hold values from -128 to 127. 
        // Forcing 130 into a byte causes it to wrap around!
        byte compressedByte = (byte) hugeNumber; 
        
        System.out.println("Original huge int: " + hugeNumber);
        System.out.println("Casted byte value: " + compressedByte); // Outputs -126 (Data corruption!)
        System.out.println();


        System.out.println("=== 4. BONUS: Char to Int Conversion (ASCII/Unicode) ===");
        char letter = 'A';
        // Widening happens here because char converts to its underlying numeric code
        int asciiValue = letter; 
        
        System.out.println("Character: " + letter);
        System.out.println("Corresponding ASCII/Unicode number: " + asciiValue); // Outputs 65
    }
}