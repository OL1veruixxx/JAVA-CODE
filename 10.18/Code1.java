
public class Main {
    public static int func1()
    {
        int total=0,temp=0;
        for(int i=1;i<=99;i++)
        {
            if(i%2!=0)
            {
                temp = i;
                total += temp;
            }

        }

        return total;






    }



    public static int func2(int m)
    {
        int total = 1;
        do
        {
            total =total*m;
            m--;


        }
        while(m!=0);
        return total;


    }


    public static void main(String[] args)
    {
        System.out.println(func1());
        System.out.println(func2(5));
    }
}