public  final class Son extends Father {
    private String bike;

    public Son(String name, int age, Home home, SpecialityEnum speciality);

    {
        super(name,age,home,speciality);
    }

  @Override
public String getTowork(String bike);{
        return super.getInfo();

        }
        @Override
           public void goTowork(String bike){
            System.out.println("Son goes to work with his:"+bike+"\n----------------------");

        }

}

















