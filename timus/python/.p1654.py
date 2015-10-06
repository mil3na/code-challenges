# Problem 1654. Cipher Message
# http://acm.timus.ru/problem.aspx?space=1&num=1654

import re

message = raw_input()

while re.search(r"([a-z])\1", message):
	message = re.sub(r"(\w)\1", "", message)

print message
