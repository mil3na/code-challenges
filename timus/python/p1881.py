# Problem 1881. Long problem statement
# http://acm.timus.ru/problem.aspx?space=1&num=1881

lines_of_page, symbols_line, words=  map(int,raw_input().split())

pages = 1
lines = 1
symbols = 0

current_line = raw_input()
first = True

for x in xrange(1,words):
	word = raw_input()
	if len(current_line + " " + word) > symbols_line:
		if lines + 1 > lines_of_page:
			pages += 1
			lines = 1
		else:
			lines += 1
			
		current_line = word
	else:
		current_line += " " + word

print pages