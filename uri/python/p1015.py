# -*- coding: utf-8 -*-
 
# Problem 1015 - Distance Between Two Points
#Source: https://www.urionlinejudge.com.br/judge/en/problems/view/1015
 
from math import sqrt
 
one = raw_input()
two = raw_input()
 
numbers = one + " " + two
a = [float(x) for x in numbers.split(" ")]
 
distance = sqrt(((a[2] - a[0]) ** 2) + ((a[3] - a[1]) ** 2))
 
print "%.4f" % distance