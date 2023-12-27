package sortingbasics;

import java.util.*;
import java.lang.*;

class Point2 {
    int x, y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class MyCmp implements Comparator<Point2> {
    public int compare(Point2 p1, Point2 p2) {
        return p1.x - p2.x;
    }
}

class Test2 {
    public static void main(String[] args) {
        Point2 arr[] = {
            new Point2(10, 20),
            new Point2(3, 12),
            new Point2(5, 7)
        };

//        Arrays.sort(arr, new MyCmp1());

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i].x + " " + arr[i].y);
    }
}
