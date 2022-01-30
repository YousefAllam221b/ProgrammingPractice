i=eval(input())
x=i-1
while x>1:
    y =i%x
    if y == 0:
        print(i , "is not a prime number")
        break
    x =x-1
