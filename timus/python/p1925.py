# Problem 1925. British Scientists Save the World
# http://acm.timus.ru/problem.aspx?space=1&num=1925

years,k = map(int,raw_input().split())

inputs = 0
screen = 0

for x in xrange(0, years):
	device, number_ith_year = map(int,raw_input().split())
	screen += device
	inputs += number_ith_year

screen += k

final = screen - ((years+1)*2) - inputs

if final >=0:
	print final
else:
	print "Big Bang!"