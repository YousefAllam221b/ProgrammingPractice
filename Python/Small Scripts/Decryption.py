file= input("Please enter the file path   ")
change = open(file).read()
dict={"yousef":"yes","nada":"no","ahmed":"maybe","omar":"sure","yes":"12ab34","no":"56cd78","maybe":"78ef90","sure":"09gh87"}
for k,v in dict.items():
    change = change.replace(v,k)
print(change)
