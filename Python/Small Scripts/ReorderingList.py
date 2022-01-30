list1=eval(input())
list2=eval(input())
list3=list1 +list2
i=0
while i < len(list3)-1:
    if list3[i+1]<list3[i]:
        temp=list3[i]
        list3[i]=list3[i+1]
        list3[i+1]=temp
        i=0
    i+=1
print(list3)
