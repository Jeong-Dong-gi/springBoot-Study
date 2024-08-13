package example3;

import java.util.Objects;

public class MenuItem {

    private final String name;
    private final int priuce;

    public MenuItem(String name, int price) {
        this.name = name;
        this.priuce = price;
    }

    public boolean matchs(String name) {
        return this.name.equals(name);
    }

    public String getName() {
        return name;
    }

    public int getPriuce() {
        return priuce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return priuce == menuItem.priuce && Objects.equals(name, menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priuce);
    }

}
