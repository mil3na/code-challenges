# Problem 2002. Test Task
# http://acm.timus.ru/problem.aspx?space=1&num=2002

num = int(raw_input())

users = {}
logged = []

for x in xrange(0,num):
	line = raw_input().split()

	if line[0] == "register":
		if line[1] in users.keys():
			print "fail: user already exists"
		else:
			users[line[1]] = line[2]
			print "success: new user added"

	if line[0] == "login":
		if line[1] in users.keys():
			if users[line[1]] == line[2]:
				if line[1] in logged:
					print "fail: already logged in"
				else:
					logged.append(line[1])
					print "success: user logged in"
			else:
				print "fail: incorrect password"
		else:
			print "fail: no such user"

	if line[0] == "logout":
		if line[1] in logged:
			logged.remove(line[1])
			print "success: user logged out"
		else:
			if line[1] in users.keys():
				print "fail: already logged out"
			else:
				print "fail: no such user"

	