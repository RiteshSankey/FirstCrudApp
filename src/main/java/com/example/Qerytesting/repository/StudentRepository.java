package com.example.Qerytesting.repository;

import com.example.Qerytesting.model.Student;
import com.example.Qerytesting.service.StudentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    //@Query(value="select * from querytest.student ",nativeQuery = true)
    // public List<Student> getAllStudent();

    /// @Query(value="select * from querytest.student where id=:Id",nativeQuery = true)
    /// public List<Student> findByName(@Param("Id") Long id);

    //@Query(value="select * from querytest.student where id=:Id or name=:Name",nativeQuery = true)
    ///public List<Student> findByName(@Param("Id")Long id,@Param("Name") String name);

    ///@Query(value="select * from querytest.student where id=:Id and name=:Name",nativeQuery = true)
    ////public List<Student> findByName(@Param("Id")Long id,@Param("Name") String name);

    //////////  @Transactional
    ////////////   @Modifying
    /////////////////@Query(value = "update querytest.student Set name=:Name where id=:Id",nativeQuery = true)
    //////////////////void updateStud(@Param("Id") Long id);


    @Transactional
    @Modifying
    @Query(value = "DELETE from querytest.student where id=:Id", nativeQuery = true)
    void deleteStud(@Param("Id") Long id);


}
