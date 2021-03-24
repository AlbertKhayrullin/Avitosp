package tech.itpark.manager;

import tech.itpark.domain.Apartment;
import tech.itpark.domain.ApartmentCreate;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class ApartmentManager {
    private long nextId = 1;
    private ArrayList<Apartment> apartments = new ArrayList<Apartment>();
    private ArrayList<Apartment> result;
    public Apartment register(ApartmentCreate dto) {
        Apartment apartment = new Apartment(
                nextId++,
                "http://",
                dto.getRoom(),
                "-к.",
                dto.getApartmentArea(),
                "м2",
                dto.getFloor(),
                dto.getFloorTotal(),
                "эт.",
                dto.getFavorite(),
                dto.getPrice(),
                "руб.",
                dto.isVerifiedRegistry(),
                dto.getResidentialComplex(),
                dto.getAddress(),
                dto.getMetroStation(),
                dto.getDistanceToMetro(),
                "км.",
                dto.getAgencyName(),
                dto.getUrlEmblem(),
                OffsetDateTime.now().toEpochSecond(),
                "секунд назад"
                );
        apartments.add(apartment);
        return apartment;
    }
    public ArrayList<Apartment> getAll() { return apartments; }

     public ArrayList<Apartment> searchBy(int minPrice, int maxPrice) {
        ArrayList<Apartment> result = new ArrayList<>();
         for (Apartment apartment : apartments) {
             if ( apartment.getPrice() >= minPrice && apartment.getPrice() <= maxPrice)
                 { result.add(apartment); }
         }
         return result;
     }
}
