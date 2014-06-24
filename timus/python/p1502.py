# Problem 1502. Domino Dots
# http://acm.timus.ru/problem.aspx?space=1&num=1502

total = int(raw_input())

#sum of combinations
print int( float(total* (total+1) * (total+2)) /2 )