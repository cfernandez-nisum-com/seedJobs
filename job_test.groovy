//Job that create 5 jobs

for(i in 0..5) {
	job("Testing-number-${i}"){
	steps{
		a=$i
		shell('echo My number is ${a}')
		}
	}
}