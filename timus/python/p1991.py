# Problem 1991. The battle near the swamp
# http://acm.timus.ru/problem.aspx?space=1&num=1991

blocks, enemies = map(int,raw_input().split())

droids = 0
booms = 0

trucks = map(int,raw_input().split())
for truck in trucks:
	diff = enemies - truck
	if diff > 0:
		droids += diff
	else:
		booms += abs(diff)

print booms, droids