package day03;

public class Demo1 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }

        for (int i=0;i<4;i++){
            for (int j=4-i;j>0;j--){
                System.out.print(" ");
            }
            for (int k=0;k<i*2+1;k=k+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
