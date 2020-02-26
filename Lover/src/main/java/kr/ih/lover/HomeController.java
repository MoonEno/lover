package kr.ih.lover;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ih.lover.biz.vo.BuildingVO;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    // 파일 저장 위치
    static final String FILE_PATH = "C:/thumb";

    @Autowired
    public HomeService homeService;

    /**
     * main 화면
     * 
     * @param model
     * @return
     */
    @RequestMapping(value = "/intro", method = RequestMethod.GET)
    public ModelAndView intro(@RequestParam(value="savePostMsg", defaultValue="") String savePostMsg) {
    	
        ModelAndView mav = new ModelAndView();
        mav.setViewName("main");
        return mav;
    }

    @RequestMapping(value = "/location", method = RequestMethod.GET)
    public ModelAndView location() {
    	 ModelAndView mav = new ModelAndView();
    	 List<BuildingVO> rList = homeService.SearchBuildingList();
    	 
        mav.addObject("buildingList", rList);
        mav.addObject("buildingListCount", rList.size());
        return mav;
    }


    /**
     * 로그아웃
     *
     * @param session 세션
     * @return 로그인 화면
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/intro";
    }

    //////////////////////////////////// json ////////////////////////////////////
    /**
     * building 목록 조회
     * 
     * @return jsonView
     */
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    public ModelAndView list() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("jsonView");

        List<BuildingVO> rList = homeService.SearchBuildingList();

        if (rList != null && !rList.isEmpty()) {
            mav.addObject("isSuccess", true);
            mav.addObject("list", rList);
        } else {
            mav.addObject("isSuccess", false);
            mav.addObject("msg", "로그인 실패");
        }

        return mav;
    }

    /**
     * 로그인
     *
     * @param jsonMap - 요청 정보
     * @param session - 세션 정보
     * @return 요청 결과
     */
    @RequestMapping(value = "/login.json", method = RequestMethod.POST)
    public ModelAndView searchSessManager(@RequestBody Map<String, Object> pMap, HttpSession session) {
        logger.info("pMap : {}", pMap);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("jsonView");

        String mngId = (String) pMap.get("mngId");
        String mngPwd = (String) pMap.get("mngPwd");
        if (mngId.equals("admin") && mngPwd.equals("admin")) {
            session.setAttribute("sessionYn", "Y");
            mav.addObject("isSuccess", true);
        } else {
            mav.addObject("isSuccess", false);
            mav.addObject("msg", "로그인 실패");
        }
        return mav;
    }

    /**
     * 파일 이름 반환
     * 
     * @return yyyyMMddHHmmssS + 난수 6자리
     */
    public static String getFileName() {
        StringBuffer sb = new StringBuffer();

        // yyyyMMddHHmmssS
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssS");
        Date current = new Date();

        return sb.append(formatter.format(current)).append(String.format("%06d", new Random().nextInt(1000000)))
                .toString();
    }

}
