package xyz.utkarshgoyal.schoolservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.utkarshgoyal.schoolservice.entity.School;

public interface SchoolRepo extends JpaRepository<School, Long> {

}
