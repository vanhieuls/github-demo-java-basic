package Enum_java;
public class ThoikhoaBieu {
    private Day thu;
    private String cacMonHoc;
    public ThoikhoaBieu(Day thu, String cacMonHoc){
        this.thu=thu;
        this.cacMonHoc=cacMonHoc;
    }
    public Day getThu() {
        return thu;
    }
    public void setThu(Day thu) {
        this.thu = thu;
    }
    public String getCacMonHoc() {
        return cacMonHoc;
    }
    public void setCacMonHoc(String cacMonHoc) {
        this.cacMonHoc = cacMonHoc;
    }
}
