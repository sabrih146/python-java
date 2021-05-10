import turtle
import random
x=turtle.Turtle()
x.speed(0)


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
x.goto(1000, 0)
drawRectangle(x, -4000, 6000, "blue")
o = 100
y=0
px = random.randint(-40000,40000)
py = random.randint(6000,6000)
x.penup() 
x.goto(400, 300)

x.fillcolor("yellow")
x.pendown()
x.begin_fill()
x.circle(50)
x.end_fill()
x.penup()

while o>y:
    x.penup()
    x.goto(int(px), int(py))
    x.fillcolor("light blue")
    x.pendown()
    x.begin_fill()
    x.circle(10)
    x.end_fill()
    px = random.randint(-400,800)
    py = random.randint(0,400)
    y+=1
x.penup()
x.goto(0,0)
drawRectangle(x, -4000, -6000, "sandy brown")
drawRectangle(x, 4000, -6000, "sandy brown")

px = random.randint(400,400)
py = random.randint(-600,-600)

x.penup()
o = 1000
y=0

while o>y:
    x.penup()
    x.goto(int(px), int(py))
    x.fillcolor("Light Goldenrod")
    x.pendown()
    x.begin_fill()
    x.circle(5)
    x.end_fill()
    px = random.randint(-4000,4000)
    py = random.randint(-400,0)
    y+=1
x.penup()
o = 1000
y=0

while o>y:
    x.penup()
    x.goto(int(px), int(py))
    x.fillcolor("black")
    x.pendown()
    x.begin_fill()
    x.circle(2)
    x.end_fill()
    px = random.randint(-4000,4000)
    py = random.randint(-400,0)
    y+=1


