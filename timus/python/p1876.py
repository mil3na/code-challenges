# Problem 1876. Centipede's Morning
# http://acm.timus.ru/problem.aspx?space=1&num=1876

left, right = map(int,raw_input().split())

#in case left is odd or even.
print max(2*left+39, 2*right+40)