import java.util.ArrayList;

public class Product implements Cloneable {
    private String str;
    private ArrayList<String> arraylist=new ArrayList<>();

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public ArrayList<String> getArraylist() {
        return arraylist;
    }

    public void setArraylist() {
        this.arraylist.add(str);
    }

    public Product(){
         System.out.println("Product构造函数执行.......");
     }

    public void method()
    {
       System.out.println("Product正常运行!");
    }

    @Override
     public Product clone(){
        Product product=null;
        try{
            System.out.println("Product复制函数执行.......");
            product=(Product)super.clone();
            //浅复制-->深复制
            //product.arraylist=(ArrayList<String>) this.arraylist.clone();
        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
            System.out.println("Product复制出错!");
        }
        return  product;
    }

}
