package find_single;

public class Single {
    private Single() {}

    public static int loopSicker(int[] arr) {
        for (int i = 1; i < arr.length - 1; i+=2)
            if (arr[i]  != arr[i - 1])
                return arr[i - 1];

        return arr[arr.length - 1];
    }

    public static Integer binarySicker(int[] arr) {
        int start   = 0;
        int len     = arr.length - 1;
        int stop    = len;
        int place = stop / 2;
        int tmp;

        if (arr[0] != arr[1])
            return arr[0];
        if (arr[len] != arr[len - 1])
            return arr[len];

        while ((stop - start) > 1) {
            if (arr[place] != arr[place - 1] && arr[place] != arr[place + 1])
                return arr[place];

            if (arr[place] == arr[place - 1]) {
                // move right
                start = place;
                place = start + (stop - start) / 2;
            } else {
                // move left
                stop = place;
                place = start + (stop - start) / 2 ;
            }
        }

        return null;
    }
}
