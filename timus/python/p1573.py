# Problem 1573. Alchemy
# http://acm.timus.ru/problem.aspx?space=1&num=1573

blue, red, yellow = map(int,raw_input().split())
total = int(raw_input())

colors = []

for x in range(total):
	colors.append(raw_input())

if total == 1:
	if "Red" in colors:
		print red
	elif "Blue" in colors:
		print blue
	else:
		print yellow
elif total == 2:
	if "Blue" in colors:
		if "Red" in colors:
			print blue * red
		else:
			print blue * yellow
	else:
		print red * yellow
elif total == 3:
	print red * blue * yellow