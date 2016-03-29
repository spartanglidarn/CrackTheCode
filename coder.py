numbers = []
alive = True
rightNumbers = True

while alive:
	numbers = raw_input("Write the numbers here(1-9 seperate by ,): ").split(",")
	num = map(int,numbers)
	print ("You entered the following numbers")
	print (num)


	for x in range (0, len(num)):
		#print thisNumber
		if num[x] == 0:
			num[x] = 5
		elif num[x] == 1:
			num[x] = 9
		elif num[x] == 2:
			num[x] = 8
		elif num[x] == 3:
			num[x] = 7
		elif num[x] == 4:
			num[x] = 6
		elif num[x] == 5:
			num[x] = 0
		elif num[x] == 6:
			num[x] = 4
		elif num[x] == 7:
			num[x] = 3
		elif num[x] == 8:
			num[x] = 2
		elif num[x] == 9:
			num[x] = 1
		else:
			print ("you are either using letters or you are not seperating you didgets with ,")
			print ("either way, thats wrong crackhead!")
			rightNumbers = False

	if rightNumbers == True:
		print ("The Przbelewsky code is")
		print (num)

	quitGame = raw_input("Type quit to stop the deciphering or press ENTER to continue: ").lower()
	if quitGame == "quit":
		alive = False
		print ("thanks for playing")

