# Problem 2023. Donald is a postman
# http://acm.timus.ru/problem.aspx?space=1&num=2023

letters = int(raw_input())

steps = 0
current = 0

first = ["A", "P", "O", "R"]
second = ["B", "M", "S"]
third = ["D", "G", "J", "K", "T", "W"]
shelfs = [first, second, third]

for x in xrange(letters):
	character = raw_input()
	if not character[0] in shelfs[current]:
		if current == 1:
			steps+= 1
			if character[0] in shelfs[2]:
				current = 2
			else:
				current = 0
		else:
			if character[0] in shelfs[1]:
				steps +=1
				current = 1
			else:
				steps+=2
				current = 2 if current == 0 else 0

print steps
