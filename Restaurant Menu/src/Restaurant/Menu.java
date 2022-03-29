package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    Date lastUpdated;

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItems> menuItems) {
        this.menuItems = menuItems;
    }

    ArrayList<MenuItems> menuItems = new ArrayList<>();

    public Menu(){
        this.lastUpdated = new Date();

    }
    public Menu(Date lastUpdated, ArrayList<MenuItems> menu){
        this.lastUpdated = lastUpdated;
        this.menuItems = menu;
    }
    public void addMenuItems(double price, String description,String category, Boolean isNew){
        this.menuItems.add(new MenuItems(price, description, category, isNew));
    }
    public void removeMenuItem(String description){
        if(this.menuItems.contains(description)){
            this.menuItems.remove(description);
        }
    }
    private void updateDateUpdated(){
        this.lastUpdated = new Date();
    }


}
