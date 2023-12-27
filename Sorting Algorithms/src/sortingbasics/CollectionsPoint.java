package sortingbasics;

import java.util.*;
import java.lang.*;
import java.io.*;

class CollectionsPoint implements Comparable<CollectionsPoint> {
    int x, y;

    CollectionsPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(CollectionsPoint P) {
        return this.x - P.x;
    }
}

class GfG {
    public static void main(String[] args) {
        List<CollectionsPoint> list = new ArrayList<CollectionsPoint>();
        list.add(new CollectionsPoint(5, 10));
        list.add(new CollectionsPoint(2, 20));
        list.add(new CollectionsPoint(10, 30));

        Collections.sort(list);

        for (CollectionsPoint p : list)
            System.out.println(p.x + " " + p.y);
    }
}
