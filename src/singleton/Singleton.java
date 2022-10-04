package singleton;

/*
    고전적인 싱글턴 패턴 구현법
 */
public class Singleton {
    private volatile static Singleton uniqueInstance = new Singleton();

    // 기타 인스턴스 변수
    public Singleton() {
    }

    // uniqueInstance는 정적 변수
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // 기타 메소드
}
