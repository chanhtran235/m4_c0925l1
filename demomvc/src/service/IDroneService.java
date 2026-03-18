package service;

import entity.Drone;

import java.util.List;

public interface IDroneService {
    List<Drone> findAll();
    List<Drone> search(String searchKey);
    List<Drone> search(String soHieu,String nguoiDieuPhoi);
    void add(Drone drone);
    boolean deleteById(int id);
}
