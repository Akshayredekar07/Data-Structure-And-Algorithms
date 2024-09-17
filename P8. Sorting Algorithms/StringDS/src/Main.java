public class Main {
    public static void main(String[] args) {

        /*
        Using String Literals:
        Using the new Keyword:
        What is a String?

A string is a sequence of characters (letters, numbers, symbols, etc.) used to represent text.
It's an object of the String class, which provides various methods for manipulating and working with text data.
Strings are immutable, meaning their contents cannot be changed after creation.
Key Concepts:

Creating Strings:
Using double quotes: String name = "Alice";
Using the new keyword (less common): String greeting = new String("Hello");
Concatenation: Joining strings: String message = "Hello, " + name + "!";
Accessing Characters:
Using indexing: char firstLetter = name.charAt(0);
Substrings: String lastName = name.substring(4);
Common Methods:
length(): Returns the number of characters.
toUpperCase(): Converts to uppercase.
toLowerCase(): Converts to lowercase.
indexOf(): Finds the first occurrence of a character or substring.
lastIndexOf(): Finds the last occurrence.
contains(): Checks if a substring is present.
startsWith(): Checks if a string starts with a given substring.
endsWith(): Checks if a string ends with a given substring.
replace(): Replaces characters or substrings.
split(): Splits a string into an array of substrings based on a delimiter.
trim(): Removes leading and trailing whitespace.
Important Points:

Immutability: Strings are immutable, so operations like concatenation create new strings rather than modifying existing ones.
String Pool: Java optimizes string storage using a string pool. Identical strings often refer to the same object in memory for efficiency.
StringBuilder and StringBuffer: For frequent string modifications, consider StringBuilder (unsynchronized) or StringBuffer (thread-safe).
They allow efficient in-place modifications.
         */



        String str1 = "Hello, World!";
        System.out.println(str1);

        String str2 = new String("Hello, World!");




    }
}
