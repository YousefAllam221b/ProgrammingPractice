put=input("Please enter your text  ")
dict={"yousef":"yes","nada":"no","ahmed":"maybe","omar":"sure","yes":"12ab34","no":"56cd78","maybe":"78ef90","sure":"09gh87"}
for k,v in dict.items():
    put=put.replace(k,v)
print(put)
