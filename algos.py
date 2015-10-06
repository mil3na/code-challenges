def find_by_binary_search(reverse, number):
	mini = 0
	maxi = len(reverse)-1
	while mini <= maxi:
		mid = mini + ((maxi - mini) / 2)
		if reverse[mid] == number:
			return True
		elif reverse[mid] < number:
			mini = mid + 1
		else:
			maxi = mid - 1
	return False