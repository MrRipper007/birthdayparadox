import java.util.*;

public class BirthdayParadox2 {
    public static void main(String[] args){
        int n = 25; //people in the room
        boolean haveSameBirthday = runTest(n);

        if (haveSameBirthday){
            System.out.println("Two people in a room of " + n + " have the same birthday!");
        }
        else
        {
            System.out.println("No Two people in a room of " + n + " have the same birthday!");
        }
    }

    private static boolean runTest(int n) {
        int[] birthdays = new int[365];

        Random rand = new Random();
        for(int i = 0; i<n;i++){
            int birthday = rand.nextInt(365);
            if(birthdays[birthday]>0){
                return true;
            }
            birthdays[birthday]++;
        }
        return false;
        
    }
}
