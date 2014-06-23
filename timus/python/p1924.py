# Problem 1924. Four Imps
# http://acm.timus.ru/problem.aspx?space=1&num=1924

n = int(raw_input())

if sum(range(1,n+1)) % 2 == 0:
	print "black"
else:
	print "grimy"
