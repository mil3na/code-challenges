# Problem 1083. Factorials!!!
# http://acm.timus.ru/problem.aspx?space=1&num=1083

inp = raw_input().split()
n = int(inp[0])
k = len(inp[1])

result = long(1)

if n%k == 0:
	stop = k
else:
	stop = n%k

while n >= stop:
	result *= n
	n = n-k

print result