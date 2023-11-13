package org.task2.methods;

public class TasksUtil {
    private TasksUtil() {}

    public static int sum_loop(int n, int m) {
        m = Math.abs(m);
        if (m > n || m <= 0)
            return 0;

        int sum = 0;
        for (int i = m ; i <= n; i += m)
            sum += i;

        return sum;
    }

    public static int sum_recursion(int n, int m) {
        m = Math.abs(m);
        if (m > n || m <= 0)
            return 0;

        return sup_sum(n, m, 0);
    }

    private static int sup_sum(int n, int m, int i) {
        if (i + m <= n)
            return i + sup_sum(n, m, i += m);

        return i;
    }
}
