class CWin {
    int width;
    int height;
    String name;

    void setW(int w) {
        width = w;
    }

    void setH(int h) {
        height = h;
    }

    void setName(String s) {
        name = s;
    }

    void setWindow(int w, int h) {
        width = w;
        height = h;
    }

    void setWindow(int w, int h, String s) {
        width = w;
        height = h;
        name = s;
    }

    void show() {
        System.out.println("名稱：" + name);
        System.out.println("寬度：" + width);
        System.out.println("高度：" + height);
    }
}

public class Ex812 {
    public static void main(String[] args) {
        CWin cw = new CWin();
        cw.setWindow(5, 3,"MY Window");
        cw.show();
    }
}
