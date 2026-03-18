package entity;

public abstract class PhuongTien {
    private String soHieu;
    private String hangSanXuat;
    private int namSanXuat;
    private String nguoiDieuPhoi;

    public PhuongTien() {
    }

    public PhuongTien(String soHieu, String hangSanXuat, int namSanXuat, String nguoiDieuPhoi) {
        this.soHieu = soHieu;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.nguoiDieuPhoi = nguoiDieuPhoi;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getNguoiDieuPhoi() {
        return nguoiDieuPhoi;
    }

    public void setNguoiDieuPhoi(String nguoiDieuPhoi) {
        this.nguoiDieuPhoi = nguoiDieuPhoi;
    }

    public abstract String getInfoToCSV();

    @Override
    public String toString() {
        return  soHieu + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", nguoiDieuPhoi='" + nguoiDieuPhoi;

    }
}
