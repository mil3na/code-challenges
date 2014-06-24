# Problem 1370. Magician
# http://acm.timus.ru/problem.aspx?space=1&num=1005

digits, clicks = map(int,raw_input().split())

numbers = []

for x in xrange(digits):
	numbers.append(raw_input())

#this gives the position of the start point (if the wheel has rotated already)
#7 % 12 = 7
i = clicks % digits

output = ""

while len(output) < 10:
	if i >= digits:
		i = 0
	output += numbers[i]
	i+=1

print output
