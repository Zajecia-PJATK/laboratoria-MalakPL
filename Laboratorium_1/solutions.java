/* Zad 1 */
import java.io.*;

class ExampleInputOutput {
  public static void main(String[] args) throws IOException {
    System.out.println("Witaj w świecie Java!!!");
  }
}

/* Zad 3 */
import java.io.*;

class ExampleInputOutput {
  public static void main(String[] args) throws IOException {
    double a, b;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    a = Double.parseDouble(br.readLine());
    b = Double.parseDouble(br.readLine());
    System.out.println(a*b);
  }
}

/* Zad 4 */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
  public static void main(String[] args) throws IOException 
  {
    System.out.printf("%.2f", Math.sqrt(Math.PI));
  }
}

/* Zad 5 */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
  public static void main(String[] args) throws IOException 
  {
      int a, b;
      Scanner in = new Scanner(System.in);
      a = in.nextInt();
      b = in.nextInt();
      System.out.println("Dodawanie: " + a + " + " + b + " = " + (a+b));
      System.out.println("Odejmowanie: " + a + " - " + b + " = " + (a-b));
      System.out.println("Mnożenie: " + a + " * " + b + " = " + (a*b));
      System.out.println("Dzielenie modulo: " + a + " mod " + b + " = " + (a%b));
  }
}

/* Zad 6 */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
  public static void main(String[] args) throws IOException 
  {
      String[] a;
      BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
      a = bi.readLine().split(" ");
      System.out.println("\"%" + a[1] + " " + a[0] + "%\"");
  }
}

/* Zad 7 */
import java.io.*;
import java.util.*;

class ExampleInputOutput {
  public static void main(String[] args) throws IOException 
  {
    float a,b,c;
    Scanner in = new Scanner(System.in);

      try 
      {
          a = in.nextFloat();
          b = in.nextFloat();
          c = in.nextFloat();

          if (a < 0 || b < 0 || c < 0)
          {
              System.out.println("BŁĄD");
          } 
          else 
          { 
              System.out.println(
                  (
                      ((a+b)>c) && 
                      ((a+c)>b) && 
                      ((b+c)>a)
                  ) ? "TAK" : "NIE");
          }
      } 
      catch (Exception e)
      {
         System.out.println("BŁĄD"); 
      }
  }
}

/* Zad 8 */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
  public static void main(String[] args) throws IOException 
  {
      int a,b,c;
      Scanner in = new Scanner(System.in);

      try 
      {
          a = in.nextInt();

          switch(a)
          {
              case 1:
                  System.out.println("Styczeń: 31 dni");
                  break;
                  
              case 2:
                  System.out.println("Luty: 28 dni");
                  break;
                  
              case 3:
                  System.out.println("Marzec: 31 dni");
                  break;

              case 4:
                  System.out.println("Kwiecień: 30 dni");
                  break;
                  
                  
              case 5:
                  System.out.println("Maj: 31 dni");
                  break;
                  
                  
              case 6:
                  System.out.println("Czerwiec: 30 dni");
                  break;
                  
              case 7:
                  System.out.println("Lipiec: 31 dni");
                  break;
                  
              case 8:
                  System.out.println("Sierpień: 31 dni");
                  break;
                  
              case 9:
                  System.out.println("Wrzesień: 30 dni");
                  break;
                                    
              case 10:
                  System.out.println("Październik: 31 dni");
                  break;
                  
              case 11:
                  System.out.println("Listopad: 30 dni");
                  break;
                  
              case 12:
                  System.out.println("Grudzień: 31 dni");
                  break;
                  
              default:
                  System.out.println("BŁĄD");
                  break;
          }
      } 
      catch (Exception e)
      {
         System.out.println("BŁĄD"); 
      }
  }
}

/* Zad 9 */
import java.util.*;

 class Solution 
 {
     public static void main(String[] args) 
     {
         Scanner in = new Scanner(System.in);
         float a = in.nextFloat();
         float b = in.nextFloat();
         float c = in.nextFloat();

         if ((a < b && a < c) && (b<c))
         {
             System.out.printf("%.6f %.6f %.6f", a, b, c);
         }

         if ((a < c && a < b) && (c<b))
         {
             System.out.printf("%.6f %.6f %.6f", a, c, b);
         }

         if ((b < a && b < c) && (a<c))
         {
             System.out.printf("%.6f %.6f %.6f", b, a, c);
         }

         if ((b < c && b < a) && (c<a))
         {
             System.out.printf("%.6f %.6f %.6f", b, c, a);
         }

         if ((c < a && c < b) && (a<b))
         {
             System.out.printf("%.6f %.6f %.6f", c, a, b);
         }

         if ((c < b && c < a) && (b<a))
         {
             System.out.printf("%.6f %.6f %.6f", c, b, a);
         }


          System.out.println();

         if ((a > b && a > c) && (b>c))
         {
             System.out.printf("%.6f %.6f %.6f", a, b, c);
         }

         if ((a > c && a > b) && (c>b))
         {
             System.out.printf("%.6f %.6f %.6f", a, c, b);
         }

         if ((b > a && b > c) && (a>c))
         {
             System.out.printf("%.6f %.6f %.6f", b, a, c);
         }

         if ((b > c && b > a) && (c>a))
         {
             System.out.printf("%.6f %.6f %.6f", b, c, a);
         }

         if ((c > a && c > b) && (a>b))
         {
             System.out.printf("%.6f %.6f %.6f", c, a, b);
         }

         if ((c > b && c > a) && (b>a))
         {
             System.out.printf("%.6f %.6f %.6f", c, b, a);
         }
      }
}

/* Zad 12 */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
  public static void main(String[] args) throws IOException 
  {
      int n, m;
      Scanner in = new Scanner(System.in);

      n = in.nextInt();
      m = in.nextInt();

      if (n < 0 || m < 0)
      {
          System.out.println("BŁĄD");
          return;  
      }
        
        try
        {

            int[] ntab = new int[n];
            for(int i = 0; i < n; ++i)
            {
                ntab[i] = Math.abs(in.nextInt());
            }

            int[] mtab = new int[m];
            for(int i = 0; i < m; ++i)
            {
                mtab[i] = Math.abs(in.nextInt());
            }


            int size = (m > n) ? n : m;
            int output = 0;
            for(int i = 0; i < size; ++i)
            {
                output += ntab[i] * mtab[i];
            }

            System.out.println(output);

        } 
        catch(Exception e)
        {
            System.out.println("BŁĄD");
            return;
        }
  }
}

/* Zad 13 */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
  public static void main(String[] args) throws IOException 
  {
        try
        {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            
            while (n <= 0)
            {
               n = in.nextInt(); 
            }

            for(int i = 0; i < n; i++)
            {
                for(int i2 = 0; i2 < n; i2++)
                {
                    System.out.print((i>=i2) ? "*" : "");
                }
                System.out.println();
            }
                      
            for(int i = 0; i < n; i++)
            {
                for(int i2 = 0; i2 < n; i2++)
                {
                    System.out.print(((n-i-1)>=i2) ? "*" : "");
                }
                System.out.println();
            }
            
            for(int i = 0; i < n; i++)
            {
                for(int i2 = 0; i2 < n; i2++)
                {
                    System.out.print((i<=i2) ? "*" : " ");
                }
                System.out.println();
            }
            
            
            for(int i = 0; i < n; i++)
            {
                for(int i2 = 0; i2 < n; i2++)
                {
                    System.out.print(((n-i-1)<=i2) ? "*" : " ");
                }
                System.out.println();
            }
 
        } 
        catch(Exception e)
        {
            return;
        }
  }
}

/* Zad 14 */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
  public static void main(String[] args) throws IOException 
  {
        try
        {
            String Word;
            Scanner in = new Scanner(System.in);
          
            Word = in.nextLine();

            Boolean jestGit = true;
            for(int i = 0; i < Word.length(); i++)
            {
                if (Word.charAt(i) != Word.charAt(Word.length()-i-1))
                {
                    jestGit = false;
                }
            }
            
            System.out.println(jestGit ? "TAK" : "NIE");
 
        } 
        catch(Exception e)
        {
            System.out.println("BŁĄD");
            return;
        }
  }
}

/* Zad 15 */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
  public static void main(String[] args) throws IOException 
  {
        try
        {
            int a, b;
            Scanner in = new Scanner(System.in);
          
            a = in.nextInt();
            b = in.nextInt();


            if (a <= 0 || b <= 0)
            {
                System.out.println("BŁĄD");
                return;
            }
            
            int[][] tab = new int[a][b];
            for(int y = 0; y < a; ++y)
            {
                for(int x = 0; x < b; ++x)
                {
                    tab[y][x] = in.nextInt();
                }
            }
            
            
            for(int x = 0; x < b; ++x)
            {
                for(int y = 0; y < a; ++y)
                {
                    System.out.print(tab[y][x]);
                    if(y != a-1)
                    {
                         System.out.print(" ");
                    }
                }
                
                if(x != b-1)
                {
                    System.out.println();
                }
            }

        } 
        catch(Exception e)
        {
            System.out.println("BŁĄD");
            return;
        }
  }
}


/* Zad 1 (1.3) */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
  public static void main(String[] args) throws IOException 
  {
      Scanner in = new Scanner(System.in);
      String text = in.nextLine().toUpperCase();
      
      String str = "ABCDEFGHIJKLMNOPQRSTVWXYZ";
      boolean allLetterPresent = true;

      for (char i = 0; i < str.length(); i++) 
      {
            if (
                !text.contains(
                    String.valueOf(str.charAt(i))
                )
            ) 
            {
                System.out.println("false");
                return;
            }
      }
      
       System.out.println("true");
  }
}


/* Zad 2 (1.3) */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);

      try
      {
          float Time = in.nextFloat() / 31557600.0f;
          in.nextLine();
          String Planet = in.nextLine();

          switch(Planet)
          {
              case "Ziemia":
                  System.out.printf("%.2f", Time);
                  break;

              case "Merkury":
                  System.out.printf("%.2f", Time / 0.2408467);
                  break;

              case "Wenus":
                  System.out.printf("%.2f", Time / 0.61519726);
                  break;

              case "Mars":
                  System.out.printf("%.2f", Time / 1.8808158);
                  break;

              case "Jowisz":
                  System.out.printf("%.2f", Time / 11.862615);
                  break;

              case "Saturn":
                  System.out.printf("%.2f", Time / 29.447498);
                  break;

              case "Uran":
                  System.out.printf("%.2f", Time / 84.016846);
                  break;

              case "Neptun":
                  System.out.printf("%.2f", Time / 164.79132);
                  break;

              default:
                  System.out.println("BŁĄD");
                  break;
          }
      } 
      catch (Exception Ex)
      {
          
      }

  }
}


/* Zad 3 (1.3) */
import java.io.*;
import java.util.*;

class ExampleInputOutput 
{
    static int max_rec(List<Integer> numbers)
    {
        if (numbers.size() > 1)
        {
            if (numbers.get(0) > numbers.get(1))
            {
                numbers.remove(1);   
            } else {
                numbers.remove(0);
            }
            
            return max_rec(numbers);
        } 
        else 
        {
            return numbers.get(0);
        }
    }
    
    public static void main(String[] args)
    {
        try
        {
            Scanner in = new Scanner(System.in);

            List<Integer> arr = new ArrayList<Integer>();
            while (in.hasNext()) 
            {
                arr.add(in.nextInt());
            }

            System.out.println(max_rec(arr));
        } 
        catch (Exception ex) 
        {
        }
    }
}
