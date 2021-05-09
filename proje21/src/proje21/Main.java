package proje21;

public class Main {
    public static void main(String[] args) {
        Builder builder1 = new Builder.ClassBuilder().author(" Raif Akyol").version(" 1.0").date(" 08.05.2001").build();
        System.out.println(builder1);
        AkilliCihaz akilliCihaz= new AkilliCihaz();
        akilliCihaz.giris();

    }
}
