package org.wisdom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wisdom.entity.TransactionIndexEntity;

import java.util.List;

public interface TransactionIndexDao extends JpaRepository<TransactionIndexEntity, byte[]> {

    List<TransactionIndexEntity> findByBlockHash(byte[] blockHash);

}