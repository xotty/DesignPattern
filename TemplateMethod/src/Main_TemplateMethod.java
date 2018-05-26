public class Main_TemplateMethod {
    public static void main(String[] args) {
        AbstractProduct productA=new ProductA();
        AbstractProduct productB=new ProductB();
        System.out.println("--------------------------ProductA运行模版方法--------------------------");
        productA.templateMethod();
        System.out.println("--------------------------ProductB运行模版方法--------------------------");
        productB.templateMethod();

        AbstractProductExpand productAExpand=new ProductAExpand();
        AbstractProductExpand productBExpand=new ProductBExpand();
        System.out.println("--------------------------ProductA Expand运行模版方法--------------------------");
        ((ProductAExpand) productAExpand).setRunningFlag(false);
        productAExpand.templateMethod();
        System.out.println("--------------------------ProductB Expand运行模版方法--------------------------");
        productBExpand.templateMethod();

    }
}
