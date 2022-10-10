package ivyprograde.project.homeproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/Products")
public class HomeController {
    @Autowired
    private HomeService service;
    @GetMapping("/getProduct")
    public List<Home> getDetails() {
        return service.getProducts();
    }
}
