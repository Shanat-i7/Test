package common;

 interface ffg {
  public   void aa (int a);
  public void ttr();
  
}



class ITest /* implements ffg */{
	
	public void aa (int a) {
		
		System.out.println(a);
	}

 
	public void ttr() {
		// TODO Auto-generated method stub
		
	}
}

class InterfaceExample {
	
	public static void main(String[] args) {
		ITest  iTest = new ITest();
		iTest.aa(23);
	}
}

abstract class asasd {
	public  abstract void fdf();
	public void test(int ass){
		
		
	}
	
	
}

class jhkhj extends asasd {
	

	@Override
	public void fdf() {
		// TODO Auto-generated method stub
		
	}
	
}