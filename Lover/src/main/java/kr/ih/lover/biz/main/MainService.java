package kr.ih.lover.biz.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {
    
    /**
     * 생성자
     */
    public MainService() {
        // Default constructor
    }
    
    /**
     * MainDao
     */
    @Autowired
    private MainDao mainDao;
    
}
