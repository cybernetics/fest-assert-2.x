/*
 * Created on Mar 29, 2009
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2013 the original author or authors.
 */

package org.fest.assertions.api;

import static junit.framework.Assert.assertSame;

import static org.fest.test.ExpectedException.none;

import org.fest.test.ExpectedException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * Tests for {@link FloatAssert#isLessThan(Float)}.
 *
 * @author Yvonne Wang
 */
public class FloatAssert_isLessThan_float_wrapper_Test {
  @Rule
  public ExpectedException thrown = none();
  private Float actual;
  private Float expected;
  private FloatAssert assertions;

  @Before
  public void setUp() {
    actual = new Float(6f);
    expected = new Float(8f);
    assertions = new FloatAssert(actual);
  }

  @Test
  public void should_pass_if_actual_is_less_than_expected() {
    assertions.isLessThan(expected);
  }

  @Test
  public void should_return_this() {
    FloatAssert returned = assertions.isLessThan(expected);
    assertSame(returned, assertions);
  }

  @Test
  public void should_throw_error_if_actual_is_null() {
    thrown.expect(AssertionError.class);
    assertions = new FloatAssert(null);
    assertions.isLessThan(expected);
  }

  @Test
  public void should_throw_error_if_expected_is_null() {
    thrown.expect(NullPointerException.class);
    assertions.isLessThan(null);
  }

  @Test
  public void should_fail_if_actual_is_greater_than_expected() {
    thrown.expect(AssertionError.class);
    assertions.isLessThan(new Float(2f));
  }

  @Test
  public void should_fail_if_actual_is_equal_to_expected() {
    thrown.expect(AssertionError.class);
    assertions.isLessThan(actual);
  }
}
