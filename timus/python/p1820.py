# Problem 1820. Ural Steaks
# http://acm.timus.ru/problem.aspx?space=1&num=1820

import math

n, k = map(float,raw_input().split())

if n < k:
	print "2"
else:
	print int(math.ceil((n*2) / k))