//工厂方法扩展，具体由SingletonFactory来创造单例对象
public class Singleton3 {
    private Singleton3(){
    }

    public void method(){
        System.out.println("这是Singleton3的实例----"+this.toString());
    }
}
