
def printrec():
    print(1)
    printrec()

result = printrec()

try:
    print(result)
except Exception as e:
    print(str(e))