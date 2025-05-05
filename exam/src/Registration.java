/**
 *
 * @author mk
 */

public record Registration(int number, String location, String date) {

    public Registration {
        if (number <= 0) {
            throw new IllegalArgumentException("Registration number must be greater than zero.");
        }

        if (location == null || location.isEmpty()) {
            throw new IllegalArgumentException("Location cannot be null or empty.");
        }

        if (date == null || date.isEmpty()) {
            throw new IllegalArgumentException("Date cannot be null or empty.");
        }
    }

    @Override
    public String toString() {
        return "Registration{" + "number=" + number + ", location='" + location + '\'' + ", date='" + date + '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Registration other = (Registration) obj;
        return this.number == other.number;
    }
}
