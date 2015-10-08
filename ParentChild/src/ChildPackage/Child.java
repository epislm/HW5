package ChildPackage;

import parentPackage.Parent;

public class Child extends Parent {
  
public Child(Parent son){

int copy = getX();
System.out.println("Parent int:" + this.getX() + "\n Child copy:" + copy );

}




}

