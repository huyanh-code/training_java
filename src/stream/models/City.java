package stream.models;

public class City {
    private int id;
    private String name;
    private String cityCode;


    public City(int id, String name, String cityCode) {
        this.id = id;
        this.name = name;
        this.cityCode = cityCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityCode='" + cityCode + '\'' +
                '}';
    }
}
