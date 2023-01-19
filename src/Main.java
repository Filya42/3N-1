import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        while(true){
            if ((j%2) == 0){
                j = j / 2;
            } else if ((j%1) == 0) {
                j = j * 3 + 1;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(j);
        }
    }
}