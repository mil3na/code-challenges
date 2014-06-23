# Problem 1209. 1, 10, 100, 1000...
# http://acm.timus.ru/problem.aspx?space=1&num=1209
import math

inputs = int(raw_input())
answer = ""

#the formula was derived from a sum of the first n digits (quadratic expression, bashkara)
for x in range(0,inputs):
    pos = int(raw_input())

    if math.modf( math.sqrt(8*pos - 7) )[0] == 0:
    	answer += "1 "
    else:
    	answer += "0 "

print answer
