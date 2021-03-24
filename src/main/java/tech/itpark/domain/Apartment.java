package tech.itpark.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Apartment {
    private long id;
    private String url;
    private int room;
    private String roomUnit;
    private double apartmentArea;
    private String areaUnit;
    private int floor;
    private int floorTotal;
    private String floorUnit;
    private Boolean favorite;
    private int price;
    private String priceUnit;
    private boolean verifiedRegistry;
    private String residentialComplex;
    private String address;
    private String metroStation;
    private double distanceToMetro;
    private String distanceUnit;
    private String agencyName;
    private String urlEmblem;
    private long placementTime;
    private String placementTimeUnit;
}
