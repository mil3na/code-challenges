# Problem 2035. Another Dress Rehearsal
# http://acm.timus.ru/problem.aspx?space=1&num=2035

maxA, maxB, total = map(int,raw_input().split())

if maxA + maxB < total:
	print "Impossible"
else:
	mini = min(maxA, total)
	print mini, total - mini
	# if (maxA > total) and (maxB > total):
	# 	print total, 0
	# elif maxA > total:
	# 	print total - maxB, maxB
	# elif maxB > total:
	# 	print maxA, total - maxA
	# else:
	# 	print maxA, maxB
