/*
 * Created on Mar 17, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2012 the original author or authors.
 */
package org.fest.assertions.error;

import org.fest.assertions.core.Matcher;

/**
 * Creates an error message indicating that an assertion that not verifies elements of a group satisfies at most n times a
 * {@code Condition} A group of elements can be a collection, an array.<br>
 * 
 * @author Nicolas François
 * @author Mikhail Mazursky
 * @author Joel Costigliola
 */
public class ElementsShouldNotBeAtMost extends BasicErrorMessageFactory {

  /**
   * Creates a new </code>{@link ElementsShouldNotBeAtMost}</code>.
   * @param actual the actual value in the failed assertion.
   * @param times least time the condition should be verify.
   * @param condition the {@code Condition}.
   * @return the created {@code ErrorMessageFactory}.
   */
  public static <E> ErrorMessageFactory elementsShouldNotBeAtMost(Object actual, int times, Matcher<?> condition) {
    return new ElementsShouldNotBeAtMost(actual, times, condition);
  }

  private ElementsShouldNotBeAtMost(Object actual, int times, Matcher<?> condition) {
    super("expecting elements:\n<%s>\n not to be at most %s times <%s>", actual, times, condition);
  }
}
