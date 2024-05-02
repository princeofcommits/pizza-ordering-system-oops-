public class Pizza { int price; String pizza;String bill="";
   int basepizza; int veg=200;int non_veg=285;
   private int extracheese=99;
   private int extratoppings=150; 
   private int packaging=25; 
   boolean isfarm_pizza=false; 
   private boolean isextrachesseaded=false;
   private boolean isextratopingsaded=false;
   private boolean isetakeaway=false;
    public void bill(){
        System.out.println("Bill details");
        if (isfarm_pizza)
            price+=extracheese+extratoppings;
        if (isetakeaway)
            bill+="Packaging charges:"+packaging+"Rs"+"\n";
        if (isextrachesseaded)
            bill+="extra cheese added:"+extracheese+"Rs"+"\n";
        if (isextratopingsaded)
            bill+="extra Toppings added: "+extratoppings+ "Rs"+"\n";
        if (this.price==veg) {
            System.out.println("pizza: " + "veg: Price: " + veg + "Rs");}
        else {System.out.println("pizza: " + "Non-veg: Price: " + non_veg + "Rs");}
        bill+="Your Total bill: ";
        System.out.println(bill+price+".Rs only");}
   public Pizza(String pizza) {
        if (pizza=="veg") {this.price = veg;}
        else this.price=non_veg; }
    public static class farm_pizza extends Pizza{
        public farm_pizza(String pizza) {super(pizza);isfarm_pizza=true; }
        @Override
        public void addextracheese() {}
        @Override
        public void addextratoppings() {}
    }
    public void addextracheese(){price+=extracheese; isextrachesseaded=true;}
    public void addextratoppings(){price+=extratoppings; isextratopingsaded=true;}
    public void takeaway(){price+=packaging;isetakeaway=true;}
    public void placeorder(String name,String pizza,int quantity){
        System.out.println("Your order no is ");System.out.println( );System.out.println();
    }
    public static void main(String[] args) {
        Pizza mypizzza=new Pizza("nonveg");
         mypizzza.addextracheese();
         mypizzza.takeaway(); 
         mypizzza.bill();
         farm_pizza p=new farm_pizza("veg");
         p.bill();
    }
}
