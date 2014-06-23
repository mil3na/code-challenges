# Problem 1327. Fuses
# http://acm.timus.ru/problem.aspx?space=1&num=1327

a = int(raw_input())
b = int(raw_input())

fuses = 0

for x in xrange(a,b+1):
	if x%2 != 0:
		fuses +=1
		 
print fuses