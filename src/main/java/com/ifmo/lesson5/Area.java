package main.java.com.ifmo.lesson5;

public class Area {

    public static void main(String[] args) {
        LinkedList snapes = new LinkedList();
        snapes.add(new Shape());
        snapes.add(new Rectangle());
        snapes.add(new Triangle(3.0, 4.0, 5.0));
        snapes.add(new Oval(3.0, 5.0));
        snapes.add(new Square(5.0));
        snapes.add(new Circle(7.0));
        double area = new Area().sum(snapes);
        System.out.println(area);
    }

    public double sum( LinkedList snapes){
        double area =0;
        int count =0;
        while(snapes.get(count) != null){
            area+=snapes.get(count).area();
            count++;
        }
        return area;
    }
}
