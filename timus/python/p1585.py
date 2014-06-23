# Problem 1585. Penguins
# http://acm.timus.ru/problem.aspx?space=1&num=1585

total = int(raw_input())

penguins = {"Emperor Penguin":0, "Little Penguin":0,"Macaroni Penguin":0}
counts = [0, 0, 0]

for x in xrange(total):
	penguins[raw_input()] += 1

print max(penguins.iterkeys(), key=(lambda temp_key: penguins[temp_key]))

