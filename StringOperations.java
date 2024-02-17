package amd;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated: " + concatenated);
        
        // Length
        int length = concatenated.length();
        System.out.println("Length: " + length);
        
        // Substring
        String substring = concatenated.substring(6); // starts from index 6 to the end
        System.out.println("Substring: " + substring);
        
        // Uppercase and lowercase
        String uppercase = concatenated.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        
        String lowercase = concatenated.toLowerCase();
        System.out.println("Lowercase: " + lowercase);
        
        // Replace
        String replaced = concatenated.replace("Hello", "Hi");
        System.out.println("Replaced: " + replaced);
        
        // Contains
        boolean containsHello = concatenated.contains("Hello");
        boolean containsJava = concatenated.contains("Java");
        System.out.println("Contains Hello: " + containsHello);
        System.out.println("Contains Java: " + containsJava);
        
        // Split
        String[] splitted = concatenated.split(" ");
        System.out.println("Splitted: ");
        for (String word : splitted) {
            System.out.println(word);
        }
    }
}