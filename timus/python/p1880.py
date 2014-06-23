# Problem 1880. Psych Up's Eigenvalues
# http://acm.timus.ru/problem.aspx?space=1&num=1880

p1 = int(raw_input())
p1ev = set(map(int,raw_input().split()))
p2 = int(raw_input())
p2ev = set(map(int,raw_input().split()))
p3 = int(raw_input())
p3ev = set(map(int,raw_input().split()))

unique = 0

print len(p1ev.intersection(p2ev).intersection(p3ev))
