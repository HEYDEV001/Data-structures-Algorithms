package recursion;

public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));

    }
    public static int friendsPairing(int friends){
        if(friends == 1 || friends == 2) return friends;
        return friendsPairing(friends-1) + (friends-1)*friendsPairing(friends-2);
    }
}
