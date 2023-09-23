///這是看拍到的照片照做的，Ex805_2 是第一次做的

class CBox {
    int length;
    int width;
    int height;

    int volume() {
        return length * width * height;
    }

    int surfaceArea() {
        return(((length * width)  + (width * height)  + (length * height) )* 2);
    }

    void showData() {
        System.out.println("length = " + length );
        System.out.println("width = " + width );
        System.out.println("height = " + height );
    }

    void showAll() {
        showData();
        System.out.println("volume = " + volume());
        System.out.println("surfaceArea = " + surfaceArea());
    }
}

public class Ex805 {
    public static void main(String[] args) {
        CBox box = new CBox();
        box = new CBox();

        box.length = 1;
        box.width = 1;
        box.height = 1;
        box.showAll();
    }
}