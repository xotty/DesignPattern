public class Main_Singleton {

    public static void main(String[] args) {
        System.out.println("--------------------------单例模式--------------------------");
        Singleton1 s11 = Singleton1.getSingleton();
        s11.method();
        Singleton1 s12 = Singleton1.getSingleton();
        s12.method();
        System.out.println();
        Singleton2 s21 = Singleton2.getSingleton();
        s21.method();
        Singleton2 s22 = Singleton2.getSingleton();
        s22.method();
        System.out.println();
        Singleton3 s31 = SingletonFactory.getSingleton();
        s31.method();
        Singleton3 s32 = SingletonFactory.getSingleton();
        s32.method();

    }
}
