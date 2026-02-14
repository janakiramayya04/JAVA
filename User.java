import java.util.ArrayList;

public class User {
    // Instance variable
    public String name;
    
    // Static (class) variable
    public static int userCount = 0;

    public User(String name) {
        this.name = name;
        userCount++;
    }

    // public static void main(String[] args) {
    //     User u1 = new User("Alice");
    //     System.out.println("u1's count: " + u1.userCount); 
    //     User u2 = new User("Bob");

    //     // The programmer checks the count on u1 *after* u2 is created
    //     System.out.println("u2's count: " + u2.userCount);
    // }
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("C++");
        languages.add("Python");
        languages.add("CSharp"); // Renamed C# to CSharp for simplicity

        
        
       languages.removeIf(lang -> lang.startsWith("C"));  // ✅ Safe and clean

        // The bug is in this loop
        // for (String lang : languages) {
        //     // if (lang.startsWith("C")) {
        //     //     languages.remove(lang); // Trying to remove the item
        //     // }
            
        // }
        
        System.out.println(languages);
    }
}