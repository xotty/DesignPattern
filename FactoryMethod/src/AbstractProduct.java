import javax.swing.plaf.synth.SynthEditorPaneUI;

abstract public class AbstractProduct {
    public void sharedMethod()
    {
       System.out.println("抽象产品的公共方法");

    }

    abstract public void individualMethod();
}
