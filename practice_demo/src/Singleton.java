public class Singleton {

    //饿汉式
    //定义唯一实例
    //private static final Singleton s = new Singleton();
    //私有化构造
    //private Singleton() {}
    //提供一个公共的访问入口
    //public static Singleton getInstance() { return s; }

    //懒汉式(会存在线程安全问题，可以同过加同步来解决，
   /* private static Singleton s = null;

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if (s == null) {
            s = new Singleton();
        }
        return s;
    }*/
    // 同步之后没次都要进行所对象的比较，影响执行效率，使用双重判定提高执行效率
    private static Singleton s = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (s == null) {
            //在第一次s赋值之后，其他线程就不用再进入到同步代码块中
            synchronized (Singleton.class) {
                //静态方法的所对象只能用单单例的字节码文件
                if (s == null) {
                    s = new Singleton();
                }
            }
        }
        return s;
    }
}

