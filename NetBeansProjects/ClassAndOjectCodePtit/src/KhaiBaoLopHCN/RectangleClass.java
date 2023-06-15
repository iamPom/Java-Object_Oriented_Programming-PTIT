// code:
// name:
package KhaiBaoLopHCN;

/**
 *
 * @author Pom
 */
public class RectangleClass {

    private double width, heigh;
    private String color;

    public RectangleClass() {
        this.width = 1;
        this.heigh = 1;
    }

    public double getWidth() {
        return width;
    }

    public RectangleClass(double width, double heigh, String color) {
        this.width = width;
        this.heigh = heigh;
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return heigh * width;
    }

    public double findPerimeter() {
        return (heigh + width) * 2;
    }

    public void chuanHoaSau() {
        color = color.substring(0, 1).toUpperCase() +
                color.substring(1).toLowerCase();
        System.out.print(color);
    }
}
