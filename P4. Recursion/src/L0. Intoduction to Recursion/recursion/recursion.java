package intoduction.recursion;

/**
 * printfunction
 */
public class recursion {

    static void print(int n) {
        if (n <= 0) {
            return; 
        }
        System.out.println(n);
        print(n - 1); 
    }

    public static void main(String[] args) {
        print(10);
    }
}

/*
Dry run of the print function in tree format:

print(10)
├── print(10) prints 10
│   ├── print(9) prints 9
│   │   ├── print(8) prints 8
│   │   │   ├── print(7) prints 7
│   │   │   │   ├── print(6) prints 6
│   │   │   │   │   ├── print(5) prints 5
│   │   │   │   │   │   ├── print(4) prints 4
│   │   │   │   │   │   │   ├── print(3) prints 3
│   │   │   │   │   │   │   │   ├── print(2) prints 2
│   │   │   │   │   │   │   │   │   ├── print(1) prints 1
│   │   │   │   │   │   │   │   │   │   └── print(0) returns (base case)
│   │   │   │   │   │   │   │   │   └── returns
│   │   │   │   │   │   │   │   └── returns
│   │   │   │   │   │   │   └── returns
│   │   │   │   │   │   └── returns
│   │   │   │   │   └── returns
│   │   │   │   └── returns
│   │   │   └── returns
│   │   └── returns
│   └── returns
└── returns

Output:
10
9
8
7
6
5
4
3
2
1
*/
