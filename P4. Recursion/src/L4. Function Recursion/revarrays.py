

def reverse(arr):
    i, j = 0, len(arr)-1

    if arr[i] == arr[j]:
        return arr[i]
    
    while i <= j:
        arr[i], arr[j] = arr[j], arr[i]

    return arr


#main
a = [1 ,2, 3, 4, 2]
res = reverse(a)
print(res)

