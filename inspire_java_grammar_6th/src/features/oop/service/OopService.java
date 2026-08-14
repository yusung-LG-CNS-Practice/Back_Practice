package features.oop.service;

import features.oop.sub.ManagerDTO;
import features.oop.sub.StudentDTO;
import features.oop.sub.TeacherDTO;
import features.oop.sup.PersonDTO;
import features.oop.util.Flag;

// 8월 14일 실습 코드

/*
- 배열을 통한 xxxxxDTO를 관리하고 싶다.
- search, delete, insert, update 요청 처리
*/

public class OopService {

    private PersonDTO[] ary;
    private int idx;

    public OopService() {
        ary = new PersonDTO[10];
        idx = 0;
    }

    // 방법 1
    // public void setTeacher(TeacherDTO tea) {
    // ary[idx++] = tea;
    // }

    // public void setStudent(StudentDTO stu) {
    // ary[idx++] = stu;
    // }

    // public void setManager(ManagerDTO man) {
    // ary[idx++] = man;
    // }

    // 방법 2
    public void setAry(TeacherDTO tea) {
        ary[idx++] = tea;
    }

    public void setAry(StudentDTO stu) {
        ary[idx++] = stu;
    }

    public void setAry(ManagerDTO man) {
        ary[idx++] = man;
    }

    //
    public void setAry(PersonDTO per) {
        ary[idx++] = per;
    }

    // copy (shallow copy, deep copy)
    public PersonDTO[] getAry() {
        return ary;
    }

    /*
     * CRUD
     * params : flag, name, age, address, comm(ssn, subject, dept)
     * flag : 1 -> Student, 2 -> Teacher, 3 -> Manager
     * makePerson() 매개변수로 전달된 값을 가지고 타입에 맞는 객체를 생성하고 배열에 담는 역할
     */
    public void makePerson(Flag flag, String name, int age, String address, String comm) {
        System.out.println("debug >>>> enum flag : " + flag);
        System.out.println("debug >>>> enum flag  getxxx : " + flag.getFalg());

        // switch (flag.getFalg()) {
        // case 1 -> System.out.println("학생");
        // case 2 -> System.out.println("강사");
        // case 3 -> System.out.println("매니저");
        // }
        // switch (flag) {
        // case STUDENT -> System.out.println("학생");
        // case TEACHER -> System.out.println("강사");
        // case MANAGER -> System.out.println("매니저");
        // }

        PersonDTO per = (flag.getFalg() == 1)
                ? StudentDTO.builder()
                        .name(name).age(age).address(address)
                        .ssn(address).build()
                : (flag.getFalg() == 2) ? TeacherDTO.builder()
                        .name(name).age(age).address(address)
                        .subject(comm).build()
                        : ManagerDTO.builder()
                                .name(name).age(age).address(address)
                                .dept(comm).build();
        setAry(per);
    }

    /*
     * params : name
     * method : findPerson
     * return : PersonDTO
     * Q1번) 이름을 전달받아서 일치하는 이름을 가진 PersonDTO를 리턴한다
     */

    // 내가 한 퀴즈 코드
    // public PersonDTO findPerson(String name) {

    //     for (PersonDTO person : ary) {

    //         // 배열의 빈 공간을 만나면 탐색 종료
    //         if (person == null) {
    //             break;
    //         }

    //         // 전달받은 이름과 배열에 저장된 사람의 이름 비교
    //         if (person.getName().equals(name)) {
    //             return person;
    //         }
    //     }

    //     // 일치하는 사람이 없으면 null 반환
    //     return null;
    // }

    // 강사님이 한 퀴즈 코드
    public PersonDTO findPerson(String name){
        return null;
    }
}
