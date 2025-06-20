/*add integer values*/
/*class Arrays 
{
public static void main(String[] args) 
{
int[] arr = {1, 2, 3, 4, 5};  
int sum = 0;
for (int i = 0; i < arr.length; i++) 
{
sum = sum + arr[i];
}
System.out.println("Sum is: " + sum);
}
}*/
/*Sum is: 15*/

/*calculate the average value of an array of integers*/
/*class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int sum=0;
float avg=0;
for(int b:a)
{
 sum+=b;
avg=sum/2;
}
System.out.println(sum);
System.out.println(avg);
}
}*/
/*15
7.0*/

/*index of an array*/
/*class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
 int target=4;
for(int i=0;i<a.length;i++)
{
if(a[i]==target)
{
System.out.println(i);
}
}
}
}*/
/*3*/

/*if array contains a specific value*/
/*class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int target=4;
int count=0;
for(int i=0;i<a.length;i++)
{
if(a[i]==target)
{
count++;
}
}
if(count==1)
{
System.out.println("element found at position");
}
else
{
System.out.println("element is not found");
}
}
}*/
/*element found at position*/

/*to remove a specific element from an array*/
/*class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int remove = 3;
int b[] = new int[a.length - 1];
int j = 0;
for (int i = 0; i < a.length; i++) 
{
if (a[i] != remove) 
{
b[j] = a[i];
j++;
}
}
for (int i = 0; i < b.length; i++) 
{
System.out.println(b[i] + " ");
}
}
}*/
/*1
  2
  4
  5  */

/*to copy an array to another array*/
/*class Arrays
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int b[]=new int[a.length-1];
for(int i=0;i<b.length;i++)
{
b[i]=a[i];
}
for(int i=0;i<b.length;i++)
{
System.out.println(b[i]+"");
}
}
}/*
/*1
  2
  3
  4  */

/*insert element at specific position*/
/*import java.util.Scanner;
class Arrays {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] oldArray = {1, 2, 3, 4};
        System.out.println("Old Array:");
        for (int i = 0; i < oldArray.length; i++) 
        {
            System.out.print(oldArray[i] + " ");
        }
        System.out.print("\nEnter number to add: ");
        int newNumber = sc.nextInt();
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) 
        {
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length - 1] = newNumber;
        System.out.println("New Array:");
        for (int i = 0; i < newArray.length; i++) 
        {
            System.out.print(newArray[i] + " ");
        }

        sc.close();
    }
}*/
/*Old Array:
  1 2 3 4
  Enter number to add: 6
  New Array:
  1 2 3 4 6*/

/*find the min and max values in array*/
/*class Arrays
{
    public static void main(String[] args)
     {
        int[] numbers = {10, 5, 25, 8, 15};
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] < min) 
            {
                min = numbers[i];
            }
            if (numbers[i] > max) 
            {
                max = numbers[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}*/
/*Minimum value: 5
  Maximum value: 25*/

/*write a function to reverse an array values*/
/*class Arrays 
{
    public static void main(String[] args) 
    {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        for (int i = 0; i < numbers.length; i++) 
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nReversed Array:");
        for (int i = numbers.length - 1; i >= 0; i--) 
        {
            System.out.print(numbers[i] + " ");
        }
    }
}*/
/*Original Array:
  10 20 30 40 50
  Reversed Array:
  50 40 30 20 10*/

/*to find the common values between two arrays*/
/*class Arrays 
{
    public static void main(String[] args) 
    {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        System.out.println("Common elements:");
        for (int i = 0; i < array1.length; i++) 
         {
            for (int j = 0; j < array2.length; j++) 
             {
                if (array1[i] == array2[j]) 
                 {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}*/
/*Common elements:
  3
  4
  5*/

/*find the duplicate values of an array*/
/*class Arrays 
{
public static void main(String[] args)
    {
        int a[]={2,3,4,4,5,6};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Duplicate is found: "+ a[i]);
                }
            }
        }
        System.out.println("Duplicate not found");
    }
}*/
/*Duplicate is found: 4
  Duplicate not found*/

  



