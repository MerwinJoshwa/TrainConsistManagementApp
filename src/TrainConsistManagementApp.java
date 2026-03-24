import java.util.*;

class UseCase2TrainConsistManagementApp{
    String bog;
    public void addPassenger(ArrayList<String> list){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Passenger bogies:");
        bog=input.nextLine();
        list.add(bog);
    }

    public void display(ArrayList<String> list){
        for(String item: list){
            System.out.println(item);
        }
    }

    public void remove(ArrayList<String> list,int pos){
        list.remove(pos);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        UseCase2TrainConsistManagementApp uc2 =new UseCase2TrainConsistManagementApp();
        System.out.println("=====================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train");
        System.out.println("=====================================\n");

        ArrayList<String> trainConsist = new ArrayList<>();
        System.out.println("Enter no of Bogies to add");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            uc2.addPassenger(trainConsist);

        }
        System.out.println("Removing bogies from list");
        System.out.println("Enter position to remove");
        int pos=input.nextInt();
        uc2.remove(trainConsist,pos);
        uc2.display(trainConsist);





    }
}
