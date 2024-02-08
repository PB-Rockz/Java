class MOverCase2 {
    public void m1(String s) {
        System.out.println("String Arg");
    }

    public void m1(Object o) {
        System.out.println("Object Arg");
    }

    public static void main(String[] args) {
        MOverCase2 c = new MOverCase2();
        c.m1(new Object());
        c.m1("Saurabh");
        c.m1(null);
    }
}
