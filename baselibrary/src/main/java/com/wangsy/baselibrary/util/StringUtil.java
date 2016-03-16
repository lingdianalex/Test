package com.wangsy.baselibrary.util;

/**
 * Created by John on 2016/3/16.
 */
public class StringUtil {


    /**
     * 判断字符串是否为空,zheyang你就能在另外一个工程调用这个项目的代码而已   就是这么使用的 en意思
     *
     * @return true：不为空， false：为空
     */
    public static boolean isNotNull(String str) {
        if (str != null && !"".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(String str) {
        if (str != null && !"".equals(str)) {
            return false;
        }
        return true;
    }
}