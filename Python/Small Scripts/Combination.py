x=eval(input())
y=eval(input())
n=x
r=y
z=n-r
a=1
b=1
c=1
while n>1:
    a=a*(n)
    n-=1
while r>1:
    b=b*(r)
    r-=1
while z>1:
    c=c*(z)
    z-=1
combination=a/(b*c)
print(combination)
