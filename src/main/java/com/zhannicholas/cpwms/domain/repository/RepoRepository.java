package com.zhannicholas.cpwms.domain.repository;

import com.zhannicholas.cpwms.domain.model.Respository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoRepository extends JpaRepository<Respository, Integer> {
    /**
     * 根据 repoId 查找 repository
     * @param repoId    仓库id
     * @return  具有 repoId 的仓库
     */
    Respository findByRepoId(int repoId);

    /**
     * 根据 repoAddress 查询仓库---模糊查询
     * @param repoAddress   仓库地址
     * @return  具有 repoAddress 子串的地址对应的所有仓库
     */
    List<Respository> findByRepoAddressContaining(String repoAddress);
}