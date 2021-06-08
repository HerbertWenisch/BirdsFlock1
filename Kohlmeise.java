public class Kohlmeise extends Bird {
   
   public Kohlmeise(String name){
       super(name);
   }
   
   @Override
   public void singing(){
       System.out.println(name + ": zitsibäh");
   }
}
