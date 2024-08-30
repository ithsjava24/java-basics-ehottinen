package se.iths.Uppgifter;

public class Uppgift5 {

    static void f1 () {
        System.out.println("test"); // allt inom denna {} är f1 metoden
    }

    static int f2 (int i) {
        return i * i; //f2 metoden
    }

    static int f3(int x, int y) {
        return x + y;
    }

    static int f4(int i) {
        return i * 5;
    }

    static void f5(double d) {

    }


    public static void main(String[] args) {
        //1
        f1(); //f1() kör f1 void-metoden som skriver test
        //2
        int a = f2(3); // kör f2 int-metoden med argument 3 som returnerar 9
        // i är ett argument för f2 int = i måste vara ett heltal // f2 gör i*i (i=3) 3*3=9
        System.out.println(a);
        //3
        System.out.println(f3(3, 5)); // kör f3 int-metoden med två argument (x,y) som returnerar 8
        //4
        int x = 2, y = 3;
        var b = f4(f4(x) + f4(y)); // kör f4 int-metoden med två argument (x,y) som returnerar 125
        // b = variabel b = f4(f4(x) + f4(y)); Argumentet till f4 är i. i = *5. f4(f4(x)=5*(2) + f4(y)=5*(3)) = f4(10 + 15)
        // = f4(25) = 25*5= 125
        System.out.println(b);
        //5
        double d = 5.5;
        f5(d); // kör f5 void-metoden (så den returnerar inget värde), d=5.5 och double ger möjligheten till längre tal
        // än float trots att float funkar här
        System.out.println(d);

    }
}
