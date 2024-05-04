public class HelloWorld {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello, World!");
            try {
                Thread.sleep(1000); // 1000 milissegundos = 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
