# Problem 1639. Chocolate 2
# http://acm.timus.ru/problem.aspx?space=1&num=1639

m, n = map(int,raw_input().split())

if m*n % 2 == 0:
	print "[:=[first]"
else:
	print "[second]=:]"