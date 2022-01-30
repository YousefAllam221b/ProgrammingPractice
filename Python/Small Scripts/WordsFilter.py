put=input("Please enter your text  ")
list=["yousef","nada","ahmed","omar"]
i=0
p=0
y=put.split()
while p<len(list):
  while i<len(y) :
    if y[i] == list[p]:
       put = put.replace(y[i],"*"*len(list[p]))
    i+=1
  p+=1
  i=0
print(put)
