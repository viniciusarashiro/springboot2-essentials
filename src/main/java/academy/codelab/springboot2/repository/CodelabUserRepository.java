package academy.codelab.springboot2.repository;

import academy.codelab.springboot2.domain.Anime;
import academy.codelab.springboot2.domain.CodelabUser;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CodelabUserRepository extends JpaRepository<CodelabUser, Long> {

    CodelabUser findByUsername(String username);
}