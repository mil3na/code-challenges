# Problem 1153. Supercomputer
# http://acm.timus.ru/problem.aspx?space=1&num=1153

n = long(raw_input())

#newton's method 
def sqrt(n):
    x = long(n)
    y = (x + n / x) / 2
    while y < x:
        x = long(y)
        y = (x + n / x) / 2
    return x

#x^2 + x - 2*n = 0 -> sum of all integers until n
#using bashkara formula, where a= 1, b=1, c= -2*n

a = 1
b = 1
c = -2*n

x1 = ( -b + sqrt(b**2 - 4*a*c) ) / 2*a
x2 = ( -b - sqrt(b**2 - 4*a*c) ) / 2*a

if x1 > 0:
	print long(x1)
else:
	print long(x2)

