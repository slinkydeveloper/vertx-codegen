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
public interface FutureInterface {

  void methodWithVoidFuture1(Handler<AsyncResult<Void>> handler);
  CompletionStage<Void> methodWithVoidFuture1();

  CompletionStage<Void> methodWithVoidFuture2();
  void methodWithVoidFuture2(Handler<AsyncResult<Void>> handler);

  <U> void methodWithTypeParamFuture(Handler<AsyncResult<U>> handler);
  <T> CompletionStage<T> methodWithTypeParamFuture();

  void methodWithArgAndFuture(String s, Handler<AsyncResult<Void>> handler);
  CompletionStage<Void> methodWithArgAndFuture(String s);

  <T> void methodWithGenericFutureWithArg(T t, Handler<AsyncResult<Void>> handler);
  <U> CompletionStage<Void> methodWithGenericFutureWithArg(U u);

  void methodWithListFuture(Handler<AsyncResult<List<String>>> handler);
  CompletionStage<List<String>> methodWithListFuture();

  @Fluent
  FutureInterface fluentMethodWithVoidFuture(Handler<AsyncResult<Void>> handler);
  CompletionStage<Void> fluentMethodWithVoidFuture();

  void methodWithCompletableFutureExt(Handler<AsyncResult<Void>> handler);
  CompletionStageExt<Void> methodWithCompletableFutureExt();
}
