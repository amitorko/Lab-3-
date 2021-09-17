import java.util.ArrayList;

public class AddressBook {
    public ArrayList<BuddyInfo> buddyInfo;
    public AddressBook(){
        this.buddyInfo= new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo buddy1){
        buddyInfo.add(buddy1);
    }
    public void removeBuddy(int i){
        if(i>=0 && i<buddyInfo.size() ){
            buddyInfo.remove(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}
