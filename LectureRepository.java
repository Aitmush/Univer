package com.company.srs.repositories;

import com.company.srs.lessons.Lecture;
import org.springframework.data.repository.CrudRepository;

public interface LectureRepository extends CrudRepository<Lecture, Long> { //уже созданный интерфейс,
                                                                           //чтобы функции управления таблицей

}
