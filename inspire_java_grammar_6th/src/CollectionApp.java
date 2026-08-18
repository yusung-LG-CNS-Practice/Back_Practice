import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import features.oop.sub.ManagerDTO;
import features.oop.sub.StudentDTO;
import features.oop.sub.TeacherDTO;
import features.oop.sup.PersonDTO;

// 8월 18일 실습 코드
public class CollectionApp {

    /*
     * Collection API(- java.util.*)
     * - List(중복허용, 순서존재, 요소의 타입으로 객체만, 가변길이)
     * - Set(중복허용 x, 순서존재 x, 요소의 타입으로 객체만, 가변길이)
     * - Map({key : value}, {key : value}, ....)
     * 
     * Wrapper Class(Primitive type -> reference type, reperence type <- primitive
     * type)
     * - int -> Integer
     * - char -> Character
     * 
     * Generics(파라미터 타입)
     * T - type
     * E - elements(collection 컴파일시점의 타입의 안정성, 불필요한 캐스팅 지양)
     * k - key
     * V - value
     * N - number
     */

    public static void main(String[] args) {

        System.out.println("debug >>>> array");
        int[] intAry = { 1, 2, 3, 4, 5 };
        System.out.println(intAry.length);
        System.out.println(Arrays.toString(intAry));

        System.out.println();
        System.out.println("debug >>> Collection API - List");
        List<String> list = new ArrayList<>();
        list.add("String");

        // generic 문법에 의한 error
        // list.add(10);
        // 옛날 방법 -> list.add(new Integer(10));
        // list.add(true);

        System.out.println("debug >>> list " + list.size());
        System.out.println("debug >>> list " + list);

        for (int idx = 0; idx < list.size(); idx++) {
            String data = list.get(idx);
            System.out.println(data);
        }

        System.out.println();
        System.out.println("debug >>> ArrayList Element xxxxDTO");

        List<PersonDTO> personList = new ArrayList<PersonDTO>();

        StudentDTO student = StudentDTO.builder().name("inspire").build();
        TeacherDTO teacher = TeacherDTO.builder().name("jslim").build();
        ManagerDTO manger = ManagerDTO.builder().name("lgcns").build();

        personList.add(student);
        personList.add(teacher);
        personList.add(manger);

        // 명령형 처리
        // List<String> filteringList = new ArrayList<String>();

        // for (int idx = 0; idx < personList.size(); idx++) {
        // PersonDTO person = personList.get(idx);
        // if (person.getName().startsWith("j")) {
        // filteringList.add(person.getName().toUpperCase());
        // // System.out.println(person.personInfo());
        // }
        // }

        // List<PersonDTO> filteringList = new ArrayList<PersonDTO>();

        // for (int idx = 0; idx < personList.size(); idx++) {
        // PersonDTO person = personList.get(idx);
        // if (person.getName().startsWith("j")) {
        // filteringList.add(person);
        // // System.out.println(person.personInfo());
        // }
        // }

        // Stream API (선언적 처리)
        // 컬렉션을 Stream 객체로 바인딩하고 - 중간연산(0~N) - 연산결과를 최종연산(1개의 연산)
        // System.out::println
        // s -> s.startsWith()
        // List<String> filteringList = personList.stream()
        //         .filter(s -> s.getName().startsWith("j"))
        //         .map(s -> s.getName().toUpperCase())
        //         // .map(s -> getName()::toUpperCase())
        //         .collect(Collectors.toList());

        // System.out.println(filteringList);

        personList.stream().filter(person -> person.getName().length() > 5).forEach(System.out::println);
    }
}
