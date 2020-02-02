package patterns.creational.prototype;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if ((this.getClass() != object2.getClass())) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == this.x && shape2.y == this.y && Objects.equals(shape2.color, this.color);
    }
}