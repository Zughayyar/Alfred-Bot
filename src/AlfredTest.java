import java.sql.DataTruncation;

public class AlfredTest {
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();    // bot instance

        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Anas Zughayyar");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play music.");
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know.");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what batman really about");

        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);

    }
}
