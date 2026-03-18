package service;

import entity.Drone;
import repository.DroneRepository;
import repository.IDroneRepository;

import java.util.ArrayList;
import java.util.List;

public class DroneService implements IDroneService{
    private IDroneRepository droneRepository = new DroneRepository();
    @Override
    public List<Drone> findAll() {
        return droneRepository.findAll();
    }

    @Override
    public List<Drone> search(String searchKey) {
        List<Drone> droneList = findAll();
        List<Drone> searchList = new ArrayList<>();
        for (int i = 0; i <droneList.size(); i++) {
            if (droneList.get(i).getSoHieu().equals(searchKey)){
                searchList.add(droneList.get(i));
            }else if (droneList.get(i).getNguoiDieuPhoi().equals(searchKey)){
                searchList.add(droneList.get(i));
            }
        }
        return searchList ;
    }

    @Override
    public List<Drone> search(String soHieu, String nguoiDieuPhoi) {
        return List.of();
    }

    @Override
    public void add(Drone drone) {
         droneRepository.add(drone);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
