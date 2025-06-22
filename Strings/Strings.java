//Differnt ways of creating Strings
/*class Strings
{
    public static void main(String[] args)
    {
        String s1="Priyavasanthi";
        String s2=new String("sviet");
        System.out.println(s1);
        System.out.println(s2);
       
    }
}*/
/*Priyavasanthi
  sviet*/

//concatenation of Strings
/*class Strings
{
    public static void main(String[] args)
    {
        String s1="priya";
        String s2="vasanthi";
        String s3=new String("sviet");
        System.out.println(s1);
        System.out.println(s2);
         System.out.println(s3);
          System.out.println(s1+s2);
           System.out.println(s2+s3);
            System.out.println(s3+s1);
       
       
    }
}*/
/*priya
  vasanthi
  sviet
  priyavasanthi
  vasanthisviet
  svietpriya*/

//length of Strings
/*class Strings
{
    public static void main(String[] args)
    {
        String s1="priya";
        String s2="vasanthi";
        String s3=new String("sviet");
        System.out.println(s1.length());
        System.out.println(s2.length());
         System.out.println(s3.length());
       
       
       
    }
}*/
/*5
  8
  5*/

//extract a string using substring
/*class Strings
{
    public static void main(String[] args)
    {
        String s1="priyavasanthi";
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(0,3));
       
       
       
    }
}*/
/*iyavasanthi
  pri*/

//searching in strings using of indexOf()
/*class Strings
{
    public static void main(String[] args)
    {
        String s1="priyavasanthi";
        System.out.println(s1.indexOf('i'));
         System.out.println(s1.indexOf('p'));
         System.out.println(s1.lastIndexOf('i'));
       
       }
}*/
/*2
  0
  12*/

//comparing strings using equals methods
/*class Strings
{
    public static void main(String[] args)
    {
        String s1="priyavasanthi";
        String s2="priyavasanthi";
        String s3="lahari";
        System.out.println(s1==s2);
         System.out.println(s1.equals(s2));
         System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
       
       
       
       
    }
}*/
/*true
  true
  false
  false*/

//startswith ,endswith.compareTo,equalsIgnoreCase methods
/*class Strings
{
    public static void main(String[] args)
    {
        String s1="priyavasanthi";
        String s2=  "priyavasanthi";
        String s3="Priyavasanthi";
        System.out.println(s1.startsWith("priya"));
         System.out.println(s1.endsWith("a"));
         System.out.println(s1.compareTo(s2));
         System.out.println(s3.compareTo(s1));
         System.out.println(s1.equalsIgnoreCase(s3));
         String s4=new String("priyavasanthi");
         System.out.println(s1.compareTo(s4));
       
        }
}*/
/*true
  false
  0
  -32
  true
  0*/

//trimming string methods
/*class Strings
{
    public static void main(String[] args)
    {
        String s1="priyavasanthi";
         System.out.println(s1.trim( ));
        }
}*/
/*priyavasanthi*/

//replacing the characters
/*class Strings
{
    public static void main(String[] args)
    {
        String s1="priya";
        System.out.println("original string is :"+s1);
        String s2=s1.replace("priya","priyavasanthi");
        System.out.println("replaced string is :"+s2);
    }
}*/
/*original string is :priya
  replaced string is :priyavasanthi*/

//converting a number into a string using valueOf()
/*class Strings
{
    public static void main(String[] args)
    {
        int a=2025;
        String s1=String.valueOf(a);
        System.out.println(s1);
        System.out.println(s1.length());
    }
}*/
/*2025
  4*/

//converting lowercase and uppercase
/*class Strings
{
    public static void main(String[] args)
    {
        String s1="priya";
       System.out.println(s1.toUpperCase());
       String s2="PRIYA";
       System.out.println(s2.toLowerCase());
       String s3="Priya";
       System.out.println(s3.toLowerCase());
       String s4="PRIYA";
        System.out.println(s4.toUpperCase());
       
    }
}*/
/*PRIYA
  priya
  priya
  PRIYA*/

//converting integer object to string
/*class Strings
{
    public static void main(String[] args)
    {
        int a=2005;
        String s1=Integer.toString(a);
        System.out.println(s1);
       
    }
}*/
/*2005*/

//splitting of  a string
/*import java.util.Arrays;

class Strings {
    public static void main(String[] args) {
        String s1 = "priyavasanthi";
        String[] s2 = s1.split("a");
        System.out.println(Arrays.toString(s2));
    }
}*/
/*[priy, v, s, nthi]*/


//matching a string in regular expressions
/*class Strings
{
    public static void main(String[] args)
    {
        String reg="[a-zA-Z]+\\d+";
        String a="java49";
        System.out.println(a.matches(reg));
    }
}*/
//true












