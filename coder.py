numbers = []
alive = True
rightNumbers = True


while alive:
	numbers = raw_input("Write the numbers here: ")
	sepNumbers = list(numbers)
	print ("You entered the following numbers")
	print (sepNumbers)
	

	for x in range (0, len(sepNumbers)):
		#print thisNumber
		if sepNumbers[x] == "0":
			sepNumbers[x] = 5
		elif sepNumbers[x] == "1":
			sepNumbers[x] = 9
		elif sepNumbers[x] == "2":
			sepNumbers[x] = 8
		elif sepNumbers[x] == "3":
			sepNumbers[x] = 7
		elif sepNumbers[x] == "4":
			sepNumbers[x] = 6
		elif sepNumbers[x] == "5":
			sepNumbers[x] = 0
		elif sepNumbers[x] == "6":
			sepNumbers[x] = 4
		elif sepNumbers[x] == "7":
			sepNumbers[x] = 3
		elif sepNumbers[x] == "8":
			sepNumbers[x] = 2
		elif sepNumbers[x] == "9":
			sepNumbers[x] = 1
		else:
			print ("shiiiiiiiit! Thats not numbers, try again U fool")
			rightNumbers = False
			break

	if rightNumbers == True:
		print ("The Przbelewsky code is")
		print (sepNumbers)

	quitGame = raw_input("Type quit to stop the deciphering or press ENTER to continue: ").lower()
	if quitGame == "quit":
		alive = False
		print ("thanks for playing")
	else:
		rightNumbers = True

