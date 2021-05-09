package proje21;

public class Eyleyici implements IDip{
    private AkilliCihaz cihaz;
    @Override
    public void ac() {
        System.out.println("Soğutucu Açılıyor!");
        cihaz.bekle(1000);
        System.out.println("Lütfen Bekleyiniz.");
        cihaz.bekle(1000);
        System.out.println("SOĞUTUCU : AÇIK");
    }

    @Override
    public void kapat() {
        System.out.println("Soğutucu Kapatılıyor!");
        cihaz.bekle(1000);
        System.out.println("Lütfen Bekleyiniz.");
        cihaz.bekle(1000);
        System.out.println("SOĞUTUCU : KAPALI");
    }
}