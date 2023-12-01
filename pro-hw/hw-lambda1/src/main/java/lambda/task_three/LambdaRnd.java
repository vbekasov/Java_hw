package lambda.task_three;

public interface LambdaRnd {
    @FunctionalInterface
    public static interface Rand {
        int rnd(int start, int stop);
    }
}
