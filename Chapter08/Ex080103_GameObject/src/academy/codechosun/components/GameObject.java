package academy.codechosun.components;

import java.util.ArrayList;

public class GameObject {
    private String name;
    private ArrayList<Component> components = new ArrayList<Component>();

    public GameObject(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void update() {
        for (Component component : this.components) {
            component.update();
        }

    }

}



