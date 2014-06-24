# Problem 1636. Penalty Time
# http://acm.timus.ru/problem.aspx?space=1&num=1636

t1, t2 = map(int,raw_input().split())

rejected_times = map(int,raw_input().split())

for rejected in rejected_times:
	if rejected >0:
		t1 += 20*rejected

if t1 > t2:
	print "Dirty debug :("
else:
	print "No chance."
