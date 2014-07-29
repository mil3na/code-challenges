# Problem 1086. Cryptography
# http://acm.timus.ru/problem.aspx?space=1&num=1086

def is_prime(i, primes):
    for prime in primes:
        if not (i == prime or i % prime):
            return False
    return True

def nth_primes(maxi):
    primes = [2]
    i = 3
    while len(primes) < maxi:
    	if is_prime(i, primes):
    		primes.append(i)
    	i+=1
    return primes

#using Siege of Eratostenes
def get_primes(n):
	upper = 170000 #this upper bound could be calculated
	primes = range(2,upper)
	for i in range(int(n**.5)+1):
 		primes=filter(lambda x:x%primes[i] or x==primes[i], primes)
	return primes[:n]

num = int(raw_input())
places = []

for x in xrange(num):
	places.append(int(raw_input()))

primes = get_primes(max(places))

for x in places:
	print primes[x-1]

