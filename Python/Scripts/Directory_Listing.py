import os
import re
import copy
directory=r"/media/yousef/6a7721ee-4aef-4fec-8acf-614869125d1d/home/yousef/Desktop"
adict={}
def extract_series():
	"""This function access the directory and creates a dict and a text.txt file which includes the directory tree."""
	with open("text.txt","w") as file:
		folders=os.listdir(directory)
		adict={"folders":{},"files":[]}
		p=[]
		for folder in folders:
			if os.path.isdir(directory+"/"+folder):
				p=os.listdir(directory+"/"+folder)
				adict["folders"][folder]={}
				adict["folders"][folder]["files"]=[]
				for i in p:
					if os.path.isdir(directory+"/"+folder+"/"+i):
						b=os.listdir(directory+"/"+folder+"/"+i)
						adict["folders"][folder][i]=b
					else:
						adict["folders"][folder]["files"]+=[i]
			else:
				adict["files"]+=[folder]
		print(adict["folders"].keys())
		for key in adict.keys():
			file.write(key+"\n")
			if key !="files":
				for a in adict[key]:
					file.write("\t"+a+"\n")
					for val in adict[key][a]:
						file.write("\t\t"+ val+"\n")
						for aval in adict[key][a][val]:
							file.write("\t\t\t"+ aval+"\n")
			else:
				for a in adict[key]:
					file.write("\t"+a+"\n")
extract_series()
names=copy.deepcopy(adict)
def renaming():
	for key in names.keys():
		for a in names[key]:
			ind=0
			for val in names[key][a]:
				season=re.compile("(?=.*)(S\d\d|s\d\d)(?=.*)")
				episode=re.compile("(?=.*)(E\d\d|e\d\d)(?=.*)")
				se=season.findall(val)
				ep=episode.findall(val)
				if len(se) !=0 and len(ep) !=0:
					names[key][a][ind]= key +" "+ se[0] + " " + ep[0] + val[-4:]
				ind+=1
	for key in names.keys():
		if key !="files":
			for a in names[key]:
				for val in names[key][a]:
					for aval in names[key][a][val]:
						season=re.compile("(?=.*)(S\d\d|s\d\d)(?=.*)")
						episode=re.compile("(?=.*)(E\d\d|e\d\d)(?=.*)")
						se=season.findall(val)
						ep=episode.findall(val)
						if len(se) !=0 and len(ep) !=0:
							names[key][a][val][ind]= key +" "+ se[0] + " " + ep[0] + aval[-4:]
						ind+=1

	with open("text2.txt","w") as file2:
		for key in names.keys():
			file2.write(key+"\n")
			if key !="files":
				for a in names[key]:
					file2.write("\t"+a+"\n")
					for val in names[key][a]:
						file2.write("\t\t"+ val+"\n")
						for aval in names[key][a][val]:
							file2.write("\t\t\t"+ aval+"\n")
			else:
				for a in names[key]:
					file2.write("\t"+a+"\n")
renaming()

names=copy.deepcopy(adict)
