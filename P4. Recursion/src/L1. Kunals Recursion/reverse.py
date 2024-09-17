
def rev2(n):
    digits = len(str(n))
    return helper(n, digits)

def helper(n: int, digits: int) -> int:
    if n % 10 == 0:
        return n
    rem = n % 10
    return rem * 10**(digits - 1) + helper(n // 10, digits - 1)

print(rev2(1234))


