package features.blogs.controller;

import java.util.List;

import features.blogs.domain.dto.BlogResponseDTO;
import features.blogs.service.BlogReactService;
import features.blogs.util.ResponseEntity;

// 8월 19일 실습 코드
public class ListController {

    private BlogReactService service;

    public ListController(){

    }

    public ListController(BlogReactService service){
        this.service = service;
    }

    // view에게 응답하는 역할의 메서드
    public ResponseEntity<List<BlogResponseDTO>> list(){
        System.out.println("debug >>>> list controller list()");
        return new ResponseEntity<List<BlogResponseDTO>>(200, "ok", service.list());
    }
}
