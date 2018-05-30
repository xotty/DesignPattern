import java.lang.reflect.Constructor;

public class SingletonFactory {
    static private Singleton3 singleton;

    static {
        try {
            System.out.println("单例正在工厂中创造......");
            Class c = Class.forName(Singleton3.class.getName());
            Constructor constructor = c.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton3) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("单例创造失败！");
        }

    }

    static public Singleton3 getSingleton() {
        return singleton;
    }
}
