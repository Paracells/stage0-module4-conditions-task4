package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println(first);
        } else if (second > third && second > first) {
            System.out.println(second);
        } else if (third > second && third > first) {
            System.out.println(third);
        } else {
            System.out.println(first);
        }

    }
}
