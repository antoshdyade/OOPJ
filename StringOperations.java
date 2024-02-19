import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input strings from the console
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        
        // Method 1: Concatenation
        String concat = str1 + str2;
        System.out.println("Concatenation of the strings: " + concat);
        
        // Method 2: Length of strings
        int length1 = str1.length();
        int length2 = str2.length();
        System.out.println("Length of first string: " + length1);
        System.out.println("Length of second string: " + length2);
        
        // Method 3: Substring
        System.out.print("Enter the starting index for substring: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending index for substring: ");
        int end = scanner.nextInt();
        
        String substr = str1.substring(start, end);
        System.out.println("Substring of first string: " + substr);
        
        // Method 4: Conversion to lowercase
        String lowercase = str1.toLowerCase();
        System.out.println("Lowercase version of first string: " + lowercase);
        
        // Method 5: Conversion to uppercase
        String uppercase = str2.toUpperCase();
        System.out.println("Uppercase version of second string: " + uppercase);
        
        // Method 6: Trim whitespace
        System.out.print("Enter a string with leading/trailing whitespace: ");
        scanner.nextLine(); // consume newline character
        String str3 = scanner.nextLine();
        
        String trimmed = str3.trim();
        System.out.println("Trimmed version of third string: " + trimmed);
        
        // Method 7: Check if a string contains a substring
        System.out.print("Enter a substring to search for: ");
        String sub = scanner.nextLine();
        
        boolean contains = str1.contains(sub);
        System.out.println("First string contains the substring: " + contains);
        
        // Method 8: Replace characters
        System.out.print("Enter a character to replace: ");
        char oldChar = scanner.next().charAt(0);
        
        System.out.print("Enter a character to replace with: ");
        char newChar = scanner.next().charAt(0);
        
        String replaced = str2.replace(oldChar, newChar);
        System.out.println("Second string after replacement: " + replaced);
        
        // Method 9: Check if two strings are equal (ignoring case)
        boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Are the strings equal (ignoring case)? " + equalsIgnoreCase);
        
        scanner.close();
    }
}
