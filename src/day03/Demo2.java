package day03;

public class Demo2 {

    public static void main(String[] args) {
        int j;
        int sum=0;
        for (int i=2;i<=100;i++)
        {
            j=2;
            while (i%j!=0)
                j++;
            if (j==i) {
                System.out.print(i+"\t");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println("100以内的质数之和sum=" + sum);
    }
}