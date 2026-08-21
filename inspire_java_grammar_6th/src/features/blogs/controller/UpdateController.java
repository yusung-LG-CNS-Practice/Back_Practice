package features.blogs.controller;

import features.blogs.domain.dto.BlogRequestDTO;
import features.blogs.service.BlogReactService;

public class UpdateController {

    private BlogReactService service;

    public UpdateController() {

    }

    public UpdateController(BlogReactService service) {
        this.service = service;
    }

    // 여러 파라미터를 객체로 바인딩하고 데이터의 유효성을 체크하는 역할이 필요함!!
    public int update(int blogId, String title, String content) {
        System.out.println("debug >>>> insert controller insert params : "+ blogId + "\t" + title + "\t" + content);

        return service.update(BlogRequestDTO.builder().blogId(blogId).title(title).content(content).build());
    }
}
