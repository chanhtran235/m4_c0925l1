package repository;

import entity.Drone;
import entity.XeTuanTraMatTrang;
import util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class XeTuanTraRepository implements IXeTuanTraRepository{
    private final String XE_TUAN_TRA_FILE ="src/data/xe.csv";
    @Override
    public List<XeTuanTraMatTrang> findAll() {
        List<XeTuanTraMatTrang> xeTuanTraMatTrangList = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSVToStringList(XE_TUAN_TRA_FILE);
        String[] array = null;
        for (String line : stringList) {
            array = line.split(",");
            XeTuanTraMatTrang xeTuanTraMatTrang = new XeTuanTraMatTrang(array[0], array[1], Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]));
            xeTuanTraMatTrangList.add(xeTuanTraMatTrang);
        }
        return xeTuanTraMatTrangList;
    }

    @Override
    public List<XeTuanTraMatTrang> search(String soHieu, String nguoiDieuPhoi) {

         return List.of();
    }

    @Override
    public void add(XeTuanTraMatTrang xeTuanTraMatTrang) {
        // ghi file text
        List<String> stringList = new ArrayList<>();
        stringList.add(xeTuanTraMatTrang.getInfoToCSV());
        ReadAndWriteFile.writeStringListToCSV(XE_TUAN_TRA_FILE, stringList, true);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
