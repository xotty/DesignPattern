public class ProductAExpand extends AbstractProductExpand {
private boolean runningFlag=true;

    public boolean isRunningFlag() {
        return runningFlag;
    }

    public void setRunningFlag(boolean runningFlag) {
        this.runningFlag = runningFlag;
    }

    public void method1() {
        System.out.println("ProductA执行method1.......");

    }

    public void method2() {
        System.out.println("ProductA执行method2.......");

    }

    public void method3() {
        System.out.println("ProductA执行method3.......");
    }

    public void method4() {
        System.out.println("ProductA执行method4.......");
    }

    @Override
    public boolean willRunningMethod2() {
        return this.runningFlag;
    }
}
