import java.util.Comparator;
import java.util.Objects;

public class Kaj implements Comparable<Kaj> {
    private String name;


    public Kaj() {
    }

    public Kaj(String name) {
        this.name = name;

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
     * @return holdweight
     */


    public String toString() {
        return "Kaj{name = " + name +" }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kaj kaj = (Kaj) o;
        return Objects.equals(name, kaj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Kaj o) {
        return this.getName().compareTo(o.getName());
    }
}
