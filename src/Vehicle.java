import java.util.Objects;

public class Vehicle {
    private String name;
    private int selfweight;
    private String parkering;


    public Vehicle() {
    }

    public Vehicle(String name, int selfweight, String parkering) {
        this.name = name;
        this.selfweight = selfweight;
        this.parkering = parkering;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return self weight
     */
    public int getSelfweight() {
        return selfweight;
    }

    /**
     * 设置
     */
    public void setSelfweight(int selfweight) {
        this.selfweight = selfweight;
    }

    /**
     * 获取

     */
    public String getParkering() {
        return parkering;
    }

    /**
     * 设置
     */
    public void setParkering(String parkering) {
        this.parkering = parkering;
    }

    public String toString() {
        return "Vehicle{name = " + name + ", selfweight = " + selfweight + ", parkering = " + parkering + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return selfweight == vehicle.selfweight && Objects.equals(name, vehicle.name) && Objects.equals(parkering, vehicle.parkering);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, selfweight, parkering);
    }

}
