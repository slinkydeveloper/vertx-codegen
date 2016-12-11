package io.vertx.test.codegen.testapi.future;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Promise;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface FutureInterface {

  void methodWithVoidFuture1(Handler<AsyncResult<Void>> handler);
  Promise<Void> methodWithVoidFuture1();

  Promise<Void> methodWithVoidFuture2();
  void methodWithVoidFuture2(Handler<AsyncResult<Void>> handler);

  <U> void methodWithGenericFuture(Handler<AsyncResult<U>> handler);
  <T> Promise<T> methodWithGenericFuture();

  void methodWithArgAndFuture(String s, Handler<AsyncResult<Void>> handler);
  Promise<Void> methodWithArgAndFuture(String s);

  <T> void methodWithGenericFutureWithArg(T t, Handler<AsyncResult<Void>> handler);
  <U> Promise<Void> methodWithGenericFutureWithArg(U u);

  @Fluent
  FutureInterface fluentMethodWithVoidFuture(Handler<AsyncResult<Void>> handler);
  Promise<Void> fluentMethodWithVoidFuture();

}
