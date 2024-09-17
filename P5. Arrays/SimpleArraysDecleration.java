public class SimpleArraysDecleration {
    public static void main(String[] args) {
        int [] arr = new int[5];
        System.out.println(arr[0]);
        arr[1] = 44;
        System.out.println(arr[1]);

        //String array
        String [] str = new String[3];
        str[0] = "a";
        str[1] = "h";
        str[2] = "k";
        System.out.println(str[1]);

        boolean[] boolArr = new boolean[4];
        boolArr[0] = true;
        boolArr[1] = false;
        System.out.println(boolArr[1]);

        double [] longDarr = new double[5];
        longDarr[4] = 1234313;
        System.out.println(longDarr[4]);


    }
}
