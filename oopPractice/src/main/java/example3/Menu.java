package example3;

import java.util.List;

public class Menu {

    private final List<MenuItem> menuItems;

    public <E> Menu(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem choose(String name) {
        return this.menuItems.stream()
                .filter(menuItem -> menuItem.matchs(name))
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("잘못된 메뉴 이름입니다."));
    }
}
