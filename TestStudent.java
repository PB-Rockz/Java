class Student {
    int roll;
    String name;
    double marks;

    public void setData(int r, String n, double m) {
        roll = r;
        name = n;
        marks = m;
    }

    public void showData() {
        System.out.println("Roll No. = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }
}

class TestStudent {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData(001, "Rahul", 97);
        s1.showData();
    }
}
