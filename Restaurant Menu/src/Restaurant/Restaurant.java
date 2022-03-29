package Restaurant;

public class Restaurant {
    public static void main(String[] args){
        String name = "The Launch Cafe";
        Menu ourMenu = new Menu();
        ourMenu.addMenuItems(4.59,"steak","Appetizer", false);
        for(MenuItems item: ourMenu.getMenuItems()){
            System.out.println(item.getDescription());
        }
    }
}
