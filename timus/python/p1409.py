# Problem 1409. Two Gangsters
# http://acm.timus.ru/problem.aspx?space=1&num=1409

harry, larry = map(int,raw_input().split())

total = harry + larry - 1

print total - harry, total - larry
