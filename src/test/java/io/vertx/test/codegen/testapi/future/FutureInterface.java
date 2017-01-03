package io.vertx.test.codegen.testapi.future;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;

import java.util.List;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface FutureInterface {

  void methodWithVoidFuture1(Handler<AsyncResult<Void>> handler);
  Future<Void> methodWithVoidFuture1();

  Future<Void> methodWithVoidFuture2();
  void methodWithVoidFuture2(Handler<AsyncResult<Void>> handler);

  <U> void methodWithTypeParamFuture(Handler<AsyncResult<U>> handler);
  <T> Future<T> methodWithTypeParamFuture();

  void methodWithArgAndFuture(String s, Handler<AsyncResult<Void>> handler);
  Future<Void> methodWithArgAndFuture(String s);

  <T> void methodWithGenericFutureWithArg(T t, Handler<AsyncResult<Void>> handler);
  <U> Future<Void> methodWithGenericFutureWithArg(U u);

  void methodWithListFuture(Handler<AsyncResult<List<String>>> handler);
  Future<List<String>> methodWithListFuture();

  @Fluent
  FutureInterface fluentMethodWithVoidFuture(Handler<AsyncResult<Void>> handler);
  Future<Void> fluentMethodWithVoidFuture();

  Future<Void> methodReturningFuture();

}
