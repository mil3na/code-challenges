# Problem 1263. Elections
# http://acm.timus.ru/problem.aspx?space=1&num=1263

candidates, electors = map(int,raw_input().split())

votes = [0 for x in range(0,candidates+1)]

for x in range(electors):
	votes[int(raw_input())] += 1

for x in votes[1:]:
	print '{percent:.2%}'.format(percent=(float(x) / electors))
