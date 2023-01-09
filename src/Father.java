public class Father extends GrandFather {


    public Father(String name, int age, Home home, SpecialityEnum specialityEnum) {
        super(name, age, home, speciality);
    }

    public final void goToWork() {
        System.out.println("Father goes to work on foot!!!" + " \ n----------------");

    }

    public Father(String name, int age, Home home, SpecialityEnum specialityEnum) {
        super(name, age, home, speciality);
    }

    public final void goToWork() {
        System.out.println("Father goes to work on foot!!!" + " \ n----------------");
    }

    @Override
    public String getInfo() {
        return super.getInfo();
        
    }


}


