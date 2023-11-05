import java.util.Scanner;

public class Assignment3 {
    /*
    Assignment-3 (User Input)
    step 1: create a class called Product
            step 2: create a main method
    step 3: declare variables: id, title, price, description, category
    step 4: get user input for each variables
    step 5: print the variables
     */
    public static void main(String[] args) {
        int id;
        String title;
        double price;
        String description;
        String category;

        Scanner inputId = new Scanner(System.in);
        System.out.print("Enter id : ");
        id = inputId.nextInt();
        System.out.println("Id : " +id);

        Scanner inputTitle = new Scanner(System.in);
        System.out.print("Enter Title : ");
        title = inputTitle.nextLine();
        System.out.println("Title : " +title);

        Scanner inputPrice = new Scanner(System.in);
        System.out.print("Enter Price : ");
        price = inputPrice.nextDouble();
        System.out.printf("Price : %.2f\n", price);

        Scanner inputDescription = new Scanner(System.in);
        System.out.print("Enter Description : ");
        description = inputDescription.nextLine();
        System.out.println("Description : " +description);

        Scanner inputCategory = new Scanner(System.in);
        System.out.print("Enter Category : ");
        category = inputCategory.nextLine();
        System.out.println("Category : " +category);
    }
}
