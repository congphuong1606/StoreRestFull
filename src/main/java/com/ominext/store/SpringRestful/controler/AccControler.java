package com.ominext.store.SpringRestful.controler;

import com.ominext.store.SpringRestful.entity.Acc;
import com.ominext.store.SpringRestful.repository.AccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("accs")
public class AccControler {
    @Autowired
    private AccRepository accRepository;


    @RequestMapping(path = "/add",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public Acc addNewUser (@RequestBody Acc acc) {
            accRepository.save(acc);
            return acc;

    }
    @RequestMapping(path="/all",method = RequestMethod.GET)
    public @ResponseBody Iterable<Acc> getAllAccs() {
        return accRepository.findAll();
    }


//    @Autowired
//    private IAccService accService;
//    @GetMapping("accs/{accId}")
//    public ResponseEntity<TblAcc> getAccById(@PathVariable("accId") Long accId) {
//        TblAcc article = accService.getAccById(accId);
//        return new ResponseEntity<TblAcc>(article, HttpStatus.OK);
//    }
//
//    @GetMapping("accs")
//    public ResponseEntity<List<TblAcc>> getAllArticles() {
//        List<TblAcc> list = accService.getAllAcc();
//        return new ResponseEntity<List<TblAcc>>(list, HttpStatus.OK);
//    }
//    @PostMapping("accs")
//    public ResponseEntity<Void> addAcc(@RequestBody TblAcc acc, UriComponentsBuilder builder) {
//        boolean flag = accService.addAcc(acc);
//        if (flag == false) {
//            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
//        }
//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(builder.path("/accs/{id}").buildAndExpand(acc.getAccId()).toUri());
//        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
//    }
//    @PutMapping("accs")
//    public ResponseEntity<TblAcc> updateArticle(@RequestBody TblAcc acc) {
//        accService.updateAcc(acc);
//        return new ResponseEntity<TblAcc>(acc, HttpStatus.OK);
//    }
//    @DeleteMapping("accs/{accId}")
//    public ResponseEntity<Void> deleteArticle(@PathVariable("accId") Long accId) {
//        accService.deleteAcc(accId);
//        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//    }
}
