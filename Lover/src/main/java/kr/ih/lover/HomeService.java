package kr.ih.lover;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ih.lover.biz.vo.BuildingVO;

@Service
public class HomeService {
    
    /**
     * 생성자
     */
    public HomeService() {
        // Default constructor
    }
    
    /**
     * HomeDao
     */
    @Autowired
    private HomeDao homeDao;
    
    
    public int SearchUsrSeq() {
        return homeDao.selectUsrSeq();
    }

    /**
     * 빌딩 목록 조회 
     */
    public List<BuildingVO> SearchBuildingList() {
        return homeDao.selectBuildingList();
    }

    public int createBuilding(Map<String, Object> pMap) {
        return homeDao.insertBuilding(pMap);
        
    }

    public int removeBuilding(String check) {
        return homeDao.deleteBuilding(check);
    }
}
