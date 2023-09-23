class CTest {
    int num;
    void test() {
        if (num == 0)
             System.out.println("此數為0");
        else if(num % 2 == 0)
             System.out.println("此數是偶數");
        else if(num % 2 != 0)
             System.out.println("此數是奇數");
       
    }
}

public class Ex07 {
    public static void main(String[] args) {
        CTest c1 = new CTest();
        CTest c2 = new CTest();
        CTest c3 = new CTest();


        c1.num =  999;
        System.out.print("c1 =" + c1.num + ", ");
        c1.test();

        c2.num =  648;
        System.out.print("c2 =" + c2.num + ", ");
        c1.test();
        
        c3.num =  0;
        System.out.print("c3 =" + c3.num + ", ");
        c1.test();

    }
}