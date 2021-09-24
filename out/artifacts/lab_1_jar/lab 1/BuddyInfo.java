public class BuddyInfo {

    String name;
    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo s = new BuddyInfo("Orko");
        System.out.println("Hello " + s.getName());
    }
}
