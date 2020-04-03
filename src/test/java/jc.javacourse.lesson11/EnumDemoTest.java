package jc.javacourse.lesson11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnumDemoTest {

  @Test
  public void demoEnum() {
    LoggingLevel [] loggingLevelList = LoggingLevel.values();

    for (int i = 1; i<=3; i++) {
      LoggingLevel currentLoggingLevel = loggingLevelList[i-1];
      System.out.println("current LoggingLevel is:" + currentLoggingLevel);
      assertEquals(i, currentLoggingLevel.code());
    }
  }

  @Test
  public void demoEnumWithDifferentArrayAssigned() {
    LoggingLevel [] loggingLevelList = { LoggingLevel.PENDING, LoggingLevel.PROCESSED, LoggingLevel.PROCESSING };

    for (int i = 1; i<=3; i++) {
      LoggingLevel currentLoggingLevel = loggingLevelList[i-1];
      System.out.println("current LoggingLevel is:" + currentLoggingLevel);
      assertEquals(i, currentLoggingLevel.code());
    }
  }
}