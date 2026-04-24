package jp.co.metateam.training;

public class Training {
    public static void main(String[] args) {
        // 問1
        int beforeweight = 10; //1年前の体重
        int afterweight = 30; //現在の体重(N＝30)

        int increase = afterweight - beforeweight;
        System.out.println(increase);

        // 問2
        int totalcards = 50; //n=カードの総枚数
        int pepple = 3; //m=人数
        int dealtcards = 10; //p=一人当たりの枚数

        int usedcards = pepple * dealtcards; //配ったカードの枚数
        int remaincards = totalcards - usedcards; //残りのカード

        System.out.println(remaincards);
        // 問3
        String[] messeges = {"book", "pen", "car", "computer"};

        int maxlength = messeges[0].length();
        int minlength = messeges[0].length();

        for (int i = 0; i < messeges.length; i++) {
            int length = messeges[i].length();
                if (length > maxlength) {
                    maxlength= length; //最も長い文字列の長さ
            }
                if (length < minlength) {
                    minlength = length; //最も短い文字列の長さ
            }
        }
        int result = maxlength - minlength; //ばらつき
        System.out.println(result);
    
    }
}
