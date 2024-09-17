package s4_problems_on_functional_rec;


public class palin {
    public static boolean isPalin(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return isPalin(i + 1, s);
    }

    public static void main(String[] args) {
//        String s = "MADAM";
         String s = "MADSM";
        boolean ans = isPalin(0, s);
        System.out.println(ans);
    }
}
