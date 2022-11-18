import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("Witterstaetter");
        myArrList.add("Johnson");
        myArrList.add("Miller");

        String prompt = "Which operation do you want to display: A - Add, D - Delete, P - Print, Q - Quit";

        String userInput = SafeInputs.getRegExString(in, prompt, "[AaDdPpQq]");
        userInput = userInput.toUpperCase();

        switch (userInput){
            case "A":
                add(myArrList);
                break;
            case "D":
                delete(myArrList);
                break;
            case "P":
                print(myArrList);
                break;
            case "Q":
                System.out.println("____________________");
                break;

        }



    }

    private static void add(ArrayList<String> list){
        Scanner in = new Scanner(System.in);
        String added;

        System.out.println(list);
        System.out.println("Enter Name to add: ");
        added = in.nextLine();
        list.add(added);
        System.out.println(list);

    }

    private static void delete(ArrayList<String> list){
        Scanner in = new Scanner(System.in);
        String deleted;
        System.out.println(list);
        System.out.println("Enter name to delete: ");
        deleted = in.nextLine();
        list.remove(deleted);
    }

    private static void print(ArrayList<String> list){
        for(String value: list){
            System.out.printf("%s ", value);
        }
    }


}