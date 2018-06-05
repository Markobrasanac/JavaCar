package person;

public class Teacher extends Person {

    private String mainSubject;
    private int expiriance;

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public int getExpiriance() {
        return expiriance;
    }

    public void setExpiriance(int expiriance) {
        this.expiriance = expiriance;

    }

    public Teacher(String name, String surname, String jmbg) {

        super(name, surname, jmbg);
    }

    public Teacher(String name, String surname, String jmbg, String mainSubject, int expiriance) {
        super(name, surname, jmbg);
        
        this.mainSubject =  mainSubject;
        this.expiriance =  expiriance;
    }
    
      @Override
    public void showData() {

        System.out.println("Main subject is:" + getMainSubject());
        System.out.println("Epiriance is:" + getExpiriance());
        super.showData();
}
}