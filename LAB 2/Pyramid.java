class Pyramid {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Name: Praful Bansal " + "\n" + "SAP ID: 500117994");

        for (int i = 1; i <= n; ++i) {
            for (int k = n - i; k >= 1; --k) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
