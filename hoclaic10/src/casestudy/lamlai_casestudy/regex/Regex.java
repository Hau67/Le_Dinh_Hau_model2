package casestudy.lamlai_casestudy.regex;

import java.util.regex.Pattern;

public class Regex {
    public static final String MADICHVU_REGEX = "^SV(VL|RO)-\\d{4}$";
    public static final String TENDICHVU_REGEX = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    public static final String DIENTICH_REGEX = "^([3-9]\\d|[1-9]\\d{2,})[m]2$";
    public static final String CHIPHITHUE_REGEX = "^[1-9]\\d*$";
    public static final String SOLUONGNGUOI_REGEX = "^1?\\d{1}$";
    public static final String SOTANG_REGEX = "^[1-9]+$";
    public static final String KIEUTHUE_REGEX = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    public static final String NGAYSINH_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)" +
            "?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
            "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";

    public static boolean maDichVu(String string) {
        return Pattern.matches(MADICHVU_REGEX,string);
    }

    public static boolean tenDichVu(String string){
        return Pattern.matches(TENDICHVU_REGEX,string);
    }

    public static boolean DienTich(String string){
        return Pattern.matches(DIENTICH_REGEX,string);
    }

    public static boolean chiPhiThue(String string){
        return Pattern.matches(CHIPHITHUE_REGEX,string);
    }

    public static boolean soLuongNguoi(String string){
        return Pattern.matches(SOLUONGNGUOI_REGEX,string);
    }

    public static boolean soTang(String string){
        return Pattern.matches(SOTANG_REGEX,string);
    }

    public static boolean kieuThue(String string){
        return Pattern.matches(KIEUTHUE_REGEX,string);
    }

    public static boolean ngaySinh(String string){
        return Pattern.matches(NGAYSINH_REGEX,string);
    }
}