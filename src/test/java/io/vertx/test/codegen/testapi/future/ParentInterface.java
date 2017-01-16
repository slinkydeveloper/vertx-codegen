package io.vertx.test.codegen.testapi.future;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface ParentInterface {

  void methodWithVoidFuture1(Handler<AsyncResult<Void>> handler);
  CompletionStage<Void> methodWithVoidFuture1();

}
