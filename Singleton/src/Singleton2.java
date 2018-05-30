//懒汉式单例方法
public class Singleton2 {
    static private Singleton2 singleton=null;
    private Singleton2(){
    }

    //多线程加锁
    synchronized static public Singleton2 getSingleton(){
        if (singleton==null) {singleton=new Singleton2();}

        return  singleton;
    }

    public void method(){
        System.out.println("这是Singleton2的实例----"+this.toString());
    }
}
