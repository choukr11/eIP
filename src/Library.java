import java.util.Scanner;

public class Library {
    int b=1;
     String[][] books = new String[b][5];
    Scanner sc = new Scanner(System.in);



    public void setBooks(){
    for(int i = 0; i< b;i++) {
        System.out.print("Enter a Title:");
        books[i][0] = sc.nextLine();

        System.out.print("Enter an Author:");
        books[i][1] = sc.nextLine();

        System.out.print("Enter a Type:");
        books[i][2] = sc.nextLine();

        System.out.print("Enter an ISBN:");
        books[i][3] = sc.nextLine();
    }
}


    public void getBooks(){
        for (int j = 0; j < b; j++) {
            System.out.println(books[j][0] +" - " +books[j][1] +" - "+books[j][2] +" - " +books[j][3]);

        }
    }


}
