//An instance variable is declared inside the class but outside any method.It belongs to an object.

class Test {

    // Instance variable
    int a = 20;

    public static void main(String[] args) {

        Test obj = new Test();   // object creation
        System.out.println(obj.a);
    }
}
