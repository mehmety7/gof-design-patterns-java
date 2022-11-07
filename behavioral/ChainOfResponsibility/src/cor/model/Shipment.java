package cor.model;

import java.util.ArrayList;
import java.util.List;

public class Shipment {

    private int id;
    private List<String> products;
    private String city;
    private String courier;

    public Shipment(int id, String city, String courier) {
        this.id = id;
        this.products = new ArrayList<>();
        this.city = city;
        this.courier = courier;
    }

    public Shipment(int id, String city) {
        this.id = id;
        this.products = new ArrayList<>();
        this.city = city;
        this.courier = "";
    }

    public String getCity() {
        return city;
    }

    public String getCourier() {
        return courier;
    }
}
