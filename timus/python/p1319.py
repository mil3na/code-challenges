# Problem 1319. Hotel
# http://acm.timus.ru/problem.aspx?space=1&num=1319

n = int(raw_input())

matrix = []

#generating nxn matrix
for x in range(n):
	matrix.append(range(n))

m=1
# filling the matrix diagonally
for k in xrange(0,2*n):
	for i in xrange(0,n):
		for j in xrange(0,n):
			if i+j == k:
				matrix[j][i] = m
				m+=1

#rotates 90 degrees
rotated = zip(*matrix[::-1])

#ugly, but necessary printing
for x in rotated:
	for y in x:
		print y,
	print ""
