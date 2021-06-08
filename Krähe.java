public class Krähe extends Bird {
   
   public Krähe(String name){
       super(name);
   }
   
   @Override
   public void singing(){
       System.out.println(name + ": krah krah");
   }
}