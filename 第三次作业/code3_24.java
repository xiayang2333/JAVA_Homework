package 第三次作业;

public class code3_24 {
    public static void main(String[] args) {
        int num1 = (int) (1 + Math.random() * 13);
        int num2 = (int) (1 + Math.random() * 4);
        String[] str = new String[14];
        str[1] = "Ace";
        str[2] = "2";
        str[3] = "3";
        str[4] = "4";
        str[5] = "5";
        str[6] = "6";
        str[7] = "7";
        str[8] = "8";
        str[9] = "9";
        str[10] = "10";
        str[11] = "Jack";
        str[12] = "Queen";
        str[13] = "Kind";
        String[] cloth = new String[5];
        cloth[1] = "Clubs";
        cloth[2] = "Diamonds";
        cloth[3] = "Hearts";
        cloth[4] = "Spades";
        System.out.println("The card you picked is "+str[num1]+" of "+cloth[num2]);
    }
}
