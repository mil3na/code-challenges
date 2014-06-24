# Problem 1431. Diplomas
# http://acm.timus.ru/problem.aspx?space=1&num=1431

total = int(raw_input())
rows = map(int,raw_input().split())
merged_rows = []

rows.sort()

index = 1

while index < len(rows):
	#only rows where the difference between them is 1 are merged
	if abs(rows[index-1] - rows[index]) == 1:
		merged_rows.append(rows[index-1] + rows[index])
		del rows[index-1:index+1]
		#after merging, it's necessary to look all rows again.
		index = 0
	index += 1

print len(rows) + len(merged_rows)
