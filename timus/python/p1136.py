# Problem 1136. Parliament
# http://acm.timus.ru/problem.aspx?space=1&num=1136

#Rewritten, apparently working, but gives RuntimeError on test #7

class Node(object):
    content = 0
    left = None
    right = None

    def __init__(self, content):
        self.content = content

# class BST(object):
#     root = None
#     output = ""

#     def __post_order(self, the_root):
#     	if the_root != None:
#     		self.__post_order(the_root.right)
#     		self.__post_order(the_root.left)
#     		self.output += str(the_root.content) + " "
    		

#     def to_string_post_order(self):
#     	self.__post_order(self.root)
#     	return self.output.strip()


#     def __add_node(self, the_root, nod):
#     	father = None
#     	root_aux = self.root
#     	while root_aux != None:
#     		father = root_aux
#     		if nod.content < root_aux.content:
#     			root_aux = root_aux.left
#     		else:
#     			root_aux = root_aux.right

#     	if father == None:
#     		self.root = nod
#     	else:
#     		if nod.content < father.content:
#     			father.left = nod
#     		else:
#     			father.right = nod

#     def __init__(self, nodes):
#         for node in nodes:
#         	temp_node = Node(node)
#         	self.__add_node(self.root, temp_node)

def add_node(root, value):
	if root is None:
		root = value
	else:
		if root.content > value.content:
			if root.left == None:
				root.left = value
			else:
				add_node(root.left, value)
		else:
			if root.right == None:
				root.right = value
			else:
				add_node(root.right, value)

def print_post_order(root):
	if root != None:
		print_post_order(root.right)
		print_post_order(root.left)
		print str(root.content),

total = int(raw_input())
ids = []
while len(ids) < total:
	ids += map(int,raw_input().split())
ids.reverse()

the_root = Node(ids[0])
for x in ids[1:]:
	add_node(the_root, Node(x))

print_post_order(the_root)

# arv = BST(ids)
# print arv.to_string_post_order()