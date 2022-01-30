import pandas as pd
pd.set_option("display.max_rows", None, "display.max_columns", None)
#Structure
file3 =open('sample','r', errors='ignore')
file4 =open('replaced','w+')
contents2=file3.read()
for x in range(len(contents2)):

    if contents2[x] == ",":
        file4.write("!!@@@")
    else:
        file4.write(str(contents2[x]))
file4.close()
names=["Month" ,"Day" ,"Time" , "Machine", "State"]
df= pd.read_csv('replaced', sep=" " , usecols=range(5) ,names=names )
df[['Month', 'Day','Time','State','Machine']] = df[['Month', 'Day','Time','State','Machine']].astype(str)
df['Structure']= df['Month'] + ' ' + df['Day'] + df['Time'] + ' ' + df['State'] + ' ' +df['Machine']
dict={"Structure": df["Structure"]}

#Info
file =open('replaced','r', errors='ignore')
file2 =open('last','w+')
contents=file.read()
for x in range(len(contents)):

    if contents[x] == ":" and contents[x-1] != "d":
        file2.write("!-!")
    else:
        file2.write(str(contents[x]))
file2.close()
df2 = pd.read_csv('last', header=None, sep='\n' , encoding='latin-1')
info_only= df2.reset_index()
info_only = info_only[0].str.split(': ', expand=True)
dict2={"Info": info_only[1]}
#both
dict_last=pd.DataFrame([dict,dict2])
dict_last.to_csv('res.csv',index=False)
print(dict_last)
