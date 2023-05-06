package kotlinjava.extensions;

public class JavaExtension {
    public static void main(String[] args) {
        String s = "ABCDE";
        System.out.println(KotlinExtensionKt.first(s));
        System.out.println(KotlinExtensionKt.addFirst(s, 'Z'));
    }
}
