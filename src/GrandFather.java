public class GrandFather {
    private String name;
    private int age;
    private Home home;
    private SpecialityEnum speciality;

    public GrandFather(String name,int age,Home home,SpecialityEnum speciality) {
         this.name=name;
         this.name=age;
         this.name=home;
         this,speciality=speciality;

    }
    public String getName() {
        return name;

    }
    public String getAge() {
        return name;

    }
    public SpecialityEnum getSpeciality(){
        return speciality;

    }
    public String getInfo(){
        return "Name:"+name+"\nAge:"+age+"\Home address:"+home.getAddress()+"\nSpeciality:"+speciality;

    }
}
