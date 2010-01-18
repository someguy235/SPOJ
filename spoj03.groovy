
class spoj03Class {}

System.in.withReader{
	println 'enter test strings "string substring": '
	comp = it.readLine().split(' ')
	println comp[0].contains(comp[1])
}
