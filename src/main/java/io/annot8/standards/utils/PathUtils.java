package io.annot8.standards.utils;

import io.annot8.core.exceptions.Annot8RuntimeException;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Helper functions for building key paths for properties, roles, types, etc.
 *
 * The implementation is very strict checking for nulls, etc so that errors are caught early by the
 * buggy caller not in a later (correctly implemented) processor.
 */
public final class PathUtils {

  // TODO: Decide on the separator we want
  public static final String SEPARATOR = ".";
  private static final Pattern SPLITTER = Pattern.compile(Pattern.quote(SEPARATOR));

  private PathUtils() {
    // Singleton
  }

  /**
   * Join to form a path
   */
  public static String join(String... path) {
    return join(Stream.of(path));
  }

  /**
   * Join to form a path
   */
  public static String join(Stream<String> path) {
    // TODO: Perhaps we should remove all the separators from the Strings and/or trim?.
    String joined = path
        // Strictly check this is non null to catch errors early
        .peek(Objects::requireNonNull)
        .collect(Collectors.joining(SEPARATOR));

    checkValid(joined);

    return joined;
  }

  /**
   * Join to form a path.
   *
   * This takes list rather than collection to emphasis the ordering.
   */
  public static String join(List<String> path) {
    return join(path.stream());
  }

  /**
   * Add a prefix to the path
   */
  public static String prefix(String prefix, String path) {
    assert prefix != null;
    assert !prefix.isEmpty();
    assert path != null;
    String joined = prefix + SEPARATOR + path;
    checkValid(joined);
    return joined;
  }

  /**
   * Add a prefix to the path
   */
  public static String prefix(String prefix, Stream<String> path) {
    return prefix(prefix, join(path));
  }

  /**
   * Add a prefix to the path
   */
  public static String prefix(String prefix, List<String> path) {
    return prefix(prefix, join(path));
  }

  /**
   * Divide a path into its segments.
   */
  public static Stream<String> spilt(String path) {
    assert path != null;
    checkValid(path);
    return SPLITTER.splitAsStream(path);
  }

  /**
   * Check a path is valid.
   *
   * You may use this (it is public) it is also used internally to this class.
   */
  public static void checkValid(String path) {
    // TODO ban whitespace too? Probably sensible
    if (path == null || path.isEmpty() || path.contains(SEPARATOR + SEPARATOR)) {
      throw new Annot8RuntimeException("Invalid path: " + path);
    }
  }
}
