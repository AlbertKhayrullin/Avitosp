package tech.itpark.controller;

import org.springframework.web.bind.annotation.*;
import tech.itpark.domain.Apartment;
import tech.itpark.domain.ApartmentCreate;
import tech.itpark.manager.ApartmentManager;

import java.util.ArrayList;

@RestController
public class ApartmentController {
    private ApartmentManager manager = new ApartmentManager();
    private ArrayList<Apartment> result;

    @GetMapping("/apartments")
    public ArrayList<Apartment> getUsers() {
        return manager.getAll();
    }

    @PostMapping("/apartments")
    public Apartment create( @RequestBody ApartmentCreate dto ) {
        return manager.register(dto);
    }

    @GetMapping("/apartments/search")
    public ArrayList<Apartment> searchBy( int minPrice, int maxPrice ) {
        return manager.searchBy( minPrice, maxPrice ); }

}

