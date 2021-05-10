no = 'no'
No = 'No'
NO = 'NO'
yes = 'yes'
Yes = 'yes'
YES = 'YES'
# sabri(1).txt
x = 2
y = 3
def w2():
    raw_input('Press enter to exit')
def w3():
    raw_input('Press enter to exit')


    
option_No = [no,No,NO]
option_Yes = [yes,Yes,YES]
File = raw_input("What is your file named?")
print
print ('-' + File + '-')
print
file_stuff = open(File,'r')
everything = file_stuff.read().replace('/n','')
print

print everything
file_stuff.close()
print 
w1 = raw_input('Do you want to count how many words or letters appear in this file?')

    
if w1 == yes:
    print
    print
    w2 = raw_input('What word or letter?')
    with open(File) as f:
        contents = f.read()
        count = contents.count(w2)
        print count
        w3 = raw_input('Do you want to count anthor word in a file ')

while w1 == no:
    break

stop = 'stop'

if w3 == yes:
    y += 1
    print
    print 'Close the window to end'
    
while y > x:
    print
    w2 = raw_input('Anthor word?: ')
    
    if w2 == stop:
        x += 3
    elif w2 != stop:
        with open(File) as f:
            contents = f.read()
            count = contents.count(w2)
            print count



