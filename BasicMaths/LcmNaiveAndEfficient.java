class LcmNaiveAndEfficient{
    public static void main(String[] args) {
        System.out.println(lcm1(4, 6));
    }

    static int lcm1(int a, int b){
        int res  =  Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0){
                return res;
            }
            res++;
        }
    }

}