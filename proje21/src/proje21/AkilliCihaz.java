package proje21;

import java.util.Scanner;

public class AkilliCihaz {
    private IAgArayuzu agArayuzu;
    private IVeriTabaniIslemleri veriTabani;
    private static final int sure=100;

    public AkilliCihaz() {
        agArayuzu=new AgArayuzu();
        veriTabani=new VeriTabaniIslemleri();
    }
    public static void bekle(int sure){
        try{
            Thread.sleep(sure);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public static void bekle(){
        try {
            Thread.sleep(sure);
        }
        catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    public void giris(){
        String kullaniciAdi,sifre;
        System.out.println("Kullanıcı adı ve şifre girin.");
        System.out.print("Kullanıcı Adı:");
        kullaniciAdi=agArayuzu.veriAl();
        System.out.print("Şifre:");
        sifre=agArayuzu.veriAl();

        if(veriTabani.kullaniciDogrula(kullaniciAdi,sifre)){
            this.secim();
        }
        else{
            bekle(800);
            System.out.println("Kullanıcı Doğrulanamadı..");
        }
    }
    private void secim(){
        String secm;
        secm=this.islem();
        switch (secm){
            case "1":
                agArayuzu.sogutucuAc();
                bekle(1200);
                break;
            case "2":
                agArayuzu.sogutucuKapat();
                bekle(1200);
                break;
            case "3":
                agArayuzu.sicaklikGonder();
                bekle(1200);
                break;
            case "4":
                System.out.println("Çıkış yapılıyor!");
                bekle(1200);
                Runtime.getRuntime().exit(0);
                break;
            default:
                System.out.println("Yanlıs deger girdiniz tekrar deneyin!");
                break;
        }
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nDevam Etmek İstiyormusunuz? e(E)/h(H)");
        char userChoice = userInput.next().charAt(0);
        if (userChoice == 'e' || userChoice == 'E') {
            bekle(800);
            secim();
        } else
        if (userChoice == 'h' || userChoice == 'H') {
            System.out.println("Çıkış yapılıyor!");
            bekle(800);
            Runtime.getRuntime().exit(0);
        }
        else {
            System.out.println("Yanlıs deger girdiniz tekrar deneyin!");
        }
    }
    private String islem(){
        agArayuzu.mesaj("------------------------");
        agArayuzu.mesaj("1-Sogutucu Ac");
        agArayuzu.mesaj("2-Sogutucu Kapat");
        agArayuzu.mesaj("3-Sıcaklık Görüntüle");
        agArayuzu.mesaj("4-Cıkıs");
        agArayuzu.mesaj("------------------------");
        return agArayuzu.secimAl();
    }
}