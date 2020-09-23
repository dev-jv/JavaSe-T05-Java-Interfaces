package javainterface1;

			// Interface

//--------------------------------------------------------------------- //interface defines a set of specifications that other classes must implement. 
//interface Polygon {
//	   public void getArea();
//	}


//--------------------------------------------------------------------- //Polygon is an interface. We have used the interface keyword to declare an interface.
//interface Polygon {
//	   public static final String color = "blue";
//	   
//	   public  void getArea(); // getArea() method is a specification defined in the Polygon interface. All classes that use this interface must implement the getArea() method.
//	}


//--------------------------------------------------------------------- // An interface can include abstract methods and constants
//interface Polygon {
//	   String color = "blue"; 
//	   
//	    void getArea(); // It is important to note that, all methods inside an interface are implicitly public and all fields are implicitly public static final. 
//	}




//--------------------------------------------------------------------- // implements Keyword in Interface
//interface Polygon {
//    void getArea(int length, int breadth);
//}
//
//class Rectangle implements Polygon { // We use the implements keyword to implement interfaces.
//    public void getArea(int length, int breadth) {
//        System.out.println("The area of the rectangle is " + (length * breadth));
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Rectangle r1 = new Rectangle();
//        r1.getArea(5, 6);
//    }
//}



//--------------------------------------------------------------------- // A class can implement multiple interfaces

//	interface Line {
//	   ...
//	}
//	interface Polygon {
//	   ...
//	}
//	class Rectangle implements Line, Polygon{
//	   ...
//	}
//



//--------------------------------------------------------------------- // Also, interfaces support private methods with the release of Java 9. Now you can use private methods and private static methods in interfaces.

// Polygon.staticMethod();




//--------------------------------------------------------------------- // default methods in Interfaces. With the release of Java 8, methods with implementation (default methods) were introduced inside an interface
//public default void getSides() {
//	   // body of getSides()
//	}

//------------------ If a large number of classes were implementing this interface, we need to track all these classes and make changes in them. This is not only tedious but error-prone as well.

//interface  Polygon {
//	   void getArea();
//	   default void getSides() { //  ...!!
//	      System.out.println("I can get sides of polygon.");
//	   }
//	}
//
//	class Rectangle implements Polygon {
//	   public void getArea() {
//	      int length = 6;
//	      int breadth = 5;
//	      int area = length * breadth;
//	      System.out.println("The area of the rectangle is "+area);
//	   }
//
//	   public void getSides() {
//	      System.out.println("I have 4 sides.");
//	   }
//	}
//
//	class Square implements Polygon {
//	   public void getArea() {
//	      int length = 5;
//	      int area = length * length;
//	      System.out.println("The area of the square is "+area);
//	   }
//	}
//
//	class Main {
//	   public static void main(String[] args) {
//	      Rectangle r1 = new Rectangle();
//	      r1.getArea();
//	      r1.getSides();
//
//	      Square s1 = new Square();
//	      s1.getArea();
//	      
//	   }
//	}



	//------------------ Practical Example of Interface

	// To use the sqrt function
	import java.lang.Math;

	interface  Polygon {
	   void getArea();
	  
	 // calculate the perimeter of a Polygon
	   default void getPerimeter(int... sides) {
	      int perimeter = 0;
	      for (int side: sides) {
	         perimeter += side;
	      }

	   System.out.println("Perimeter: " + perimeter);
	   }
	}

	class Triangle implements Polygon {
	   private int a, b, c;
	   private double s, area;

	// initializing sides of a triangle
	   Triangle(int a, int b, int c) {
	      this.a = a;
	      this.b = b;
	      this.c = c;
	      s = 0;
	   }

	// calculate the area of a triangle
	   public void getArea() {
	      s = (double) (a + b + c)/2;
	      area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	      System.out.println("Area: " + area);
	   }
	}

	class Main {
	   public static void main(String[] args) {
	      Triangle t1 = new Triangle(2, 3, 4);

	// calls the method of the Triangle class
	      t1.getArea();

	// calls the method of Polygon
	      t1.getPerimeter(2, 3, 4);
	   }
	}

	//--------------------------------------------------------------------- // extends Keyword in Interface


//	interface Line {
//		   //members of Line interface
//		}
//
//	interface Polygon extends Line {
//		   //members of Polygon interface and Line interface
//	}
//		
	//------------------ An interface can extend multiple interfaces similar to a class implementing multiple interfaces
	
//	interface A {
//		...
//	}
//	interface B {
//		... 
//	}
//
//	Interface C extends A, B {
//		...
//	}



