import java.util.ArrayList;

public class AddressBook {
    public ArrayList<BuddyInfo> buddyInfo;
    public AddressBook(){
        this.buddyInfo= new ArrayList<BuddyInfo>();
    }
    public void addBuddy(BuddyInfo buddy1){
        if(buddy1!=null)
        buddyInfo.add(buddy1);
    }
    public void removeBuddy(BuddyInfo buddy2){
        int index= -1;
        for(int i=0; i<buddyInfo.size(); i++){
            if(buddyInfo.get(i)==buddy2){
                index = i;
            }
        }
        if(index != -1)
            buddyInfo.remove(index);

    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom");
        AddressBook aBook = new AddressBook();
        aBook.addBuddy(buddy);
        aBook.removeBuddy(buddy);
        System.out.println("Hello world");
    }

}
