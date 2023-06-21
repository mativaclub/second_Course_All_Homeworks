public class Item {

    private String name;

    private Person owner = null;

    public Item(String name, Person owner) {
        this.name = name;
        this.owner = owner;
    }


    public String getName() {
        return name;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
