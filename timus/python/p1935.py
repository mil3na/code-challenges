# Problem 1935. Tears of Drowned
# http://acm.timus.ru/problem.aspx?space=1&num=1935

skins = int(raw_input())
distances = map(int,raw_input().split())

distances.sort()

sheets = 2*distances[0]

for idx, dist in enumerate(distances[1:]): 
	diff = dist - distances[idx]
	sheets += dist + diff

print sheets