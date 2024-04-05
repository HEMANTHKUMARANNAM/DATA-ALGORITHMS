public class characterunder 
{
    public static void main(String[] args) 
    {

        char a;
        int b;

        a = 'a';
        b = a;
        System.out.println(b);
        a = 'z';
        b = a;
        System.out.println(b);
        a = 'A';
        b = a;
        System.out.println(b);
        a = 'Z';
        b = a;
        System.out.println(b);
        a = '0';
        b = a;
        System.out.println(b);
        a = '9';
        b = a;
        System.out.println(b);

        for (int i = 97; i <= 122 ; i++)
        {
            char c = (char) i;
            System.out.print(c);
        }
        System.out.println("");
        
        for (int i = 65; i <= 90 ; i++)
        {
            char c = (char) i;
            System.out.print(c);
        }
        System.out.println("");

        for (int i = 48; i <= 57 ; i++)
        {
            char c = (char) i;
            System.out.print(c);
        }
        System.out.println("");



    }
}
