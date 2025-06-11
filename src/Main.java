import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** 자판기 메뉴 ***");
        System.out.println("1. 멜론소다 2000원");
        System.out.println("2. 아메리카노 1500원");

        int choice = scanner.nextInt();

        String item = "";
        int price = 0;

        switch (choice) {
            case 1:
                item = "멜론소다";
                price = 2000;
                break;
            case 2:
                item = "아메리카노";
                price = 1500;
                break;
            default:
                System.out.println("없는 음료수입니다. 다시 실행해주세요.");
                return; //main 빠져나가기, break는 switch 빠져나가기
        }

        System.out.println(item + "을(를) 선택하셨네요. 금액을 넣어주세요.");

        int money = scanner.nextInt();

        if(money < price) {
            System.out.println("금액이 부족하여 종료합니다.");
        }

    }
}