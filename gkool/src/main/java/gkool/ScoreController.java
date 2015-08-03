package gkool;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ScoreController {
 
    @Autowired
    private ScoreDAO scoreSheetDao;
    
    @Autowired
    private ScoreSheet scoreSheet;
 
    @RequestMapping(value="/guest")
    public ModelAndView guestbook(HttpServletRequest request) {
        // Handle a new guest (if any):
        String name = request.getParameter("name");
        scoreSheet.setTestName("Normal"); 
        
        if (name != null)
        	scoreSheetDao.persist(scoreSheet);
 
        // Prepare the result view (guest.jsp):
        return new ModelAndView("guest.jsp", "scoreSheetDao", scoreSheetDao);
    }
}