package com.zoo;

public class Animal {
	
	  public static String name;
	  public static String sound ;
	  int age;
	 

  public void makeSound(){
	  
	  System.out.println("The " +name+ " makes a sound ==> "+sound);
  }
  
 public void makeSound(String name , String sound){
	  
	  System.out.println("The " +name+ " makes a sound ==> "+sound);
  }
  
  
  
}