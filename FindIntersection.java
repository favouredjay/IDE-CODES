package Extras;

public class FindIntersection {
    public static void main() {
        String[] stringArr = {"2, 5, 6, 9", "3, 5, 6, 9"};
        boolean isCommon = false;
        String[] strings = stringArr[0].split(",");
        String[] strings1 = stringArr[1].split(",");
        for (String string : strings) {
            for (String s : strings1) {
                if (string.equals(s)) {
                    StringBuilder common = new StringBuilder();
                    common.append(string).append(", ");
                    System.out.print(common);
                }

            }
        }
    }
    public static void main(String[] args) {
        main();
    }

        }









