package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<String> items;
    private double total;

    public Pedido() {
        items = new ArrayList<>();
        total = 0.0;
    }

    public void agregarItem(String item, double precio) {
        items.add(item + " - $" + precio);
        total += precio;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (String item : items) {
            builder.append(item).append("\n");
        }
        builder.append("\nTotal: $").append(total).append("\n");
        return builder.toString();
    }
}
