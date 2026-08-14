import features.oop.service.OopService;
import features.oop.sub.ManagerDTO;
import features.oop.sub.StudentDTO;
import features.oop.sub.TeacherDTO;
import features.oop.sup.PersonDTO;
import features.oop.util.Flag;

public class OopApp {

    public static void main(String[] args) {

        // StudentDTO stu = new StudentDTO();
        // stu.setSsn("2026");
        // stu.setName(null);
        // stu.setAge(0);
        // stu.setAddress(null);

        StudentDTO stu = new StudentDTO("나유성", 25, "서울", "2026");
        System.out.println(stu.getName());
        System.out.println(stu.getAge());
        System.out.println(stu.getAddress());
        System.out.println(stu.getSsn());

        System.out.println();
        System.out.println("debug >>> TeacherDTO");

        // Q1번) TeacherDTO도 PersonDTO 상속받고 StudentDTO 객체생성처럼 구현
        // 퀴즈 1번에 대한 내코드
        TeacherDTO tea = new TeacherDTO("나유성", 40, "서울", "JAVA");
        System.out.println(tea.getName());
        System.out.println(tea.getAge());
        System.out.println(tea.getAddress());
        System.out.println(tea.getSubject());

        System.out.println();
        System.out.println("debug >>> 변수타입의 다형성");

        // Q2번) getDept에 접근할 수 있는 방법은?
        // ((ManagerDTO)manager).getDept() 이런식으로 하면 자식에 대한 접근은 가능
        // casting이 참조타입에 적용될 수 있음(다만, 상속관계를 전제로)
        PersonDTO manager = new ManagerDTO("김혜림", 20, "서울", "교육사무국");
        System.out.println(((ManagerDTO) manager).getDept());

        System.out.println();
        System.out.println("debug >>> 변수타입의 다형성을 활용 : 배열");

        PersonDTO[] ary = new PersonDTO[3];
        ary[0] = new TeacherDTO("임정섭", 45, "서울", "react");
        ary[1] = new ManagerDTO("김해림", 30, "서울", "교육팀");
        ary[2] = new StudentDTO("나유성", 25, "서울", "2026");

        PersonDTO per01 = ary[0];
        System.out.println(per01.getName());
        System.out.println(per01.getAge());
        System.out.println(per01.getAddress());
        System.out.println(((TeacherDTO) per01).getSubject());

        System.out.println();

        // for (int idx = 0; idx < ary.length; idx++) {
        // PersonDTO per = ary[idx];
        // if(per instanceof TeacherDTO){

        // }else if(per instanceof ManagerDTO){

        // }else{

        // }

        // if (per instanceof TeacherDTO) {
        // System.out.println(((TeacherDTO) per).getSubject());
        // }
        // if (per instanceof ManagerDTO) {
        // System.out.println(((ManagerDTO) per).getDept());
        // }
        // if (per instanceof StudentDTO) {
        // System.out.println(((StudentDTO) per).getSsn());
        // }
        // }

        for (int idx = 0; idx < ary.length; idx++) {
            PersonDTO per = ary[idx];
            System.out.println(per.personInfo());
        }

        // 8월 14일 실습 코드 시작
        System.out.println();
        System.out.println();
        System.out.println("debug >>>> 매개변수의 다형성");
        System.out.println();

        OopService service = new OopService();
        // service.setAry(stu);
        // service.setAry(tea);
        // service.setAry(manager);

        service.makePerson(Flag.STUDENT, "나유성", 25, "서울", "2026");
        service.makePerson(Flag.TEACHER, "임정섭", 40, "서울", "java");
        service.makePerson(Flag.MANAGER, "김혜림", 30, "서울", "교육팀");

        System.out.println();
        System.out.println("debug >>>> 정보출력");
        PersonDTO[] result = service.getAry();
        for (PersonDTO person : result) {
            if (person == null) {
                break;
            }
            System.out.println(person.personInfo());
        }

        System.out.println();
        System.out.println("debug >>>> findPerson");
        PersonDTO find = service.findPerson("임정섭");
        if(find != null){
            System.out.println(find.personInfo());
        }else{
            System.out.println(">>>> Not Found!");
        }
    }
}
