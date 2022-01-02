package 第七次作业;
import java.util.Random;
public class code9_4 {
    public static void main(String[] args){
        Random gennrator1 = new Random(1000);
        for(int i=1;i<=50;i++)
            System.out.println(gennrator1.nextInt(100));
    }
}
