package ivyprograde.project.homeproduct;

import javax.persistence.*;

@Entity
@Table(name="homeproduct")
public class Home {
    private String name;
    private int price;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long no;
    public Home(){}

    public Home(String name, int price, long no) {
        this.name = name;
        this.price = price;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }
}
