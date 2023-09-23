class CSphere {
    private int x;
    private int y;
    private int z;
    private int radius;

    void setLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void setRadius(int r) {
        radius = r;
    }

    double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    void showCenter() {
        System.out.println("圓心座標：(" + x + ", " + y + ", " + z + ")");
    }
}



public class Ex816 {
    public static void main(String[] args) {
        CSphere sphere = new CSphere();
        
        sphere.setLocation(3, 4, 5);
        
        sphere.setRadius(1);
        
        sphere.showCenter();
        
        double surfaceArea = sphere.surfaceArea();
        System.out.println("表面積：" + surfaceArea);
        
        double volume = sphere.volume();
        System.out.println("體積：" + volume);
    }
}
