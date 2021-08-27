public class SingletonStaticBlock
{
    private static final SingletonStaticBlock obj;
    private SingletonStaticBlock() {}
    static {
        try {
            obj = new SingletonStaticBlock();}
        catch (Exception e) {
            throw new RuntimeException("Error Static block loading!!", e); }
    }
    public static SingletonStaticBlock getInstance() {
        return obj;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}
