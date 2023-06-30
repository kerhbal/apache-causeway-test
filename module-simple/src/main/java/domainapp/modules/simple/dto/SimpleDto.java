package domainapp.modules.simple.dto;

import lombok.*;
import org.apache.causeway.applib.annotation.DomainObject;
import org.apache.causeway.applib.annotation.Nature;
import org.apache.causeway.applib.annotation.Title;

import javax.inject.Named;
import javax.xml.bind.annotation.*;

@Named("simple.SimpleDto")
@DomainObject(nature = Nature.VIEW_MODEL)
@XmlRootElement(name = "SimpleDto")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        propOrder = {
                "id",
                "name"
        }
)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter @Setter
public class SimpleDto {
    private Long id;

    @Title
    private String name;

    public SimpleDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
