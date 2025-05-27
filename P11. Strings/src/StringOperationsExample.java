public class StringOperationsExample {

    public static void main(String[] args) {
        // Creating Strings
        String fruit1 = "Apple";
        String fruit2 = new String("Banana");

        // Concatenation
        String message = "I love " + fruit1 + " and " + fruit2 + "!";

        // Accessing Characters
        char firstLetter = fruit1.charAt(0);
        String substring = fruit1.substring(1);

        // Common Methods
        int length = fruit1.length();
        String upperCaseFruit1 = fruit1.toUpperCase();
        String lowerCaseFruit2 = fruit2.toLowerCase();
        int indexOfA = fruit1.indexOf('A');
        int lastIndexOfA = fruit1.lastIndexOf('A');
        boolean containsBan = message.contains("Ban");
        boolean startsWithI = message.startsWith("I love");
        boolean endsWithExclamation = message.endsWith("!");

        // Replace
        String replacedMessage = message.replace("love", "enjoy");

        // Split
        String fruits = "Apple, Banana, Orange";
        String[] fruitArray = fruits.split(", ");

        // Trim
        String withSpaces = "   Pineapple   ";
        String trimmed = withSpaces.trim();

        // Output
        System.out.println("Original Message: " + message);
        System.out.println("First Letter of " + fruit1 + ": " + firstLetter);
        System.out.println("Substring of " + fruit1 + ": " + substring);
        System.out.println("Length of " + fruit1 + ": " + length);
        System.out.println("Uppercase of " + fruit1 + ": " + upperCaseFruit1);
        System.out.println("Lowercase of " + fruit2 + ": " + lowerCaseFruit2);
        System.out.println("Index of 'A' in " + fruit1 + ": " + indexOfA);
        System.out.println("Last Index of 'A' in " + fruit1 + ": " + lastIndexOfA);
        System.out.println("Contains 'Ban': " + containsBan);
        System.out.println("Starts with 'I love': " + startsWithI);
        System.out.println("Ends with '!': " + endsWithExclamation);
        System.out.println("Replaced Message: " + replacedMessage);

        System.out.println("Fruits Array: ");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        System.out.println("Original String with Spaces: '" + withSpaces + "'");
        System.out.println("Trimmed String: '" + trimmed + "'");

        String s = "Radhe shyam";
        String s1 = "likes cows!!";
        boolean ends =  s.endsWith("shyam");
        System.out.println(ends);

        s1.toUpperCase();
        System.out.println(s1);

        System.out.println(s.indexOf("R"));
  
    }
}
