abstract public class AbstractProduct {
    public void sharedMethod()
    {
       System.out.println("抽象产品的公共方法");
    }

    abstract public void individualMethod();

    public void setPart(String str){
        System.out.println("本产品关键零部件制造完成："+str);
    }
}
