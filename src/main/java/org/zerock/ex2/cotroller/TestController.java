package org.zerock.ex2.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.zerock.ex2.MemoRepository;
import org.zerock.ex2.entity.Memo;

import java.util.List;
import java.util.Optional;

@Controller
public class TestController {
    @Autowired
    private MemoRepository memoRepository;

    @GetMapping("/test")
    public String test(Model model) {
        List<Memo> result = memoRepository.findAll();
        model.addAttribute("list", result);
        return "test";
    }

    @GetMapping("/test/{mno}")
    public String test1(Model model, @PathVariable Long mno) {
        Optional<Memo> result = memoRepository.findById(mno);
        model.addAttribute("memo", result);
        return "test1";
    }

//    @public void testPageDefault() {
//        Pageable pageable = PageRequest.of(page:0, size:10);
//    }
}
