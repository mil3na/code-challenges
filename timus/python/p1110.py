# Problem 1110. Power
# http://acm.timus.ru/problem.aspx?space=1&num=1110

N, M, Y = map(int,raw_input().split())

numbers = []

for x in xrange(0,M):
	if x**N % M == Y:
		numbers.append(x)

if len(numbers) < 1 :
	print "-1"
else:
	for x in numbers:
		print x,