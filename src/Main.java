public class Main {
    public static void main(String[] args) {
    Rect man1 = new Rect("Петя","Кофевар", 800);
    String info1 = man1.getInfo(2);
        System.out.println(info1);

    Rect man2 = new Rect("Анна","Печатница", 400);
    String info2 = man2.getInfo(2);
        System.out.println(info2);
    }
}
