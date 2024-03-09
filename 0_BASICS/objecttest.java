public class objecttest 
{
    public static void main(String[] args) 
    {
        meow obj = new meow();

        alterdata(obj);

        System.out.println(obj.data);

    }

    static void alterdata(meow obj)
    {
        obj.data = 10;
    }

}

class meow
{
    int data;
    meow()
    {
        data = 0;
    }
}