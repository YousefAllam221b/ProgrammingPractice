a=eval(input())
b=eval(input())
c=eval(input())
x=a-b
y=b-c
z=a-c
if x*y>0:
    print("the middle number is ",b)
elif y*z>0:
    print("the middle number is ",a)
else:
    print("the middle number is ",c)
