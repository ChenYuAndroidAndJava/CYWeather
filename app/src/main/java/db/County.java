package db;

import org.litepal.crud.DataSupport;

/**
 * Created by qqche on 2017/3/12.
 */

public class County extends DataSupport {
    private int id;
    private String CountyName;
    private String weatherId;
    private int CityId;

    public int getId() {
        return id;
    }

    public int getCityId() {
        return CityId;
    }

    public String getCountyName() {
        return CountyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

}
