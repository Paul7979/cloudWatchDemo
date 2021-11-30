package at.technikum.cloudWatchDemo;

import at.technikum.cloudWatchDemo.service.TimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CloudWatchDemoApplicationTest {

  @Autowired
  TimeService timeService;
  @Test
  void testTime() {

    var time = timeService.getNowFormatted();
    assertNotNull(time);
    assertTrue(time.length() > 0);

  }




}