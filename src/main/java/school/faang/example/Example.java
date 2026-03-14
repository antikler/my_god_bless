package school.faang.example;

import java.util.List;

public class Example {
    public static List<Integer> reverse(List<Integer> numList) {
        int listSize = numList.size();
        int num;
        for (int i = 0; i < listSize / 2; i++) {
            num = numList.get(i);
            numList.set(i, numList.get(listSize - i - 1));
            numList.set(listSize - i - 1, num);
        }

        return numList;
    }
}
