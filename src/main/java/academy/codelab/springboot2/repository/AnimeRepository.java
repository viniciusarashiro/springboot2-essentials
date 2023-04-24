package academy.codelab.springboot2.repository;

import academy.codelab.springboot2.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
