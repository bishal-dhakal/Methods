public class MyClass {
    public static void main(String[] args){
        sayHello("joshua");
//        sayHello("Everyone");
//        sayHello("Mark");

        int sum = Add(1,56);
        System.out.println(sum);
    }
    public static void sayHello(String name){
        System.out.println("Hello "+ name);
    }

    public static int Add(int x, int y){
        System.out.println(x+y);
        return (x+y);
    }
}
