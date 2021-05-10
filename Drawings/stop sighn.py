
import turtle  # Allows us to use turtles
x = turtle.Turtle()
turtle.setup(400, 600)  # Determine the window size
wn = turtle.Screen()  # Creates a playground for turtles
wn.title('traffic light using different turtles')  # Set the window title
wn.bgcolor('black')  # Set the window background color
tess = turtle.Turtle()  # Create a turtle, assign to tess
alex = turtle.Turtle()  # Create alex
henry = turtle.Turtle()  # Create henry


def draw_housing():
    """ Draw a nice housing to hold the traffic lights"""
    tess.pensize(3)  # Change tess' pen width
    tess.color('black', 'white')  # Set tess' color
    tess.begin_fill()  # Tell tess to start filling the color
    tess.forward(80)  # Tell tess to move forward by 80 units
    tess.left(90)  # Tell tess to turn left by 90 degrees
    tess.forward(200)
    tess.circle(40, 180)  # Tell tess to draw a semi-circle
    tess.forward(200)
    tess.left(90)
    tess.end_fill()  # Tell tess to stop filling the color


draw_housing()


def circle(t, ht, colr):
    """Position turtle onto the place where the lights should be, and
    turn turtle into a big circle"""
    t.penup()  # This allows us to move a turtle without drawing a line
    t.forward(40)
    t.left(90)
    t.forward(ht)
    t.shape('circle')  # Set tutle's shape to circle
    t.shapesize(3)  # Set size of circle
    t.fillcolor(colr)  # Fill color in circle


circle(tess, 50, 'green')
circle(alex, 120, 'orange')
circle(henry, 190, 'red')
x.goto(20,0)
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
drawRectangle(x, 20, -100, 'blue')
x.right(90)
x.forward(100)
x.goto(-600,-100)
drawRectangle(x, 100, 1200, 'brown')
