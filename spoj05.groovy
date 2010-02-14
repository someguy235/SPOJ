//find next largest palindromic integer for a given integer

class spoj05Class {}

number = "213890109999132"
numStr = number.split("")
numStr = numStr[1..-1]
numInt = [number.size()-1]
for (i in 0..(number.size()-1)){
	//println Integer.parseInt(numStr[i])
	numInt[i] = Integer.parseInt(numStr[i])
}
//println "numStr: " + numStr
//println numStr[1]
//numStr[1] = "1"
//println numInt[1].getClass()

isPal = false
int leftIndex, rightIndex

if ((number.size() % 2) == 0){
	orgRight = rightIndex = (number.size() / 2) 
	centerIndex = orgLeft = leftIndex = rightIndex - 1
}
else{
	centerIndex = orgLeft = leftIndex = orgRight = rightIndex = ((number.size()-1) / 2)
}

rolledOver = false

while ((number[leftIndex] == number[rightIndex]) && (leftIndex >= 0)){
	leftIndex--
	rightIndex++
}

if (number[leftIndex] > number[rightIndex]){
	finishPal(leftIndex, rightIndex)
}
else{
	nineChecking=true
	nineCheckingIndex=centerIndex
	//println numInt[nineCheckingIndex]
	while(nineChecking && (nineCheckingIndex >= 0)){
		if (numInt[nineCheckingIndex] == 9){
			numInt[nineCheckingIndex] = 0
			nineCheckingIndex--
		}
		else{
			numInt[nineCheckingIndex] = (numInt[nineCheckingIndex] += 1)
			nineChecking = false
		}
	}
	finishPal(orgLeft, orgRight)
}

def finishPal(left, right){
	//println numInt
	while(left>=0){
		numInt[right++] = numInt[left--]
	}
	println "start: " + numStr
	println "final: " + numInt
}



