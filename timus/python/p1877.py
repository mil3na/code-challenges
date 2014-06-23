# Problem 1877. Bicycle Codes
# http://acm.timus.ru/problem.aspx?space=1&num=1877

code1 = int(raw_input())
code2 = int(raw_input())

#the thief tries even numbers on the first lock and odd numbers on the second one.
if code1%2 == 0 or code2%2 == 1:
	print "yes"
else:
	print "no"