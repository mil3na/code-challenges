# Problem 1225. Flags
# http://acm.timus.ru/problem.aspx?space=1&num=1225

stripes = int(raw_input())

# def fib(number):
# 	if number < 2:
# 		return number
# 	else:
# 		return fib(number-1) + fib(number-2)


#faster fibonacci calculation found here: 
# http://stackoverflow.com/questions/18172257/efficient-calculation-of-fibonacci-series
def fib(n, computed = {0: 0, 1: 1}):
	if n not in computed:
		computed[n] = fib(n-1, computed) + fib(n-2, computed)
	return computed[n]

print 2*fib(stripes)