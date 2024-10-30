
def printF(ind, ds, arr, n):
    if ind == n:
        for it in ds:
            print(it, end=" ")
        if len(ds) == 0:
            print("()", end="")
        else:
            print()
        return

    # Take or pick the particular index into the subsequence
    ds.append(arr[ind])
    printF(ind + 1, ds, arr, n)
    ds.pop()

    # Not pick, or not take condition, this element is not added to your subsequence
    printF(ind + 1, ds, arr, n)


if __name__ == "__main__":
    arr = [3, 1, 2]
    n = 3
    ds = []
    printF(0, ds, arr, n)
