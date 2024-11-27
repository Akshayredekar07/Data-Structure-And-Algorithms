
def palin(i, s):

    if (i >= len(s)/2): 
        return True
    
    if( s[i] != s[len(s)-i-1]):
        return False
    
    return palin(i+1, s)


## main 
# s = "MADAM"
s = "MADSM"
ans = palin(0, s)
print(ans)