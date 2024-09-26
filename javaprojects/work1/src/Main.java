// import java.util.*;

// class Person {
//     private String name;
//     private int age;
//     private boolean gender;
//     private int id;
//     static int cnt;

//     public Person() {
//         System.out.println("This is constructor");
//     }

//     public Person(String nm, int ag, boolean sex) {
//         name = nm;
//         age = ag;
//         gender = sex;
//     }

//     public String toString() {
//         return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", id=" + id + "]";
//     }

//     static {
//         System.out.println("This is static initialization block");
//         cnt = 0;
//     }
//     {
//         id = cnt;
//         cnt++;
//         System.out.printf("This is initialization block, id is %d\n", id);
//     }

//     public String prt() {
//         return name + "," + age + "," + gender + "," + id;
//     }
// }

// public class Main {
//     public static void main(String args[]) {
//         Scanner in = new Scanner(System.in);
//         String s = in.nextLine();
//         int n = Integer.parseInt(s);
//         Person[] ps = new Person[n + 1];
//         for (int i = 0; i < n; i++) {
//             s = in.nextLine();
//             String[] str = s.split("\\s+");
//             ps[i] = new Person(str[0], Integer.parseInt(str[1]), Boolean.parseBoolean(str[2]));
//         }
//         for (int i = n - 1; i >= 0; i--) {
//             System.out.println(ps[i].toString());
//         }
//         ps[n] = new Person();
//         System.out.println(ps[n].prt());
//         System.out.println(ps[n].toString());
//     }
// }

// import java.util.Scanner;

// class Complex {
//     public double a;
//     public double b;
//     // public Complex thisnum;

//     public void setRealPart(double a) {
//         this.a = a;
//     }

//     public void setImaginaryPart(double b) {
//         this.b = b;
//     }

//     public String add(Complex next) {
//         Complex c = new Complex();
//         c.a = this.a + next.a;
//         c.b = this.b + next.b;

//         return c.a + "+" + c.b + "i";

//     }

//     public String toString() {
//         if (this.b > 0)
//         {
//             return this.a + "+" + this.b + "i";
//         }
//         else if (this.b == 0)
//             return this.a+"i";
//         else
//             return this.a + this.b + "i";
//     }

//     public String sub(Complex next) {
//         Complex c = new Complex();
//         c.a = this.a - next.a;
//         c.b = this.b - next.b;

//         return c.a + "+" + c.b + "i";
//     }

// }

// public class Main {

//     public static void main(String[] args) {
//         Complex a = new Complex();
//         Complex b = new Complex();
//         Scanner in = new Scanner(System.in);
//         a.setRealPart(in.nextDouble());
//         a.setImaginaryPart(in.nextDouble());
//         b.setRealPart(in.nextDouble());
//         b.setImaginaryPart(in.nextDouble());
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(a.add(b));
//         System.out.println(a.sub(b));
//     }
// }

// import java.util.Scanner;

// public class Main {

//     public static double findsqrt(double n) {
//         double l = 0;
//         double r = n;
//         double mid = 0;
//         if (n == 1)
//             return 1;
//         while (r - l > 1e-6) {
//             mid = l + ((r - l) / 2);
//             if (mid * mid < n)
//                 l = mid;
//             else
//                 r = mid;
//         }
//         return mid;

//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         while (true) {
//             double num = in.nextDouble();
//             if (num < 0) {
//                 System.out.println("NaN");
//             } else {
//                 double res = findsqrt(num);
//                 System.out.printf("%.6f\n", res);

//             }

//         }

//     }
// } 

// import java.util.*;
// public class Main {
//     public static void main(String args[]) {
//         Scanner in = new Scanner(System.in);
//         String str;
//         double step = 0.0001, epsilon = 0.0001;
//         while (true) {
//             if ((str = in.nextLine()).equals(""))
//                 break;
//             double x = Double.parseDouble(str);
//             if (x < 0)
//                 System.out.println(Double.NaN);
//             else {
//                 double now = 0;
//                 while (now * now < x && Math.abs(x - now * now) > epsilon) {
//                     now += step;
//                 }
//                 System.out.printf("%.6f\n", now);
//             }
//         }
//     }
// }
// import java.util.*;

// public class Main {
//     public static void main(String args[]) {
//         Scanner in = new Scanner(System.in);

//         while (true) {
//             try {
//                 int res = 0;
//                 String a = in.nextLine();
//                 for (char ch : a.toCharArray()) {
//                     if (ch >= '0' && ch <= '9') {
//                         int num = ch - '0';
//                         res += num;
//                     }
//                 }
//                 System.out.println(res);
//             }

//             catch (Exception e) {
//                 break;
//             }
//         }

//     }
// }

// import java.util.Scanner;

// class DateUtil {

//     public int year;
//     public int month;
//     public int day;

//     public DateUtil(int year, int month, int day) {
//         this.year = year;
//         this.month = month;
//         this.day = day;
//     }

//     public DateUtil(DateUtil date) // 参数为对象
//     {
//         this.day = date.day;
//         this.month = date.month;
//         this.year = date.year;
//     }

//     public int getDay() {
//         return this.day;
//     }

//     public int getMonth() {
//         return this.month;
//     }

//     public int getYear() {
//         return this.year;
//     }

//     public boolean checkInputValidity()// 检查日期是否合法
//     {
//         if (year < 1000 || year > 8999)
//             return false;
//         if (month < 1 || month > 12)
//             return false;
//         if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

//             if (day < 1 || day > 31)
//                 return false;
//         } else if (month == 2) {

//             if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//                 // 闰年判
//                 if (day < 1 || day > 29)
//                     return false;
//             } else {

//                 if (day < 1 || day > 28)
//                     return false;
//             }
//         } else {

//             if (day < 1 || day > 30)
//                 return false;
//         }
//         return true;

//     }

//     public DateUtil getNextNDays(int len) {
//         DateUtil temp_date = new DateUtil(this); // 临时对象，不改变现在的日期
//         while (true) // 死循环
//         {
//             temp_date = nextDay(temp_date); // 计算下一天
//             len--; // 要增加的天数--
//             if (len == 0) // 当要增加的天数等于0时，停止循环
//                 break;
//         }
//         return temp_date;
//     }

//     public DateUtil nextDay(DateUtil date) // 计算下一天
//     {
//         if (date.day == isLastDays(date.year, date.month)) // 如果是月底
//         {
//             date.day = 1; // 那么下一天则置天数为1
//             date.month++; // 月份++
//             if (date.month == 13) // 如果是年底
//             {
//                 date.month = 1; // 那么月份置为1
//                 date.year++; // 年份加1
//             }
//         } else // 如果不是月底，天数加一即可
//             date.day++;
//         return date;
//     }

//     public int isLastDays(int year, int month) // 返回对应月份的天数
//     {
//         if (isRun(year) && month == 2)
//             return 29;
//         if (month == 2)
//             return 28;
//         if (month == 4 || month == 6 || month == 9 || month == 11)
//             return 30;
//         return 31;
//     }

//     public boolean isRun(int year) // 判断是否为闰年
//     {
//         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
//             return true;
//         else
//             return false;
//     }

//     public String showDate() {
//         return this.getYear() + "-" + this.getMonth() + "-" + this.getDay();
//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int year = 0;
//         int month = 0;
//         int day = 0;

//         int choice = input.nextInt();

//         if (choice == 1) { // test getNextNDays method测下一个n天
//             int m = 0;
//             year = Integer.parseInt(input.next());
//             month = Integer.parseInt(input.next());
//             day = Integer.parseInt(input.next());
//             DateUtil date = new DateUtil(year, month, day);
//             if (!date.checkInputValidity()) {
//                 System.out.println("Wrong Format");
//                 System.exit(0);
//             }

//             m = input.nextInt();

//             if (m < 0) {
//                 System.out.println("Wrong Format");
//                 System.exit(0);
//             }
//             System.out
//                     .println(date.getYear() + "-" + date.getMonth() + "-" + date.getDay() + " next " + m + " days is:");
//             System.out.println(date.getNextNDays(m).showDate());
//         }
//         else if (choice == 2) { // 测试前一个n天
//         int n = 0;
//         year = Integer.parseInt(input.next());
//         month = Integer.parseInt(input.next());
//         day = Integer.parseInt(input.next());
//         DateUtil date = new DateUtil(year, month, day);
//         if (!date.checkInputValidity()) {
//         System.out.println("Wrong Format");
//         System.exit(0);
//         }
//         n = input.nextInt();
//         if (n < 0) {
//         System.out.println("Wrong Format");
//         System.exit(0);
//         }
//         System.out.print(
//         date.getYear() + "-" + date.getMonth() + "-" + date.getDay() + " previous " +
//         n + " days is:");
//         System.out.println(date.getPreviousNDays(n).showDate());
//         } 

//         else if (choice == 3) 
//         { //测试中间一共有几天
//         year = Integer.parseInt(input.next());
//         month = Integer.parseInt(
//         System.out.print(input.next());
//         day = Integer.parseInt(input.next());
//         int anotherYear = Integer.parseInt(input.next());
//         int anotherMonth = Integer.parseInt(input.next());
//         int anotherDay = Integer.parseInt(input.next());
//         DateUtil fromDate = new DateUtil(year, month, day);
//         DateUtil toDate = new DateUtil(anotherYear, anotherMonth, anotherDay);
//         if (fromDate.checkInputValidity() && toDate.checkInputValidity()) {
//         System.out.println("The days between " + fromDate.showDate() +
//         " and " + toDate.showDate() + " are:"
//         + fromDate.getDaysofDates(toDate));
//         } else {
//         System.out.println("Wrong Format");
//         System.exit(0);
//         }
//         }
//         else {
//             System.out.println("Wrong Format");
//             System.exit(0);
//         }
//     }
// }

// import java.util.*;

// class Rectangle {
//     public int width;
//     public int length;

//     public Rectangle(int width, int length) {
//         this.width = width;
//         this.length = length;

//     }

//     public int getPerimeter() {
//         return width * 2 + length * 2;

//     }

//     public int getArea() {
//         return width * length;
//     }

//     public String toString() {
//         return "Rectangle [width=" + width + ",length=" + length + "]";

//     }

// }

// class Circle {
//     public int radius;

//     public Circle(int radius) {
//         this.radius = radius;
//     }

//     public int getArea() {
//         double num = Math.PI * radius * radius;
//         int need = (int) num;
//         return need;
//     }

//     public int getPerimeter() {
//         return (int) Math.PI * radius * 2;
//     }

//     public String toString() {
//         return "Circle [radius=" + radius + "]";

//     }

// }

// public class Main {
//     public static void main(String[] args) {
//         int len1, len2;
//         int len3, len4;
//         int r1;
//         int r2;
//         Scanner in = new Scanner(System.in);
//         len1 = in.nextInt();
//         len2 = in.nextInt();
//         len3 = in.nextInt();
//         len4 = in.nextInt();
//         int findlyC = 1;
//         int findlyS = 0;
//         Rectangle re1 = new Rectangle(len1, len2);
//         Rectangle re2 = new Rectangle(len3, len4);
//         findlyC += re1.getPerimeter();
//         findlyC += re2.getPerimeter();
//         findlyS += re1.getArea();
//         findlyS += re2.getArea();
//         r1 = in.nextInt();
//         r2 = in.nextInt();
//         Circle ci1 = new Circle(r1);
//         Circle ci2 = new Circle(r2);
//         findlyC += ci1.getPerimeter();
//         findlyC += ci2.getPerimeter();
//         findlyS += ci1.getArea();
//         findlyS += ci2.getArea();
//         System.out.println(findlyC);
//         System.out.println(findlyS);
//         System.out.println("[" + re1.toString() + "," + re2.toString() + "]");
//         System.out.println("[" + ci1.toString() + "," + ci2.toString() + "]");

//     }
// }

// import java.util.*;

// public class Main {
//     public static void main(String args[]){
//         Scanner in =new Scanner(System.in);
//         while(true){ //此方法读入未知数量的键盘输入
//             try{
//                   String str;
//                 if ((str = in.nextLine()).equals(""))break;
//                 int n=Integer.parseInt(str);
//                 String [][]mul=new String[n][];
//                 for(int i=0;i<n;i++){
//                     mul[i]=new String[i+1];
//                     for(int j=0;j<i+1;j++){
//                         mul[i][j]=(i+1)+"*"+(j+1)+"="+(i+1)*(j+1);
//                     }
//                 }
//                 for(int i=0;i<n;i++){
//                     for(int j=0;j<i+1;j++){
//                     //%-3d表示用空格在右侧填充
//                         if(j!=i)System.out.printf("%d*%d=%-3d",i+1,j+1,(i+1)*(j+1));
//                         else System.out.printf("%d*%d=%d",i+1,j+1,(i+1)*(j+1));
//                     }
//                     System.out.println();
//                 }
//                 System.out.println(Arrays.deepToString(mul));
//                 }
//               catch (Exception e) {
//               break;
//      }

//         }

//     }
// }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        char[] A = stdIn.next().toCharArray(); // 等于 String a = sc.nextLine();char[] A = a.toCharArray();
        char[] B = stdIn.next().toCharArray(); // 把输入string型转换成字符数组然后存储在我们的字符数组里
        if (A.length < B.length) { // 无论数组A的元素个数是否大于B的，都将A转换成元素个数最多的
            char[] t = A;
            A = B;
            B = t;
        }
        int[] ans = new int[1001];
        for (int i = 1; i <= A.length; i++) {
            int ai = A[A.length - i] - '0'; // 把数字字符转换成数字
            int bi = i <= B.length ? B[B.length - i] - '0' : 0; // 条件运算符 i 如果<= B.length，bi = B[B.length -i]-'0'，否则 bi =
                                                                // 0；
            ans[i - 1] += ai + bi; // （逆序转换）
            if (ans[i - 1] >= 10) { // 进位
                ans[i - 1] -= 10;
                ans[i] += 1;
            }
        }
        int index = ans.length - 1;
        while (ans[index] == 0)
            index--; // 去除前导0
        for (int i = index; i >= 0; i--) {
            System.out.print(ans[i]);
        }
    }
}
