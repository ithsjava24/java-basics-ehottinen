package se.iths.Week2;

//todo: Skapa en klass som kallas TextBook
    //:todo: ska ha ett privat fält av typen String[] som kan lagra text och ska kallas pages
//todo: Skapa en default konstruktor med en array som har 10 platser
//todo: Skapa konstruktor där man kan ange ett annat antal platser större än 0
    //todo: Anger man ett värde till konstruktorn som är <= 0 ska en
    //todo: exception kastas: throw new IllegalArgumentException();
//todo: skapa metoder i klassen så vi kan lägga till och läsa sidor i boken
//todo: Från början har vår bok 0 sidor även om det finns platser i arrayen
    //todo: så vi behöver hålla reda på hur många sidor vår bok fått skrivna med hjälp av ett fält

//todo: Följande metoder ska finnas:
    //todo: addPage(String text) – Sparar text som en ny sida i arrayen på första lediga plats.
    //todo: Om det inte finns lediga platser kasta en exception.
    //todo: count() - returnerar en int med hur många sidor vår bok innehåller.
    //todo: getPage(int page) – Returnerar texten för sidan page där första sidan är 0. Om det
    //todo: inte finns några sidor eller page numret är ogiltigt returnera en tom textsträng, ””.

//todo: Extra svårighet:
    //todo: getPages() - Returnerar en array bestående av alla sidor. Ska vara en kopia av
    //todo: vårt fält och inte en referens till fältet. Tänk på att antalet sidor i boken kan vara
        //mindre än arrayen som lagrar dessa.
    //todo: getPages(int start) – Fungerar som metoden ovan fast den ska börja på page
        //nummer start och returnera alla efterföljande sidor.
    //todo: getPages(int start, int stop) – Returnerar alla sidor mellan start (inklusive) och
    //todo: stop (exklusive). Ska så långt som möjligt acceptera ogitliga värden

public class TextBook {
    public class Textbook {

        private final String[] pages;
        private int pageCount;

        public TextBook() {
            pages = new String[10];
        }

        public TextBook(int size) {
            if (size <= 0) {
                throw new IllegalArgumentException("Number of pages must be greater than 0");
            }
            pages = new String[size];
        }

        public void addPage(String text) {

            if (pageCount >= pages.length) {
                throw new IllegalArgumentException("No empty pages in book.");
            }
            pages[pageCount++] = text;
        }

        public int count() {
            return pageCount;
        }

        public String getPage(int page) {
            if (page < 0 || page >= pageCount)
                return "";
            return pages[page];
        }

        public static void main(String[] args) {
            TextBook defaulSize = new TextBook();
            TextBook customSize = new TextBook(20);

            defaulSize.addPage("Hello World!");
            defaulSize.addPage("World");
            defaulSize.addPage("More text on page");
            defaulSize.addPage("This is a simple text book");
            defaulSize.addPage("This is a simple text book with a cat in it");
            defaulSize.addPage("This is a simple text book with a cat");
            defaulSize.addPage("This is a simple text book with a cat");
            defaulSize.addPage("This is a simple text book with a cat");
            defaulSize.addPage("This is a simple text book with a cat");
            defaulSize.addPage("This is a simple text book with a cat");
            defaulSize.addPage("Beyond the end");

            customSize.addPage("Hello World");
            System.out.println(defaulSize.count());
            System.out.println(customSize.count());
            System.out.println(defaulSize.getPage(0));
            System.out.println(defaulSize.getPage(1));
        }
    }
}
