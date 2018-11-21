package HO;

public class Swapper {

    public static String swap(String swap) {
        String cons = "";
        int index = 1;
        String swapp = swap.replaceAll("\\s+", "");
        String[] templ = swapp.split("");
        for (String sign : templ) {
            String blank = sign.toUpperCase();
            for (int i = 0; i < blank.length(); i++) {

                if (index <= blank.length()) {
                    cons = cons.concat(blank + "-");
                    index++;
                } else {
                    blank = blank.concat(sign);

                }

            }

        }
        String black = cons.substring(0, cons.length() - 1);
        return black;
    }
}

