package lambda.task_four;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MainRemove {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("qwer");
        list.add("asdf");
        list.add("zxcv");
        list.add("quyt");
        list.add("yhng");
        list.add("qlkh");
        list.add("olkj");
        System.out.println(list);

        String del = "q";
        Predicate<String> pr = s -> s.startsWith(del);
        list.removeIf(pr);
        System.out.println(list);
    }
}
