---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:36Z'
section: guide
site: akka-io
source_url: https://doc.akka.io/libraries/guide/microservices-tutorial/grpc-service.html
title: 'Section 3: Create the gRPC Cart service :: Akka Guide'
---

# Section 3: Create the gRPC Cart service :: Akka Guide

## Content

# Section 3: Create the gRPC Cart service

Language

We will create the gRPC `ShoppingCartService` for the **Cart Service** shown in the architectural overview below. The motivation for using gRPC as the inter\-service protocol is explained in [Akka gRPC concepts](../concepts/akka-grpc.html). The [Introduction to Akka gRPC video ![new tab](../_images/new-tab.svg)](https://akka.io/blog/news/2020/04/08/akka-grpc-intro-video) is also a good starting point for learning Akka gRPC.

![Example gRPC service](_images/example-grpc-server.drawio.svg)

First, we will create the `ShoppingCartService` with a single operation that adds items to a cart. The implementation will only log the calls for now. Later, we’ll expand the service with more operations and real implementations. On this page you will learn how to:

- define the interface of a gRPC service
- implement the service interface
- initialize and run an HTTP server and the service locally
- interact with the service from the command line

## Source downloads

If you prefer to simply view and run the example, download a zip file containing the completed code:

Java

- [Source](_attachments/0-shopping-cart-start-java.zip) with the initial project template.
- [Source](_attachments/1-shopping-cart-grpc-java.zip) with the steps on this page completed.

Scala

- [Source](_attachments/0-shopping-cart-start-scala.zip) with the initial project template.
- [Source](_attachments/1-shopping-cart-grpc-scala.zip) with the steps on this page completed.

## 1\. Create service definition

gRPC takes a schema\-first approach, where the protocol is declared in a Protobuf service descriptor. From the service descriptor the source code for the messages, client and server stubs are generated.

First, create a protobuf service descriptor file: `src/main/protobuf/shoppingcart/shopping_cart_service.proto`. In it, define the service interface as shown below:

```
syntax = "proto3";

package shoppingcart;

option java_multiple_files = true;
option java_package = "shopping.cart.proto";

// gRPC definition for ShoppingCartService

service ShoppingCartService { (1)
  rpc AddItem(AddItemRequest) returns (Cart) {}
}

message AddItemRequest { (2)
  string cart_id = 1;
  string item_id = 2;
  int32 quantity = 3;
}

message Cart {
  repeated Item items = 1;
}

message Item {
  string item_id = 1;
  int32 quantity = 2;
}
```

| **1** | Defines the requests a client may send to the service in the service definition. |
| --- | --- |
| **2** | Describes the request to add an item to the shopping cart. |

## 2\. Generate code

The Akka gRPC plugin will generate code from the service descriptor when you compile the project. Run `sbt` `mvn` to compile:

```
sbt compile
```

```
mvn compile
```

|  | You might have to synchronize the `build.sbt` `pom.xml` in IntelliJ after this so that it adds the source directories for the generated code. On the right\-side menu, select the `sbt` `Maven` tab and check for a button to reload the projects. |
| --- | --- |

## 3\. Implement the service

Let’s implement the `ShoppingCartService` trait interface. Create a `ShoppingCartServiceImpl` class that extends the generated `ShoppingCartService` trait interface. Implement the `addItem` method from the trait interface by logging the call and return a successful `Future` `CompletionStage`.

Java

src/main/java/shopping/cart/ShoppingCartServiceImpl.java:

```
package shopping.cart;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.*;

public final class ShoppingCartServiceImpl implements ShoppingCartService {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Cart> addItem(AddItemRequest in) { (1)
    logger.info("addItem {} to cart {}", in.getItemId(), in.getCartId());
    Item item = Item.newBuilder().setItemId(in.getItemId()).setQuantity(in.getQuantity()).build();
    Cart cart = Cart.newBuilder().addItems(item).build();
    return CompletableFuture.completedFuture(cart);
  }
}
```

Scala

src/main/scala/shopping/cart/ShoppingCartServiceImpl.scala:

```
package shopping.cart

import scala.concurrent.Future

import org.slf4j.LoggerFactory

class ShoppingCartServiceImpl extends proto.ShoppingCartService {

  private val logger = LoggerFactory.getLogger(getClass)

  override def addItem(in: proto.AddItemRequest): Future[proto.Cart] = { (1)
    logger.info("addItem {} to cart {}", in.itemId, in.cartId)
    Future.successful(
      proto.Cart(items = List(proto.Item(in.itemId, in.quantity))))
  }

}
```

| **1** | The method corresponding to the `rpc AddItem` in the service definition. Defined in the generated `proto.ShoppingCartService`. |
| --- | --- |

## 4\. Initialize HTTP Server

We will run the gRPC service implementation in an Akka HTTP server. Add the following server initialization code in a `ShoppingCartServer` `object` `class`:

Java

src/main/java/shopping/cart/ShoppingCartServer.java:

```
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.grpc.javadsl.ServerReflection;
import akka.grpc.javadsl.ServiceHandler;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.CompletionStage;
import shopping.cart.proto.ShoppingCartService;
import shopping.cart.proto.ShoppingCartServiceHandlerFactory;

public final class ShoppingCartServer {

  private ShoppingCartServer() {}

  static void start(String host, int port, ActorSystem<?> system, ShoppingCartService grpcService) {
    @SuppressWarnings("unchecked")
    Function<HttpRequest, CompletionStage<HttpResponse>> service =
        ServiceHandler.concatOrNotFound(
            ShoppingCartServiceHandlerFactory.create(grpcService, system),
            // ServerReflection enabled to support grpcurl without import-path and proto parameters
            ServerReflection.create( (1)
                Collections.singletonList(ShoppingCartService.description), system));

    CompletionStage<ServerBinding> bound =
        Http.get(system).newServerAt(host, port).bind(service); (2)

    bound.whenComplete(
        (binding, ex) -> { (3)
          if (binding != null) {
            binding.addToCoordinatedShutdown(Duration.ofSeconds(3), system);
            InetSocketAddress address = binding.localAddress();
            system
                .log()
                .info(
                    "Shopping online at gRPC server {}:{}",
                    address.getHostString(),
                    address.getPort());
          } else {
            system.log().error("Failed to bind gRPC endpoint, terminating system", ex);
            system.terminate();
          }
        });
  }
}
```

| **1** | Concatenate the service implementation with `ServerReflection` for better `grcurl` support. |
| --- | --- |
| **2** | Start the HTTP server for the gRPC service. |
| **3** | Add it for coordinated and terminate the Actor system in case of error. Also, some logging at startup. |

Scala

src/main/scala/shopping/cart/ShoppingCartServer.scala

```
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.grpc.scaladsl.{ ServerReflection, ServiceHandler }
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ HttpRequest, HttpResponse }

import scala.concurrent.{ ExecutionContext, Future }
import scala.concurrent.duration._
import scala.util.{ Failure, Success }

object ShoppingCartServer {

  def start(
      interface: String,
      port: Int,
      system: ActorSystem[_],
      grpcService: proto.ShoppingCartService): Unit = {
    implicit val sys: ActorSystem[_] = system
    implicit val ec: ExecutionContext =
      system.executionContext

    val service: HttpRequest => Future[HttpResponse] =
      ServiceHandler.concatOrNotFound(
        proto.ShoppingCartServiceHandler.partial(grpcService),
        // ServerReflection enabled to support grpcurl without import-path and proto parameters
        ServerReflection.partial(List(proto.ShoppingCartService))
      ) (1)

    val bound =
      Http()
        .newServerAt(interface, port)
        .bind(service)
        .map(_.addToCoordinatedShutdown(3.seconds)) (2)

    bound.onComplete { (3)
      case Success(binding) =>
        val address = binding.localAddress
        system.log.info(
          "Shopping online at gRPC server {}:{}",
          address.getHostString,
          address.getPort)
      case Failure(ex) =>
        system.log.error("Failed to bind gRPC endpoint, terminating system", ex)
        system.terminate()
    }
  }

}
```

| **1** | Concatenate the service implementation with `ServerReflection` for better `grcurl` support. |
| --- | --- |
| **2** | Start the HTTP server for the gRPC service. |
| **3** | Some logging at startup along with logic to terminate the Actor system in case of error. |

## 5\. Main method

To run the service we need a class with a `main` method. Edit the `Main` class that is included from the template project. It should initialize the `ActorSystem` and the `ShoppingCartServer` like this:

Java

```
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.management.cluster.bootstrap.ClusterBootstrap;
import akka.management.javadsl.AkkaManagement;
import com.typesafe.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.ShoppingCartService;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    ActorSystem<Void> system =
        ActorSystem.create(Behaviors.empty(), "shopping-cart-service"); (1)
    try {
      init(system);
    } catch (Exception e) {
      logger.error("Terminating due to initialization failure.", e);
      system.terminate();
    }
  }

  public static void init(ActorSystem<Void> system) {
    AkkaManagement.get(system).start(); (2)
    ClusterBootstrap.get(system).start();

    Config config = system.settings().config();
    String grpcInterface = config.getString("shopping-cart-service.grpc.interface");
    int grpcPort = config.getInt("shopping-cart-service.grpc.port");
    ShoppingCartService grpcService = new ShoppingCartServiceImpl();
    ShoppingCartServer.start(grpcInterface, grpcPort, system, grpcService); (3)
  }
}
```

| **1** | Start an `ActorSystem` with an empty `Behavior`. |
| --- | --- |
| **2** | Initialization of Akka Management that is used for forming the Akka Cluster. |
| **3** | Initialize the gRPC server. This is the code you should add to the existing `Main`. |

Scala

```
package shopping.cart

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.ActorSystem
import akka.management.cluster.bootstrap.ClusterBootstrap
import akka.management.scaladsl.AkkaManagement
import org.slf4j.LoggerFactory
import scala.util.control.NonFatal

object Main {

  val logger = LoggerFactory.getLogger("shopping.cart.Main")

  def main(args: Array[String]): Unit = {
    val system =
      ActorSystem[Nothing](Behaviors.empty, "shopping-cart-service") (1)
    try {
      init(system)
    } catch {
      case NonFatal(e) =>
        logger.error("Terminating due to initialization failure.", e)
        system.terminate()
    }
  }

  def init(system: ActorSystem[_]): Unit = {
    AkkaManagement(system).start() (2)
    ClusterBootstrap(system).start()

    val grpcInterface =
      system.settings.config.getString("shopping-cart-service.grpc.interface")
    val grpcPort =
      system.settings.config.getInt("shopping-cart-service.grpc.port")
    val grpcService = new ShoppingCartServiceImpl
    ShoppingCartServer.start(
      grpcInterface,
      grpcPort,
      system,
      grpcService
    ) (3)
  }

}
```

| **1** | Start an `ActorSystem` with an empty `Behavior`. |
| --- | --- |
| **2** | Initialization of Akka Management that is used for forming the Akka Cluster. |
| **3** | Initialize the gRPC server. This is the code you should add to the existing `Main`. |

The `grpc.port` configuration is defined in `local1.conf`, which is included in the generated template project.

## 6\. Run locally

You can run this service with:

```
sbt -Dconfig.resource=local1.conf run
```

```
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

Note the log output from the `ShoppingCartServer`

```
Shopping online at gRPC server 127.0.0.1:8101
```

### 6\.1\. Exercise the service

Use `[grpcurl](https://github.com/fullstorydev/grpcurl)` to exercise the service:

1. Add 3 socks to a cart:

```
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
2. Add 2 t\-shirts to the same cart:

```
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":2}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

Note the logging from the `ShoppingCartServiceImpl` in the console.

### 6\.2\. Stop the service

You can stop the service with `ctrl-c`.

## 7\. Run in Kubernetes

As an alternative, you can run the service in [Kubernetes ![new tab](../_images/new-tab.svg)](https://kubernetes.io/).

### 7\.1\. Build the service

The `build.sbt and project/plugins.sbt` `pom.xml` contains build plugin settings for building a Docker image.

The version number of the image is derived from the git commit. If you see error "Given Docker name 'shopping\-cart\-service:${git.commit.time}\-${git.commit.id.abbrev}' is invalid" it is because the directory is not a git repository. You can enable git for the directory with the following commands.

```
git init
git add .
git commit -m "some descriptive commit message"
```

Alternatively the version can be specified with `-Dversion.number=0.1-SNAPSHOT`.

```
mvn -Dversion.number=0.1-SNAPSHOT -DskipTests -Ddocker.registry=registry.example.com clean package docker:push
```

The version number of the image, as well as from the project itself, is derived from the git commit using [sbt\-dynver ![new tab](../_images/new-tab.svg)](https://github.com/sbt/sbt-dynver). If your project is not being versioned with git, you will see a fixed version number (eg: `HEAD-20210119-1515`). You can enable git for the directory with the following commands.

```
git init
git add .
git commit -m "some descriptive commit message"
```

Alternatively you can add the version to your `build.sbt` file and maintain it manually.

```
version := "1.0.0"
```

Java

```
mvn -DskipTests -Ddocker.registry=registry.example.com clean package docker:push
```

Scala

```
sbt -Ddocker.registry=registry.example.com docker:publish
```

Take note of the image tag as displayed by the `docker:publish` `docker:push` command.

Java

```
DOCKER> Tagging image shopping-cart-service:20201209-135004-363ae2b successful!
```

Scala

```
[info] Successfully tagged shopping-cart-service:20201209-135004-363ae2b
```

### 7\.2\. Deployment files

You need the following Kubernetes files:

1. namespace.json

```
{
  "kind": "Namespace",
  "apiVersion": "v1",
  "metadata": {
    "name": "shopping-cart-namespace",
    "labels": {
      "name": "shopping-cart-namespace"
    }
  }
}
```
2. rbac.yml

For Akka Cluster bootstrap we need to define role based access control.

```
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
  namespace: shopping-cart-namespace
rules:
  - apiGroups: [""] # "" indicates the core API group
    resources: ["pods"]
    verbs: ["get", "watch", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: read-pods
  namespace: shopping-cart-namespace
subjects:
  # Note the `name` line below. The first default refers to the namespace. The second refers to the service account name.
  # For instance, `name: system:serviceaccount:myns:default` would refer to the default service account in namespace `myns`
  - kind: User
    name: system:serviceaccount:shopping-cart-namespace:default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
```
3. deployment.yml

```
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: shopping-cart-service
  name: shopping-cart-service
  namespace: shopping-cart-namespace
spec:
  replicas: 1
  selector:
    matchLabels:
      app: shopping-cart-service
  template:
    metadata:
      labels:
        app: shopping-cart-service
        actorSystemName: shopping-cart-service
    spec:
      containers:
        - name: shopping-cart-service
          # use specific image version from docker publish
          image: shopping-cart-service:latest
          # these will need to be increased tuned for production environments!
          resources:
            limits:
              memory: "2Gi"
            requests:
              memory: "2Gi"
              cpu: "1000m"
          readinessProbe:
            httpGet:
              path: /ready
              port: management
            periodSeconds: 10
            failureThreshold: 3
            initialDelaySeconds: 10
          livenessProbe:
            httpGet:
              path: "/alive"
              port: management
            periodSeconds: 10
            failureThreshold: 5
            initialDelaySeconds: 20
          ports:
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
            - name: grpc
              containerPort: 8101
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75 -Dakka.persistence.r2dbc.connection-factory.ssl.enabled=true -Dakka.persistence.r2dbc.connection-factory.ssl.mode=require"
            - name: DB_HOST
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_HOST
                  optional: true
            - name: DB_USER
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_USER
                  optional: true
            - name: DB_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_PASSWORD
                  optional: true
```

Update the `image:` in the `deployment.yml` with the specific image version and location you published.

### 7\.3\. Apply with kubectl

Deploy to Kubernetes with:

```
1) kubectl apply -f kubernetes/namespace.json
2) kubectl config set-context --current --namespace=shopping-cart-namespace
3) kubectl apply -f kubernetes/rbac.yml
4) kubectl apply -f kubernetes/deployment.yml

// all should be in ready state
5) kubectl get pods
```

### 7\.4\. Port forward

Create a Kubernetes `Service` and port forward to simplify access to the pods from your local machine:

```
apiVersion: v1
kind: Service
metadata:
  name: shopping-cart-service-svc
spec:
  selector:
    app: shopping-cart-service
  type: NodePort
  ports:
    - protocol: TCP
      port: 8101
      targetPort: 8101
```

```
kubectl apply -f kubernetes/service.yml
```

Start port forward with:

```
kubectl port-forward svc/shopping-cart-service-svc 8101:8101
```

### 7\.5\. Exercise the service in Kubernetes

Use `[grpcurl](https://github.com/fullstorydev/grpcurl)` to exercise the service:

1. Add 3 socks to a cart:

```
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
2. Add 2 t\-shirts to the same cart:

```
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":2}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```
3. You can list the pods with:

```
kubectl get pods
```
4. Inspect logs from a separate terminal window:

```
kubectl logs -f <shopping-cart-service pod name from above>
```

Note the logging from the `ShoppingCartServiceImpl` in the console that is running `kubectl logs -f`.

## Learn more

- [Akka gRPC concepts](../concepts/akka-grpc.html)
- [Akka gRPC server reference documentation ![new tab](../_images/new-tab.svg)](https://doc.akka.io/libraries/akka-grpc/current/server/index.html).

## Code Examples

### Example 1: 1. Create service definition

```protobuf
syntax = "proto3";

package shoppingcart;

option java_multiple_files = true;
option java_package = "shopping.cart.proto";

// gRPC definition for ShoppingCartService

service ShoppingCartService { (1)
  rpc AddItem(AddItemRequest) returns (Cart) {}
}

message AddItemRequest { (2)
  string cart_id = 1;
  string item_id = 2;
  int32 quantity = 3;
}

message Cart {
  repeated Item items = 1;
}

message Item {
  string item_id = 1;
  int32 quantity = 2;
}
```

### Example 2: 2. Generate code

```shell
sbt compile
```

### Example 3: 2. Generate code

```shell
mvn compile
```

### Example 4: 3. Implement the service

```java
package shopping.cart;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.*;

public final class ShoppingCartServiceImpl implements ShoppingCartService {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Cart> addItem(AddItemRequest in) { (1)
    logger.info("addItem {} to cart {}", in.getItemId(), in.getCartId());
    Item item = Item.newBuilder().setItemId(in.getItemId()).setQuantity(in.getQuantity()).build();
    Cart cart = Cart.newBuilder().addItems(item).build();
    return CompletableFuture.completedFuture(cart);
  }
}
```

### Example 5: 3. Implement the service

```scala
package shopping.cart

import scala.concurrent.Future

import org.slf4j.LoggerFactory

class ShoppingCartServiceImpl extends proto.ShoppingCartService {

  private val logger = LoggerFactory.getLogger(getClass)

  override def addItem(in: proto.AddItemRequest): Future[proto.Cart] = { (1)
    logger.info("addItem {} to cart {}", in.itemId, in.cartId)
    Future.successful(
      proto.Cart(items = List(proto.Item(in.itemId, in.quantity))))
  }

}
```

### Example 6: 4. Initialize HTTP Server

```java
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.grpc.javadsl.ServerReflection;
import akka.grpc.javadsl.ServiceHandler;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.CompletionStage;
import shopping.cart.proto.ShoppingCartService;
import shopping.cart.proto.ShoppingCartServiceHandlerFactory;

public final class ShoppingCartServer {

  private ShoppingCartServer() {}

  static void start(String host, int port, ActorSystem<?> system, ShoppingCartService grpcService) {
    @SuppressWarnings("unchecked")
    Function<HttpRequest, CompletionStage<HttpResponse>> service =
        ServiceHandler.concatOrNotFound(
            ShoppingCartServiceHandlerFactory.create(grpcService, system),
            // ServerReflection enabled to support grpcurl without import-path and proto parameters
            ServerReflection.create( (1)
                Collections.singletonList(ShoppingCartService.description), system));

    CompletionStage<ServerBinding> bound =
        Http.get(system).newServerAt(host, port).bind(service); (2)

    bound.whenComplete(
        (binding, ex) -> { (3)
          if (binding != null) {
            binding.addToCoordinatedShutdown(Duration.ofSeconds(3), system);
            InetSocketAddress address = binding.localAddress();
            system
                .log()
                .info(
                    "Shopping online at gRPC server {}:{}",
                    address.getHostString(),
                    address.getPort());
          } else {
            system.log().error("Failed to bind gRPC endpoint, terminating system", ex);
            system.terminate();
          }
        });
  }
}
```

### Example 7: 4. Initialize HTTP Server

```scala
package shopping.cart

import akka.actor.typed.ActorSystem
import akka.grpc.scaladsl.{ ServerReflection, ServiceHandler }
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ HttpRequest, HttpResponse }

import scala.concurrent.{ ExecutionContext, Future }
import scala.concurrent.duration._
import scala.util.{ Failure, Success }

object ShoppingCartServer {

  def start(
      interface: String,
      port: Int,
      system: ActorSystem[_],
      grpcService: proto.ShoppingCartService): Unit = {
    implicit val sys: ActorSystem[_] = system
    implicit val ec: ExecutionContext =
      system.executionContext

    val service: HttpRequest => Future[HttpResponse] =
      ServiceHandler.concatOrNotFound(
        proto.ShoppingCartServiceHandler.partial(grpcService),
        // ServerReflection enabled to support grpcurl without import-path and proto parameters
        ServerReflection.partial(List(proto.ShoppingCartService))
      ) (1)

    val bound =
      Http()
        .newServerAt(interface, port)
        .bind(service)
        .map(_.addToCoordinatedShutdown(3.seconds)) (2)

    bound.onComplete { (3)
      case Success(binding) =>
        val address = binding.localAddress
        system.log.info(
          "Shopping online at gRPC server {}:{}",
          address.getHostString,
          address.getPort)
      case Failure(ex) =>
        system.log.error("Failed to bind gRPC endpoint, terminating system", ex)
        system.terminate()
    }
  }

}
```

### Example 8: 5. Main method

```java
package shopping.cart;

import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import akka.management.cluster.bootstrap.ClusterBootstrap;
import akka.management.javadsl.AkkaManagement;
import com.typesafe.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import shopping.cart.proto.ShoppingCartService;

public class Main {

  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    ActorSystem<Void> system =
        ActorSystem.create(Behaviors.empty(), "shopping-cart-service"); (1)
    try {
      init(system);
    } catch (Exception e) {
      logger.error("Terminating due to initialization failure.", e);
      system.terminate();
    }
  }

  public static void init(ActorSystem<Void> system) {
    AkkaManagement.get(system).start(); (2)
    ClusterBootstrap.get(system).start();

    Config config = system.settings().config();
    String grpcInterface = config.getString("shopping-cart-service.grpc.interface");
    int grpcPort = config.getInt("shopping-cart-service.grpc.port");
    ShoppingCartService grpcService = new ShoppingCartServiceImpl();
    ShoppingCartServer.start(grpcInterface, grpcPort, system, grpcService); (3)
  }
}
```

### Example 9: 5. Main method

```scala
package shopping.cart

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.ActorSystem
import akka.management.cluster.bootstrap.ClusterBootstrap
import akka.management.scaladsl.AkkaManagement
import org.slf4j.LoggerFactory
import scala.util.control.NonFatal

object Main {

  val logger = LoggerFactory.getLogger("shopping.cart.Main")

  def main(args: Array[String]): Unit = {
    val system =
      ActorSystem[Nothing](Behaviors.empty, "shopping-cart-service") (1)
    try {
      init(system)
    } catch {
      case NonFatal(e) =>
        logger.error("Terminating due to initialization failure.", e)
        system.terminate()
    }
  }

  def init(system: ActorSystem[_]): Unit = {
    AkkaManagement(system).start() (2)
    ClusterBootstrap(system).start()

    val grpcInterface =
      system.settings.config.getString("shopping-cart-service.grpc.interface")
    val grpcPort =
      system.settings.config.getInt("shopping-cart-service.grpc.port")
    val grpcService = new ShoppingCartServiceImpl
    ShoppingCartServer.start(
      grpcInterface,
      grpcPort,
      system,
      grpcService
    ) (3)
  }

}
```

### Example 10: 6. Run locally

```shell
sbt -Dconfig.resource=local1.conf run
```

### Example 11: 6. Run locally

```shell
# make sure to compile before running exec:exec
mvn compile exec:exec -DAPP_CONFIG=local1.conf
```

### Example 12: 6.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 13: 6.1. Exercise the service

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":2}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 14: 7.1. Build the service

```shell
git init
git add .
git commit -m "some descriptive commit message"
```

### Example 15: 7.1. Build the service

```shell
git init
git add .
git commit -m "some descriptive commit message"
```

### Example 16: 7.1. Build the service

```shell
version := "1.0.0"
```

### Example 17: 7.1. Build the service

```shell
DOCKER> Tagging image shopping-cart-service:20201209-135004-363ae2b successful!
```

### Example 18: 7.1. Build the service

```shell
[info] Successfully tagged shopping-cart-service:20201209-135004-363ae2b
```

### Example 19: 7.2. Deployment files

```json
{
  "kind": "Namespace",
  "apiVersion": "v1",
  "metadata": {
    "name": "shopping-cart-namespace",
    "labels": {
      "name": "shopping-cart-namespace"
    }
  }
}
```

### Example 20: 7.2. Deployment files

```yaml
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
  namespace: shopping-cart-namespace
rules:
  - apiGroups: [""] # "" indicates the core API group
    resources: ["pods"]
    verbs: ["get", "watch", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: read-pods
  namespace: shopping-cart-namespace
subjects:
  # Note the `name` line below. The first default refers to the namespace. The second refers to the service account name.
  # For instance, `name: system:serviceaccount:myns:default` would refer to the default service account in namespace `myns`
  - kind: User
    name: system:serviceaccount:shopping-cart-namespace:default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
```

### Example 21: 7.2. Deployment files

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: shopping-cart-service
  name: shopping-cart-service
  namespace: shopping-cart-namespace
spec:
  replicas: 1
  selector:
    matchLabels:
      app: shopping-cart-service
  template:
    metadata:
      labels:
        app: shopping-cart-service
        actorSystemName: shopping-cart-service
    spec:
      containers:
        - name: shopping-cart-service
          # use specific image version from docker publish
          image: shopping-cart-service:latest
          # these will need to be increased tuned for production environments!
          resources:
            limits:
              memory: "2Gi"
            requests:
              memory: "2Gi"
              cpu: "1000m"
          readinessProbe:
            httpGet:
              path: /ready
              port: management
            periodSeconds: 10
            failureThreshold: 3
            initialDelaySeconds: 10
          livenessProbe:
            httpGet:
              path: "/alive"
              port: management
            periodSeconds: 10
            failureThreshold: 5
            initialDelaySeconds: 20
          ports:
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
            - name: grpc
              containerPort: 8101
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75 -Dakka.persistence.r2dbc.connection-factory.ssl.enabled=true -Dakka.persistence.r2dbc.connection-factory.ssl.mode=require"
            - name: DB_HOST
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_HOST
                  optional: true
            - name: DB_USER
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_USER
                  optional: true
            - name: DB_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_PASSWORD
                  optional: true
```

### Example 22: 7.3. Apply with kubectl

```shell
1) kubectl apply -f kubernetes/namespace.json
2) kubectl config set-context --current --namespace=shopping-cart-namespace
3) kubectl apply -f kubernetes/rbac.yml
4) kubectl apply -f kubernetes/deployment.yml

// all should be in ready state
5) kubectl get pods
```

### Example 23: 7.4. Port forward

```yaml
apiVersion: v1
kind: Service
metadata:
  name: shopping-cart-service-svc
spec:
  selector:
    app: shopping-cart-service
  type: NodePort
  ports:
    - protocol: TCP
      port: 8101
      targetPort: 8101
```

### Example 24: 7.4. Port forward

```shell
kubectl apply -f kubernetes/service.yml
```

### Example 25: 7.4. Port forward

```shell
kubectl port-forward svc/shopping-cart-service-svc 8101:8101
```

### Example 26: 7.5. Exercise the service in Kubernetes

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 27: 7.5. Exercise the service in Kubernetes

```shell
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":2}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 28: 7.5. Exercise the service in Kubernetes

```shell
kubectl get pods
```

### Example 29: 7.5. Exercise the service in Kubernetes

```shell
kubectl logs -f <shopping-cart-service pod name from above>
```

## Related Pages (Internal Links)

- https://doc.akka.io/guide/concepts/akka-grpc.html
- https://doc.akka.io/guide/microservices-tutorial/_attachments/0-shopping-cart-start-java.zip
- https://doc.akka.io/guide/microservices-tutorial/_attachments/0-shopping-cart-start-scala.zip
- https://doc.akka.io/guide/microservices-tutorial/_attachments/1-shopping-cart-grpc-java.zip
- https://doc.akka.io/guide/microservices-tutorial/_attachments/1-shopping-cart-grpc-scala.zip
- https://doc.akka.io/libraries/akka-grpc/current/server/index.html

---
*Source: [https://doc.akka.io/guide/microservices-tutorial/grpc-service.html](https://doc.akka.io/guide/microservices-tutorial/grpc-service.html)*