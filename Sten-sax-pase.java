
public class Sten_sax_påse {

    static int human = 0;
    static int data = 0;

    public static void main(String[] args) {
        kör();

    }

    static void kör() {
        Scanner input = new Scanner(System.in);
        int antal = 0;
        System.out.print("Hur många gngr ska du köra ");

        int gngr = input.nextInt();
        input.nextLine();

        do {
            System.out.println("");
            int runda = antal+1;
            System.out.println("Round "+ runda + " Välj sten sax eller pase");
            String svar = input.nextLine().trim();

            switch (svar) {

                case "sten":
                    condition("sten", randm());

                    break;
                case "pase":
                    condition("påse", randm());
                    break;
                case "sax":
                    condition("sax", randm());
                    break;
                default:
                    System.out.println("Fel inamt");
            }
            antal++;

        } while (antal < gngr);

    }

    static String randm() {
        String[] rando = {"sten", "sax", "påse"};
        Random random = new Random();

        int select = random.nextInt(rando.length);

        String ran = rando[select];

        return ran;
    }

    static void condition(String s, String s2) {
        if (s == "sten" && s2 == "sax") {
            System.out.println("Du valde " + s + " Datorn valde " + s2);
            System.out.println("Du vann");
            human = human + 1;

        } else if (s == "sten" && s2 == "sten") {
            System.out.println("Du valde " + s + " Datorn valde " + s2);
            System.out.println("Tie");

        } else if (s == "sten" && s2 == "påse") {
            System.out.println("Du valde " + s + " Datorn valde " + s2);
            System.out.println("Du förlora");
            data++;

        } else if (s == "sax" && s2 == "påse") {
            System.out.println("Du valde " + s + " Datorn valde " + s2);
            System.out.println("Du vann");
            human++;

        } else if (s == "sax" && s2 == "sax") {
            System.out.println("Du valde " + s + " Datorn valde " + s2);
            System.out.println("Tie");

        } else if (s == "sax" && s2 == "sten") {
            System.out.println("Du valde " + s + " Datorn valde " + s2);
            System.out.println("Du förlora");
            data++;
        } else if (s == "påse" && s2 == "sten") {
            System.out.println("Du valde " + s + " Datorn valde " + s2);
            System.out.println("Du vann");
            human++;

        } else if (s == "påse" && s2 == "påse") {
            System.out.println("Du valde " + s + " Datorn valde " + s2);
            System.out.println("Tie");

        } else if (s == "påse" && s2 == "sax") {
            System.out.println("Du valde " + s + " Datorn valde " + s2);
            System.out.println("Du förlora");
            data++;

        }

        System.out.println("Det står " + data + "-" + human+ " datan har " + data + " du har " + human);

    }
}
