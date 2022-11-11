
package exp12;

import java.util.*;

public class Exp121 {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        int i=0,n;        
        ficks<Integer> f = new ficks();
        System.out.print("\n1-To Insert value\t2-To Display Array\t3-To Count odds of a List\n4-To Exchange Position of values in a List\t5-To Find the Extreamist element");
        while(i==0)
        {
            System.out.print("\nEnter your Choice : ");
            n = o.nextInt();
            switch(n)
            {
                case 1:
                    f.ins();
                    break;
                case 2:
                    f.sz();
                    break;
                case 3:
                    f.fods();
                    break;
                case 4:
                    f.rps();
                    break;
                case 5:
                    f.exm();
                    break;
                default:
                    i=i+1;
                    break;
            }
        }
        
    }
}

class ficks<C>
{
    Scanner o = new Scanner(System.in);
    ArrayList<Integer> a = new ArrayList<>();
    void ins()
    {
        System.out.print("Enter value : ");
        int q = o.nextInt();
        a.add(q);
    }
    void sz()
    {
        System.out.println("The Elements of List : "+a+" of Size "+a.size()+".");
    }
    void fods()
    {
        int i,c=0,q;
        for(i=0;i<a.size();i++)
        {
            q = a.get(i);
            if(q%2 != 0)
            {
                System.out.print("\nFound an Odd value : "+q);
                c=c+1;
            }
        }
        if(c==0)
            System.out.print("There is no Odd values found so far.");
        else
            System.out.print("\nTotal Odds are "+c+".");
    }
    void rps()
    {
        System.out.print("\nEnter the Value of the List to be Removed : ");
        int r = o.nextInt();
        int i = a.indexOf(r);
        a.remove(i);
        System.out.print("Enter the Value to be Placed : ");
        int c = o.nextInt();
        a.add(i, c);
        System.out.print("\nThe Value of the List has been Replaced."); 
    }
    void exm()
    {
        System.out.print("\nEnter the Start Index : ");
        int q = o.nextInt();
        System.out.print("\nEnter the End Index : ");
        int e = o.nextInt();
        int m = a.get(q);
        int s;
        for(s=q;s<=e;s++)
        {
            int c = a.get(s);
            if(m < c)
            {
                m = c;
            }
        }
        System.out.print("\nThe Extream Value of the List between the Indices is "+m);
    }
}
