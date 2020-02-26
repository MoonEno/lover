package kr.ih.lover;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ih.lover.biz.vo.BuildingVO;

@Repository
public class HomeDao {

    /**
     * 생성자
     */
    public HomeDao() {
        // Default Constructor
    }

    /**
     * sqlSession
     */
    @Autowired
    private SqlSession sqlSession;

    public int selectUsrSeq() {
        return sqlSession.selectOne("user.selectUsrSeq");
    }

    /**
     * 빌딩 목록 조회
     */
    public List<BuildingVO> selectBuildingList() {
        return sqlSession.selectList("building.selectBulidingList");
    }

    public int insertBuilding(Map<String, Object> pMap) {
        // TODO Auto-generated method stub
        return sqlSession.insert("building.insertBuilding", pMap);
    }

    public int deleteBuilding(String check) {
        // TODO Auto-generated method stub
        return sqlSession.delete("building.deleteBuilding", check);
    }
}
