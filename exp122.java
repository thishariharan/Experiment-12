
package exp12;

import java.util.*;

public class exp122 {
    public static void main(String[] args)
    {
        Scanner o = new Scanner(System.in);
        pokes p = new pokes();
        int i=0,n;
        System.out.print("1-To Add\t2-To Display\t3-To Search elements using Type");
        while(i==0)
        {
            System.out.print("\nEnter your Choice :");
            n = o.nextInt();
            switch(n)
            {
                case 1:
                    p.ad();
                    break;
                case 2:
                    p.pt();
                    break;
                case 3:
                    p.sch();
                    break;
                case 4:
                    p.pck();
                    break;
                default:
                    i++;
                    break;
            }
        }
    }
}

class pokes
{
    Scanner p = new Scanner(System.in);
    ArrayList a = new ArrayList<>();
    void pt()
    {
        System.out.print(a+" of Size "+a.size());
    }
    void ad()
    {
        System.out.print("Enter any kind of Data :");
        if(p.hasNextInt())
        {
            System.out.print("You have entered an Integer and it has been added to the List.");
            a.add(p.nextInt());
        }  
        else if(p.hasNextFloat())
        {
            System.out.print("You have entered an Float and it has been added to the List.");
            a.add(p.nextFloat());
        } 
        else if(p.hasNext())
        {
            System.out.print("You have entered an String and it has been added to the List.");
            a.add(p.next());
        }
    }
    void sch()
    {
        System.out.print("Enter the data of any type :");
        if(p.hasNext())
        {    
            newt("String");
        }
        else if(p.hasNextInt())
        {    
            newt("Integer");
        }
        else if(p.hasNextFloat())
        {    
            newt("Float");
        }    
    }
    void newt(String s)
    {
        int g; String ck;
        for(g=0;g<a.size();g++)
        {
            ck = a.get(g).getClass().getSimpleName();
            if(ck.equals(s))
            {
                System.out.print("\n"+a.get(g)+" - "+ck);
            }
        }
    }
    void pck()
    {
        String ck;
        for(int g=0;g<a.size();g++)
        {
            ck = a.get(g).getClass().getSimpleName();
            {
                System.out.print("\n"+a.get(g)+" - "+ck);
            }
        }
    }
}

