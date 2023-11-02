package exceptions;


public class ZeroArgs extends NullPointerException {
        public ZeroArgs(String errorMessage) {
            super(errorMessage);
        }

        public ZeroArgs() {super("Null Object.");}

        public ZeroArgs(NullPointerException e) {
            super("Null Object.");
            System.out.println("\nReason " + e.getCause());
        }
}
