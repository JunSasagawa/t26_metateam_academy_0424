package jp.co.metateam.training;

public class Training {
    public static void main(String[] args) {
        // 問1
     int pastWeight = 10;
     int currentWeight = 30;
     int increase = currentWeight - pastWeight;
     System.out.println(increase);
    
        // 問2
     int n = 50;
     int m = 3;
     int p = 10;
     int remaining = n - (m * p);
     System.out.println(remaining);
        // 問3
    String[] words = {"book", "pen", "car", "computer"};

    int max = words[0].length();
    int min = words[0].length();

    for (int i = 1; i < words.length; i++) {
      int len = words[i].length();

        if (len > max) {max = len;
        }
        if (len < min) {min = len;
        }  
      }
    int result = max - min;
    System.out.println(result);
       
    }
}
