# Problem 1989. Subpalindromes
# http://acm.timus.ru/problem.aspx?space=1&num=1989

word = list(raw_input())
times = int(raw_input())

# def is_palindrome(text):
# 	left = 0
# 	right = len(text) -1
# 	while left < right:
# 		if text[left] != text[right]:
# 			return False
# 		left += 1
# 		right -= 1
# 	return True


for x in xrange(0,times):
	check = raw_input()
	if check[0] == "c":
		pos, new_char = check.split()[1:]
		word[int(pos) -1] = new_char
	else:
		first, last = map(int,check.split()[1:])
		sub = word[first-1:last]
		if sub == sub[::-1]:
			print "Yes"
		else:
			print "No"