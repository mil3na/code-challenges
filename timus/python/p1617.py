# Problem 1617. Flat Spots
# http://acm.timus.ru/problem.aspx?space=1&num=1617

total = int(raw_input())

sizes ={}
cars = 0

for x in xrange(total):
	size = raw_input()
	if size in sizes.keys():
		sizes[size] += 1
	else:
		sizes[size] = 1

for x in sizes.values():
	cars += x / 4

print cars