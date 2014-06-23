# Problem 1068. Sum
# http://acm.timus.ru/problem.aspx?space=1&num=1068

n = int(raw_input())
print sum(range(n,2) if n <= 0 else range(0,n+1))
