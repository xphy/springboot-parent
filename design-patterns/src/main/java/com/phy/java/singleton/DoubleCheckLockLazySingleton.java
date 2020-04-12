package com.phy.java.singleton;

/**
 * @author ：mmzs
 * @date ：Created in 2020/4/12 13:05
 * @description：
 * @modified By：
 * @version: $
 */
public class DoubleCheckLockLazySingleton {
    private static volatile DoubleCheckLockLazySingleton INSTANCE = null;

    private DoubleCheckLockLazySingleton() {
    }

    public static DoubleCheckLockLazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockLazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockLazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
