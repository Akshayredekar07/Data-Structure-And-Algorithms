
def printNto1(i ,N):
    if i < 1:
        return
    
    print(i)
    printNto1(i-1, N)


if __name__ == "__main__":
    printNto1(5,5)