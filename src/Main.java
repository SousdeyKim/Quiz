import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "What is the main role of a backend server in web development?",
                "Which HTTP method is commonly used to retrieve data from a server?",
                "Which database language is used to query and manage relational databases?",
                "In Laravel, which command is used to start the local development server?",
                "What is the purpose of an API in backend development?"
        };
        String[][] options = {
                {"A. Designing website layouts",
                 "B. Managing data and business logic",
                 "C. Editing images for the website",
                 "D. Creating animations"},

                {"A. POST",
                 "B. DELETE",
                 "C. GET",
                 "D. PUT"},

                {"A. HTML",
                 "B. CSS",
                 "C. JavaScript",
                 "D. SQL"},

                {"A. php start",
                 "B. npm run serve",
                 "C. php artisan serve",
                 "D. laravel run"},

                {"A. To style web pages",
                 "B. To connect frontend and backend systems",
                 "C. To create database tables only",
                 "D. To compress images"}
        };
        char[] correctAnswers = {'B', 'C', 'D', 'C', 'B'};
        char[] userAnswers = new char[5];
        int totalScore = 0;
        System.out.print("""
                **********
                Quiz Game
                **********
                """);

        for(int i = 0; i < 5; i++){
            System.out.println(questions[i]);
            for(int j=0; j<4; j++){
                System.out.println(options[i][j]);
            }
            do {
                System.out.print("Choose your answer (A->D): ");
                userAnswers[i] = Character.toUpperCase(scanner.next().charAt(0));
            } while (userAnswers[i] != 'A' &&
                    userAnswers[i] != 'B' &&
                    userAnswers[i] != 'C' &&
                    userAnswers[i] != 'D');

            if (userAnswers[i] == correctAnswers[i]) {
                System.out.print("""
                    ********
                    Correct!
                    ********
                    """);
                totalScore++;
            }
            else{
                System.out.print("""
                    ******
                    Wrong!
                    ******
                    """);
            };
        };

System.out.println("Your total score is "+ totalScore +"/5.");


    }
}