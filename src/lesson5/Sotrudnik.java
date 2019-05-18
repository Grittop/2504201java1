package lesson5;

public class Sotrudnik {

    String fio;
    String dolzhnost;
    String email;
    String phone;
    int zarplata;
    int age;



    public Sotrudnik(String fio, String dolzhnost, String email, String phone, int zarplata, int age) {
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.email = email;
        this.phone = phone;
        this.zarplata = zarplata;
        this.age = age;
    }

    public void info(){
        System.out.println("ФИО: "+ fio +", Должность: " + dolzhnost + ", Email: " + phone + ", Зарплата: " + zarplata + ", Возраст: " + age);
    }



        public void info40(){

            if (age > 40){
                System.out.println("ФИО: "+ fio +", Должность: " + dolzhnost + ", Email: " + phone + ", Зарплата: " + zarplata + ", Возраст: " + age);
            }

    }


}
