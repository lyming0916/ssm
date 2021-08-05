package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.security.util.Password;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ren {
    private String Id;
    private String Password;
}
