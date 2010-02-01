
class spoj04Class {}

println("(a+(b*c))")
println("abc*+")
println rpn("(a+(b*c))")
println("((a+b)*(z+x))")
println("ab+zx+*")
println rpn("((a+b)*(z+x))")
println("((a+t)*((b+(a+c))^(c+d)))")
println("at+bac++cd+^*")
println rpn("((a+t)*((b+(a+c))^(c+d)))")

def rpn (String expression){
	String leftToken, rightToken, operator
	if (!(expression.getAt(1).equals("("))){
		leftToken=expression.getAt(1)
		operator=expression.getAt(2)
		rightToken=expression.getAt(3..-2)
	}
	else{
		parens=1
		index=1
		while(parens>0){
			index++
			if (expression.getAt(index).equals("(")){
				parens++
			}
			else if (expression.getAt(index).equals(")")){
				parens--
			}
		}
		leftToken=rpn(expression[1..index])
		operator=expression.getAt(index+1)
		rightToken=expression[index+2..-2]
	}
	if (rightToken.size() == 1){	}
	else rightToken = rpn(rightToken)
	
	return leftToken + rightToken + operator
}
