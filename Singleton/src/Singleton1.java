//饿汉式单例方法
public class Singleton1 {
    final static private Singleton1 singleton=new Singleton1();
    private Singleton1(){
    }
    static public Singleton1 getSingleton(){
        return  singleton;
    }

    public void method(){
        System.out.println("这是Singleton1的实例----"+this.toString());
    }
}
