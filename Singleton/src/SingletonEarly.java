public class SingletonEarly
{
    private static SingletonEarly object=new SingletonEarly();
    private SingletonEarly(){}
    public static SingletonEarly getInstance(){
        return object;
    }
    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}

