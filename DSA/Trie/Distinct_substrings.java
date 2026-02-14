package  DSA.Trie;
import java.util.Scanner;

class Node{
    Node links[] =new Node[26];

    public Node(){

    }
    boolean containskey(char ch){
        return (links[ch-'a']!=null);
    }
    void put(char ch,Node node){
        links[ch-'a']=node;
    }
    Node get(char ch){
        return links[ch-'a'];
    }

}

public class Distinct_substrings{
    public static void main(String[] args) {
        System.out.println("Enter String:");
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();

        int count=0;
        Node root=new Node();

        for(int i=0;i<ss.length();i++){
            Node node=root;
            for(int j=i;j<ss.length();j++){
                if(!node.containskey(ss.charAt(j))){
                    node.put(ss.charAt(j), new Node());
                    count++;
                }
                node=node.get(ss.charAt(j));
            }
        }
        System.out.println(count+1);
        sc.close();
    }    
}