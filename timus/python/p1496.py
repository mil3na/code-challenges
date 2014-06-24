# Problem 1496. Spammer
# http://acm.timus.ru/problem.aspx?space=1&num=1496

total = int(raw_input())

submissions = []
spammers = []

for i in range(total):
	team = raw_input()
	if team in submissions:
		spammers.append(team)
	else:
		submissions.append(team)

for x in set(spammers):
	print x