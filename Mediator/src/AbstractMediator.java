abstract public class AbstractMediator {
    protected  Colleague1 colleague1;
    protected  Colleague2 colleague2;
    protected  Colleague3 colleague3;
    public AbstractMediator(){
        colleague1=new Colleague1(this);
        colleague2=new Colleague2(this);
        colleague3=new Colleague3(this);
    }

    abstract public void doSomthing1();
    abstract public void doSomthing2();
    abstract public void doSomthing3();
}
