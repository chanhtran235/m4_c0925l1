package validate;

public class Validation {
    public static boolean checkSoHieu(String soHieu,String type){
//        + Drone: DRN-XXX
//         + Xe tuần tra: XTT-XXX
        String soHieuRegexDrone = "^(DRN-)\\d$";
        String soHieuRegexXeTTMT = "^(XTT-)\\d$";
        if (type.equals("DRONE")){
            if (soHieu.equals("DRN-000")){
                return false;
            }
            return soHieu.matches(soHieuRegexDrone);
        }else {
            if (soHieu.equals("XTT-000")){
                return false;
            }
            return soHieu.matches(soHieuRegexXeTTMT);
        }

    }
    public static boolean checkSoDuong(String number){
        String soDungRegex = "^[1-9]\\d*$";
        return number.matches(soDungRegex);
    }

    public static boolean checkSoDuongNhoHon10(String number){
        String soDungRegex = "^[1-9](\\.[0-9]{1,3})?$";
        return number.matches(soDungRegex);
    }
}
