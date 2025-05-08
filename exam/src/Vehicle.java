import java.util.Objects;

/**
 *
 * @author mk
 */
public abstract class Vehicle {

    private Person mainOwner;
    private Registration registration;
    private String model;
    private String brand;
    private int mileage;

    

    public Vehicle(Person mainOwner, String model, String brand) {
        setModel(model);
        setMainOwner(mainOwner);
        setBrand(brand);
    }

    public void setRegistration(Registration r) {
        if (r == null) {
            throw new IllegalArgumentException("Registration cannot be null.");
        }
        this.registration = r;
    }

    public final void setMainOwner(Person owner) {
        if (owner == null) throw new IllegalArgumentException("Owner cannot be null.");
        this.mainOwner = owner;
    }

    public Person getMainOwner() {
        return mainOwner;
    }

    public Registration getRegistration() {
        return registration;
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        if (model == null || model.isEmpty()) throw new IllegalArgumentException("Model cannot be null or empty.");
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) throw new IllegalArgumentException("Brand cannot be null or empty.");
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    protected void setMileage(int mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage cannot be negative.");
        }
        this.mileage = mileage;
    }

    public abstract String move(int distance);

    @Override
    public String toString() {
        return "Vehicle{" + "registration=" + registration + ", model=" + model + ", brand=" + brand + ", mileage=" + mileage + ", mainOwner=" + mainOwner + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.registration);
        hash = 43 * hash + Objects.hashCode(this.model);
        hash = 43 * hash + Objects.hashCode(this.brand);
        hash = 43 * hash + this.mileage;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.model, other.model)) return false;
        if (!Objects.equals(this.brand, other.brand)) return false;
        return Objects.equals(this.registration, other.registration);
    }
}
