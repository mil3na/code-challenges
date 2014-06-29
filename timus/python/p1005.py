# Problem 1005. Stone Pile
# http://acm.timus.ru/problem.aspx?space=1&num=1005

total = int(raw_input())
weights = map(int,raw_input().split())

#Balanced Partition Problem
#Still gives TLE. 

weights.sort(reverse=True)


answer = 2000000
limit = 1 << total

for i in range(0,limit):
	k = i
	sum1 = 0
	sum2 = 0

	for stone in weights:
		if (k&1) > 0:
			sum1 += stone
		else:
			sum2 += stone
		
		k >>= 1

	answer = min(answer, abs(sum1-sum2))

print answer

