public class SimpleFactory  {
   static public <T extends AbstractProduct> T createProduct(Class<T> c){
       AbstractProduct product=null;
       try{
           System.out.println("具体产品创造中......"+c.getName());
           product=(AbstractProduct) Class.forName(c.getName()).newInstance();
       }catch (Exception e)
       {
           e.printStackTrace();
           System.out.println("具体产品创造失败！");
       }
       return (T)product;
   }
}
