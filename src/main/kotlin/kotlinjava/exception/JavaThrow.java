package kotlinjava.exception;

import java.io.IOException;

public class JavaThrow {

    public void throwIOException() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {
        JavaThrow javaThrow = new JavaThrow();
        try {
            javaThrow.throwIOException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        KotlinThrow kotlinThrow = new KotlinThrow();
        try {
            kotlinThrow.throwIOException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Finished");
    }
}
