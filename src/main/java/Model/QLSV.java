package Model;

import com.sun.tools.javac.comp.Todo;

import java.util.ArrayList;

public class QLSV {
    private ArrayList<ThiSinh> dsThiSinh;

    public QLSV() {
        this.dsThiSinh = new ArrayList<ThiSinh>();
    }

    public QLSV(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }

    public ArrayList<ThiSinh> getDsThiSinh() {
        return dsThiSinh;
    }

    public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }
    public void insert(ThiSinh thiSinh){
        this.dsThiSinh.add(thiSinh);
    }
    public void delete(ThiSinh thiSinh){
        this.dsThiSinh.remove(thiSinh);
    }
    public void edit(ThiSinh thiSinh){
        // TODO: 20/04/2023
    }
    public void update(ThiSinh thiSinh){
        this.dsThiSinh.remove(thiSinh);
        this.dsThiSinh.add(thiSinh);
    }


}
