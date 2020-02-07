package com.feilong.mvcstu.repository;

import com.feilong.mvcstu.dao.UserDao;
import com.feilong.mvcstu.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByAgeAfter(int age);

    @Query(value = "select new com.feilong.mvcstu.dao.UserDao(p.name, p.age, c.companyName, s.name)" +
            "from Person p left join Company c on p.companyId=c.id " +
            "left join School s on p.schoolId=s.id " +
            "where p.id=:personId")
    UserDao getPersonInformation(@Param("personId") Long personId);
}
