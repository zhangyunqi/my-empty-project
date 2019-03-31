package com.zyq.myemptyproject.common.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 扩展自己的JPA
 * 逻辑删除，统一更新is_delete字段为1,实体字段deleted
 * @param <T>
 * @param <ID>
 */
public interface BaseRepository<T,ID> extends JpaRepository<T, ID> {
    /**
     * 逻辑删除
     * @param id
     */
    @Query(value = "update #{#entityName} t set t.id = ?1")
    void deleteByIdOfLogic(ID id);

}
