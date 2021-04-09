public class Kepkeret {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < args.length; i++) {
            max = Math.max(max, Integer.parseInt(args[i]));
            min = Math.min(min, Integer.parseInt(args[i]));
        }

        System.out.println(max-min);
    }

}
