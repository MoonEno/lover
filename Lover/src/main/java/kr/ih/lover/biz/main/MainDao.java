package kr.ih.lover.biz.main;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MainDao {

    /**
     * 생성자
     */
    public MainDao() {
        // Default Constructor
    }
    
    /**
     * sqlSession
     */
    @Autowired
    private SqlSession sqlSession;
    
    
}
