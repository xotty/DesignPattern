public class Main_Builder {

    public static void main(String[] args) {
    System.out.println("--------------------------建造者模式--------------------------");
        Director director=new Director();
        AbstractProduct productA=director.getProductA();
        System.out.println("ProductA开始运行演示......");
        productA.sharedMethod();
        productA.individualMethod();
        System.out.println();
        AbstractProduct productB=director.getProductB();
        System.out.println("ProductB开始运行演示......");
        productB.sharedMethod();
        productB.individualMethod();
    }
}
