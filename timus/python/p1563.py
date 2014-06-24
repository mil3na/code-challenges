# Problem 1563. Bayan
# http://acm.timus.ru/problem.aspx?space=1&num=1563

total = int(raw_input())

stores ={}
not_visited = 0

for x in xrange(total):
	store = raw_input()
	if store in stores.keys():
		stores[store] += 1
	else:
		stores[store] = 1

for x in stores.values():
	if x > 1:
		not_visited += x -1

print not_visited