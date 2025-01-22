public class SmallestLetter {

    public static void main(String[] args) {
        SmallestLetter solution = new SmallestLetter();

        // Example test cases
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';
        System.out.println(solution.nextGreatestLetter(letters1, target1)); // Output: c

        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';
        System.out.println(solution.nextGreatestLetter(letters2, target2)); // Output: f

        char[] letters3 = {'c', 'f', 'j'};
        char target3 = 'd';
        System.out.println(solution.nextGreatestLetter(letters3, target3)); // Output: f

        char[] letters4 = {'c', 'f', 'j'};
        char target4 = 'g';
        System.out.println(solution.nextGreatestLetter(letters4, target4)); // Output: j

        char[] letters5 = {'c', 'f', 'j'};
        char target5 = 'k';
        System.out.println(solution.nextGreatestLetter(letters5, target5)); // Output: c (wrap around)

        char[] letters6 = {'e','e','e','e','e','e','n','n'};
        char target6 = 'd';
        System.out.println(solution.nextGreatestLetter(letters6, target6)); // Output: e

    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length]; // Modulo for wrap-around
    }
}
