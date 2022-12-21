import java.util.Scanner;

public class Author
{
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){return name;}

    public String getEmail(){return email;}

    public void setEmail(String email){this.email = email;}

    public char getGender(){return gender;}

    @Override
    public String toString()
    {
        return "Автор - " + name + ", Пол - " + gender + ", Почта - " + email;
    }

    public static void main(String[] args) {
        String name = "Ivan Popov";
        String email = "ivPopov@somewhere.com";
        char gender = 'm';
        Author auth = new Author(name, email, gender);
        System.out.println("Автор - " + auth.getName() + ", Пол - " + auth.getGender() + ", Почта - " + auth.getEmail());

        Scanner input = new Scanner(System.in);
        System.out.println("Введите новую почту автора: ");
        auth.setEmail(input.nextLine());
        System.out.println(auth.toString());
    }
}
