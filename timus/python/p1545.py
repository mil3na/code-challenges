# Problem 1545. Hieroglyphs
# http://acm.timus.ru/problem.aspx?space=1&num=1545

total = int(raw_input())

hieroglyphes = []

for i in range(total):
	hieroglyphes.append(raw_input())

letter = raw_input()

for hieroglyph in hieroglyphes:
	if hieroglyph[0] == letter:
		print hieroglyph