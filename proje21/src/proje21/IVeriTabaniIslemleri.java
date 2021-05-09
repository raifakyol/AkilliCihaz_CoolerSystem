package proje21;

import java.sql.Connection;
import java.sql.SQLException;
public interface IVeriTabaniIslemleri {
    boolean kullaniciDogrula(String ad,String sifre);
}