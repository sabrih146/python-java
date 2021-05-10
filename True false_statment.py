import sys
y = '%'
x = 0
for r in range(-999998, 99999, 2):
    y =2

for line in open('proTest.txt'):
    x += 1
print '<',x,'>'
f=open('proTest.txt')
lines=f.readlines()

yo = raw_input('what number do you want the lines in your file to skip by? :')
if x < int(yo):
    print
    print 'thats too high of a number'
    sys.exit()

for i in range(0, x, int(yo)):
    print lines[i]
   

    

    
