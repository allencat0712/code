// import java.util.Scanner;

// abstract class Shape {
//     public static double PI = 3.14;

//     abstract public double getPerimeter();

//     abstract public double getArea();

//     public static double sumAllArea(Shape[] a, int n) {
//         double res = 0;
//         for (int i = 0; i < n; i++) {
//             res += a[i].getArea();

//         }
//         return res;
//     }

//     public static double sumAllPerimeter(Shape[] a, int n) {
//         double res = 0;
//         for (int i = 0; i < n; i++) {
//             res += a[i].getPerimeter();
//         }
//         return res;
//     }

// }

// // 抽象类的子类必须实现抽象方法
// class Rectangle extends Shape {
//     public int width;
//     public int length;

//     public Rectangle(int width, int length) {
//         this.width = width;
//         this.length = length;

//     }

//     public double getPerimeter() {
//         return width * 2 + length * 2;
//     }

//     public double getArea() {
//         return width * length;

//     }

//     public String toString() {
//         return "Rectangle [width=" + width + ", length=" + length + "]";
//     }

// }

// class Circle extends Shape {
//     public int radius;

//     public Circle(int radius) {
//         this.radius = radius;

//     }

//     public double getPerimeter() {
//         return 2 * PI * radius;

//     }

//     public double getArea() {
//         return PI * radius * radius;

//     }

//     public String toString() {
//         return "Circle [radius=" + radius + "]";
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int num = in.nextInt();
//         Shape[] a = new Shape[num];
//         for (int i = 0; i < num; i++) {
//             String cha = in.nextLine();
//             if (cha=="rect") {
//                 int num1 = in.nextInt();
//                 int num2 = in.nextInt();
//                 a[i] = new Rectangle(num1, num2);
//             } else {
//                 int num3 = in.nextInt();
//                 a[i] = new Circle(num3);

//             }
//         }

//         System.out.println(Shape.sumAllPerimeter(a, num));
//         System.out.println(Shape.sumAllArea(a, num));

//     }
// }
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         String cha1 = in.nextLine();
//         String cha2 = in.nextLine();
//         if (cha1.equals("SwpuIot") && cha2.equals("123456")) {
//             System.out.println("welcome");
//         } else if (cha1.equals("SwpuIot") && !cha2.equals("123456")) {
//             System.out.println("Mismatch");

//         } else {
//             System.out.println("NotExist");
//         }

//     }
// }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int num = in.nextInt();
//         int[][] arr = new int[num][num];
//         for (int i = 0; i < num; i++) {
//             for (int j = 0; j <= i; j++) {
//                 if (j == 0 || i == 0) {
//                     arr[i][j] = 1;
//                     System.out.printf("%-4d", 1);

//                 } else {
//                     arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
//                     System.out.printf("%-4d", arr[i][j]);

//                 }
//             }
//             System.out.println();

//         }
//     }
// }


//形状-继承 
import java.util.*;

abstract class Shape {
    static final double PI = 3.14;

    public abstract double getPerimeter();

    public abstract double getArea();

    public static double sumAllArea(Shape[] a, int n) {
        double res = 0;
        for (int i = 0; i < n; i++) {
            res += a[i].getArea();
        }
        return res;
    }

    public static double sumAllPerimeter(Shape[] a, int n) {
        double res = 0;
        for (int i = 0; i < n; i++) {
            res += a[i].getPerimeter();
        }
        return res;
    }
}

class Rectangle extends Shape {
    private int width, length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    public double getArea() {
        return width * length;
    }

    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + "]";
    }
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = Integer.parseInt(str);
        Shape[] a = new Shape[n];
        for (int i = 0; i < n; i++) {
            str = in.nextLine();
            if (str.equals("rect")) {
                str = in.nextLine();
                String[] strArr = str.split("\\s+");
                int[] x = new int[2];
                for (int j = 0; j < 2; j++) {
                    x[j] = Integer.parseInt(strArr[j]);
                }
                a[i] = new Rectangle(x[0], x[1]);
            } else {
                str = in.nextLine();
                int x = Integer.parseInt(str);
                a[i] = new Circle(x);
            }
        }
        System.out.println(Shape.sumAllPerimeter(a, n));
        System.out.println(Shape.sumAllArea(a, n));

        System.out.println(Arrays.toString(a));
        for (int i = 0; i < n; i++)
            System.out.println(a[i].getClass() + "," + a[i].getClass().getSuperclass());
    }
}
