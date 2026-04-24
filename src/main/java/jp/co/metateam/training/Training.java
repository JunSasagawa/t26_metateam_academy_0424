package jp.co.metateam.training;

public class Training {
    public static void main(String[] args) {
        // 問1
        int Before_Weight =10;
        int N=30;
        int increase_weight=N-Before_Weight;
        System.out.println(increase_weight);
        
        // 問2
        int n=50;
        int m=3;
        int p=10;
        int remaining_cards=n-m*p;
        System.out.println(remaining_cards);

        // 問3
          String[] Messages = {"book","pen","car","computer"};
          int Max_length = Messages[0].length();
          int min_length = Messages[0].length();

          for(int i =0;
            i < Messages.length; i++)
            {int length = Messages[i].length();
                if(length > Max_length){
                   Max_length = length;

    
            }
            if (length < min_length) {
                min_length = length;
            }
        }
        int Variation = Max_length - min_length;
        System.out.println(Variation);
          


    }
}
