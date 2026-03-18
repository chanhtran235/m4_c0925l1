package entity;

public class XeTuanTraMatTrang  extends PhuongTien{

    private int capDoBucXa;

    public XeTuanTraMatTrang() {

    }

    public XeTuanTraMatTrang(String soHieu, String hangSanXuat, int namSanXuat, String nguoiDieuPhoi, int capDoBucXa) {
        super(soHieu, hangSanXuat, namSanXuat, nguoiDieuPhoi);
        this.capDoBucXa = capDoBucXa;
    }

    public int getCapDoBucXa() {
        return capDoBucXa;
    }

    public void setCapDoBucXa(int capDoBucXa) {
        this.capDoBucXa = capDoBucXa;
    }

    @Override
    public String getInfoToCSV() {
        return this.getSoHieu()+","+this.getHangSanXuat()+","+this.getNamSanXuat()+","+this.getNguoiDieuPhoi()+","+this.getCapDoBucXa();
    }

    @Override
    public String toString() {
        return "XeTuanTraMatTrang{" + super.toString()+
                "capDoBucXa=" + capDoBucXa +
                '}';
    }
}
