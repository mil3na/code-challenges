# Problem 1118. Nontrivial Numbers
# http://acm.timus.ru/problem.aspx?space=1&num=1118

def find_parcel(x, n):
   total = 1
   i = 1
   while x % n == 0:
      total += n**i
      x = x/n
      i +=1

   return total

def find_prime_divs(x,primes):
   dividers = []
   i=0
   while primes[i] <= x/2:
      if x%primes[i] == 0:
         dividers.append(primes[i])
      i += 1
   return dividers

def triviality(x, primes):
   primes_div = find_prime_divs(x,primes)
   parcels = 1.0
   for prime in primes_div:
      parcels *= find_parcel(x,prime)
   
   return (parcels - x)/x

# def triviality(x): 
#    factors = 0.0
#    for i in xrange(1, (x/2) + 1):
#       if x % i ==0:
#          factors += i
#    return (factors/x)


def rwh_primes1(n):
    # http://stackoverflow.com/questions/2068372/fastest-way-to-list-all-primes-below-n-in-python/3035188#3035188
    """ Returns  a list of primes < n """
    sieve = [True] * (n/2)
    for i in xrange(3,int(n**0.5)+1,2):
        if sieve[i/2]:
            sieve[i*i/2::i] = [False] * ((n-i*i-1)/(2*i)+1)
    return [2] + [2*i+1 for i in xrange(1,n/2) if sieve[i]]


ins = map(int,raw_input().split())
min_triv = 100
less_triv = -1
primes = rwh_primes1(ins[1])

if ins[0] != 1:
   if primes[-1] >= ins[0]:
      less_triv = primes[-1]
   else:
      for x in xrange(ins[1], ins[0]-1, -1):
         triv = triviality(x, primes)
         if(triv < min_triv):
            min_triv = triv
            less_triv = x
else:
   less_triv = 1

print less_triv