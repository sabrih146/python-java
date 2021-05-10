import os
f = open("x.vbs","w+")
p = '{CAPSLOCK}'
w = 'WshShell.SendKeys "'+p +'"'
f.write('set WshShell = CreateObject("WScript.Shell")\n')
f.write (str(w))
f.close()
os.system("x.vbs")
'''
os.remove("x.vbs")
'''
print("done")

