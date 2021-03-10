package academy.codechosun;

public class switchCase {
    public static void main(String[] args) {
        String month = "March";

        switch (month)
        {
            case "December":
                // Intentional fall-through
            case "January":
                // Intentional fall-through
            case "February":
                System.out.printf("It's winter season.%s", System.lineSeparator());
                break;
            case "March":
                // Intentonal fall-through
            case "April":
                // Intentonal fall-through
            case "May":
                System.out.printf("It's spring season.%s", System.lineSeparator());
                break;
        }
    }
}


