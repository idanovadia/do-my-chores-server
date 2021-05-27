package com.domychoresserver.domychoresserver.Controllers;

import com.domychoresserver.domychoresserver.Enteties.JobService;
import com.domychoresserver.domychoresserver.Services.JobServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@RequestMapping("/JobService")
public class ServicesController {

    JobServiceService jobServiceService;

    @Autowired
    public ServicesController(JobServiceService jobServiceService) {
        this.jobServiceService = jobServiceService;
    }

    @RequestMapping(value = "/all", produces = "application/json; charset=UTF-8", method = GET)
    @ResponseBody
    public ResponseEntity<?> getCustomers() {
        try {
            return new ResponseEntity<>(this.jobServiceService.allJobServices(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("An error has occurred", HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/addOne", consumes = "application/json", method = POST)
    @ResponseBody
    public ResponseEntity<?> addJobService(@RequestBody JobService jobService) {
        try {
            return new ResponseEntity<>(this.jobServiceService.addJobService(jobService), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("An error has occurred", HttpStatus.BAD_REQUEST);
        }
    }
}
