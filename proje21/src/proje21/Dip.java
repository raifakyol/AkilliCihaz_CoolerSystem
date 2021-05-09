package proje21;

public class Dip {
    private IDip dip;

    public Dip(IDip dip) {
        this.dip = dip;
    }
    public void ac(){
        dip.ac();
    }
    public void kapat(){
        dip.kapat();
    }
}
