package jp.co.metateam.training;

public class Training {
    public static void main(String[] args) {
        // 問1
        int beforeweight = 10;//1年前の体重
        int nowweight = 30;//現在の体重
        int weight = nowweight - beforeweight;
        System.out.println(weight);
    



        // 問2
        int n = 50;
        int m = 3;
        int p = 10;
        int result = n-(m*p);
        System.out.println(result);

        // 問3
        String[]messages ={"book","pen","car","computer"};
        int max = messages[0].length();
        int min = messages[0].length();

        for(int i = 0; i < messages.length; i++){
        int length = messages[i].length();
        if(length > max){
        max = length;
        }
        if(length < min){
            min = length;
        }
        }
        int varietion = max - min;
        System.out.println(varietion);
    }
}
