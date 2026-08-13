package features.oop.sub;

import features.oop.sup.PersonDTO;

public class StudentDTO  extends PersonDTO{

    private String ssn;

    public StudentDTO(){

    }

    public StudentDTO(String name, int age, String address, String ssn) {
        super(name, age, address);

        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }
    
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String personInfo() {
        // super를 this라고 써도 상관은 없지만 무한루프에 빠질 수 있음
        return super.personInfo() + ", ssn = " + ssn;
    }
}
