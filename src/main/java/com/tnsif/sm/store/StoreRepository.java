package com.tnsif.sm.store;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StoreRepository extends JpaRepository<Store,Integer> {

}
