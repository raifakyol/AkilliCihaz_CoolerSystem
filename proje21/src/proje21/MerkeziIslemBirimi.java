package proje21;

import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.Callable;
public class MerkeziIslemBirimi implements IMerkeziIslemBirimi{
    private ISicaklikAlgilayici sicaklikAlgilayici;
    public MerkeziIslemBirimi(){
        sicaklikAlgilayici=SicaklikAlgilayici.getInstance(new Publisher());
        sicaklikAlgilayici.aboneEkle(new Subscriber1());
        sicaklikAlgilayici.aboneEkle(new Subscriber2());
    }
    @Override
    public void eyleyiciyeGonder(){
        IDip eylc=new Eyleyici();
        Dip dip=new Dip(eylc);
        dip.ac();
    }
    @Override
    public void eyleyiciyeGonder2(){
        IDip eylc=new Eyleyici();
        Dip dip=new Dip(eylc);
        dip.kapat();
    }
    @Override
    public void sicaklikAlgilayiciyaGonder() {
        sicaklikAlgilayici.sicaklikOku();
    }
}
