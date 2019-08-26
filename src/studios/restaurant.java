package studios;




import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

    public class restaurant {

        public class Menu {
            private String name;
            private LocalDate updatedAt = LocalDate.now();
            private ArrayList<MenuItem> menuItems = new ArrayList<>();

            public Menu() {
            }

            public Menu(String aName) {
                this.name = aName;
            }

            public Menu(String aName, ArrayList<MenuItem> menuItemList) {
                this.name = aName;
                this.menuItems = menuItemList;
            }

            public String getName() {
                return name;
            }

            // @todo 3: A way to tell when the menu was last updated
            public void setName(String name) {
                this.name = name;
                this.updateTimeStamp();
            }

            // @todo 3: A way to tell when the menu was last updated
            public LocalDate getUpdatedAt() {
                return updatedAt;
            }

            public ArrayList<MenuItem> getMenuItems() {
                return menuItems;
            }

            public void setMenuItems(ArrayList<MenuItem> menuItems) {
                this.menuItems = menuItems;
                this.updateTimeStamp();
            }

            // @todo 1: A way to add and remove menu items from the menu
            // @todo 3: A way to tell when the menu was last updated
            public void addMenuItem(MenuItem aMenuItem) {

                this.menuItems.add(aMenuItem);
                this.updateTimeStamp();
            }
            public void removeMenuItem(MenuItem aMenuItem) {

                this.menuItems.remove(aMenuItem);
                this.updateTimeStamp();
            }

            // @todo 4: A way to print out both a menu item and an entire menu
            public void printMenuItem(Integer index) {
                System.out.println(this.menuItems.get(index));
            }

            // @todo 4: A way to print out both a menu item and an entire menu
            public void printMenu() {
                System.out.println(this.name);
                System.out.println(this.updatedAt);
                for (MenuItem item : this.menuItems) {
                    System.out.println(item);
                }
            }

            // @todo 3: A way to tell when the menu was last updated
            private void updateTimeStamp() {
                this.updatedAt = LocalDate.now();
            }}

    public class MenuItem {
        private String name;
        private Double price;
        private String description;
        private String category;
        private LocalDate createdAt = LocalDate.now();

        public MenuItem() {
        }

        public MenuItem(String aName, Double aPrice, String aDescription, String aCategory) {
            this.name = aName;
            this.price = aPrice;
            this.category = aCategory;
            this.description = aDescription;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public LocalDate getCreatedAt() {
            return createdAt;
        }

        // @todo 2: A way to tell if a menu item is new
        // I considered a menu item to be new if it was created within the last three days
        public boolean isMenuItemNew() {
            Period period = Period.between(LocalDate.now(), this.createdAt);
            return period.getDays() < 3;
        }

        // @todo 4: A way to print out both a menu item and an entire menu
        // this assists with setting up how I want menuItems to display when I print them;
        @Override
        public String toString() {
            return "category: " + this.category + "name: " + this.name + "price: " + this.price + "description: " + this.description;
        }

        // @todo 5: A way to determine whether or not two menu items are equal
        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }

            if (o == null) {
                return false;
            }

            if (o.getClass() != getClass()) {
                return false;
            }

            MenuItem item = (MenuItem) o;
            return item.getName() == getName();
        }
    }
}
