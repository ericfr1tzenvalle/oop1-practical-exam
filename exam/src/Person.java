import java.util.Objects;

/**
 *
 * @author mk
 */
public class Person {

    private String name;
    private String cpf;

    public Person(String name, String cpf) {
        setName(name);
        setCpf(cpf);
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF cannot be null or empty.");
        }
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Owner{" + "name='" + name + '\'' + ", cpf='" + cpf + '\'' + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        final Person other = (Person) obj;
        return Objects.equals(this.cpf, other.cpf);
    }
}
