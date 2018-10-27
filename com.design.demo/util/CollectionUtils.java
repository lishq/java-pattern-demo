package util;

import java.util.List;

public class CollectionUtils {

    /**
     * 判断一个Map集合是否为空
     */
    public static boolean isNotEmpty(List pList) {
        if (pList == null || pList.size() == 0)
            return false;
        return true;
    }
}
