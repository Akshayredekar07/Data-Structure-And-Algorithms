import java.util.Arrays;

public class passingInFunctions {
    public static void main(String[] args) {
        int [] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

        String [] str = new String[3];
        str[2] = "Harshal";
        System.out.println(Arrays.toString(str));
        strArray(str);
        System.out.println(Arrays.toString(str));
    }

    static void change(int [] arr){
        arr[0] = 99;
    }

    static void strArray(String [] arr){
        arr[2] = "Prathamesh";
    }
}
