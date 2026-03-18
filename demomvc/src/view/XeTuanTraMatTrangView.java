package view;

import entity.Drone;
import entity.XeTuanTraMatTrang;
import validate.Validation;

import java.util.List;
import java.util.Scanner;

public class XeTuanTraMatTrangView {
    private static Scanner scanner = new Scanner(System.in);

    public static XeTuanTraMatTrang inputData() {
        System.out.println("Nhập số hiệu");
        String soHieu= "";
        do {
            soHieu = scanner.nextLine();
        }while (!Validation.checkSoHieu(soHieu,"XTT"));

        System.out.println("Nhập hãng sản xuất");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập  người điều phối");
        String nguoiDieuPhoi = scanner.nextLine();

        String capDoBXText = "";
        do {
            System.out.println("Nhập độ bức xạ");
            capDoBXText = scanner.nextLine();
        }while (!Validation.checkSoDuongNhoHon10(capDoBXText));
        int capDoBucXa = Integer.parseInt(capDoBXText);
        return new XeTuanTraMatTrang(soHieu,hangSanXuat,namSanXuat,nguoiDieuPhoi,capDoBucXa);
    }
    public static int inputId(){
        System.out.println("Nhập id cần xoá");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void displayList(List<XeTuanTraMatTrang> droneList){
        for (int i = 0; i <droneList.size() ; i++) {
            System.out.println(droneList.get(i));
        }
    }

    public static String inputForSearch() {
        System.out.println("Nhập số hiệu hoặc tên người điều phối");
        return (scanner.nextLine());
    }
}
