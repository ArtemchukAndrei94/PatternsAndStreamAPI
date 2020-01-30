package patterns.creational.singliton_одиночка;

public final class ThreadSafeSingleton {
    // Поле обязательно должно быть объявлено volatile, чтобы двойная проверка
    // блокировки сработала как надо.
    private static volatile ThreadSafeSingleton instance;

    public String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        // Техника, которую мы здесь применяем называется «блокировка с двойной
        // проверкой» (Double-Checked Locking). Она применяется, чтобы
        // предотвратить создание нескольких объектов-одиночек, если метод будет
        // вызван из нескольких потоков одновременно.
        //
        // Хотя переменная `result` вполне оправданно кажется здесь лишней, она
        // помогает избежать подводных камней реализации DCL в Java.
        //
        // Больше об этой проблеме можно почитать здесь:
        // https://refactoring.guru/ru/java-dcl-issue
        ThreadSafeSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(ThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new ThreadSafeSingleton(value);
            }
            return instance;
        }
    }
}
