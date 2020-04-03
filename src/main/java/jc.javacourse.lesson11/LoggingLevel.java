package jc.javacourse.lesson11;

public enum LoggingLevel {
  PENDING(1), PROCESSED(2), PROCESSING(3);

  int i;

  LoggingLevel(int i) {
    this.i = i;
  }

  int code() {
    return this.i;
  }
}
