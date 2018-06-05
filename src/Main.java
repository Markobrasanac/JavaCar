
import loops.Loops;
import person.Person;
import person.Student;
import person.Teacher;

public class Main {

    public static void main(String[] args) {

////        Car myCar = new Car();
////        myCar.printMainAttributes();
//        Car companyCar = new Car(150, 30, 2000, false, "EFG-456", 'B', 3500, 60000);
//        companyCar.changeModel("Fiat");
//        companyCar.ChangeMaxFuel(150);
//        companyCar.fuelUp();
//        companyCar.changeConsumption(10);
//
//        companyCar.printMainAttributes();
//        companyCar.travel(10);
//        companyCar.printMainAttributes();
//
//        Car audi = new Car();
//        audi.changeModel("Audi");
//        audi.fuelUp();
//
//        audi.printMainAttributes();
//        audi.travel(3);
//        audi.printMainAttributes();
//        audi.travel(3);
//        audi.printMainAttributes();
//
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//        audi.getIn();
//        audi.printMainAttributes();
//
//        audi.getOut();
//        audi.printMainAttributes();
//        audi.getOut();
//        audi.printMainAttributes();
//        audi.getOut();
//        audi.printMainAttributes();
//        audi.getOut();
//        audi.printMainAttributes();
//        audi.getOut();
//        audi.printMainAttributes();
////        audi.getOut();
////        audi.printMainAttributes();
//        audi.getOut();
//        audi.printMainAttributes();
//
//        audi.getIn(2);
//        audi.getIn(2);
//        audi.getIn(1);
//        audi.getIn(2);
//
//        audi.getOut(2);
//        audi.getOut(2);
//        audi.getOut(1);
//       Loops testLoop = new Loops();
//        Loops.testWhileLoop();
//        Loops.testDoWhileLoop();
//        Loops.testForLoop();
        Person p1 = new Person();
        p1.showData();

        p1.setName("Marko");
        p1.setSurname("Markovic");
        p1.setJmbg("544545599");

        Person p2 = new Person("Petar", "Petrovic", "1226555456");
        p2.showData();

        Student studentJovan = new Student("Jovan", "Jovanovic", "6465656");
        studentJovan.showData();
        
        Student studentMarija = new Student ("Marija","Maricic","3545555","oas-123",2);
        studentMarija.showData();
  
        
        
        Teacher teacherMilomir = new Teacher ("Milomir", "Dragovic","666464", "QA",4);
        teacherMilomir.showData();
    }

}
