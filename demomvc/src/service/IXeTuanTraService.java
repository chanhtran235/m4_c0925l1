package service;

import entity.Drone;
import entity.XeTuanTraMatTrang;

import java.util.List;

public interface IXeTuanTraService {
    List<XeTuanTraMatTrang> findAll();
    List<XeTuanTraMatTrang> search(String keySearch);
    List<XeTuanTraMatTrang> search(String soHieu,String nguoiDieuPhoi);
    void add(XeTuanTraMatTrang xeTuanTraMatTrang);
    boolean deleteById(int id);
}
