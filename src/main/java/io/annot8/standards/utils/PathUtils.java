package io.annot8.standards.utils;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PathUtils {

  // TODO: Decide on the separator we want
  public static final String SEPARATOR = ".";
  private static final Pattern SPLITTER = Pattern.compile(Pattern.quote(SEPARATOR));

  private PathUtils() {
    // Singleton
  }

  public static String join(String... path) {
    return join(Arrays.asList(path));

  }

  public static String join(Stream<String> path) {
    // TODO: Perhaps we should remove all the separators from the Strings? Trim, filter null, etc.
    return path.collect(Collectors.joining(SEPARATOR));
  }

  public static String join(List<String> path) {
    return join(path.stream());
  }

  public static String prefix(String prefix, String path) {
    return prefix + SEPARATOR + path;
  }

  public static String prefix(String prefix, Stream<String> path) {
    return prefix(prefix, join(path));
  }

  public static Stream<String> spilt(String path) {
    return SPLITTER.splitAsStream(path);
  }
}
