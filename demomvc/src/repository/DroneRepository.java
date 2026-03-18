package repository;

import entity.Drone;
import util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class DroneRepository implements IDroneRepository{
    private final String DRONE_FILE ="src/data/drone.csv";
    @Override
    public List<Drone> findAll() {
        List<Drone> droneList = new ArrayList<>();
        // đọc file text
        List<String> stringList = ReadAndWriteFile.readFileCSVToStringList(DRONE_FILE);
        // chuyển đổi stringList => droneList
        String[] array = null;
        for (String line : stringList) {
//            String soHieu, String hangSanXuat, int namSanXuat, String nguoiDieuPhoi, float tamBayToiDa
            array = line.split(",");
            Drone drone = new Drone(array[0], array[1], Integer.parseInt(array[2]),array[3],Float.parseFloat(array[4]));
            droneList.add(drone);
        }
        return droneList;
    }


    @Override
    public List<Drone> search(String soHieu, String nguoiDieuPhoi) {
        return List.of();
    }

    @Override
    public void add(Drone drone) {
        // ghi file text
        List<String> stringList = new ArrayList<>();
        stringList.add(drone.getInfoToCSV());
        ReadAndWriteFile.writeStringListToCSV(DRONE_FILE, stringList, true);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
