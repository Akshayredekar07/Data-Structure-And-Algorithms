

## Multiple intoduction.recursion.recursion calls
## 0, 1, 1, 2, 3, 5, 8, 13

def fibonacci(n):
    if n<=1:
        return n
    #recursive call for (n-1) + (n-2)
    return fibonacci(n-1) + fibonacci(n-2)


## main
n = 5
ans = fibonacci(n)
print(ans)