# Problem 1149. Sinus Dances
# http://acm.timus.ru/problem.aspx?space=1&num=1149

N = int(raw_input())

An = ["", "sin(1"]

for i in xrange(2,N+1):
	if i % 2 == 0:
		An.append(An[i-1] + "-sin("+str(i))
	else:
		An.append(An[i-1] + "+sin("+str(i))

sum = []

total = N
for idx,an in enumerate(An[1:]):
	sum.append(an + (idx+1)*")" + "+" + str(total) + ")")
	total-= 1

out = (N-1)*"("
for x in sum:
	out +=  x
	

print out[:len(out)-1]
