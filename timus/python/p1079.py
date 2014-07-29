# Problem 1079. Maximum
# http://acm.timus.ru/problem.aspx?space=1&num=1079

# def a(x):
# 	if x == 0:
# 		return 0
# 	elif x == 1:
# 		return 1
# 	elif x % 2 == 0:
# 		return a(x/2)
# 	else:
# 		return a(x/2) + a(x/2 +1)

num = int(raw_input())
nums = []

while num != 0:
	nums.append(num)
	num = int(raw_input())

maxi = max(nums) + 1

pre=[0 for x in xrange(maxi)]
pre[0] = 0
pre[1] = 1
for x in xrange(2,maxi):
	if x % 2 == 0:
		pre[x] = pre[x/2]
	else:
		pre[x] = pre[x/2] + pre[x/2 +1]

for x in nums:
	print max(pre[:x+1])


	
