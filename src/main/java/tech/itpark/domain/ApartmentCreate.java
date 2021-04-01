package tech.itpark.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ApartmentCreate {
    private String url;
    private int room;
    private double apartmentArea;
    private int floor;
    private int floorTotal;
    private Boolean favorite;
    private int price;
    private String address;
    private String metroStation;
    private double distanceToMetro;
    private String distanceUnit;
    private String residentialComplex;
    private String agencyName;
    private String urlEmblem;
    private boolean verifiedRegistry;
    private String placementTimeUnit;
}
