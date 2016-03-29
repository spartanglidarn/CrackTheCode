#alphabet index goes from 0-25
alphabet = list("abcdefghijklmnopqrstuvwxyz")
numPad = list("1234567890")


#print (alphabet)
#print (numPad)

message = raw_input("Write your message here: ")
sepMessage = list(message)
print (len(alphabet))


theCode = input("Write the code here(only numbers): ")

for x in range (0, len(sepMessage)): 
	if sepMessage[x] != " ":
		letterIndex = alphabet.index(sepMessage[x])
		codeIndex = letterIndex + theCode
		if codeIndex > 25:
			codeIndex -= 26
		sepMessage[x] = alphabet[codeIndex]	
		









print "".join(sepMessage)


theCode = input("To decrypt the message, please enter your code again: ")

for x in range (0, len(sepMessage)): 
	if sepMessage[x] != " ":
		letterIndex = alphabet.index(sepMessage[x])
		codeIndex = letterIndex - theCode
		if codeIndex > 25:
			codeIndex -= 26
		sepMessage[x] = alphabet[codeIndex]

print "".join(sepMessage)