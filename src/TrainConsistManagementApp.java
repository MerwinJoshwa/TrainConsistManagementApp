import java.util.*;

class UseCase3TrainConsistManagementApp{
    String bog;
    public void addbogieID(HashSet<String> set){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter bogie ID: ");
        bog=input.nextLine();
        set.add(bog);
    }

    public void display(HashSet<String> set){
        for(String item: set){
            System.out.println(item);
        }
    }


}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        UseCase3TrainConsistManagementApp uc3 =new UseCase3TrainConsistManagementApp();
        System.out.println("=====================================");
        System.out.println(" UC3 -  Track Unique Bogie ID");
        System.out.println("=====================================\n");

        HashSet<String> bogies=new HashSet<>();

        System.out.println("Enter no of Bogies ID to add");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            uc3.addbogieID(bogies);
        }
        uc3.display(bogies);






    }
}
