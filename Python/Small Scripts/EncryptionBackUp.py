put=input("Please enter your text  ")
dict={"yousef":"yes","nada":"no","ahmed":"maybe","omar":"sure","yes":"12ab34","no":"56cd78","maybe":"78ef90","sure":"09gh87"}
dict_2={"a":"0","b":"1","c":"2","d":"3","e":"4","f":"5","g":"6","h":"7","i":"8","j":"9","k":"10","l":"11","m":"12","n":"13","o":"14","p":"15","q":"16","r":"17","s":"18","t":"19","u":"20","v":"21","w":"22","x":"23","y":"24","z":"25"}
for k,v in dict_2.items():
    put=put.replace(k,v)
print(put)
