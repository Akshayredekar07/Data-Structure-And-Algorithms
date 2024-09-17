class setBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(SetBits(n));

    } 
    
    static int SetBits(int n){
        int count = 0;
        while(n > 0){
            count++;
            // n = n - (n & (-n));  //or use
            n = n & (n-1);
            
        }
        return count;
    }
}
