/**
 * 
 * @author mk
 */
public enum Purpose {
    PASSENGER("Passengers"),
    CARGO("Goods"),
    AGRICULTURAL("Agricultural Chemicals");

    private final String usage;

    Purpose(String usage) {
        this.usage = usage;
    }

    public String getUsage() {
        return usage;
    }
}
