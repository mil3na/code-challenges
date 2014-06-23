# Problem 1581. Teamwork
# http://acm.timus.ru/problem.aspx?space=1&num=1581

total = int(raw_input())
numbers = map(int,raw_input().split())

i = 0
count = 1

while i < total:
	if (i+1 < total) and (numbers[i+1] == numbers[i]):
		count += 1
	else:
		print count, numbers[i],
		count = 1

	i += 1