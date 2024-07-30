public class decimal_to_bin{
    public static void main (String[] args) {

        int n = 10;

        int ans = 0;
        int i = 0;
        while(n != 0){

            int bit = n&1;
            ans = (bit << i) + ans ;
            n = n >> 1;
            i++;
        }
        System.out.println("Ans is " + ans);



        decBinaryNumber(17);

        int num = 59;
        System.out.print("Binary of num 59 is: ");
        reverse(DecimalToBinary(num));


        int N = 17;
        System.out.println (decimalToBinary(N));
        //Time complexity: O(logn) & Auxiliary Space: O(1)

    }

    public static void decBinaryNumber(int n){
        int [] bin = new int[32];
        int i=0;
        while(n > 0){
            bin[i] = n%2;
            n = n/2;
            i++;
        }
        for (int j = i-1; j >= 0; j--) {
            System.out.print(bin[j]);
        }
    }

    public void decToBinary(int n) {
        // Size of an integer is assumed to be 32 bits
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }


    static String DecimalToBinary(int num)
    {
        String str = "";
        while (num > 0) {
            if ((num & 1) == 1) // 1
                str += '1';
            else // 0
                str += '0';
            num >>= 1; // Right Shift by 1
        }
        return str;
    }
    //Time Complexity:  O(log n) & Auxiliary Space: O(1)

    // reverse the string
    static void reverse(String str)
    {
        for (int i = str.length() - 1; i >= 0; i--)
            System.out.print(str.charAt(i));
    }

    static int decimalToBinary(int N)
    {

        // To store the binary number
        int B_Number = 0;
        int cnt = 0;
        while (N != 0)
        {
            int rem = N % 2;
            double c = Math.pow(10, cnt);
            B_Number += rem * c;
            N /= 2;

            // Count used to store exponent value
            cnt++;
        }

        return B_Number;
    }

}

