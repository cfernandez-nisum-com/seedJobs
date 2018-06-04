//Job that create 5 jobs

for(i in 0..5) {
	job("Testing-number-${i}"){
	steps{
		shell('echo My number is '+i)
		}
	}
}