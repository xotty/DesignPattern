public class Main_Decorator {

    public static void main(String[] args) {
        System.out.println("--------------------------装饰模式--------------------------");
        AbstractComponent component = new Component();
        component = new DecoratorA(component);
        component.operate();
        System.out.println();
        component = new DecoratorB(component);
        component.operate();
    }
}
