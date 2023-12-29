package Task1;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
         Map<String, Integer> items;

        public Inventory() {
            this.items = new HashMap<>();
        }

        public void addItem(String itemName, int quantity) {
            if (items.containsKey(itemName)) {
                items.put(itemName, items.get(itemName) + quantity);
            } else {
                items.put(itemName, quantity);
            }
        }

        public void removeItem(String itemName, int quantity) {
            if (items.containsKey(itemName)) {
                int currentQuantity = items.get(itemName);
                if (currentQuantity >= quantity) {
                    currentQuantity -= quantity;
                    if (currentQuantity == 0) {
                        items.remove(itemName);
                    } else {
                        items.put(itemName, currentQuantity);
                    }
                } else {
                    throw new IllegalArgumentException(" " + itemName + " ");
                }
            } else {
                throw new IllegalArgumentException(itemName + " нету ");
            }
        }

        public boolean checkItem(String itemName) {
            return items.containsKey(itemName);
        }

        public Map<String, Integer> getItems() {
            return items;
        }
    }

