package jp.co.metateam.training;

public class Training {
    public static void main(String[] args) {
        // 問1 
               int pastWeight = 10;
               int currentWeight = 30;
               int increse = currentWeight - pastWeight;
               System.out.println (increse);

        // 問2  
               int n = 50;
               int m = 3;
               int p = 10;
               System.out.println(n-m*p);

        // 問3
             String [] words = {"look" , "book" , "pen", "computer" } ;
             int max = words [0].length();
             int min = words[0].length();
             for(int i= 0;i < words.length;i++){
                int length = words[i] . length ();
                if(length > max){max = length;
                 }
                if(length < min){min = length;
                 } 
             }
             int result = max - min ;
             System.out.println(result);




    }
}
