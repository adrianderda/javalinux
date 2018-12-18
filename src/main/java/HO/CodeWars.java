package HO;


import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;


public class CodeWars {

    public static boolean isValid(String braces) {
        return braces.equals(new StringBuilder(braces).reverse().toString());
    }


    public static String spinWords(String sentence) {

        List<String> tempList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        List<String> newList = new ArrayList<>();
        for (String s : tempList) {
            if (s.length() < 5) {
                newList.add(s);
            } else {
                String var = new StringBuilder(s).reverse().toString();
                newList.add(var);
            }
        }


        return String.valueOf(newList);
    }

    public static int countBits(int n) {
        return Integer.bitCount(n);
    }

    public static int solution(int number) {
        int temp = 0;
        for (int i = 0; i < number; i++) {
            if ((i % 3) == 0 || (i % 5) == 0) {
                temp += i;
            }
        }
        return temp;
    }

    public static long findNextSquare(long sq) {
        long temp = (long) Math.sqrt(sq);
        long var = (temp * temp);
        if (var == sq) {
            return ((temp + 1) * (temp + 1));
        } else {
            return -1;
        }
    }

    public static int[] sortArray(int[] array) {

        final int[] sortedOdd = Arrays.stream(array)
                .filter(e -> e % 2 != 0)
                .sorted()
                .toArray();


        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) array[i] = sortedOdd[j++];
        }

        return array;
    }

    public static boolean isSquare(int n) {
        if (n < 0) {
            return false;
        }
        int temp = (int) Math.sqrt(n);
        int var = (temp * temp);
        return var == n;
    }

    public static String maskify(String str) {
        if (str.length() <= 4) {
            return str;
        } else {
            String temp = str.substring(0, str.length() - 4);
            String var = temp.replaceAll(".", "#");
            return String.valueOf(new StringBuilder(str).replace(0, str.length() - 4, var));
        }
    }

    public static int getSum(int a, int b) {
        int abs = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                abs += i;
            }
        } else if (b > a) {
            for (int i = a; i <= b; i++) {
                abs += i;
            }
        } else if (a == b) {
            return a;
        }
        return abs;
    }

    public static String tickets(int[] peopleInLine) {
        int bill25 = 0;
        int bill50 = 0;
        for (int payment : peopleInLine) {
            if (payment == 25) {
                bill25++;
            } else if (payment == 50) {
                bill25--;
                bill50++;
            } else if (payment == 100) {
                if (bill50 > 0 && bill25 > 0) {
                    bill50--;
                    bill25--;
                } else {
                    bill25 -= 3;
                }
            }
            if (bill25 < 0 || bill50 < 0) {
                return "NO";
            }
        }
        return "YES";
    }

    public static String makeReadable(int seconds) {
        return LocalTime.MIN.plusSeconds(seconds).toString();

    }

    public static String whoIsNext(String[] names, int n) {

        List<String> crowd = Arrays.asList(names);
        List<String> list = new ArrayList<>(crowd);

        for (int i = 0; i < n; i++) {
            String asd = list.get(0);
            list.add(asd);
            list.add(asd);
            list.remove(0);
        }
        if (n <= 5) {
            return crowd.get(n - 1);
        }
        return list.get(0);
    }

    public static String longestConsec(String[] strarr, int k) {

        Set<String> list1 = new HashSet<>(Arrays.asList(strarr));
        Set<String> list = new HashSet<>(list1);
        String var = "";
        String x = "";
        int index = 0;
        while (k > index) {
            for (String temp : list) {
                if (temp.length() > var.length()) {
                    var=temp;
                }
            }
            x=x.concat(var);
            list.remove(var);
            var="";
            index++;
        }
        return x;
    }


    public static void main(String[] args) {

        CodeWars codeWars = new CodeWars();


        System.out.println(longestConsec(new String[]{"wlwsasphmxx","owiaxujylentrklctozmymu","wpgozvxxiu"}, 2));
    }
}
