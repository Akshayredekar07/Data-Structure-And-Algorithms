

def dec_binary_number(n):
    bin = [0] * 32
    i = 0
    while n > 0:
        bin[i] = n % 2
        n = n // 2
        i += 1
    
    for j in range(i - 1, -1, -1):
        print(bin[j], end='')

# Example usage
dec_binary_number(17)


