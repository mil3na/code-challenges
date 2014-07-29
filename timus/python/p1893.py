# Problem 1893. A380
# http://acm.timus.ru/problem.aspx?space=1&num=1893

seat = raw_input()

#A = 65
#char I (= 73) is omitted.
column = ord(seat[len(seat)-1:].upper())
if column > 73:
	column -= 65
else:
	column -= 64

#number
row = int(seat[:len(seat)-1])

if row >= 1 and row <= 2:
	pos = 4*(row-1) + column
	if pos % 4 <= 1:
		print "window"
	else:
		print "aisle"
elif row >= 3 and row <= 20:
	pos = 6*(row-1) + column
	if pos % 6 <= 1:
		print "window"
	elif pos%6 == 2 or pos%6 == 3 or pos%6 == 4 or pos%6 == 5 :
		print "aisle"
	else:
		print "neither"
elif row >= 21 and row <= 65:
	pos = 10*(row-1) + column
	if pos % 10 <= 1:
		print "window"
	elif pos%10 == 3 or pos%10 == 4 or pos%10 == 7 or pos%10 == 8:
		print "aisle"
	else:
		print "neither"