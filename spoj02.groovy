
class spoj02Class {}

def ranges = []
System.in.withReader{
	print '# of test cases:'
	t = Integer.parseInt(it.readLine())
	for (i in 1..t){
		print 'enter min['+i+'] max['+i+'] (ex. "1 2") : '
		line = it.readLine()	
		range = line.split(' ')
		ranges.add(range)
	}
	for (i in 0..t-1){
		println i+1 + ': ' + ranges[i][0] + ', ' + ranges[i][1]
		sieve(Integer.parseInt(ranges[i][0]), Integer.parseInt(ranges[i][1]))
	}
}
def sieve(min, max){
	primes = []
	for (i in 1..max){
		primes[i] = true
	}
	
}
println "done"
