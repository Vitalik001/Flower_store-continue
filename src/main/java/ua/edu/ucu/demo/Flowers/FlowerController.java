package ua.edu.ucu.demo.Flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/flower")
public class FlowerController {

    @GetMapping
    public List<Flower> getflowers(){
        return List.of(new Flower("flower1", 50, "red", 25));
    }
}