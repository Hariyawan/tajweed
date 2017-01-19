package com.quran.tajweed.model;

public enum ResultType {
  GHUNNA("Ghunna", "43A047"),
  IDGHAM_NOT_PRONOUNCED("Idgham, not pronounced", "EEEEEE"),     // gray
  IDGHAM_WITH_GHUNNA("Idgham with Ghunna", "43A047"),            // light green
  IDGHAM_WITHOUT_GHUNNA("Idgham without Ghunna", "EEEEEE"),      // gray
  IQLAB_NOT_PRONOUNCED("Iqlab, not pronounced", "EEEEEE"),       // gray
  IQLAB("Iqlab", "43A047"),                                      // light green
  QALQALAH("Qalqalah", "0091EA"),                                // light blue
  MEEM_IDGHAM("Meem Idgham", "43A047"),                          // light green
  MEEM_IKHFA("Meem Ikhfa", "EACE00"),                            // yellow
  IKHFA("Ikhfa", "EACE00"),                                      // yellow
  MAAD_SUKOON("Maad as a result of Sukoon", "FB8C00"),           // orange
  MAAD_MUNFASSIL_MUTASSIL("Maad Munfasil/Muttasil", "F44336"),   // red
  MAAD_SILA_SUGHRA("Maad Sila Sughra", "FFE0B2"),                // light orange
  MAAD_LONG("Maad Set Harakat", "B71C1C");                       // dark red

  public final String color;
  public final String debugName;

  ResultType(String debugName, String color) {
    this.debugName = debugName;
    this.color = color;
  }
}
