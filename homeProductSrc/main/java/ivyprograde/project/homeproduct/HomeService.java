package ivyprograde.project.homeproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {
    @Autowired
    private HomeRepository repo;


    public List<Home> getProducts() {
        return repo.findAll();
    }
}
