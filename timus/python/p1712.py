# Problem 1712. Cipher Grille
# http://acm.timus.ru/problem.aspx?space=1&num=1712

def read_windows(g, ps):
	passwd = ""
	i = 0
	j = 0
	while i < 4:
		while j < 4:
			if g[i][j] == "X":
				passwd += ps[i][j]
			j+=1
		j=0	
		i+=1

	return passwd 

grille = []
ciphered_password =[]
password = ""

for x in range(4):
	grille.append(list(raw_input()))

for x in range(4):
	ciphered_password.append(list(raw_input()))

for x in xrange(4):
	password += read_windows(grille, ciphered_password)
	grille = zip(*grille[::-1])

print password

