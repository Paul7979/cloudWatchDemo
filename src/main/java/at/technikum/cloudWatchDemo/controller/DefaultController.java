package at.technikum.cloudWatchDemo.controller;

import at.technikum.cloudWatchDemo.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

  private final TimeService timeService;

  public DefaultController(TimeService timeService) {
    this.timeService = timeService;
  }

  @GetMapping("/time")
  public String getTime() {
    return timeService.getNowFormatted();
  }

}
