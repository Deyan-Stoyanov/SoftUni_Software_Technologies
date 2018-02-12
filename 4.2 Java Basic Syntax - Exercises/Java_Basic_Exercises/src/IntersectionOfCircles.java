import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] circle1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        double x1 = circle1[0];
        double y1 = circle1[1];
        double radius1 = circle1[2];
        double[] circle2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        double x2 = circle2[0];
        double y2 = circle2[1];
        double radius2 = circle2[2];
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        if(d <= radius1 + radius2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
