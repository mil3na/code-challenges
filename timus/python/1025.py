# Problem 1025. Democracy in Danger
# http://acm.timus.ru/problem.aspx?space=1&num=1025

from math import ceil

groups = int(raw_input())
voters = sorted(map(int,raw_input().split()))
min_voters = 0

for x in range(0,(groups/2) + 1):
   min_voters += (voters[x]/2) +1

print min_voters