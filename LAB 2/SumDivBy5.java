
class SumDivBy5 {
    public static void main(String[] args) {
        System.out.println("Name: Praful Bansal " + "\n" + "SAP ID: 500117994");
        int sum = 0;
        System.out.println("Sum of all numbers divisible by 5 from 40 to 250:");
        for (int i = 40; i <= 250; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
