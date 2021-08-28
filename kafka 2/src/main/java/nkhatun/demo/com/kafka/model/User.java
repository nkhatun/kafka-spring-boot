package nkhatun.demo.com.kafka.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User  {
    private String fname;
    private String lname;
}
