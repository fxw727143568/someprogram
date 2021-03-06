package daily;

import com.google.common.collect.BiMap;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import mian.AbstractMain;

import java.util.*;

/**
 * Created by pfliu on 2019/04/30.
 */
public class CollectionsTest extends AbstractMain {
    @Override
    public void run() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> umList = Collections.unmodifiableList(list);

        logger.info(umList.toString());


        ImmutableCollection li = ImmutableList.of(1, 2, 3, 4, 5);

        ImmutableList l1 = ImmutableList.copyOf(list);
        logger.info("l1:" + l1.toString());

        ImmutableList.Builder<String> bu = ImmutableList.builder();

        list.add(2);
        logger.info("l1:" + l1.toString());
        logger.info("list:" + list.toString());


        logger.info("aa :" + li.toString());


    }

    public static void main(String[] args) {
        new CollectionsTest().parseArgsAndRun(args);

        putIt("pf","2019-05-01");
        int i =0;
    }

    static Map<String, List<String>> userSign = new HashMap<>();

    public static void putIt(String name, String date) {
        List<String> dates = userSign.getOrDefault(name, new ArrayList<>());
        if (!dates.contains(date)) {
            dates.add(date);
        }
        userSign.put(name, dates);
    }



}
