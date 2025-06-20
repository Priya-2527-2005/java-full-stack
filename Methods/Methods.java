/*static,instance methods and variables*/
/*
class Methods
{
    static int a=10;
    static int b=20;
    int c=30;
    int d=40;
    static void s1()
    {
        System.out.println("static method 1");
    }
    static void s2()
    {
         System.out.println("static method 2");
         System.out.println(a);
      System.out.println(b);
    }
     
      void instancemethod1()
      {
          System.out.println("instance method1");
      }
      void instancemethod2()
      {
          System.out.println("instance method2 ");
      }
      public static void main(String[] args){
          Methods a=new Methods();
          a.s1();
          a.s2();
          
          System.out.println("executed successfully"); 
      }
}
static method 1
static method 2
10
20
executed successfully
*/

/*print instance variables in static method*/
/*class Methods
{
    int a=10;
    int b=20;
    static void greet()
    {
        Methods obj=new Methods();
        System.out.println(obj.a);
        System.out.println(obj.b);
        
    }
    public static void main(String[] args)
    {
        System.out.println("executed succesfully");
        greet();
    }
}
executed succesfully
10
20*/

//print staic variable in instance class//
/*class Methods
{
    static int a=10;
    static int b=20;
    void greet()
    {
        System.out.println(a);
        System.out.println(b);
        
    }
    public static void main(String[] args)
    {
        System.out.println("hi");
        Methods obj=new Methods();
        obj.greet();
        
    }
}*/
/*hi
10
20*/

/*call instance methods in static methods*/
/*class Methods 
{
    void show() 
    {
        System.out.println("This is instance method");
    }

    
    public static void main(String[] args) 
    
    {
        System.out.println("successful");
        Methods obj = new Methods();
        obj.show();  
    }
}
successful
This is instance method*/

/*call static methods in instance methods*/
/*class Methods 
{
    static void show() 
    {
        System.out.println("This is a static method");
    }

    
    public void display() 
    {
        System.out.println("Inside instance method");
        show(); 
    }

    public static void main(String[] args) 
    {
        Methods obj = new Methods(); 
        obj.display();  
    }
}*/
/*Inside instance method
This is a static method*/

/*class Methods
{

   
    static int a = 10;
    static int b= 20;

    int c = 30;
    int d= 40;

    public static void main(String[] args) 
    {
       
        Methods obj = new Methods();
        System.out.println(a);
        System.out.println(b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}*/
/*10
  20
  30
  40*/
 

/*Call static methods and instance methods in main method*/
 /*class Methods{
    static void Method() {
        System.out.println("This is a static method.");
    }
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        Method();
        Methods obj = new Methods();
        obj.instanceMethod();
    }
}*/
/*This is a static method.
  This is an instance method.*/



