import os
import copy
import re
startfile=r"C:\Users\Yousef\Videos\Series - Copy - Copy - Copy"
adict={}
def extracting():
    with open("list.txt","w") as file:
        for root,dirs,files in os.walk(startfile):
            level=root.replace(startfile,"").count(os.sep)
            adict[root]={"folders":[],"files":[]}
            indent=" "*4*(level)
            file.write(indent+os.path.basename(root)+"\n")
            subindent=" "*4*(level+1)
            for d in dirs:
                adict[root]["folders"]+=[d]
            for f in files:
                adict[root]["files"]+=[f]
                file.write(subindent+f+"\n")
extracting()
names=copy.deepcopy(adict)
def changing():
    out=[]
    for key in adict.keys():
        if key != startfile:
            out=[]
            for val in adict[key]["files"]:
                    level=key.replace(startfile,"")
                    level=level.split("\\")[1]
                    season=re.compile("(?=.*)(S\d\d|s\d\d)(?=.*)")
                    episode=re.compile("(?=.*)(E\d\d|e\d\d)(?=.*)")
                    se=season.findall(val)
                    ep=episode.findall(val)
                    if len(se) !=0 and len(ep) !=0:
                        for n, i in enumerate(adict[key]["files"]):
                            if i == val:
                                out += [level +" "+ se[0] + " " + ep[0] + val[-4:]]
                    else:
                        out+=[val]
            names[key]["files"]=out
changing()
def renaming():
    before=[]
    after=[]
    with open("list2.txt","w") as file:
        for key in adict.keys():
            file.write(key+'\n')
            for val in adict[key]["files"]:
                    before+=[key+"\\"+val]
                    file.write(val+'\n')
    with open("list3.txt","w") as file:
        for key in names.keys():
            file.write(key+'\n')
            for val in names[key]["files"]:
                    after+=[key+"\\"+val]
                    file.write(val+"\n")
    for x in range(len(before)):
        os.rename(before[x],after[x])
renaming()
