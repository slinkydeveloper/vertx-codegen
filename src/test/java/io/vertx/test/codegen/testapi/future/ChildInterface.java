package io.vertx.test.codegen.testapi.future;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.concurrent.CompletionStage;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface ChildInterface extends ParentInterface {

  void foo();

}
