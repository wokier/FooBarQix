package net.story.code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FooBarQixTest {

  @Test
  public void testTranslate() {
    FooBarQix fooBarQix = new FooBarQix();
    assertEquals("1", fooBarQix.translate(1));
    assertEquals("2", fooBarQix.translate(2));
    assertEquals("FooFoo", fooBarQix.translate(3));
    assertEquals("4", fooBarQix.translate(4));
    assertEquals("BarBar", fooBarQix.translate(5));
    assertEquals("Foo", fooBarQix.translate(6));
    assertEquals("QixQix", fooBarQix.translate(7));
    assertEquals("8", fooBarQix.translate(8));
    assertEquals("Foo", fooBarQix.translate(9));
    assertEquals("Bar", fooBarQix.translate(10));

    assertEquals("Foo", fooBarQix.translate(13));
    assertEquals("FooBarBar", fooBarQix.translate(15));
    assertEquals("FooFooFoo", fooBarQix.translate(33));
  }

}
