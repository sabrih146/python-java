import turtle
x=turtle.Turtle()

def drawRectangle(x, width, height, color):
    x.fillcolor(color)
    x.begin_fill()
    x.forward(width)
    x.left(90)
    x.forward(height)
    x.left(90)
    x.forward(width)
    x.left(90)
    x.forward(height)
    x.left(90)
    x.end_fill()
drawRectangle(x, 250, 25, "yellow")

#Triangle
x.color("sandybrown")
x.begin_fill()
x.left(90)
x.forward(25)
x.left(120)
x.forward(25)
x.left(120)
#lead
x.color("black")
x.forward(5)
x.left(120)
x.forward(5)
x.left(120)
x.forward(5)
x.left(120)
x.forward(25)

x.color("sandybrown")
x.left(120)
x.end_fill()


#Pencil lines
x.color("black")
x.penup()
x.forward(8.33)
x.pendown()
x.right(90)
x.forward(75)
x.penup()
x.forward(50)
x.pendown()
x.forward(125)
x.left(90)
x.forward(8.33)
x.left(90)
x.forward(25)
x.penup()
x.forward(75)
x.pendown()
x.forward(150)
x.right(90)
x.forward(8.33)
x.right(90)
x.forward(250)

#iron part of the pencil
drawRectangle(x, 25, -25, "gray")
x.color("black")
x.forward(8.33)
x.right(90)
x.penup()
x.forward(10)
x.pendown()
x.forward(13)
x.penup()
x.forward(2)
x.left(90)
x.forward(8.33)
x.left(90)
x.penup()
x.forward(10)
x.pendown()
x.forward(13)
x.penup()
x.forward(2)
x.right(90)
x.forward(8.33)
#eraser
x.color("black")
drawRectangle(x, 10, -25, "pink")
x.hideturtle()








