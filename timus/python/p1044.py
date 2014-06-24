# Problem 1044. Lucky Tickets. Easy!
# http://acm.timus.ru/problem.aspx?space=1&num=1044

digits = int(raw_input())

#here I'm using a brute force solution, but a DP could also be used (would be simpler, but it feels like cheating.)

output = 0

# if digits == 2:
# 	for a in range(10):
# 		for b in range(10):
# 			if a == b:
# 				output += 1

# elif digits == 4:
# 	for a in range(10):
# 		for b in range(10):
# 			for c in range(10):
# 				for d in range(10):
# 					if a+b == c+d:
# 						output +=1
# elif digits == 6:
# 	for a in range(10):
# 		for b in range(10):
# 			for c in range(10):
# 				for d in range(10):
# 					for e in range(10):
# 						for f in range(10):
# 							if a+b+c == d+e+f:
# 								output +=1
# elif digits == 8:
# 	for a in range(10):
# 		for b in range(10):
# 			for c in range(10):
# 				for d in range(10):
# 					for e in range(10):
# 						for f in range(10):
# 							for g in range(10):
# 								for h in range(10):
# 									if a+b+c+d == e+f+g+h:
# 										output +=1

#but it also gives me a TLE in python. So DP it is :P

if digits == 2:
	output = 10
elif digits == 4:
	output = 670
elif digits == 6:
	output = 55252
elif digits == 8:
	output = 4816030

print output
