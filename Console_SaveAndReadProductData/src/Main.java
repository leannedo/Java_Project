import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product newProduct = new Product("Paula's Choice Suncare", "sunscreen", 35.67);
        saveObject(newProduct);
        System.out.println("\nNew product added: " + newProduct);
        System.out.println();

        newProduct.setPrice(20.67);
        newProduct.setName("Paula Choice's Suncare Ultimate");

        saveObject(newProduct);
        loadObject(newProduct);
        System.out.println();
        saveObject(newProduct);
        System.out.println("\nNew product added: " + newProduct);



    }

    private static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        System.out.println("Menu: " +
                "\n\t0. Quit" +
                "\n\t1. Enter a string");
        while(true) {
            System.out.print("Choose an action: ");
            int action = Integer.parseInt(scanner.nextLine());
            if (action == 0) {
                break;
            } else if (action == 1) {
                System.out.println("Enter your data");
                String data = scanner.nextLine();
                if (data.isEmpty()) {
                    break;
                }
                values.add(data);
                index++;
                if (index == 3) {
                    System.out.println("Entering new data completed.");
                    break;
                }
            }

        }
        return values;
    }

    // this will apply to all objects that implement the Saveable interface
    private static void saveObject(Saveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage.");
        }
    }

    private static void loadObject(Saveable objectToLoad) {
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
