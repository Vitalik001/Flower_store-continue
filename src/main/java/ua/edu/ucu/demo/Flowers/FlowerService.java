package ua.edu.ucu.demo.Flowers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    public List<Flower> getFlowers(){
            return List.of(new Flower(1, "flower1", 50, "red", 25));
        }
    }

