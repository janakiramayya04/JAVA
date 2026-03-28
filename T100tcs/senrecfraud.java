package T100tcs;

// import java.util.*;

// public class senrecfraud {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt(); // number of transactions
//         sc.nextLine();

//         HashMap<String, Integer> map = new HashMap<>();

//         for (int i = 0; i < n; i++) {

//             String sender = sc.next();
//             String receiver = sc.next();
//             int amount = sc.nextInt();
//             int time = sc.nextInt();

//             String key = sender + "-" + receiver + "-" + amount;

//             if (map.containsKey(key)) {
//                 int prevTime = map.get(key);

//                 if (time - prevTime <= 60) {
//                     System.out.println("Fraud");
//                 } else {
//                     System.out.println("Valid");
//                 }
//             } else {
//                 System.out.println("Valid");
//             }

//             // update latest timestamp
//             map.put(key, time);
        // }
    // }
// }
import java.util.*;

public class senrecfraud {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>();

        int prevTime = -1;

        for (int i = 0; i < n; i++) {

            String sender = sc.next();
            String receiver = sc.next();
            int time = sc.nextInt();
            int amount = sc.nextInt();

            String key = sender + "-" + receiver;

            // Rule 1: Duplicate check
            if (set.contains(key)) {
                System.out.println("ERROR DUPLICATION TRANSACTION");
                return;
            }

            // Rule 2: Time difference check
            if (prevTime != -1 && (time - prevTime > 60)) {
                System.out.println("FRAUD DETECTED");
                return;
            }

            set.add(key);
            prevTime = time;
        }

        // Rule 3
        System.out.println("ALL TRANSACTION ARE VALID");
    }
}