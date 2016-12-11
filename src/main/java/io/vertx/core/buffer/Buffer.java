package io.vertx.core.buffer;

import io.vertx.codegen.annotations.VertxGen;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface Buffer {

  static Buffer buffer(byte[] bytes) {
    throw new UnsupportedOperationException();
  }

  byte[] getBytes();
}
