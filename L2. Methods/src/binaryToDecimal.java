public class binaryToDecimal {
    public static void main(String[] args) {
        binDec(1010);
    }

    public static void binDec(int binNum){
        int pow = 0;
        double decNum = 0;
        while(binNum > 0){
            int ld = binNum % 10;
            decNum = decNum + (ld*Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println(decNum);
    }
}
