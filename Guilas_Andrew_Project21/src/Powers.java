public class Powers {
    public static void main(String[] args) throws Exception {
        for (int power = 0; power <= 20; power++) {
            int answer = (int) Math.pow(2, power);
            System.out.println(answer);
        }
    }
}
