public class FuncaoIndependente
{
    public static void main(String[] args)
    {
        int a = 5, b = 7;
        int m = min(a, b);
        System.out.println("O minimo é " + m);
    }

    public static int min(int c, int d)
    {
        int m2;
        if (c < d)
            m2 = c;
        else
            m2 = d;

        return m2;
    }
}