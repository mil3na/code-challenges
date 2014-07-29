# Problem 1100. Final Standings
# http://acm.timus.ru/problem.aspx?space=1&num=1100
#Gives TLE, no idea how to solve. Probably an IO problem.

from sys import stdin

total = int(stdin.readline())
teams = []

for line in stdin:
	team_id, solved = map(int,line.split())
	teams.append((team_id, solved))

for i in xrange(100, -1, -1):
	for x in teams:
		if x[1] == i:
			print x[0], x[1]

