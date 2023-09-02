class Circle extends Shape {
        public Circle() {
            setName("Circle");
            System.out.println("Circle");
        }
    }
    class Quad extends Shape {
        public Quad() {
            setName("Quad");
            System.out.println("Quad");
        }
    }
    class Rectangle extends Shape {
        public Rectangle() {
            setName("Rectangle");
            System.out.println("Rectangle");
        }
    }
    class Trapezoid extends Shape {
        public Trapezoid() {
            setName("Trapezoid");
            System.out.println("Trapezoid");
        }
    }
    class Rhombus extends Shape {
        public Rhombus() {
            setName("Rhombus");
            System.out.println("Rhombus");
        }
    }

    class GetShape{
        public String getShape(Shape shape){
            return shape.getName();
        }
    }

public class GraphicsEditor{
    public static void main(String[] args){
        GetShape gs = new GetShape();
        Circle c = new Circle();
        Quad q = new Quad();
        Rectangle r = new Rectangle();
        Trapezoid t = new Trapezoid();
        Rhombus rh = new Rhombus();

        System.out.println(gs.getShape(c));
        System.out.println(gs.getShape(q));
        System.out.println(gs.getShape(r));
        System.out.println(gs.getShape(t));
        System.out.println(gs.getShape(rh));
    }
}