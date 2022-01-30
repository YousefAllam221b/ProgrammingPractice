import random
number=random.randint(1,100)
guess=0
count=0
print(number)
while guess != number:
    guess=eval(input("Enter your guess "))
    if guess < 1 or guess >100:
        print("invalid, try again")
    elif guess>number:
        print("the number is lower than ",guess)
        count+=1
    elif guess<number:
        print("the number is bigger than",guess)
        count+=1
print("you guessed it in ",count," tries!")
