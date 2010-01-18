
class spoj02Class {}

def ranges = []
System.in.withReader{
	print '# of test cases:'
	t = Integer.parseInt(it.readLine())
	for (i in 1..t){
		print 'enter min['+i+'] max['+i+'] (ex. "1 2") : '
		ranges.add(it.readLine().split(' '))
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
	for (i in 2..max){
		if (primes[i]){
			for(int j = 2; (j*i <= max); j++){
				primes[j*i] = false
			}
		}
	}
	for (i in 1..max){
		if (primes[i] & i >= min){
			print i + ' '
		}
	}
	println()
}
println "done"
