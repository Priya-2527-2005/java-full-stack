/*class Patterns
{
public static void main(String[] args)
{
System.out.println("*");
}
}*/
/* * */

/*class Patterns
{
public static void main(String[] args)
{
for(int i=0;i<5;i++)
{
System.out.println("*");
}
}
}*/
/* *
   *
   *
   *
   *   */

/*class Patterns
{
public static void main(String[] args)
{
for(int i=0;i<5;i++)
{
System.out.print("*");
}
}
}*/
/* ***** */

/*class Patterns
{
public static void main(String[] args)
{
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print("*");
}
System.out.println("*");
}
}
}*/
 /* ******
    ******
    ******
    ******
    ******  */

/*class Patterns
{
public static void main(String[] args)
{
for(int i = 1; i <= 5; i++) 
{
for(int j = 1; j <= 5; j++)
{
System.out.print(i);
}
System.out.println();
}
}
}*/
 /* 11111
    22222
    33333
    44444
    55555  */

/*class Patterns
{
public static void main(String[] args)
{
for(int i = 1; i <= 5; i++) 
{
for(int j = 1; j <= 5; j++)
{
System.out.print(j);
}
System.out.println();
}
}
}*/
/*12345
  12345
  12345
  12345
  12345*/

/*class Patterns
{
public static void main(String[] args)
{
int row=5,col=5,num=1;
for(int i = 1; i <= 5; i++) 
{
for(int j = 1; j <= 5; j++)
{
System.out.print(num+"\t");
num++;
}
System.out.println();
}
}
}*/
/*1       2       3       4       5
  6       7       8       9       10
 11      12      13      14      15
 16      17      18      19      20
 21      22      23      24      25*/

/*class Patterns{
public static void main(String[] args)
{
int[] starts = {1, 6, 2, 7, 3}; 
for (int i = 0; i < 5; i++) 
{
int num = starts[i];
for (int j = 0; j < 5; j++) 
{
System.out.print(num);
num++;
if (num == 10) num = 1; 
}
System.out.println();
}
}
}*/
/*12345
  67891
  23456
  78912
  34567*/


/*class Patterns
{
public static void main(String[] args) 
{
int num = 1;
for (int row = 1; row <= 5; row++) 
{
for (int i = 1; i <= 5; i++) 
{
System.out.print(num + " ");
num += 2;
}
System.out.println();
}
}
}*/
/*1 3 5 7 9
  11 13 15 17 19
  21 23 25 27 29
  31 33 35 37 39
  41 43 45 47 49*/

/*class Patterns 
{
public static void main(String[] args) 
{
for (int i = 1; i <= 5; i++) 
{
System.out.println("1 0 1 0 1");
}
}
}*/
/*1 0 1 0 1
  1 0 1 0 1
  1 0 1 0 1
  1 0 1 0 1
  1 0 1 0 1*/

/*class Patterns 
{
public static void main(String[] args) 
{
int i, j;
for (i = 1; i <= 5; i++) 
{
for (j = 5; j > i; j--) 
{
System.out.print(" ");
}
for (j = 1; j <= i; j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}*/
/*    *
     * *
    * * *
   * * * *
  * * * * *   */

/*class Patterns 
{
public static void main(String[] args) 
{
int rows = 5;
for (int i = 1; i <= rows; i++)
{
int num = 2;
for (int j = 1; j <= i; j++)
{
System.out.print(num + " ");
num += 2;
}
System.out.println();
}
}
}*/
/*2
  2 4
  2 4 6
  2 4 6 8  
  2 4 6 8 10*/


/*class Patterns
{
public static void main(String[] args) 
{
System.out.println("I");
System.out.println("IN");
System.out.println("IND");
System.out.println("INDI");
System.out.println("INDIA");
}
}*/
/* I
   IN
   IND
   INDI
   INDIA    */

/*class Patterns 
{
public static void main(String[] args)
{
int rows = 4;
for (int i = 1; i <= rows; i++)
{
for (int j = 1; j <= rows - i; j++)
{
System.out.print("  ");
}
for (int k = 1; k <= 2 * i - 1; k++)
{
System.out.print("* ");
}
System.out.println();
}
for (int i = rows - 1; i >= 1; i--)
{
for (int j = 1; j <= rows - i; j++)
{
System.out.print("  ");
}
for (int k = 1; k <= 2 * i - 1; k++) 
{
System.out.print("* ");
}
System.out.println();
}
}
}*/
/*      *
      * * *
    * * * * *
  * * * * * * *
    * * * * *
      * * *
        *         */

/*class Patterns
{
public static void main(String[] args)
{
int size = 5;
for (int i = 1; i <= size; i++)
{
for (int j = 1; j <= size; j++)
{
if (i == 1 || i == size || j == 1 || j == size)
{
System.out.print("* ");
} else {
System.out.print("  ");
}
}
System.out.println();
}
}
}*/
/* * * * * *
   *       *
   *       *
   *       *
   * * * * *     */


/*class Patterns

{
    public static void main(String[] args)
    {
        int n = 5;

        int mid = n / 2 + 1;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
               
                if (i == mid || j == mid)
                {
                    System.out.print("* ");
                } else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/
/*    *
      *
  * * * * *
      *
      *       */


/*class Patterns 
{
public static void main(String[] args)
{
int n = 5;

        for (int i = 1; i <= n; i++)
        {        
            for (int j = 1; j <= n; j++)
            {      
               
                if (i == j || i + j == n + 1)
                {
                    System.out.print("* ");
                } else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}*/
/*  *       *
      *   *
        *
      *   *
    *       *         */

/*class Patterns 
{
public static void main(String[] args) 
{
int n = 5;
for (int i = 1; i <= n; i++)
{
for (int j = 1; j <= n - i; j++) 
{
System.out.print(" ");
}
for (int j = 1; j <= 2 * i - 1; j++) 
{
if (j == 1 || j == 2 * i - 1) 
{
System.out.print("*");
} else {
System.out.print(" ");
}
}
System.out.println();
}
for (int i = n - 1; i >= 1; i--) 
{
for (int j = 1; j <= n - i; j++) 
{
System.out.print(" ");
}
for (int j = 1; j <= 2 * i - 1; j++) {
if (j == 1 || j == 2 * i - 1) {
System.out.print("*");
} else {
System.out.print(" ");
}
}
System.out.println();
}
}
} */
/*    *
     * *
    *   *
   *     *
  *       *
   *     *
    *   *
     * *
      *           */

/*class Patterns 
{
public static void main(String[] args) 
{
int n = 6;
for (int i = 0; i <= n; i++) 
{
for (int j = 0; j < i; j++) 
{
System.out.print("* ");
}
System.out.println(i);
}
}
}*/
/*0
 * 1
 * * 2
 * * * 3
 * * * * 4
 * * * * * 5
 * * * * * * 6    */

/*class Patterns {
 public static void main(String[] args) {
 int n = 7;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++){
if (i == 1) {
System.out.print("* ");
}
else if (j == 1 || j == i) {
System.out.print("* ");
}
else {
 System.out.print(" ");
}
 }
System.out.println();
}
}
}*/
/* * * * * * * *
   * *
   *  *
   *   *
   *    *
   *     *
   *      *               */

/*class Patterns {
public static void main(String[] args) {
int n = 7;
for (int i = n; i >= 1; i--) {
 for (int j = 1; j <= i; j++) {
 if (j == 1 || j == i || i == n) {
System.out.print("*");
} else {
System.out.print(" ");
 }
}
System.out.println();
}
}
}*/
/* *******
   *    *
   *   *
   *  *
   * *
   **
   *            */






























