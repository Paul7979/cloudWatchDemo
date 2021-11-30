package at.technikum.cloudWatchDemo.service;


import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class TimeService {


  private static final DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

  public String getNowFormatted() {
    return formatter.format(OffsetDateTime.now());
  }
}
