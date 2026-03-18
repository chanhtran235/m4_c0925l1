package view;

import entity.Drone;
import entity.XeTuanTraMatTrang;
import validate.Validation;

import java.util.List;
import java.util.Scanner;

public class DroneView {
    private static Scanner scanner = new Scanner(System.in);

    public static Drone inputData() {
        System.out.println("Nhập số hiệu");
        String soHieu= "";
        do {
            soHieu = scanner.nextLine();
        }while (!Validation.checkSoHieu(soHieu,"DRONE"));

        System.out.println("Nhập hãng sản xuất");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập người điều phối");
        String nguoiDieuPhoi = scanner.nextLine();

        String tambayText ="";
        do {
            System.out.println("Nhập tâm bay");
            tambayText = scanner.next();
        }while (!Validation.checkSoDuong(tambayText));
        float tamBayToiDa = Float.parseFloat(tambayText);
        return new Drone(soHieu,hangSanXuat,namSanXuat,nguoiDieuPhoi,tamBayToiDa);
    }
    public static int inputId(){
        System.out.println("Nhập id cần xoá");
        return Integer.parseInt(scanner.nextLine());
    }
    public static String inputForSearch(){
        System.out.println("Nhập số hiệu hoặc tên người điều phối");
        return (scanner.nextLine());
    }


    public static void displayList(List<Drone> list){
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
