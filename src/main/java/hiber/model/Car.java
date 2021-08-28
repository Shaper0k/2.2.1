package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" + "id: " + id +
                " model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Car() {}

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    @OneToOne (cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn (name = "user_id")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }




}
