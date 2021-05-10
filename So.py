import tkinter
import tkinter.messagebox

class Menu:
    def __init__(self):

        self.main = tkinter.Tk()
        self.main.geometry("600x200")

        self.position = tkinter.Label(self.main, text = '123',\
                                      bg = 'Purple',\
                                      height = 2, width = 50)
        self.position.place(height=50, width= 100)

        self.position.pack()

        tkinter.mainloop()

    def button1(self):
        button = tkinter.Button(geometry("600x200"), 
                   text="QUIT", 
                   fg="red",
                   command=quit)
        self.position.place(height=20, width= 10)
        self.position.pack()

        tkinter.mainloop()

gui = Menu()
