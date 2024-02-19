public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Method 1: charAt()
        char charAtIndex = str.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);
        
        // Method 2: length()
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // Method 3: substring()
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);
        
        // Method 4: contains()
        boolean contains = str.contains("World");
        System.out.println("Contains 'World'? " + contains);
        
        // Method 5: indexOf()
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index);
        
        // Method 6: lastIndexOf()
        int lastIndex = str.lastIndexOf("l");
        System.out.println("Last index of 'l': " + lastIndex);
        
        // Method 7: equals()
        boolean equals = str.equals("Hello, World!");
        System.out.println("Equals 'Hello, World!'? " + equals);
        
        // Method 8: equalsIgnoreCase()
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("Equals (ignore case) 'hello, world!'? " + equalsIgnoreCase);
        
        // Method 9: toUpperCase()
        String upperCase = str.toUpperCase();
        System.out.println("Uppercase: " + upperCase);
        
        // Method 10: toLowerCase()
        String lowerCase = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);
        
        // Method 11: replace()
        String replaced = str.replace("Hello", "Hi");
        System.out.println("Replaced 'Hello' with 'Hi': " + replaced);
        
        // Method 12: trim()
        String trimmed = "  Hello, World!   ".trim();
        System.out.println("Trimmed: " + trimmed);
        
        // Method 13: startsWith()
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello'? " + startsWith);
        
        // Method 14: endsWith()
        boolean endsWith = str.endsWith("World!");
        System.out.println("Ends with 'World!'? " + endsWith);
        
        // Method 15: isEmpty()
        boolean isEmpty = str.isEmpty();
        System.out.println("Is empty? " + isEmpty);
        
        // Method 16: concat()
        String concatenated = str.concat(" Goodbye!");
        System.out.println("Concatenated: " + concatenated);
        
        // Method 17: valueOf()
        int number = 123;
        String valueOfNumber = String.valueOf(number);
        System.out.println("String value of number: " + valueOfNumber);
    }
}
