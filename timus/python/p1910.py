# Problem 1910. Titan Ruins: Hidden Entrance
# http://acm.timus.ru/problem.aspx?space=1&num=1910

sections = int(raw_input())
forces = map(int,raw_input().split())
maxi = 0
position = 0

for x in range(1,sections-1):
   field_sum = forces[x-1]+forces[x]+forces[x+1]
   if field_sum > maxi:
      maxi = field_sum
      position = x+1
   
print str(maxi) + " " + str(position)
