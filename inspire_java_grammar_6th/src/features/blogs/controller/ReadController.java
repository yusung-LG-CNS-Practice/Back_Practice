package features.blogs.controller;

import features.blogs.domain.dto.BlogResponseDTO;
import features.blogs.service.BlogReactService;

public class ReadController {

    /*
     * Q4-3번) BlogService와 의존성 관계를 형성
     */

    // 내가 한 코드
    // private BlogReactService service;

    // public ReadController(BlogReactService service) {
    // this.service = service;
    // }

    // 강사님 한 코드
    private BlogReactService service;

    public ReadController(BlogReactService service) {
        this.service = service;
    }    

    public BlogResponseDTO read(int blogId) {

        // service read()호출해서 반환
        System.out.println("debug >>>> Read Controller read()");

        return service.read(blogId);
    }
}
