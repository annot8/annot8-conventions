package io.annot8.standards.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.annot8.core.exceptions.Annot8RuntimeException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class PathUtilsTest {

  @Test
  void joinNull() {
    assertThrows(NullPointerException.class, () -> PathUtils.join((Stream<String>) null));

    assertThrows(NullPointerException.class, () -> PathUtils.join((List<String>) null));

    assertThrows(NullPointerException.class, () -> PathUtils.join((String) null));

  }

  @Test
  void join() {
    assertEquals("a.b.c", PathUtils.join("a", "b", "c"));
    assertEquals("B.A", PathUtils.join(Arrays.asList("B", "A")));
    assertEquals("1.2", PathUtils.join(Stream.of("1", "2")));

  }

  @Test
  void prefix() {
    assertEquals("hello.a.b.c", PathUtils.prefix("hello", "a.b.c"));
    assertEquals("s.3.2", PathUtils.prefix("s", Stream.of("3", "2")));

  }

  @Test
  void invalidJoin() {
    assertThrows(Annot8RuntimeException.class, () -> PathUtils.prefix("hello", ".a.b.c"));
    assertThrows(Annot8RuntimeException.class, () -> PathUtils.join("a", ".", "c"));
    assertThrows(Annot8RuntimeException.class, () -> PathUtils.join(Stream.of()));
  }

  @Test
  void spilt() {
    List<String> spilt = PathUtils.spilt("ab.b.c").collect(Collectors.toList());
    assertEquals(3, spilt.size());
    assertEquals("ab", spilt.get(0));
    assertEquals("b", spilt.get(1));
    assertEquals("c", spilt.get(2));
  }

  @Test
  void invalidSpilt() {
    assertThrows(Annot8RuntimeException.class, () -> PathUtils.spilt("ab..b.c"));
    assertThrows(Annot8RuntimeException.class, () -> PathUtils.spilt(""));
  }

}