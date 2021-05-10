'''
data = {'cows': 1, 'pigs': 2, 'hourses': 3,}
print data['pigs']
'''


inventory = {'apples': 430, 'bananas': 312, 'oranges': 525, 'pears': 217}

for x in inventory.keys():     # the order in which we get the keys is not defined
   print("Got key", x, "which maps to value", inventory[x])

ks = list(inventory.keys())
print(ks)
print (inventory)



'''

inventory = {'apples': 430, 'bananas': 2, 'oranges': 525, 'pears': 217}
print('apples' in inventory)
print('cherries' in inventory)
x = inventory['bananas']
if x > 0:
    print(inventory['bananas'])
else:
    print("We have no bananas")
'''
'''
inventory = {'apples': 430, 'bananas': 312, 'oranges': 525, 'pears': 217}

print(inventory.get("apples"))
print(inventory.get("cherries",0))  #if there is nothing assistive with cherries in the list then it would print out 0

print(inventory.get("cherries",0))

'''
'''
#tells you you the hoghest number  in a list
listx = [1, 2, 3, 4, 5]
a = listx[0]
for x in listx:
    if x > a:
        a = x
print a
'''
d = {'a': 194, 'b': 54, 'c':34, 'd': 44, 'e': 312, 'full':31}

a = 0
for c in d:   #is going through all the lines in the list
    if d[c] > a:
        a = d[c]

print("max value is " + str(a))















