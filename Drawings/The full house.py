import turtle
x=turtle.Turtle()
#sky

x.color("light blue")
x.speed(10000)
pos = x.position()
x.begin_fill()
x.forward(500)
x.left(180)
x.forward(1000)
x.right(90)
x.forward(500)
x.right(90)
x.forward(1000)
x.right(90)
x.forward(500)
x.end_fill()

#grass
x.begin_fill()
x.color("light green")
x.forward(500)
x.right(90)
x.forward(1000)
x.right(90)
x.forward(500)
x.right(90)
x.forward(1000)
x.end_fill()

def postion(co):
    x.color(co)
    x.penup()
    x.goto(0,0)
    x.right(180)
postion('black')

# house box
x.begin_fill()
x.color('black')
x.pendown()
x.forward(200)
x.right(90)
x.forward(150)
x.right(90)
x.forward(400)
x.right(90)
x.forward(150)
x.right(90)
x.forward(200)
x.end_fill()

# house triangle
x.begin_fill()
x.forward(200)
x.right(90)
x.forward(150)
x.right(60)
x.forward(230)
x.right(60)
x.forward(242)
x.penup()
x.end_fill()

postion('black')
x.color('red')



x.penup() 
x.goto(400, 300)
x.fillcolor("yellow")
x.pendown()
x.begin_fill()
x.circle(24)
x.end_fill()


def drawRectangle(t, width, height, color):
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

x.penup()
x.goto(-300,0)
x.color('brown')
x.right(60)
drawRectangle(x, 50, 10, 'brown')
x.forward(50)
x.color('green')
x.penup()
x.right(90)
x.forward(12)
x.left(90)
x.pendown()
x.begin_fill()
x.circle(24)
x.end_fill()

x.color('white')
x.penup()
postion('white')
x.pendown()
x.right(180)
x.penup()
x.forward(100)
x.left(90)
x.forward(100)
x.pendown()
drawRectangle(x, 40, 40, 'white')
x.penup()
x.right(180)
x.forward(200)
x.pendown()
x.left(180)
drawRectangle(x, 40, 40, 'white')
postion('brown')
x.penup()
x.goto(0,-200)
x.pendown()
x.forward(-600)
drawRectangle(x, 1200, 100, 'grey')







x.goto(-200,-200)
from turtle import Turtle, Screen

RADIUS = 25
FONTSIZE = int(RADIUS / 2)
FONT = ("Arial", FONTSIZE, "bold")

sarah = Turtle(visible=False)
sarah.penup()

screen = Screen()

sarah.sety(-RADIUS)
sarah.begin_poly()
sarah.circle(RADIUS, steps=8)
sarah.end_poly()
screen.register_shape("octagon", sarah.get_poly())
sarah.shape("octagon")

sarah.fillcolor("red")
sarah.home()
sarah.setheading(360 / 8 / 2)
sarah.stamp()

sarah.pencolor("white")
sarah.shapesize(0.9)
sarah.stamp()
sarah.shapesize(1.0)

sarah.sety(-FONTSIZE / 2)
sarah.write("STOP", align="center", font=FONT)

x.penup()
x.goto(0,-20)
drawRectangle(x, 10, -60, 'brown')
x.penup()
x.goto(300,0)
x.pendown()
x.left(60)
x.forward(50)
x.right(120)
x.forward(50)
x.right(120)
x.right(60)
x.forward(50)
x.right(30)
x.forward(50)
x.penup()
x.right(90)
x.pendown()
x.circle(20)
x.right(90)
x.right(30)
x.forward(50)
x.right(180)
x.forward(50)
x.right(60)
x.forward(50)




'''
george.penup()
george.goto(400, 300)
george.pendown()
drawFourRays(george, 25, 24)
george.right(45)
drawFourRays(george, 15, 24)
george.left(45)
'''
