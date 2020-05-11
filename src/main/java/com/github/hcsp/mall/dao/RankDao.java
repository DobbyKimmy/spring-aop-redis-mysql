package com.github.hcsp.mall.dao;

import com.github.hcsp.mall.entity.RankItem;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankDao {
    private final SqlSession sqlSession;

    public RankDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<RankItem> getRankItems() {
        return sqlSession.selectList("MyMapper.selectRanks");
    }
}