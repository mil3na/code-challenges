# Problem 1100. Final Standings
# http://acm.timus.ru/problem.aspx?space=1&num=1100

from sys import stdin

total = int(stdin.readline())
teams = []

for line in stdin:
	team_id, solved = map(int,line.split())
	teams.append((team_id, solved))

teams.sort(key= lambda team: team[1], reverse=True)
for team in teams:
	print team[0], team[1]