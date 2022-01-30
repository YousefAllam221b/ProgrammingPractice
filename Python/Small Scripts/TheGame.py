import random
bags=[10,10,10]
turn='p'
flag=True
while flag:
    if turn == 'p':
        bagP=eval(input("Select the number of the bag:"))
        print(bagP)
        while bags[bagP-1] ==0:
            print("please choose a non empty bag ")
            bagP=eval(input("Select the number of the bag:"))
        while bagP <1 or bagP > 3 or bagP ==0:
            print("please enter a number from 1 to 3")
            bagP=eval(input("Select the number of the bag:"))
        objectsP=eval(input("Select number of objects:"))
        while objectsP <1 or objectsP > 5 or objectsP ==0:
            print("please enter a number from 1 to 5")
            objectsP=eval(input("Select number of objects:"))
        while bags[bagP-1] < objectsP :
                print("you cannot remove these objects")
                objectsP=eval(input("Select number of objects:"))
        else:
            print("You took: ",objectsP," objects from: ",bagP)
            bags[bagP-1]-= objectsP
            print(bags)
        turn ='c'
        if bags ==[0,0,0]:
            flag=False
            break
    if turn == 'c':
        bagC=random.randint(1,3)
        while bags[bagC-1] ==0:
             bagC=random.randint(1,3)

        if bags[bagC-1] < 5:
            objectsC = random.randint(1,bags[bagC-1])
        else:
            objectsC = random.randint(1,5)
        print("The computer took: ",objectsC," objects from: ",bagC)
        bags[bagC-1]-= objectsC
        print(bags)
        turn = 'p'
        if bags ==[0,0,0]:
            flag=False
            break
if turn == 'p':
    print("the computer wins and you lose")
else:
    print("you win")
