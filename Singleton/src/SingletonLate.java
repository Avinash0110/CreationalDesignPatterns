public class SingletonLate
{
    private static SingletonLate obj;
    private SingletonLate() {}
    public static SingletonLate getInstance()
    {
        if (obj==null)
            obj = new SingletonLate();
        return obj;
    }
    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}