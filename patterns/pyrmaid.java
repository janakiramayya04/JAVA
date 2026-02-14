package patterns;

public class pyrmaid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){//why spaces taking n-i beacause we want the center in the middle so we move it to center, with this i=1 5-1 =4 spaces neede in first row ,3,2,1,0 like that
                System.out.print(" ");
            } 
            for(int j=1;j<=2*i-1;j++){// why  we need for stars 2i-1 ,because you see the middle star has a symentric stars both sides , so we need to add symntric stars on both sides like 2 row * * *  ,because they are odd 
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
