package io.vertx.test.codegen.testapi.future;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.concurrent.CompletableFuture;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface MethodWithInvalidTypeParamFuture1 {
  <T, U> CompletableFuture<T> m();
  <U, T> void m(Handler<AsyncResult<T>> handler);
}
