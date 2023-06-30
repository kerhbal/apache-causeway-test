package domainapp.modules.simple.dom.so;

import java.util.List;

import domainapp.modules.simple.dto.SimpleDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SimpleObjectRepository extends JpaRepository<SimpleObject, Long> {

    List<SimpleObject> findByNameContaining(final String name);

    SimpleObject findByName(final String name);

    @Query("SELECT new domainapp.modules.simple.dto.SimpleDto(so.id, so.name) FROM SimpleObject so")
    List<SimpleDto> findAllDto();

}
