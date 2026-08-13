package features.blogs.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BlogResponseDTO {

    private int status;
    private String message;

    // public BlogResponseDTO() {
    // }

    // public BlogResponseDTO(int status, String message) {
    //     this.status = status;
    //     this.message = message;
    // }

    // public int getStatus() {
    //     return status;
    // }

    // public void setStatus(int status) {
    //     this.status = status;
    // }

    // public String getMessage() {
    //     return message;
    // }

    // public void setMessage(String message) {
    //     this.message = message;
    // }
}
