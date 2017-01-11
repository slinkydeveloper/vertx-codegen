/*
 * Copyright 2014 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.codegen;

import javax.lang.model.element.ExecutableElement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
class MethodList extends ArrayList<MethodInfo> {

  protected LinkedHashMap<ExecutableElement, MethodInfo> methods = new LinkedHashMap<>();

  Stream<Map.Entry<ExecutableElement, MethodInfo>> entries() {
    return methods.entrySet().stream();
  }

  void add(ExecutableElement elt, MethodInfo meth) {
    methods.put(elt, meth);
    add(meth);
  }

  List<MethodInfo> getStaticMethods() {
    return methods.values().stream().filter(MethodInfo::isStaticMethod).collect(Collectors.toList());
  }

  List<MethodInfo> getInstanceMethods() {
    return methods.values().stream().filter(m -> !m.isStaticMethod()).collect(Collectors.toList());
  }

  ExecutableElement getElement(MethodInfo mi) {
    Optional<ExecutableElement> opt = methods.entrySet().stream().filter(t -> t.getValue() == mi).findFirst().map(Map.Entry::getKey);
    if (opt.isPresent()) {
      return opt.get();
    } else {
      return null;
    }
  }
}
