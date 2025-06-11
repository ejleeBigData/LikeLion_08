import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        String item = "";

        switch (choice) {
            case 1:
                item = "멜론소다";
                break;
            case 2:
                item = "아메리카노";
                break;
            default:
                item = "없는 음료수입니다.다시 실행해주세요.";
        }

        System.out.println(item);
    }
}