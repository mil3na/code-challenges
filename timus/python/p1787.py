# Problem 1787. Turn for MEGA
# http://acm.timus.ru/problem.aspx?space=1&num=1787

k, n = map(int,raw_input().split())
all_cars = map(int,raw_input().split())
total = 0

for cars in all_cars:
	total += k - cars
	if total >= 0:
		total = 0

print abs(total)