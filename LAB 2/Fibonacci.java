class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Name: Praful Bansal " + "\n" + "SAP ID: 500117994");
        int a = 0, b = 1, c = 0;
        System.out.println("Fibonacci series upto 10 terms:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}