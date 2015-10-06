# Problem 2011. Long Statement
# http://acm.timus.ru/problem.aspx?space=1&num=2011
# http://math.stackexchange.com/questions/483277/how-many-different-words-can-be-formed-using-all-the-letters-of-the-word-googolp

import math, operator,functools

total = int(raw_input())
pieces = raw_input().split()

summ = pieces.count("1") + pieces.count("2") + pieces.count("3")
multi = pieces.count("1") * pieces.count("2") * pieces.count("3")

abc = [pieces.count("1"), pieces.count("2"), pieces.count("3")]

fac_abc = [math.factorial(abc[0]),
			math.factorial(abc[1]),
			math.factorial(abc[2])]

final = math.factorial(total) / functools.reduce(operator.mul, fac_abc, 1)

if final >= 6:
	print "Yes"
else:
	print "No"
