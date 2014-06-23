# Problem 1197. Lonesome Knight
# http://acm.timus.ru/problem.aspx?space=1&num=1197

tests = int(raw_input())
charmap = {"a": 1, "b": 2,"c": 3,"d": 4,"e": 5,"f": 6,"g": 7,"h": 8}

def moviments(x, y):
	moves = 0

	if x + 2 <= 8:
		if y + 1 <= 8:
			moves += 1
		if y - 1 > 0:
			moves += 1

	if x - 2 > 0:
		if y + 1 <= 8:
			moves += 1
		if y - 1 > 0:
			moves += 1

	if y + 2 <= 8:
		if x + 1 <= 8:
			moves += 1
		if x - 1 > 0:
			moves += 1

	if y - 2 > 0:
		if x + 1 <= 8:
			moves += 1
		if x - 1 > 0:
			moves += 1

	return moves

for x in xrange(0,tests):
	place = raw_input()
	print moviments(charmap[place[0]], int(place[1]))	

