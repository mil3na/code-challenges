# Problem 1131. Copying
# http://acm.timus.ru/problem.aspx?space=1&num=1131

computers, cables = map(int,raw_input().split())

installed = 1
hours = 0

while installed < cables and installed < computers:
	installed *= 2
	hours +=1

if installed < computers:
	remaining = computers - installed
	# o que sobrou, mais o que esta sendo instalado naquela hora menos um que foi instalado a mais no while anterior (probably).
	hours += (remaining+cables-1) / cables

print hours