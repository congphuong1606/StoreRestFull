package com.ominext.store.SpringRestful.repository;

import com.ominext.store.SpringRestful.entity.Acc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccRepository extends CrudRepository<Acc, Long> {
//    @Query("select u from Acc u where u.accName = ?1")
//    Acc findByAccName(String accName);
//
//    @Modifying
//    @Query("delete from Acc u where u.accId = ?1")
//    void deleteAccByAccId(long accId);
}
