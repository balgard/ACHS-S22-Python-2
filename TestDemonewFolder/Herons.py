import math

side_a = float(input("Enter a number for side A: "))
side_b = float(input("Enter a number for side B: "))
side_c = float(input("Enter a number for side C: "))

semiperimeter = (side_a + side_b + side_c) / 2

if semiperimeter - a < 0 or semiperimeter - b < 0 or semiperimeter - c < 0:
    print("Error not a triangle")
else:
    area = math.sqrt(semiperimeter*(semiperimeter-a)*(semiperimeter-b)*(semiperimeter-c))
    print("Area of your entered triangle: " + str(area))
