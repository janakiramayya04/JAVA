public class rounfoff {
    static int ro(double num){
        int inter= (int) num;
        double deimal=num-inter;
        if(deimal>=.5){
            return inter+1;
        }
        else {return inter;}
    }
    static double rr(double num,int d){
        double power=1;
        for(int i=0;i<d;i++){
            power*=10;
        }
        double inter =num*power;
        int inter1=(int) inter;
        double decimal =inter-inter1;
        if(decimal>=.5){
            return (inter1+1)/power;
        }else{
            return inter1/power; 
        }
    }
    public static void main(String[] args) {
        double num=123.456;
        double num1=12.141414;
        System.out.println("round off number :"+ rr(num1,2));
        System.out.println("round off number :" + ro(num));
    }
}
