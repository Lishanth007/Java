List<Integer> data=Arrays.asList(1,2,3,4,5,6);
		
		
		//reduce(BinaryValue,(operation))
		                 
		//1+2+3+4+5+6
		//1%2=1,3%2=1,5%2=1,
		//2%2=0,4%2=0,6%2=0
		                                                 //2,4,6= 2+4=6, 6+6=12                 
		int result= data.stream().filter(a->a%2==0).reduce(0, (res,a)->(res+a));    
		
		
		                               //1,4,9,16,25,36    =91+0=91;
		int secondResult=data.stream().map(x->x*x).reduce(0, (a,b)->(a+b));
		
		System.out.println(result);
		
		System.out.println(secondResult);
