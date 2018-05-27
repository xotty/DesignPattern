public class Main_Prototype {

    public static void main(String[] args) {
    System.out.println("--------------------------原型模式--------------------------");
        Product productA=new Product();
        Product productB=productA.clone();
        productA.setStr("A");
        productA.setArraylist();
        System.out.println("ProductA中str="+productA.getStr());
        System.out.println("ProductA中arraylist="+productA.getArraylist());
        System.out.println();
        productB.setStr("B");
        productB.setArraylist();
        System.out.println("ProductB开始运行演示......");
        productB.method();

        System.out.println("ProductB中str="+productB.getStr());
        System.out.println("ProductB中arraylist="+productB.getArraylist());

        System.out.println("ProductA中str="+productA.getStr());
        System.out.println("ProductA中arraylist="+productA.getArraylist());
    }
}
