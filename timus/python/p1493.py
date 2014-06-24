# Problem 1493. One Step from Happiness
# http://acm.timus.ru/problem.aspx?space=1&num=1493

ticket = raw_input()

first_sum = sum(map(int,list(ticket[:3])))
second_sum = sum(map(int,list(ticket[3:])))

if abs(first_sum - second_sum) != 1:
	print "No"
else:
	second_aux_plus = sum(map(int,list(str(int(ticket[3:]) + 1))))
	second_aux_minus = sum(map(int,list(str(int(ticket[3:]) - 1))))

	if abs(first_sum - second_aux_plus) ==0 or abs(first_sum - second_aux_minus) == 0:
		print "Yes"
	else:
		print "No"

