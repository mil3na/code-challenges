# Problem 1607. Taxi
# http://acm.timus.ru/problem.aspx?space=1&num=1607

petr_init,petr_raise,taxi_init,taxi_red = map(int,raw_input().split())

petr = petr_init
taxi = taxi_init

while petr_init < taxi - taxi_red and taxi_init > petr + petr_raise and taxi >= petr:
	petr += petr_raise
	taxi -= taxi_red

if petr > taxi:
	print petr
else:
	print taxi
