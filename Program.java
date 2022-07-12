/*
 *  JAVA 8 Features :
 * 	
 * 1. Lambda Expression
 * 2. Functional Interfaces
 * 3. Default Methods
 * 4. Static Methods
 * 5. Stream API
 * 6. Optional
 * 7. Method resolution operator(::)
 * 8. new Date & Time Api
 * 
 */

/*
 *   ==== Features of Lambda Expression =====
 *   
 * public int method1(int a,int b){      - It doesnt have name = public int(int a,int b){...}     
 * 										 - It doesnt have modifiers = int(int a,int b) {...}
 *  	int res =a + b ;				 - It doesnt have return type = (int a, int b) {...}
 *  return res;
 * }
 * 
 * Correct way := 
 *     (int a , int b) -> {int result = a+b}
 */

/*
 *  Without Lambda																with Lambda
 *  
 *  1. public void m1(){												()->{s.o.p("Hello")}  or ()->s.o.p("Hello!")				
 *   	s.o.p("Hello !")
 *  }
 *  
 *  2. public void add(int a,int b){								(int a,int b)->{int result = a+b}
 *  																			or
 *  																(a,b)->int result = a+b ;   //Type inference
 *  
 *  
 *  3. public int getLength(String s){								(String s)->(return s.length();}
 *  	return s.length()															or
 *  }																	s ->s.length()	;
 *  																			
 *  	int result = a + b ;
 *  }
 */

/*
 *  Characteristics of Lambda Experssion 
 * 		
 * 		1. A LE can take any number of parameter 
 * 		
 * 		2. If multiple parameter present then these parameters should separate with commas
 * 			(a,b,c) -> s.o.p(a+b+c);
 * 
 * 		3. If only one parameter is present ten parenthesis( () ) are optional
 * 				s ->s.length()
 * 
 * 		4. Type Inferance :
 * 				we dont need to pass the data type to the parameter , based on the context compiler
 * 				can guess the type automatically
 * 				(String s1 , String s2) -> s.o.p.(s1+s2);
 * 				(s1,s2) ->s.o.p(s1+s2)
 * 
 * 		5. If LE method body will hve only one statement then no need of curly braces
 * 
 * 				()->{									()-> statement1
 * 					statement1;
 * 					statement1;					
 * 					}
 * 
 * 		6. If LE return something then we can remove the return keyword
 * 
 * 			s->s.length()                public int getLength(String s){
 * 										 return s.lenght			
 * 										}
 */

/*
 *  Q. If lambda expression doesnt having name then how to call it?
 *   ---> Functional Interfaces
 */
public class Program extends Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program p = new Program();
		p.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello  from Print from Program");
	}

}

abstract class Test{
    abstract public void print();
}