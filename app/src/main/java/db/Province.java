package db;

import org.litepal.crud.DataSupport;

/**
 * Created by qqche on 2017/3/12.
 */

public class Province extends DataSupport {
    private int id;
    private String Provincename;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public String getProvincename() {
        return Provincename;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setProvincename(String provincename) {
        Provincename = provincename;
    }

}
