a=input('A value')
b=input('B value')
c=input('C value')
below=2*a   # under the fraction
srn=b**2        #inside the square root
rod=-4*a*c
rest=srn + rod
rightb=-abs(b)      #sets b negitive
num_square = rest**0.5    # starting to add and subtract
Olast=num_square + rightb
Plast=rightb - num_square
fresult=Olast/below
sresult=Plast/below
'''
switchPro=-abs(fresult)
switchNeg=abs(sresult)
'''
switchPro=fresult
switchNeg=sresult
print 'x=', switchNeg
print 'x=', switchPro
'''
print num_square, rightb, below
print Olast, Plast
'''






