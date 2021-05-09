package proje21;

import java.util.Scanner;

public class AgArayuzu implements IAgArayuzu{
    private Scanner scan=new Scanner(System.in);
    private IMerkeziIslemBirimi merkeziIslemBirimi;
    private IAgArayuzu agArayuzu;
    public AgArayuzu() {
        merkeziIslemBirimi=new MerkeziIslemBirimi();
    }
    public String veriAl() {
        return scan.next();
    }
    public void mesaj(String mesaj){
        System.out.println(mesaj);
    }
    public String secimAl(){
        return scan.next();
    }
    @Override
    public void sogutucuAc() {
        merkeziIslemBirimi.eyleyiciyeGonder();
    }
    @Override
    public void sogutucuKapat() {
        merkeziIslemBirimi.eyleyiciyeGonder2();
    }
    @Override
    public void sicaklikGonder(){
        merkeziIslemBirimi.sicaklikAlgilayiciyaGonder();
    }
}


