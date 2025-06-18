/*class Loops
{
public static void main(String[] args)
{
for(int i=0;i<10;i++)
{
System.out.println("Bright It Career");
}
}
}*/
/*Bright It Career
  Bright It Career
  Bright It Career
  Bright It Career
  Bright It Career
  Bright It Career
  Bright It Career
  Bright It Career
  Bright It Career
  Bright It Career    */

/*class Loops
{
public static void main(String[] args)
{
int i=1;
while(i<=20)
{
System.out.println(i);
i++;
}
}
}*/
/*1
  2
  3
  4
  5
  6
  7
  8
  9
  10
  11
  12
  13
  14
  15
  16
  17
  18
  19
  20 */

/*class Loops 
{
public static void main(String[] args) 
{
for (int i = 1; i <= 5; i++) 
{
if (i == 3) 
{
System.out.println(i + " is equal to 3");
}
if (i != 3) 
{
System.out.println(i + " is not equal to 3");
}
}        
}    
}*/
/*1 is not equal to 3
  2 is not equal to 3
  3 is equal to 3
  4 is not equal to 3
  5 is not equal to 3*/

/*class Loops 
{
public static void main(String[] args) 
{
System.out.println("Even Numbers from 1 to 20:");
for (int i = 1; i <= 20; i++) 
{
if (i % 2 == 0) 
{
System.out.print(i + " ");
}
}
System.out.println("\n\nOdd Numbers from 1 to 20:");
for (int i = 1; i <= 20; i++) 
{
if (i % 2 != 0) 
{
System.out.print(i + " ");
}
}
}
}*/
/*Even Numbers from 1 to 20:
  2 4 6 8 10 12 14 16 18 20

  Odd Numbers from 1 to 20:
  1 3 5 7 9 11 13 15 17 19*/

/*import java.util.Scanner;
class Loops
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("Enter the first number: ");
int num1 = s.nextInt();
System.out.print("Enter the second number: ");
int num2 = s.nextInt();
System.out.print("Enter the third number: ");
int num3 = s.nextInt();
int[] numbers = {num1, num2, num3};
int largest = numbers[0];
for (int i = 1; i < numbers.length; i++)
{
if (numbers[i] > largest)
{
largest = numbers[i];
}
}
System.out.println("The largest number is: " + largest);
}
}*/
/*Enter the first number: 1
  Enter the second number: 22
  Enter the third number: 49
  The largest number is: 49  */

/*class Loops
{
public static void main(String[] args) 
{
int i = 10;
while (i <= 100) 
{
if (i % 2 == 0) 
{
System.out.println(i);
}
i++;
}
}
}*/
/*10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100*/

/*class Loops 
{
public static void main(String[] args) 
{
int i = 1;
do 
{
System.out.println(i);
i++;
}
while (i <= 10);
}
}*/
/*1
2
3
4
5
6
7
8
9
10*/

/*class Loops
{
public static void main(String[] args) 
{
int num = 153;  
int temp = num;
int sum = 0;
while (num > 0) {
int digit = num % 10;
sum = sum + (digit * digit * digit); 
num = num / 10;
}
if (sum == temp) 
{
System.out.println(temp + " is an Armstrong number.");
} else {
System.out.println(temp + " is not an Armstrong number.");
}
}
}*/
/*153 is an Armstrong number.*/

/*class Loops 
{
public static void main(String[] args) 
{
int num = 7;  
int count = 0;
for (int i = 1; i <= num; i++) 
{
if (num % i == 0) 
{
count++;
}
}
if (count == 2) 
{
System.out.println(num + " is a Prime Number.");
} else {
System.out.println(num + " is not a Prime Number.");
}
}
}*/
/*7 is a Prime Number.*/

/*class Loops
{
public static void main(String[] args) 
{
int num = 121;  
int original = num;
int reverse = 0;
while (num > 0) 
{
int digit = num % 10;
reverse = reverse * 10 + digit;
num = num / 10;
}
if (original == reverse) 
{
System.out.println(original + " is a Palindrome number.");
} else {
System.out.println(original + " is not a Palindrome number.");
}
}
}*/
/*121 is a Palindrome number.*/

/*import java.util.Scanner;
class Loops 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
switch (num % 2) 
{
case 0:
System.out.println(num + " is EVEN.");
break;
case 1:
System.out.println(num + " is ODD.");
break;
default:
System.out.println("Invalid input.");
}
sc.close();
}
}*/
/*Enter a number: 2
2 is EVEN.*/

/*import java.util.Scanner;
class Loops
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter m or f: ");
char ch = sc.next().charAt(0);
switch (ch) 
{
case 'm':
System.out.println("Male");
break;
case 'f':
System.out.println("Female");
break;
default:
System.out.println("Invalid input");
}
sc.close();
}
}*/
/*Enter m or f: m
Male*/

/*class Loops {
public static void main(String[] args) 
{
int a = 10;
int b = 20;
int c = 30;
if (a > b && a > c) 
{
System.out.println("Largest number is: " + a);
} else if (b > a && b > c) 
{
System.out.println("Largest number is: " + b);
} else {
System.out.println("Largest number is: " + c);
}
}
}*/
/*Largest number is: 30*/






