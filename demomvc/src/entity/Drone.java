package entity;

public class Drone extends PhuongTien {
    private float tamBayToiDa;

    public Drone() {

    }

    public Drone(String soHieu, String hangSanXuat, int namSanXuat, String nguoiDieuPhoi, float tamBayToiDa) {
        super(soHieu, hangSanXuat, namSanXuat, nguoiDieuPhoi);
        this.tamBayToiDa = tamBayToiDa;
    }

    public float getTamBayToiDa() {
        return tamBayToiDa;
    }

    public void setTamBayToiDa(float tamBayToiDa) {
        this.tamBayToiDa = tamBayToiDa;
    }

    @Override
    public String getInfoToCSV() {
        return this.getSoHieu()+","+this.getHangSanXuat()+","+this.getNamSanXuat()+","+this.getNguoiDieuPhoi()+","+this.getTamBayToiDa();
    }

    @Override
    public String toString() {
        return "Drone{" + super.toString()+
                "tamBayToiDa=" + tamBayToiDa +
                '}';
    }
}
