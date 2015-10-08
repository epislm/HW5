package ChildPackage;

import parentPackage.Parent;

public class Child extends Parent {
    
    public static void main(String [] args){
        
        
        Parent dad = new Parent();
        Child kid = new Child(dad);
        
        
    }

public Child(Parent son){

int copy = x;
System.out.println("Parent int:" + this.x + "\n Child copy:" + copy );

}




}


