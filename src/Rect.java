public class Rect {
    String name, placeName;
    double moneyWork;

    public Rect(String name, String placeName, double moneyWork) {
        this.name = name;
        this.placeName = placeName;
        this.moneyWork = moneyWork;
    }

    String getInfo(int i){
        moneyWork *= i;
        return "Имя: " + name + "\nДолжность: " + placeName + "\nЗарплата за " + i +" месяцев: " + moneyWork + "\n__________________";
    }
}
