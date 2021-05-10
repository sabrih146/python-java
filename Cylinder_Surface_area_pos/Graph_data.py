import matplotlib.pyplot as plt
plt.xlabel("Radius in cm")
plt.ylabel("surface area in cm")

X, Y = [], []
X1, Y1 = [], []
minX = 1000
minY = 1000
for line in open('Text_surface_with_radius.txt', 'r'):
  values = [float(s) for s in line.split()]
  X.append(values[0])
  Y.append(values[1])



plt.plot(X, Y, label = "Possible surface area with radius")

plt.legend()
plt.show()
