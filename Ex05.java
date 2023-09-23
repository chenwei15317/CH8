///老師因為我看題目不太懂是要一次全部印出來還是要用input所以就搭配chat gtp慢慢修改成像現在這樣要輸入關鍵字才會回傳的模式


import java.util.Scanner;

class CBox {
    int length;
    int width;
    int height;

    void volume() {
        System.out.println("體積：" + length * width * height);
    }

    void surfaceArea() {
        System.out.println("表面積：" + ((length * width) * 2 + (width * height) * 2 + (length * height) * 2));
    }

    void showData() {
        System.out.println("長：" + length + " 寬：" + width + " 高：" + height);
    }

    void showAll() {
        System.out.println("長：" + length);
        System.out.println("寬：" + width);
        System.out.println("高：" + height);
        System.out.println("表面積：" + ((length * width) * 2 + (width * height) * 2 + (length * height) * 2));
        System.out.println("體積：" + length * width * height);
    }
}

public class Ex05 {
    public static void main(String[] args) {
        CBox box;
        box = new CBox();

        box.length = 1;
        box.width = 1;
        box.height = 1;

        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("請輸入指令（volume/surfaceArea/showData/showAll，或輸入 exit 來結束）：");
            String userInput = scanner.nextLine();

            if ("exit".equalsIgnoreCase(userInput)) {
                continueInput = false;
            } else if ("volume".equals(userInput)) {
                box.volume();
            } else if ("surfaceArea".equals(userInput)) {
                box.surfaceArea();
            } else if ("showData".equals(userInput)) {
                box.showData();
            } else if ("showAll".equals(userInput)) {
                box.showAll();
            } else {
                System.out.println("無效的選項。");
            }
        }

        scanner.close();
    }
}