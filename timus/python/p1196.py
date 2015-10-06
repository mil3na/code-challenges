# Problem 1196. History Exam
# http://acm.timus.ru/problem.aspx?space=1&num=1196

professor_set = set()
final = 0

professor = int(raw_input())
for x in xrange(0,professor):
	professor_set.add(int(raw_input()))

student = int(raw_input())
for x in xrange(0,student):
	year = int(raw_input())
	if year in professor_set:
		final+=1

print final