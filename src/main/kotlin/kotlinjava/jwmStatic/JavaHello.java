package kotlinjava.jwmStatic;

public class JavaHello {

    public static void main(String[] args) {
        System.out.println(KotlinHello.Companion.hello());   // @JvmStatic이 선언되지 않은 경우
        System.out.println(KotlinHello.hello());

        System.out.println(Hi.INSTANCE.hi());   // @JvmStatic이 선언되지 않은 경우
        System.out.println(Hi.hi());
    }
}
