/* Zad 1 */
class Account
{
   public String id;
   public String name;
   public int balance;

    public Account(String id, String name)
    {
        this.id = id;
        this.name = name;
    }

   public Account(String id, String name, int balance)
   {
       this.id = id;
       this.name = name;
       this.balance = balance;
   }

   public String getID()
   {
        return id;
   }

   public String getName()
   {
       return name;
   }

   public int getBalance()
   {
       return balance;
   }


    public void credit(int amount)
    {
        balance += amount;
    }

    public void debit(int amount)
    {
        if (amount <= balance)
        {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account[id="+id+",name="+name+",balance="+balance+"]";
    }
}


/* Zad 2 */
class Author
{
   public String name;
   public String email;
   public char gender;
   
   public Author(String name, String email, char gender)
   {
       this.name = name;
       this.email = email;
       this.gender = gender;
   }

   public String getName() 
   {
        return name;
   }
    
   public String getEmail()
   {
        return email;
   }
   
   public char getGender()
   {
       return gender;
   }

    public void setEmail(String email)
    {
        this.email = email;
    }
    

    @Override
    public String toString() {
        return "Author[name="+name+",email="+email+",gender="+gender+"]";
    }
}

class Book
{
    public String name;
    public double price;
    public Author author;
    public int qty;

    public Book(String name, double price, Author author)
    {
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = 0;
    }

    public Book(String name, double price, Author author, int qty)
    {
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }

    public String getName()
    {
        return name;
    }

    public Author getAuthor()
    {
        return author;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQty()
    {
        return qty;
    }
    

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }


    @Override
    public String toString() {
        return "Book[name="+name+",author="+author.toString()+",price="+price+",qty="+qty+"]";
    }
}


/* Zad 3 */
import java.util.Arrays;
import java.util.stream.Collectors;

class Author
{
   public String name;
   public String email;
   public char gender;

   public Author(String name, String email, char gender)
   {
       this.name = name;
       this.email = email;
       this.gender = gender;
   }

   public String getName()
   {
        return name;
   }

   public String getEmail()
   {
        return email;
   }

   public char getGender()
   {
       return gender;
   }

    public void setEmail(String email)
    {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Author[name="+name+",email="+email+",gender="+gender+"]";
    }
}

class Book
{
    public String name;
    public double price;
    public Author[] author;
    public int qty;

    public Book(String name, double price, Author[] author)
    {
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = 0;
    }

    public Book(String name, double price, Author[] author, int qty)
    {
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }

    public String getName()
    {
        return name;
    }

    public Author[] getAuthors()
    {
        return author;
    }

    public String getAuthorNames()
    {
        return Arrays.stream(author).map(item -> item.getName()).collect(Collectors.joining(","));
    }

    public double getPrice()
    {
        return price;
    }

    public int getQty()
    {
        return qty;
    }


    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }


    @Override
    public String toString() {
         return "Book[name="+name+",price="+price+",authors=["+Arrays.stream(author).map(item -> item.toString()).collect(Collectors.joining(", "))+"],qty="+qty+"]";
    }
}



/* Zad 4 */
class RandomNumbers 
{
    private static int[] _array = {1,2,3,4,5,6,7,8,9,10,11,12};

    public static int randomElement()
    {
        return _array[(int)(Math.random() * _array.length)];
    }
}


/* Zad 5 */
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String Word = in.nextLine();

        System.out.println(Word.toUpperCase());
        System.out.println(Word.toLowerCase());
        System.out.println(Word.substring(0, 1).toUpperCase() + Word.substring(1));
        System.out.println(Arrays.stream(Word.split(" ")).map(word -> word.substring(0, 1).toUpperCase() + word.substring(1)).collect(Collectors.joining(" ")));
    }
}



/* Zad 6 */
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String Text = in.nextLine();
        String Word = in.nextLine();

        if (Text.toLowerCase().contains(Word.toLowerCase()))
        {
            System.out.println("Słowo " + Word + " znajduje się w ciągu");
        } else {
            System.out.println("Słowo " + Word + " nie znajduje się w ciągu");
        }
   }
}



/* Zad 7 */
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String Text = in.nextLine();

        String[] aa = Text.split("/");
        System.out.println(aa[aa.length-1]);
   }
}



/* Zad 8 */
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String Text = in.nextLine();

        String[] aa = Text.split("@");
        System.out.println(aa[0]);
   }
}



/* Zad 9 */
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String Text = in.nextLine();
        String Word = in.nextLine();
        String Rep = in.nextLine();

        System.out.println(Text.replace(Word,Rep));
   }
}



/* Zad 10 */
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String Text1 = in.nextLine();
        String Text2 = in.nextLine();

        int Size = Text1.length();
        if (Text2.length() < Size)
        {
            Size = Text2.length();
        }

        for (int i = 0; i < Size; i++)
        {
            if (Text1.charAt(i) != Text2.charAt(i))
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println("The strings are equal");
   }
}


/* Zad 11 */
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char c = in.nextLine().charAt(0);
        char nc = (char)(c + 1);

        //97-122

        if (c + 1 >= 123)
        {
            nc -= 26;
        }
        else if (c + 1 >= 90 && c + 1 < 97 )
        {
            nc -= 26;
        }

        System.out.println(nc);
   }
}



/* Zad 12 */
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String TT = in.nextLine();
        String[] T = TT.split(" ");
        String[] P12 = in.nextLine().split(" ");
        String P1 = P12[0];
        String P2 = P12[1];
        String K = in.nextLine();



        ArrayList<String> NewT = new ArrayList<>();


        int OnlyAddEndRange = -1;
        for (int i = 0; i < T.length; i++)
        {
            NewT.add(T[i]);

            if (i < OnlyAddEndRange) {continue;}

            if (i < T.length - 1)
            {
                if (T[i].equals(P1) && CheckExist(T, i+1, P2))
                {
                    NewT.add(K);
                    OnlyAddEndRange = FindIndex(T, i+1, P2);
                }
            }
        }

        System.out.println(String.join(" ", NewT));

    }

    public static Boolean CheckExist(String[] T, int Start, String value)
    {
        for(int i = Start; i < T.length; i++)
        {
            if (T[i].equals(value)){
                return true;
            }
        }

        return false;
    }

    public static int FindIndex(String[] T, int Start, String value)
    {
        for(int i = Start; i < T.length; i++)
        {
            if (T[i].equals(value)){
                return i;
            }
        }

        return -1;
    }

}



/* Zad 13 */
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String X = in.nextLine();

        if (X.contains("."))
        {
            System.out.println(Double.parseDouble(X));
        } else {
            System.out.println(Integer.parseInt(X));
        }
    }
}


/* Zad 14 */
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String X = in.nextLine();
        System.out.println(X.replaceAll("[\\\\/:'*?\"<>|+-]+", " ").replaceAll("[ ]+", " ").trim());
    }
}



/* Zad 15 */
import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] Words = Arrays.stream(in.nextLine().split(" ")).distinct().toArray(String[]::new);
        String X = in.nextLine();

        for(int i = 0; i< Words.length; i++)
        {
            if (Words[i].startsWith(X))
            {
                System.out.println(X + " jest przedrostkiem słowa " + Words[i]);
            }
            else if  (Words[i].endsWith(X))
            {
                System.out.println(X + " jest przyrostkiem słowa " + Words[i]);
            }
        }
   }
}


