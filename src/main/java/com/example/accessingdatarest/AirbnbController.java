package com.example.accessingdatarest;

import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(allowedHeaders="http://www.localhost:4200/")
public class AirbnbController {
    @Autowired
    MenuRepository menuRepository;

    @Autowired
    RoomRepository roomRepository;

    @GetMapping("/menus")
    public List<Menu> menus() {
        System.out.println("==== get menus ====");
        return menuRepository.findAll();
    }

    @GetMapping("/rooms")
    public List<Rooms> rooms() {
        System.out.println("==== get rooms ====");
        return roomRepository.findAll();
    }
}