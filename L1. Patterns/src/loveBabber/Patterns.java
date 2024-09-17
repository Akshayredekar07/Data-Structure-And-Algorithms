package loveBabber;

public class Patterns {
    public static void main(String[] args) {

        int n = 4;

//        int i = 1;
//        while(i <= n){
//            int j = 1;
//            while (j <= n){
//                System.out.print(j + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        while(i <= n){
//            int j = 1;
//            while (j <= n){
//                System.out.print(n-j+1 + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //1,2,3
        //4,5,6
        //7,8,9
//        int count = 1;
//        int i = 1;
//        while(i <= n){
//            int j = 1;
//            while (j <= n){
//                System.out.print(count + " ");
//                count = count + 1;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //without using the counter variable
//        for(int row = 1; row <= n; row++){
//            for (int col = 1; col <= n; col++) {
//                int val = (row - 1)*n + col;
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }

        //*
        //**
        //***
//        int i = 1;
//        while(i <= n){
//            int j = 1;
//            while(j <= i){
//                System.out.print("*" + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        //1
        //23
        //345
//        int row = 1;
//        while(row <= n){
//            int col = 1;
//            int value = row;
//            while(col <= row){
//                System.out.print(value + " ");
//                value = value + 1;
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

        //1
        //21
        //321
        //4321
//        int row = 1;
//        while(row <= n){
//            int col = 1;
//            while(col <= row){
//                System.out.print((row-col+1)+ " ");
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

        //AAA
        //BBB
        //CCC
//        int row = 1;
//        while(row <= n){
//            int col = 1;
//            char ch = 'A';
//            while(col <= n){
//                System.out.print((char)(ch+ col-1));
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

        //ABC
        //ABC
        //ABC
//        int row = 1;
//        while(row <= n){
//            int col = 1;
//            char ch = 'A';
//            while(col <= n){
//                System.out.print((char)(ch+ row-1));
//                col++;
//            }
//            System.out.println();
//            row++;
//        }


        //ABC
        //DEF
        //GHI
//        int row = 1;
//        while(row <= n){
//            int col = 1;
//            char c = (char)('A' + row + col -2);
//            while(col <= n){
//                System.out.print(c);
//                c = (char)(c + 1);
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

        //A
        //BB
        //CCC
//        for(int i = 1; i <= n; i++){
//            char ch = (char)('A' + i - 1);
//            for(int j = 1; j <= i; j++){
//                System.out.print(ch);
//            }
//            System.out.println();
//        }

        //A
        //BC
        //DEF
//        int row = 1;
//        int ch = 65;
//        while(row <= n){
//            int col = 1;
//            while(col <= row){
//                System.out.print((char)(ch));
//                ch++;
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

        //A
        //BC
        //CDE
//        int row = 1;
//        int ch = 'A';
//        while(row <= n){
//            int col = 1;
//            while(col <= row){
//                System.out.print((char)(ch+row+col-2));
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

//        int row = 1;
//        while(row <= n){
//            int col = 1;
//            int ch = (char)('A'+ n - row);
//            while(col <= row){
//                System.out.print((char)(ch));
//                ch++;
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

//        int row = 1;
//        while(row <= n){
//            int col = 1;
//            int ch = (char)('A'+ row + col - 2);
//            while(col <= n){
//                System.out.print((char)(ch));
//                ch++;
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

//        int row = 1;
//        while (row <= n) {
//            int space = n - row;
//            while (space > 0) {
//                System.out.print(" ");
//                space = space - 1;
//            }
//
//            int col = 1;
//            while (col <= row) {
//                System.out.print("*");
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

        //****
        //***
        //**
        //*
//        int row = 1;
//        while (row <= n) {
//            int col = 1;
//            while (col <= n-row+1) {
//                System.out.print("*");
//                col++;
//            }
//            System.out.println();
//            row++;
//        }

//        int i = 1;
//        while (i <= n) {
//            int space = 1;
//            while (space <= i-1){
//                System.out.print(" ");
//                space = space+1;
//            }
//            int j = 1;
//            while (j <= n-i+1) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        while (i <= n) {
//            int space = 1;
//            while (space <= i-1){
//                System.out.print(" ");
//                space = space+1;
//            }
//            int j = 1;
//            while (j <= n-i+1) {
//                System.out.print(i);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        while (i <= n) {
//            int space = 1;
//            while (space <= n-i){
//                System.out.print(" ");
//                space = space+1;
//            }
//            int j = 1;
//            while (j <= i) {
//                System.out.print(i);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
/*1234
*  234
*   34
*    4
* */
//        int i = 1;
//        while (i <= n) {
//            int space = 1;
//            while (space <= i-1){
//                System.out.print(" ");
//                space = space+1;
//            }
//            int j = 1;
//            int val = i;
//            while (j <= n-i+1) {
//                System.out.print(val);
//                val++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//        int i = 1;
//        int cnt = 1;
//        while (i <= n) {
//            int space = 1;
//            while (space <= n-i){
//                System.out.print(" ");
//                space = space+1;
//            }
//            int j = 1;
//            while (j <= i) {
//                System.out.print(cnt);
//                cnt++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


//        int i = 1;
//        int cnt = 1;
//        while (i <= n) {
//            int space = 1;
//            while (space <= n-i){
//                System.out.print(" ");
//                space = space+1;
//            }
//            int j = 1;
//            while (j <= i) {
//                System.out.print(j);
//                j++;
//            }
//
//            int k = i-1;
//            while(k > 0){
//                System.out.print(k);
//                k--;
//            }
//            System.out.println();
//            i++;
//        }

        //Dabang pattern
        int m = 5;
        int row = 1;
        while (row <= m){

            int j = 1;
            while (j <= m-row+1) {
                System.out.print(j);
                j++;
            }

            int l = 1;
            while (l <= row-1) {
                System.out.print("*");
                l++;
            }
            int k = row-1;
            while(k > 0){
                System.out.print("*");
                k--;
            }

            int s = m;
            while (s >= row){
                System.out.print(s-row+1);
                s--;
            }

            System.out.println();
            row++;

        }



    }
}
