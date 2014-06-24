# Problem 1567. SMS-spam
# http://acm.timus.ru/problem.aspx?space=1&num=1567

slogan = raw_input()

list(slogan)

total = 0

for char in slogan:
	if char == ' ' or char == '.' or ((ord(char) - ord('a')) % 3) == 0:
		total +=1
	elif char == ',' or ((ord(char) - ord('b')) % 3) == 0:
		total +=2
	elif char == '!' or ((ord(char) - ord('c')) % 3) == 0:
		total +=3

print total

