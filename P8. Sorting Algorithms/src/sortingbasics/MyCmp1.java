package sortingbasics;

import java.util.*;
import java.lang.*;

class MyCmp1 implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        return a % 2 - b % 2;
    }
}

class Test4 {
    public static void main(String[] args) {
        Integer[] arr = {5, 20, 10, 3, 12};

        Arrays.sort(arr, new MyCmp1());

        System.out.println(Arrays.toString(arr));
    }
}

