package se.iths.Week2;

//odo: Skapa en class Rectangle
//odo: Ge den width och heigth som attribut
//odo: Skapa en metod med lämpliga konstruktorer
//odo: Skapa varsin get och set metod för varje attribut
//odo: Beräkna och returnera area och omkrets (kalla omkretsen för perimeter)

public class Ex5 {
    static class Rectangle {
        float width;
        float height;

        public Rectangle(float width, float height) {
            this.width = width;
            this.height = height;
        }
        public Rectangle() {
            this.width = 1;
            this.height = 2;
        }
        public float getWidth() {
            return width;
        }
        public void setWidth(float width) {
            this.width = width;
        }
        public float getHeight() {
            return height;
        }
        public void setHeight(float height) {
            this.height = height;
        }
        public float getArea() {
            return width * height;
        }
        public float perimeter() {
            return (width + height) * 2;
        }
    }
    public static void main(String[] args) {
        Rectangle dumbdumb = new Rectangle();
        dumbdumb.setWidth(5);
        dumbdumb.setHeight(10);
        System.out.println("Area: " + dumbdumb.getArea());
        System.out.println("Perimeter: " + dumbdumb.perimeter());
        }
}
