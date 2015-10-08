import parentPackage.Parent;
import ChildPackage.Child;


public class Demo {

	public static void main(String [] args){
		
		Parent dad = new Parent();
		Child kid = new Child(dad); 
		
		int k;
		
		k = dad.getX(); 
	
		System.out.println(k);
		
	}
	}

