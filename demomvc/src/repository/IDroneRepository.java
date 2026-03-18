package repository;

import entity.Drone;

import java.util.List;

public interface IDroneRepository {
    List<Drone> findAll();
    List<Drone> search(String soHieu,String nguoiDieuPhoi);
    void add(Drone drone);
    boolean deleteById(int id);
}
