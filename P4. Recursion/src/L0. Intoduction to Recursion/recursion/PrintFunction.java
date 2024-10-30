package intoduction.recursion;

public class PrintFunction {

    public static void main(String[] args) {
        print(0);
    }

    static void print(int count) {
        if (count >= 10) {
            return;
        }
        System.out.println(count);
        print(count + 1);
    }
}

/*
Dry run of the print function in tree format:

print(0)
├── print(0) prints 0
│   ├── print(1) prints 1
│   │   ├── print(2) prints 2
│   │   │   ├── print(3) prints 3
│   │   │   │   ├── print(4) prints 4
│   │   │   │   │   ├── print(5) prints 5
│   │   │   │   │   │   ├── print(6) prints 6
│   │   │   │   │   │   │   ├── print(7) prints 7
│   │   │   │   │   │   │   │   ├── print(8) prints 8
│   │   │   │   │   │   │   │   │   ├── print(9) prints 9
│   │   │   │   │   │   │   │   │   │   └── print(10) returns (base case)
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
0
1
2
3
4
5
6
7
8
9
*/
