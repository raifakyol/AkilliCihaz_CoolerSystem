package proje21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VeriTabaniIslemleri implements IVeriTabaniIslemleri{
    private AkilliCihaz cihaz;
    private static String password="0024003";
    private static String dbUrl="jdbc:postgresql://localhost:5432/proje2021";
    private static String userName="postgres";
    private Connection baglan(){
        Connection conn=null;
        try{
            conn = DriverManager.getConnection(dbUrl,userName,password);
            if (conn != null)
                cihaz.bekle(1000);
                System.out.println("Veritabanına bağlanıldı!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    @Override
    public boolean kullaniciDogrula(String ad, String sifre){
        Connection conn=this.baglan();
        String ifade= "SELECT \"kullaniciAdi\",\"sifre\" FROM \"KullaniciGiris\" WHERE \"kullaniciAdi\"="+"'"+ad+"'"+"AND \"sifre\"="+"'"+sifre+"'";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(ifade);
            conn.close();
            if(!rs.next()){
                return false;
            }
            else{
                cihaz.bekle(1000);
                System.out.println("Kullanıcı doğrulandı!");
                return true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}