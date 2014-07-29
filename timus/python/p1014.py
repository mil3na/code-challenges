# Problem 1014. Product of Digits
# http://acm.timus.ru/problem.aspx?space=1&num=1014

number = int(raw_input())

if number == 0:
	print 10
elif number < 10:
	print number 
else:
	out = 0
	i = 9
	while number > 1 and i > 1:
		if number % i == 0:
			out *= 10
			out += i
			number /= i
		else:
			i-=1
	if number > 1:
		print -1
	else:
		print str(out)[::-1]

