abstract public class AbstractDecorator extends AbstractComponent{
    private AbstractComponent component=null;
    public AbstractDecorator(AbstractComponent _component){
        this.component=_component;
    }
    public void operate(){
        this.component.operate();
    }
}
