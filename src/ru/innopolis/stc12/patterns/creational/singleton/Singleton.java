package ru.innopolis.stc12.patterns.creational.singleton;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        Singleton localeInstance = instance;
        if (localeInstance == null) {
            synchronized (Singleton.class){
                localeInstance=instance;
                if (localeInstance == null){
                    instance = localeInstance = new Singleton();
                }
            }
        }
        return localeInstance;
    }
}
