package service;

import entity.Drone;
import entity.XeTuanTraMatTrang;
import repository.IXeTuanTraRepository;
import repository.XeTuanTraRepository;

import java.util.ArrayList;
import java.util.List;

public class XeTuanTraMatTrangService implements IXeTuanTraService{
    private IXeTuanTraRepository xeTuanTraRepository = new XeTuanTraRepository();
    @Override
    public List<XeTuanTraMatTrang> findAll() {
        return xeTuanTraRepository.findAll();
    }

    @Override
    public List<XeTuanTraMatTrang> search(String searchKey) {

        List<XeTuanTraMatTrang> xeTuanTraMatTrangList = findAll();
        List<XeTuanTraMatTrang> searchList = new ArrayList<>();
        for (int i = 0; i <xeTuanTraMatTrangList.size(); i++) {
            if (xeTuanTraMatTrangList.get(i).getSoHieu().equals(searchKey)){
                searchList.add(xeTuanTraMatTrangList.get(i));
            }else if (xeTuanTraMatTrangList.get(i).getNguoiDieuPhoi().equals(searchKey)){
                searchList.add(xeTuanTraMatTrangList.get(i));
            }
        }
        return searchList ;
    }

    @Override
    public List<XeTuanTraMatTrang> search(String soHieu, String nguoiDieuPhoi) {
        return xeTuanTraRepository.findAll();
    }

    @Override
    public void add(XeTuanTraMatTrang xeTuanTraMatTrang) {
         xeTuanTraRepository.add(xeTuanTraMatTrang);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
