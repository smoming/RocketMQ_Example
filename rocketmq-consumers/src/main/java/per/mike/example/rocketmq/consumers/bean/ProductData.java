package per.mike.example.rocketmq.consumers.bean;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductData implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private BigDecimal amt;

}
