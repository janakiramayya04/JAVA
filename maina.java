class senior{
    void howareoyu(int n){
        System.out.println("senior class");
    }
}
class junior extends senior{
    @Override
   void howareoyu(int n){
        System.out.println("junior  class");
    }
}
public class maina {
    public static void main(String[] args) {
        senior ss=new senior();
        ss.howareoyu(90);
        junior js=new junior();
        js.howareoyu(98);
        js.howareoyu(8);    
        senior ko=new junior();
        ko.howareoyu(8);

    }
}
