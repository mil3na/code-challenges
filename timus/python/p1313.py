# Problem 1313. Some Words about Sport
# http://acm.timus.ru/problem.aspx?space=1&num=1313

n = int(raw_input())

matrix = []

for x in xrange(0,n):
	matrix.append(raw_input().split())

for k in xrange(0,2*n):
	for i in xrange(0,n):
		for j in xrange(0,n):
			if i+j == k:
				print matrix[j][i],

