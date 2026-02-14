public class phonenumbvalidate {
    public static void main(String[] args) {
        String carnumber = "1244";
        if(carnumber.matches("[1-9][0-9]{3}")){
            System.out.println("valid phone number");
        }else {
            System.out.println("not valid phone number");
        }
    }
}
