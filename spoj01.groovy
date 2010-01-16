
class spoj01Class {}

int go = 1
System.in.withReader{
	while (go){
		print 'input:'
		input = it.readLine()
		println(input);
	
		if (input == '42'){
			println('you found it!')
			go = 0;
		}
	}
}


