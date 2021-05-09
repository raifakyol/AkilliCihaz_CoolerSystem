package proje21;

import java.util.Random;
public class SicaklikAlgilayici implements ISicaklikAlgilayici{
    private AkilliCihaz cihaz;
    Random rand = new Random();
    private Random random=new Random();
    private static SicaklikAlgilayici instance;
    private ISubject publisher;
    public SicaklikAlgilayici(ISubject publisher){
        this.publisher=publisher;
    }
    public static SicaklikAlgilayici getInstance(ISubject publisher){
        if(instance==null){
            instance=new SicaklikAlgilayici(publisher);
        }
        return instance;
    }
    @Override
    public void aboneEkle(IObserver abone){
        publisher.attach(abone);
    }
    @Override
    public void sicaklikOku() {
        int rand_int = rand.nextInt(100);
        System.out.println("Sıcaklık Ölçülüyor.");
        cihaz.bekle(800);
        System.out.print("Sıcaklık: ");
        System.out.println(rand_int);
        if(rand_int>=45){
            cihaz.bekle(1000);
            publisher.notify("Sıcaklık 45 derecenin üzerine çıktı, soğutucuyu açınız.");
        }
        else if(rand_int>=25 && rand_int<45){
            cihaz.bekle(1000);
            publisher.notify("Soğutucuyu açabilirsiniz.");
        }
        else if(rand_int<25){
            cihaz.bekle(1000);
            publisher.notify("Sıcaklık 25 derecenin altına indi, soğutucuyu kapatınız.");
        }
    }
}