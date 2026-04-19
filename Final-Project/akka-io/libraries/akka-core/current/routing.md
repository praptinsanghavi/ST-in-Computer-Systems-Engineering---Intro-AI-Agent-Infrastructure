---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/routing.html
title: Classic Routing • Akka core
---

# Classic Routing • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Routing

Note
Akka Classic pertains to the original Actor APIs, which have been improved by more type safe and guided Actor APIs. Akka Classic is still fully supported and existing applications can continue to use the classic APIs. It is also possible to use the new Actor APIs together with classic actors in the same ActorSystem, see [coexistence](typed/coexisting.html). For new projects we recommend using [the new Actor API](typed/actors.html).

For the documentation of the new API of this feature and for new projects see [routers](typed/routers.html).

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Routing, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

## Introduction

Messages can be sent via a router to efficiently route them to destination actors, known as its *routees*. A [`Router`](https://doc.akka.io/api/akka-core/2.10/akka/routing/Router.html "akka.routing.Router")[`Router`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html "akka.routing.Router") can be used inside or outside of an actor, and you can manage the routees yourselves or use a self contained router actor with configuration capabilities.

Different routing strategies can be used, according to your application’s needs. Akka comes with several useful routing strategies right out of the box. But, as you will see in this chapter, it is also possible to [create your own](routing.html#custom-router).

## A Simple Router

The following example illustrates how to use a `Router` and manage the routees from within an actor.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L299-L320 "Go to snippet source")import akka.routing.{ ActorRefRoutee, RoundRobinRoutingLogic, Router }

class Master extends Actor {
  var router = {
    val routees = Vector.fill(5) {
      val r = context.actorOf(Props[Worker]())
      context.watch(r)
      ActorRefRoutee(r)
    }
    Router(RoundRobinRoutingLogic(), routees)
  }

  def receive = {
    case w: Work =>
      router.route(w, sender())
    case Terminated(a) =>
      router = router.removeRoutee(a)
      val r = context.actorOf(Props[Worker]())
      context.watch(r)
      router = router.addRoutee(r)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L78-L123 "Go to snippet source")static final class Work implements Serializable {
  private static final long serialVersionUID = 1L;
  public final String payload;

  public Work(String payload) {
    this.payload = payload;
  }
}

static class Master extends AbstractActor {

  Router router;

  {
    List<Routee> routees = new ArrayList<Routee>();
    for (int i = 0; i < 5; i++) {
      ActorRef r = getContext().actorOf(Props.create(Worker.class));
      getContext().watch(r);
      routees.add(new ActorRefRoutee(r));
    }
    router = new Router(new RoundRobinRoutingLogic(), routees);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Work.class,
            message -> {
              router.route(message, getSender());
            })
        .match(
            Terminated.class,
            message -> {
              router = router.removeRoutee(message.actor());
              ActorRef r = getContext().actorOf(Props.create(Worker.class));
              getContext().watch(r);
              router = router.addRoutee(new ActorRefRoutee(r));
            })
        .build();
  }
}

```

We create a `Router` and specify that it should use [`RoundRobinRoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/RoundRobinRoutingLogic.html "akka.routing.RoundRobinRoutingLogic")[`RoundRobinRoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoundRobinRoutingLogic.html "akka.routing.RoundRobinRoutingLogic") when routing the messages to the routees.

The routing logic shipped with Akka are:

- [`RoundRobinRoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/RoundRobinRoutingLogic.html "akka.routing.RoundRobinRoutingLogic")[`RoundRobinRoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoundRobinRoutingLogic.html "akka.routing.RoundRobinRoutingLogic")
- [`RandomRoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/RandomRoutingLogic.html "akka.routing.RandomRoutingLogic")[`RandomRoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/RandomRoutingLogic.html "akka.routing.RandomRoutingLogic")
- [`SmallestMailboxRoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/SmallestMailboxRoutingLogic.html "akka.routing.SmallestMailboxRoutingLogic")[`SmallestMailboxRoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/SmallestMailboxRoutingLogic.html "akka.routing.SmallestMailboxRoutingLogic")
- [`BroadcastRoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/BroadcastRoutingLogic.html "akka.routing.BroadcastRoutingLogic")[`BroadcastRoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/BroadcastRoutingLogic.html "akka.routing.BroadcastRoutingLogic")
- [`ScatterGatherFirstCompletedRoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/ScatterGatherFirstCompletedRoutingLogic.html "akka.routing.ScatterGatherFirstCompletedRoutingLogic")[`ScatterGatherFirstCompletedRoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ScatterGatherFirstCompletedRoutingLogic.html "akka.routing.ScatterGatherFirstCompletedRoutingLogic")
- [`TailChoppingRoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/TailChoppingRoutingLogic.html "akka.routing.TailChoppingRoutingLogic")[`TailChoppingRoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingRoutingLogic.html "akka.routing.TailChoppingRoutingLogic")
- [`ConsistentHashingRoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRoutingLogic.html "akka.routing.ConsistentHashingRoutingLogic")[`ConsistentHashingRoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRoutingLogic.html "akka.routing.ConsistentHashingRoutingLogic")

We create the routees as ordinary child actors wrapped in [`ActorRefRoutee`](https://doc.akka.io/api/akka-core/2.10/akka/routing/ActorRefRoutee.html "akka.routing.ActorRefRoutee")[`ActorRefRoutee`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ActorRefRoutee.html "akka.routing.ActorRefRoutee"). We watch the routees to be able to replace them if they are terminated.

Sending messages via the router is done with the [`route`](https://doc.akka.io/api/akka-core/2.10/akka/routing/Router.html#route(message:Any,sender:akka.actor.ActorRef):Unit "akka.routing.Router")[`route`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html#route(java.lang.Object,akka.actor.ActorRef) "akka.routing.Router") method, as is done for the `Work` messages in the example above.

The `Router` is immutable and the [`RoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/RoutingLogic.html "akka.routing.RoutingLogic")[`RoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoutingLogic.html "akka.routing.RoutingLogic") is thread safe; meaning that they can also be used outside of actors. 

Note
In general, any message sent to a router will be sent onwards to its routees, but there is one exception. The special [Broadcast Messages](routing.html#broadcast-messages) will send to *all* of a router’s routees. However, do not use [Broadcast Messages](routing.html#broadcast-messages) when you use [BalancingPool](routing.html#balancing-pool) for routees as described in [Specially Handled Messages](routing.html#router-special-messages).

## A Router Actor

A router can also be created as a self contained actor that manages the routees itself and loads routing logic and other settings from configuration.

This type of router actor comes in two distinct flavors:

- Pool \- The router creates routees as child actors and removes them from the router if they terminate.
- Group \- The routee actors are created externally to the router and the router sends messages to the specified path using actor selection, without watching for termination.

The settings for a router actor can be defined in configuration or programmatically. In order to make an actor to make use of an externally configurable router the `FromConfig` props wrapper must be used to denote that the actor accepts routing settings from configuration. This is in contrast with Remote Deployment where such marker props is not necessary. If the props of an actor is NOT wrapped in `FromConfig` it will ignore the router section of the deployment configuration.

You send messages to the routees via the router actor in the same way as for ordinary actors, i.e. via its [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef"). The router actor forwards messages onto its routees without changing the original sender. When a routee replies to a routed message, the reply will be sent to the original sender, not to the router actor.

Note
In general, any message sent to a router will be sent onwards to its routees, but there are a few exceptions. These are documented in the [Specially Handled Messages](routing.html#router-special-messages) section below.

### Pool

The following code and configuration snippets show how to create a [round\-robin](routing.html#round-robin-router) router that forwards messages to five `Worker` routees. The routees will be created as the router’s children.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L35-L40 "Go to snippet source")akka.actor.deployment {
  /parent/router1 {
    router = round-robin-pool
    nr-of-instances = 5
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L349-L350 "Go to snippet source")val router1: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router1")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L183-L184 "Go to snippet source")ActorRef router1 =
    getContext().actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router1");
```

Here is the same example, but with the router configuration provided programmatically instead of from configuration.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L354-L355 "Go to snippet source")val router2: ActorRef =
  context.actorOf(RoundRobinPool(5).props(Props[Worker]()), "router2")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L188-L189 "Go to snippet source")ActorRef router2 =
    getContext().actorOf(new RoundRobinPool(5).props(Props.create(Worker.class)), "router2");
```

#### Remote Deployed Routees

In addition to being able to create local actors as routees, you can instruct the router to deploy its created children on a set of remote hosts. Routees will be deployed in round\-robin fashion. In order to deploy routees remotely, wrap the router configuration in a [`RemoteRouterConfig`](https://doc.akka.io/api/akka-core/2.10/akka/remote/routing/RemoteRouterConfig.html "akka.remote.routing.RemoteRouterConfig")[`RemoteRouterConfig`](https://doc.akka.io/japi/akka-core/2.10/akka/remote/routing/RemoteRouterConfig.html "akka.remote.routing.RemoteRouterConfig"), attaching the remote addresses of the nodes to deploy to. Remote deployment requires the `akka-remote` module to be included in the classpath.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L600-L604 "Go to snippet source")import akka.actor.{ Address, AddressFromURIString }
import akka.remote.routing.RemoteRouterConfig
val addresses =
  Seq(Address("akka", "remotesys", "otherhost", 1234), AddressFromURIString("akka://othersys@anotherhost:1234"))
val routerRemote = system.actorOf(RemoteRouterConfig(RoundRobinPool(5), addresses).props(Props[Echo]()))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L453-L460 "Go to snippet source")Address[] addresses = {
  new Address("akka", "remotesys", "otherhost", 1234),
  AddressFromURIString.parse("akka://othersys@anotherhost:1234")
};
ActorRef routerRemote =
    system.actorOf(
        new RemoteRouterConfig(new RoundRobinPool(5), addresses)
            .props(Props.create(Echo.class)));
```

#### Senders

By default, when a routee sends a message, it will [implicitly set itself as the sender](actors.html#actors-tell-sender) .

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/ActorDocSpec.scala#L659 "Go to snippet source")sender() ! x // replies will go to this actor
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L147 "Go to snippet source")getSender().tell("reply", getSelf());
```

However, it is often useful for routees to set the *router* as a sender. For example, you might want to set the router as the sender if you want to hide the details of the routees behind the router. The following code snippet shows how to set the parent router as sender.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/actor/ActorDocSpec.scala#L654-L655 "Go to snippet source")sender().tell("reply", context.parent) // replies will go back to parent
sender().!("reply")(context.parent) // alternative syntax
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L151 "Go to snippet source")getSender().tell("reply", getContext().getParent());
```

#### Supervision

Routees that are created by a pool router will be created as the router’s children. The router is therefore also the children’s supervisor.

The supervision strategy of the router actor can be configured with the `supervisorStrategy` property of the Pool. If no configuration is provided, routers default to a strategy of “always escalate”. This means that errors are passed up to the router’s supervisor for handling. The router’s supervisor will decide what to do about any errors.

Note the router’s supervisor will treat the error as an error with the router itself. Therefore a directive to stop or restart will cause the router *itself* to stop or restart. The router, in turn, will cause its children to stop and restart.

It should be mentioned that the router’s restart behavior has been overridden so that a restart, while still re\-creating the children, will still preserve the same number of actors in the pool.

This means that if you have not specified `supervisorStrategy` of the router or its parent a failure in a routee will escalate to the parent of the router, which will by default restart the router, which will restart all routees (it uses Escalate and does not stop routees during restart). The reason is to make the default behave such that adding [`withRouter`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html#withRouter(r:akka.routing.RouterConfig):akka.actor.Props "akka.actor.Props")[`withRouter`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html#withRouter(akka.routing.RouterConfig) "akka.actor.Props") to a child’s definition does not change the supervision strategy applied to the child. This might be an inefficiency that you can avoid by specifying the strategy when defining the router.

Setting the strategy is done like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-actor-tests/src/test/scala/akka/routing/RoutingSpec.scala#L140-L146 "Go to snippet source")val escalator = OneForOneStrategy() {
  case e => testActor ! e; SupervisorStrategy.Escalate
}
val router =
  system.actorOf(RoundRobinPool(1, supervisorStrategy = escalator).props(routeeProps = Props[TestActor]()))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L481-L488 "Go to snippet source")final SupervisorStrategy strategy =
    new OneForOneStrategy(
        5,
        Duration.ofMinutes(1),
        Collections.<Class<? extends Throwable>>singletonList(Exception.class));
final ActorRef router =
    system.actorOf(
        new RoundRobinPool(5).withSupervisorStrategy(strategy).props(Props.create(Echo.class)));
```

Note
If the child of a pool router terminates, the pool router will not automatically spawn a new child. In the event that all children of a pool router have terminated the router will terminate itself unless it is a dynamic router, e.g. using a resizer.

### Group

Sometimes, rather than having the router actor create its routees, it is desirable to create routees separately and provide them to the router for its use. You can do this by passing in paths of the routees to the router’s configuration. Messages will be sent with [`ActorSelection`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html "akka.actor.ActorSelection")[`ActorSelection`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSelection.html "akka.actor.ActorSelection") to these paths, wildcards can be and will result in the same semantics as explicitly using `ActorSelection`.

The example below shows how to create a router by providing it with the path strings of three routee actors. 

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L44-L49 "Go to snippet source")akka.actor.deployment {
  /parent/router3 {
    router = round-robin-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L359-L360 "Go to snippet source")val router3: ActorRef =
  context.actorOf(FromConfig.props(), "router3")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L193 "Go to snippet source")ActorRef router3 = getContext().actorOf(FromConfig.getInstance().props(), "router3");
```

Here is the same example, but with the router configuration provided programmatically instead of from configuration.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L345 "Go to snippet source")val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router4: ActorRef =
  context.actorOf(RoundRobinGroup(paths).props(), "router4")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L179 "Go to snippet source")List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
ActorRef router4 = getContext().actorOf(new RoundRobinGroup(paths).props(), "router4");
```

The routee actors are created externally from the router:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L534 "Go to snippet source")system.actorOf(Props[Workers](), "workers")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L362 "Go to snippet source")system.actorOf(Props.create(Workers.class), "workers");
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L330-L334 "Go to snippet source")class Workers extends Actor {
  context.actorOf(Props[Worker](), name = "w1")
  context.actorOf(Props[Worker](), name = "w2")
  context.actorOf(Props[Worker](), name = "w3")
  // ...
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L160-L167 "Go to snippet source")static class Workers extends AbstractActor {
  @Override
  public void preStart() {
    getContext().actorOf(Props.create(Worker.class), "w1");
    getContext().actorOf(Props.create(Worker.class), "w2");
    getContext().actorOf(Props.create(Worker.class), "w3");
  }
  // ...
```

The paths may contain protocol and address information for actors running on remote hosts. Remoting requires the `akka-remote` module to be included in the classpath.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L231-L239 "Go to snippet source")akka.actor.deployment {
  /parent/remoteGroup {
    router = round-robin-group
    routees.paths = [
      "akka://[[email protected]](/cdn-cgi/l/email-protection):2552/user/workers/w1",
      "akka://[[email protected]](/cdn-cgi/l/email-protection):2552/user/workers/w1",
      "akka://[[email protected]](/cdn-cgi/l/email-protection):2552/user/workers/w1"]
  }
}
```

## Router usage

In this section we will describe how to create the different types of router actors.

The router actors in this section are created from within a top level actor named `parent`. Note that deployment paths in the configuration starts with `/parent/` followed by the name of the router actor. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L538 "Go to snippet source")system.actorOf(Props[Parent](), "parent")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L366 "Go to snippet source")system.actorOf(Props.create(Parent.class), "parent");
```

### RoundRobinPool and RoundRobinGroup

Routes in a [round\-robin](https://en.wikipedia.org/wiki/Round-robin) fashion to its routees.

RoundRobinPool defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L35-L40 "Go to snippet source")akka.actor.deployment {
  /parent/router1 {
    router = round-robin-pool
    nr-of-instances = 5
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L349-L350 "Go to snippet source")val router1: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router1")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L183-L184 "Go to snippet source")ActorRef router1 =
    getContext().actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router1");
```

RoundRobinPool defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L354-L355 "Go to snippet source")val router2: ActorRef =
  context.actorOf(RoundRobinPool(5).props(Props[Worker]()), "router2")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L188-L189 "Go to snippet source")ActorRef router2 =
    getContext().actorOf(new RoundRobinPool(5).props(Props.create(Worker.class)), "router2");
```

RoundRobinGroup defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L44-L49 "Go to snippet source")akka.actor.deployment {
  /parent/router3 {
    router = round-robin-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L359-L360 "Go to snippet source")val router3: ActorRef =
  context.actorOf(FromConfig.props(), "router3")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L193 "Go to snippet source")ActorRef router3 = getContext().actorOf(FromConfig.getInstance().props(), "router3");
```

RoundRobinGroup defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L345 "Go to snippet source")val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router4: ActorRef =
  context.actorOf(RoundRobinGroup(paths).props(), "router4")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L179 "Go to snippet source")List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
ActorRef router4 = getContext().actorOf(new RoundRobinGroup(paths).props(), "router4");
```

### RandomPool and RandomGroup

This router type selects one of its routees randomly for each message.

RandomPool defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L53-L58 "Go to snippet source")akka.actor.deployment {
  /parent/router5 {
    router = random-pool
    nr-of-instances = 5
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L369-L370 "Go to snippet source")val router5: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router5")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L201-L202 "Go to snippet source")ActorRef router5 =
    getContext().actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router5");
```

RandomPool defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L374-L375 "Go to snippet source")val router6: ActorRef =
  context.actorOf(RandomPool(5).props(Props[Worker]()), "router6")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L206-L207 "Go to snippet source")ActorRef router6 =
    getContext().actorOf(new RandomPool(5).props(Props.create(Worker.class)), "router6");
```

RandomGroup defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L62-L67 "Go to snippet source")akka.actor.deployment {
  /parent/router7 {
    router = random-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L379-L380 "Go to snippet source")val router7: ActorRef =
  context.actorOf(FromConfig.props(), "router7")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L211 "Go to snippet source")ActorRef router7 = getContext().actorOf(FromConfig.getInstance().props(), "router7");
```

RandomGroup defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L345 "Go to snippet source")val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router8: ActorRef =
  context.actorOf(RandomGroup(paths).props(), "router8")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L179 "Go to snippet source")List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
ActorRef router8 = getContext().actorOf(new RandomGroup(paths).props(), "router8");
```

### BalancingPool

A Router that will try to redistribute work from busy routees to idle routees. All routees share the same mailbox.

Note
The BalancingPool has the property that its routees do not have truly distinct identity: they have different names, but talking to them will not end up at the right actor in most cases. Therefore you cannot use it for workflows that require state to be kept within the routee, you would in this case have to include the whole state in the messages.

With a [SmallestMailboxPool](routing.html#smallestmailboxpool) you can have a vertically scaling service that can interact in a stateful fashion with other services in the back\-end before replying to the original client. The other advantage is that it does not place a restriction on the message queue implementation as BalancingPool does.

Note
Do not use [Broadcast Messages](routing.html#broadcast-messages) when you use [BalancingPool](routing.html#balancing-pool) for routers, as described in [Specially Handled Messages](routing.html#router-special-messages).

BalancingPool defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L71-L76 "Go to snippet source")akka.actor.deployment {
  /parent/router9 {
    router = balancing-pool
    nr-of-instances = 5
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L389-L390 "Go to snippet source")val router9: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router9")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L219-L220 "Go to snippet source")ActorRef router9 =
    getContext().actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router9");
```

BalancingPool defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L394-L395 "Go to snippet source")val router10: ActorRef =
  context.actorOf(BalancingPool(5).props(Props[Worker]()), "router10")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L224-L225 "Go to snippet source")ActorRef router10 =
    getContext().actorOf(new BalancingPool(5).props(Props.create(Worker.class)), "router10");
```

Addition configuration for the balancing dispatcher, which is used by the pool, can be configured in the `pool-dispatcher` section of the router deployment configuration.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L80-L88 "Go to snippet source")akka.actor.deployment {
  /parent/router9b {
    router = balancing-pool
    nr-of-instances = 5
    pool-dispatcher {
      attempt-teamwork = off
    }
  }
}
```

The [`BalancingPool`](https://doc.akka.io/api/akka-core/2.10/akka/routing/BalancingPool.html "akka.routing.BalancingPool")[`BalancingPool`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/BalancingPool.html "akka.routing.BalancingPool") automatically uses a special `BalancingDispatcher` for its routees \- disregarding any dispatcher that is set on the routee Props object. This is needed in order to implement the balancing semantics via sharing the same mailbox by all the routees.

While it is not possible to change the dispatcher used by the routees, it is possible to fine tune the used *executor*. By default the `fork-join-dispatcher` is used and can be configured as explained in [Dispatchers](dispatchers.html). In situations where the routees are expected to perform blocking operations it may be useful to replace it with a `thread-pool-executor` hinting the number of allocated threads explicitly:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L92-L106 "Go to snippet source")akka.actor.deployment {
  /parent/router10b {
    router = balancing-pool
    nr-of-instances = 5
    pool-dispatcher {
      executor = "thread-pool-executor"

      # allocate exactly 5 threads for this pool
      thread-pool-executor {
        core-pool-size-min = 5
        core-pool-size-max = 5
      }
    }
  }
}
```

It is also possible to change the `mailbox` used by the balancing dispatcher for scenarios where the default unbounded mailbox is not well suited. An example of such a scenario could arise whether there exists the need to manage priority for each message. You can then implement a priority mailbox and configure your dispatcher:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L110-L118 "Go to snippet source")akka.actor.deployment {
  /parent/router10c {
    router = balancing-pool
    nr-of-instances = 5
    pool-dispatcher {
      mailbox = myapp.myprioritymailbox
    }
  }
}
```
Note
Bear in mind that `BalancingDispatcher` requires a message queue that must be thread\-safe for multiple concurrent consumers. So it is mandatory for the message queue backing a custom mailbox for this kind of dispatcher to implement akka.dispatch.MultipleConsumerSemantics. See details on how to implement your custom mailbox in [Mailboxes](mailboxes.html).

There is no Group variant of the BalancingPool.

### SmallestMailboxPool

A Router that tries to send to the non\-suspended child routee with fewest messages in mailbox. The selection is done in this order:

- pick any idle routee (not processing message) with empty mailbox
- pick any routee with empty mailbox
- pick routee with fewest pending messages in mailbox
- pick any remote routee, remote actors are consider lowest priority, since their mailbox size is unknown

SmallestMailboxPool defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L122-L127 "Go to snippet source")akka.actor.deployment {
  /parent/router11 {
    router = smallest-mailbox-pool
    nr-of-instances = 5
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L410-L411 "Go to snippet source")val router11: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router11")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L229-L231 "Go to snippet source")ActorRef router11 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router11");
```

SmallestMailboxPool defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L415-L416 "Go to snippet source")val router12: ActorRef =
  context.actorOf(SmallestMailboxPool(5).props(Props[Worker]()), "router12")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L235-L237 "Go to snippet source")ActorRef router12 =
    getContext()
        .actorOf(new SmallestMailboxPool(5).props(Props.create(Worker.class)), "router12");
```

There is no Group variant of the SmallestMailboxPool because the size of the mailbox and the internal dispatching state of the actor is not practically available from the paths of the routees.

### BroadcastPool and BroadcastGroup

A broadcast router forwards the message it receives to *all* its routees.

BroadcastPool defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L131-L136 "Go to snippet source")akka.actor.deployment {
  /parent/router13 {
    router = broadcast-pool
    nr-of-instances = 5
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L420-L421 "Go to snippet source")val router13: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router13")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L241-L243 "Go to snippet source")ActorRef router13 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router13");
```

BroadcastPool defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L425-L426 "Go to snippet source")val router14: ActorRef =
  context.actorOf(BroadcastPool(5).props(Props[Worker]()), "router14")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L247-L248 "Go to snippet source")ActorRef router14 =
    getContext().actorOf(new BroadcastPool(5).props(Props.create(Worker.class)), "router14");
```

BroadcastGroup defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L140-L145 "Go to snippet source")akka.actor.deployment {
  /parent/router15 {
    router = broadcast-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L430-L431 "Go to snippet source")val router15: ActorRef =
  context.actorOf(FromConfig.props(), "router15")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L252 "Go to snippet source")ActorRef router15 = getContext().actorOf(FromConfig.getInstance().props(), "router15");
```

BroadcastGroup defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L345 "Go to snippet source")val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router16: ActorRef =
  context.actorOf(BroadcastGroup(paths).props(), "router16")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L179 "Go to snippet source")List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
ActorRef router16 = getContext().actorOf(new BroadcastGroup(paths).props(), "router16");
```

Note
Broadcast routers always broadcast *every* message to their routees. If you do not want to broadcast every message, then you can use a non\-broadcasting router and use [Broadcast Messages](#broadcast-messages) as needed.

### ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

The ScatterGatherFirstCompletedRouter will send the message on to all its routees. It then waits for first reply it gets back. This result will be sent back to original sender. Other replies are discarded.

It is expecting at least one reply within a configured duration, otherwise it will reply with [`AskTimeoutException`](https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskTimeoutException.html "akka.pattern.AskTimeoutException")[`AskTimeoutException`](https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html "akka.pattern.AskTimeoutException") in a [`Failure`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Status$$Failure.html "akka.actor.Status.Failure")[`Failure`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Failure.html "akka.actor.Status.Failure").

ScatterGatherFirstCompletedPool defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L149-L155 "Go to snippet source")akka.actor.deployment {
  /parent/router17 {
    router = scatter-gather-pool
    nr-of-instances = 5
    within = 10 seconds
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L440-L441 "Go to snippet source")val router17: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router17")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L260-L262 "Go to snippet source")ActorRef router17 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router17");
```

ScatterGatherFirstCompletedPool defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L445-L446 "Go to snippet source")val router18: ActorRef =
  context.actorOf(ScatterGatherFirstCompletedPool(5, within = 10.seconds).props(Props[Worker]()), "router18")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L266-L271 "Go to snippet source")Duration within = Duration.ofSeconds(10);
ActorRef router18 =
    getContext()
        .actorOf(
            new ScatterGatherFirstCompletedPool(5, within).props(Props.create(Worker.class)),
            "router18");
```

ScatterGatherFirstCompletedGroup defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L159-L165 "Go to snippet source")akka.actor.deployment {
  /parent/router19 {
    router = scatter-gather-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
    within = 10 seconds
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L450-L451 "Go to snippet source")val router19: ActorRef =
  context.actorOf(FromConfig.props(), "router19")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L275 "Go to snippet source")ActorRef router19 = getContext().actorOf(FromConfig.getInstance().props(), "router19");
```

ScatterGatherFirstCompletedGroup defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L345 "Go to snippet source")val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router20: ActorRef =
  context.actorOf(ScatterGatherFirstCompletedGroup(paths, within = 10.seconds).props(), "router20")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L179 "Go to snippet source")List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
Duration within2 = Duration.ofSeconds(10);
ActorRef router20 =
    getContext()
        .actorOf(new ScatterGatherFirstCompletedGroup(paths, within2).props(), "router20");
```

### TailChoppingPool and TailChoppingGroup

The TailChoppingRouter will first send the message to one, randomly picked, routee and then after a small delay to a second routee (picked randomly from the remaining routees) and so on. It waits for first reply it gets back and forwards it back to original sender. Other replies are discarded.

The goal of this router is to decrease latency by performing redundant queries to multiple routees, assuming that one of the other actors may still be faster to respond than the initial one.

This optimisation was described nicely in a blog post by Peter Bailis: [Doing redundant work to speed up distributed queries](http://www.bailis.org/blog/doing-redundant-work-to-speed-up-distributed-queries/).

TailChoppingPool defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L169-L176 "Go to snippet source")akka.actor.deployment {
  /parent/router21 {
    router = tail-chopping-pool
    nr-of-instances = 5
    within = 10 seconds
    tail-chopping-router.interval = 20 milliseconds
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L460-L461 "Go to snippet source")val router21: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router21")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L286-L288 "Go to snippet source")ActorRef router21 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router21");
```

TailChoppingPool defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L465-L466 "Go to snippet source")val router22: ActorRef =
  context.actorOf(TailChoppingPool(5, within = 10.seconds, interval = 20.millis).props(Props[Worker]()), "router22")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L292-L298 "Go to snippet source")Duration within3 = Duration.ofSeconds(10);
Duration interval = Duration.ofMillis(20);
ActorRef router22 =
    getContext()
        .actorOf(
            new TailChoppingPool(5, within3, interval).props(Props.create(Worker.class)),
            "router22");
```

TailChoppingGroup defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L180-L187 "Go to snippet source")akka.actor.deployment {
  /parent/router23 {
    router = tail-chopping-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
    within = 10 seconds
    tail-chopping-router.interval = 20 milliseconds
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L470-L471 "Go to snippet source")val router23: ActorRef =
  context.actorOf(FromConfig.props(), "router23")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L302 "Go to snippet source")ActorRef router23 = getContext().actorOf(FromConfig.getInstance().props(), "router23");
```

TailChoppingGroup defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L345 "Go to snippet source")val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router24: ActorRef =
  context.actorOf(TailChoppingGroup(paths, within = 10.seconds, interval = 20.millis).props(), "router24")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L179 "Go to snippet source")List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
Duration within4 = Duration.ofSeconds(10);
Duration interval2 = Duration.ofMillis(20);
ActorRef router24 =
    getContext().actorOf(new TailChoppingGroup(paths, within4, interval2).props(), "router24");
```

### ConsistentHashingPool and ConsistentHashingGroup

The ConsistentHashingPool uses [consistent hashing](https://en.wikipedia.org/wiki/Consistent_hashing) to select a routee based on the sent message. This [article](https://tom-e-white.com/2007/11/consistent-hashing.html) gives good insight into how consistent hashing is implemented.

There is 3 ways to define what data to use for the consistent hash key.

- You can define [`hashMapping`](https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingPool.html#hashMapping:akka.routing.ConsistentHashingRouter.ConsistentHashMapping "akka.routing.ConsistentHashingPool")[`withHashMapper`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRoutingLogic.html#withHashMapper(akka.routing.ConsistentHashingRouter.ConsistentHashMapper) "akka.routing.ConsistentHashingRoutingLogic") of the router to map incoming messages to their consistent hash key. This makes the decision transparent for the sender.
- The messages may implement [`ConsistentHashable`](https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html "akka.routing.ConsistentHashingRouter.ConsistentHashable")[`ConsistentHashable`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRouter.ConsistentHashable.html "akka.routing.ConsistentHashingRouter.ConsistentHashable"). The key is part of the message and it’s convenient to define it together with the message definition.
- The messages can be wrapped in a [`ConsistentHashableEnvelope`](https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html "akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope")[`ConsistentHashableEnvelope`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/ConsistentHashingRouter.ConsistentHashableEnvelope.html "akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope") to define what data to use for the consistent hash key. The sender knows the key to use.

These ways to define the consistent hash key can be use together and at the same time for one router. The `hashMapping``withHashMapper` is tried first.

Code example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/ConsistentHashingRouterDocSpec.scala#L14-L33 "Go to snippet source")import akka.actor.Actor
import akka.routing.ConsistentHashingRouter.ConsistentHashable

class Cache extends Actor {
  var cache = Map.empty[String, String]

  def receive = {
    case Entry(key, value) => cache += (key -> value)
    case Get(key)          => sender() ! cache.get(key)
    case Evict(key)        => cache -= key
  }
}

final case class Evict(key: String)

final case class Get(key: String) extends ConsistentHashable {
  override def consistentHashKey: Any = key
}

final case class Entry(key: String, value: String)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/ConsistentHashingRouterDocTest.java#L43-L114 "Go to snippet source")static class Cache extends AbstractActor {
  Map<String, String> cache = new HashMap<String, String>();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Entry.class,
            entry -> {
              cache.put(entry.key, entry.value);
            })
        .match(
            Get.class,
            get -> {
              Object value = cache.get(get.key);
              getSender().tell(value == null ? NOT_FOUND : value, getSelf());
            })
        .match(
            Evict.class,
            evict -> {
              cache.remove(evict.key);
            })
        .build();
  }
}

static final class Evict implements Serializable {
  private static final long serialVersionUID = 1L;
  public final String key;

  public Evict(String key) {
    this.key = key;
  }
}

static final class Get implements Serializable, ConsistentHashable {
  private static final long serialVersionUID = 1L;
  public final String key;

  public Get(String key) {
    this.key = key;
  }

  public Object consistentHashKey() {
    return key;
  }
}

static final class Entry implements Serializable {
  private static final long serialVersionUID = 1L;
  public final String key;
  public final String value;

  public Entry(String key, String value) {
    this.key = key;
    this.value = value;
  }
}

static final String NOT_FOUND = "NOT_FOUND";
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/ConsistentHashingRouterDocSpec.scala#L47-L71 "Go to snippet source")import akka.actor.Props
import akka.routing.ConsistentHashingPool
import akka.routing.ConsistentHashingRouter.ConsistentHashMapping
import akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope

def hashMapping: ConsistentHashMapping = {
  case Evict(key) => key
}

val cache: ActorRef =
  context.actorOf(ConsistentHashingPool(10, hashMapping = hashMapping).props(Props[Cache]()), name = "cache")

cache ! ConsistentHashableEnvelope(message = Entry("hello", "HELLO"), hashKey = "hello")
cache ! ConsistentHashableEnvelope(message = Entry("hi", "HI"), hashKey = "hi")

cache ! Get("hello")
expectMsg(Some("HELLO"))

cache ! Get("hi")
expectMsg(Some("HI"))

cache ! Evict("hi")
cache ! Get("hi")
expectMsg(None)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/ConsistentHashingRouterDocTest.java#L124-L156 "Go to snippet source")  
final ConsistentHashMapper hashMapper =
    new ConsistentHashMapper() {
      @Override
      public Object hashKey(Object message) {
        if (message instanceof Evict) {
          return ((Evict) message).key;
        } else {
          return null;
        }
      }
    };

ActorRef cache =
    system.actorOf(
        new ConsistentHashingPool(10)
            .withHashMapper(hashMapper)
            .props(Props.create(Cache.class)),
        "cache");

cache.tell(new ConsistentHashableEnvelope(new Entry("hello", "HELLO"), "hello"), getRef());
cache.tell(new ConsistentHashableEnvelope(new Entry("hi", "HI"), "hi"), getRef());

cache.tell(new Get("hello"), getRef());
expectMsgEquals("HELLO");

cache.tell(new Get("hi"), getRef());
expectMsgEquals("HI");

cache.tell(new Evict("hi"), getRef());
cache.tell(new Get("hi"), getRef());
expectMsgEquals(NOT_FOUND);

```

In the above example you see that the `Get` message implements `ConsistentHashable` itself, while the `Entry` message is wrapped in a `ConsistentHashableEnvelope`. The `Evict` message is handled by the `hashMapping` partial function.

ConsistentHashingPool defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L191-L197 "Go to snippet source")akka.actor.deployment {
  /parent/router25 {
    router = consistent-hashing-pool
    nr-of-instances = 5
    virtual-nodes-factor = 10
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L480-L481 "Go to snippet source")val router25: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router25")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L313-L315 "Go to snippet source")ActorRef router25 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router25");
```

ConsistentHashingPool defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L485-L486 "Go to snippet source")val router26: ActorRef =
  context.actorOf(ConsistentHashingPool(5).props(Props[Worker]()), "router26")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L319-L321 "Go to snippet source")ActorRef router26 =
    getContext()
        .actorOf(new ConsistentHashingPool(5).props(Props.create(Worker.class)), "router26");
```

ConsistentHashingGroup defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L201-L207 "Go to snippet source")akka.actor.deployment {
  /parent/router27 {
    router = consistent-hashing-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
    virtual-nodes-factor = 10
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L490-L491 "Go to snippet source")val router27: ActorRef =
  context.actorOf(FromConfig.props(), "router27")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L325 "Go to snippet source")ActorRef router27 = getContext().actorOf(FromConfig.getInstance().props(), "router27");
```

ConsistentHashingGroup defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L345 "Go to snippet source")val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router28: ActorRef =
  context.actorOf(ConsistentHashingGroup(paths).props(), "router28")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L179 "Go to snippet source")List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
ActorRef router28 = getContext().actorOf(new ConsistentHashingGroup(paths).props(), "router28");
```

`virtual-nodes-factor` is the number of virtual nodes per routee that is used in the consistent hash node ring to make the distribution more uniform.

## Specially Handled Messages

Most messages sent to router actors will be forwarded according to the routers’ routing logic. However there are a few types of messages that have special behavior.

Note that these special messages, except for the [`Broadcast`](https://doc.akka.io/api/akka-core/2.10/akka/routing/Broadcast.html "akka.routing.Broadcast")[`Broadcast`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Broadcast.html "akka.routing.Broadcast") message, are only handled by self contained router actors and not by the [`Router`](https://doc.akka.io/api/akka-core/2.10/akka/routing/Router.html "akka.routing.Router")[`Router`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Router.html "akka.routing.Router") component described in [A Simple Router](routing.html#simple-router).

### Broadcast Messages

A `Broadcast` message can be used to send a message to *all* of a router’s routees. When a router receives a `Broadcast` message, it will broadcast that message’s *payload* to all routees, no matter how that router would normally route its messages.

The example below shows how you would use a `Broadcast` message to send a very important message to every routee of a router.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L554-L555 "Go to snippet source")import akka.routing.Broadcast
router ! Broadcast("Watch out for Davy Jones' locker")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L387 "Go to snippet source")router.tell(new Broadcast("Watch out for Davy Jones' locker"), getTestActor());
```

In this example the router receives the `Broadcast` message, extracts its payload (`"Watch out for Davy Jones' locker"`), and then sends the payload on to all of the router’s routees. It is up to each routee actor to handle the received payload message.

Note
Do not use [Broadcast Messages](routing.html#broadcast-messages) when you use [BalancingPool](routing.html#balancing-pool) for routers. Routees on [BalancingPool](routing.html#balancing-pool) shares the same mailbox instance, thus some routees can possibly get the broadcast message multiple times, while other routees get no broadcast message.

### PoisonPill Messages

A [`PoisonPill`](https://doc.akka.io/api/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill")[`PoisonPill`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill") message has special handling for all actors, including for routers. When any actor receives a `PoisonPill` message, that actor will be stopped. See the [PoisonPill](actors.html#poison-pill) documentation for details.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L563-L564 "Go to snippet source")import akka.actor.PoisonPill
router ! PoisonPill
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L401 "Go to snippet source")router.tell(PoisonPill.getInstance(), getTestActor());
```

For a router, which normally passes on messages to routees, it is important to realise that `PoisonPill` messages are processed by the router only. `PoisonPill` messages sent to a router will *not* be sent on to routees.

However, a `PoisonPill` message sent to a router may still affect its routees, because it will stop the router and when the router stops it also stops its children. Stopping children is normal actor behavior. The router will stop routees that it has created as children. Each child will process its current message and then stop. This may lead to some messages being unprocessed. See the documentation on [Stopping actors](actors.html#stopping-actors) for more information.

If you wish to stop a router and its routees, but you would like the routees to first process all the messages currently in their mailboxes, then you should not send a `PoisonPill` message to the router. Instead you should wrap a `PoisonPill` message inside a `Broadcast` message so that each routee will receive the `PoisonPill` message. Note that this will stop all routees, even if the routees aren’t children of the router, i.e. even routees programmatically provided to the router.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L572-L574 "Go to snippet source")import akka.actor.PoisonPill
import akka.routing.Broadcast
router ! Broadcast(PoisonPill)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L415 "Go to snippet source")router.tell(new Broadcast(PoisonPill.getInstance()), getTestActor());
```

With the code shown above, each routee will receive a `PoisonPill` message. Each routee will continue to process its messages as normal, eventually processing the `PoisonPill`. This will cause the routee to stop. After all routees have stopped the router will itself be stopped automatically unless it is a dynamic router, e.g. using a resizer.

### Kill Messages

[`Kill`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Kill.html "akka.actor.Kill")[`Kill`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Kill.html "akka.actor.Kill") messages are another type of message that has special handling. See [Killing an Actor](actors.html#killing-actors) for general information about how actors handle `Kill` messages.

When a `Kill` message is sent to a router the router processes the message internally, and does *not* send it on to its routees. The router will throw an [`ActorKilledException`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorKilledException.html "akka.actor.ActorKilledException")[`ActorKilledException`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorKilledException.html "akka.actor.ActorKilledException") and fail. It will then be either resumed, restarted or terminated, depending how it is supervised.

Routees that are children of the router will also be suspended, and will be affected by the supervision directive that is applied to the router. Routees that are not the routers children, i.e. those that were created externally to the router, will not be affected.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L582-L583 "Go to snippet source")import akka.actor.Kill
router ! Kill
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L429 "Go to snippet source")router.tell(Kill.getInstance(), getTestActor());
```

As with the [`PoisonPill`](https://doc.akka.io/api/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill")[`PoisonPill`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html "akka.actor.PoisonPill") message, there is a distinction between killing a router, which indirectly kills its children (who happen to be routees), and killing routees directly (some of whom may not be children.) To kill routees directly the router should be sent a `Kill` message wrapped in a [`Broadcast`](https://doc.akka.io/api/akka-core/2.10/akka/routing/Broadcast.html "akka.routing.Broadcast")[`Broadcast`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Broadcast.html "akka.routing.Broadcast") message.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L591-L593 "Go to snippet source")import akka.actor.Kill
import akka.routing.Broadcast
router ! Broadcast(Kill)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L443 "Go to snippet source")router.tell(new Broadcast(Kill.getInstance()), getTestActor());
```

### Management Messages

- Sending [`GetRoutees`](https://doc.akka.io/api/akka-core/2.10/akka/routing/GetRoutees.html "akka.routing.GetRoutees")[`GetRoutees`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/GetRoutees.html "akka.routing.GetRoutees") to a router actor will make it send back its currently used routees in a [`Routees`](https://doc.akka.io/api/akka-core/2.10/akka/routing/Routees.html "akka.routing.Routees")[`Routees`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Routees.html "akka.routing.Routees") message.
- Sending [`AddRoutee`](https://doc.akka.io/api/akka-core/2.10/akka/routing/AddRoutee.html "akka.routing.AddRoutee")[`AddRoutee`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/AddRoutee.html "akka.routing.AddRoutee") to a router actor will add that routee to its collection of routees.
- Sending [`RemoveRoutee`](https://doc.akka.io/api/akka-core/2.10/akka/routing/RemoveRoutee.html "akka.routing.RemoveRoutee")[`RemoveRoutee`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/RemoveRoutee.html "akka.routing.RemoveRoutee") to a router actor will remove that routee to its collection of routees.
- Sending [`AdjustPoolSize`](https://doc.akka.io/api/akka-core/2.10/akka/routing/AdjustPoolSize.html "akka.routing.AdjustPoolSize")[`AdjustPoolSize`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/AdjustPoolSize.html "akka.routing.AdjustPoolSize") to a pool router actor will add or remove that number of routees to its collection of routees.

These management messages may be handled after other messages, so if you send `AddRoutee` immediately followed by an ordinary message you are not guaranteed that the routees have been changed when the ordinary message is routed. If you need to know when the change has been applied you can send `AddRoutee` followed by `GetRoutees` and when you receive the `Routees` reply you know that the preceding change has been applied.

## Dynamically Resizable Pool

MostAll pools can be used with a fixed number of routees or with a resize strategy to adjust the number of routees dynamically.

There are two types of resizers: the default [`Resizer`](https://doc.akka.io/api/akka-core/2.10/akka/routing/Resizer.html "akka.routing.Resizer")[`Resizer`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html "akka.routing.Resizer") and the [`OptimalSizeExploringResizer`](https://doc.akka.io/api/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.html "akka.routing.OptimalSizeExploringResizer")[`OptimalSizeExploringResizer`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.html "akka.routing.OptimalSizeExploringResizer").

### Default Resizer

The default resizer ramps up and down pool size based on pressure, measured by the percentage of busy routees in the pool. It ramps up pool size if the pressure is higher than a certain threshold and backs off if the pressure is lower than certain threshold. Both thresholds are configurable.

Pool with default resizer defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L255-L264 "Go to snippet source")akka.actor.deployment {
  /parent/router29 {
    router = round-robin-pool
    resizer {
      lower-bound = 2
      upper-bound = 15
      messages-per-resize = 100
    }
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L500-L501 "Go to snippet source")val router29: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router29")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L333-L335 "Go to snippet source")ActorRef router29 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router29");
```

Several more configuration options are available and described in `akka.actor.deployment.default.resizer` section of the reference [configuration](general/configuration.html).

Pool with resizer defined in code:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L505-L507 "Go to snippet source")val resizer = DefaultResizer(lowerBound = 2, upperBound = 15)
val router30: ActorRef =
  context.actorOf(RoundRobinPool(5, Some(resizer)).props(Props[Worker]()), "router30")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L339-L344 "Go to snippet source")DefaultResizer resizer = new DefaultResizer(2, 15);
ActorRef router30 =
    getContext()
        .actorOf(
            new RoundRobinPool(5).withResizer(resizer).props(Props.create(Worker.class)),
            "router30");
```

*It is also worth pointing out that if you define the `router` in the configuration file then this value will be used instead of any programmatically sent parameters.*

### Optimal Size Exploring Resizer

The [`OptimalSizeExploringResizer`](https://doc.akka.io/api/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.html "akka.routing.OptimalSizeExploringResizer")[`OptimalSizeExploringResizer`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.html "akka.routing.OptimalSizeExploringResizer") resizes the pool to an optimal size that provides the most message throughput.

This resizer works best when you expect the pool size to performance function to be a convex function. For example, when you have a CPU bound tasks, the optimal size is bound to the number of CPU cores. When your task is IO bound, the optimal size is bound to optimal number of concurrent connections to that IO service \- e.g. a 4 node elastic search cluster may handle 4\-8 concurrent requests at optimal speed.

It achieves this by keeping track of message throughput at each pool size and performing the following three resizing operations (one at a time) periodically:

- Downsize if it hasn’t seen all routees ever fully utilized for a period of time.
- Explore to a random nearby pool size to try and collect throughput metrics.
- Optimize to a nearby pool size with a better (than any other nearby sizes) throughput metrics.

When the pool is fully\-utilized (i.e. all routees are busy), it randomly choose between exploring and optimizing. When the pool has not been fully\-utilized for a period of time, it will downsize the pool to the last seen max utilization multiplied by a configurable ratio.

By constantly exploring and optimizing, the resizer will eventually walk to the optimal size and remain nearby. When the optimal size changes it will start walking towards the new one.

It keeps a performance log so it’s stateful as well as having a larger memory footprint than the default `Resizer`. The memory usage is O(n) where n is the number of sizes you allow, i.e. upperBound \- lowerBound.

Pool with `OptimalSizeExploringResizer` defined in configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L268-L277 "Go to snippet source")akka.actor.deployment {
  /parent/router31 {
    router = round-robin-pool
    optimal-size-exploring-resizer {
      enabled = on
      action-interval = 5s
      downsize-after-underutilized-for = 72h
    }
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L511-L512 "Go to snippet source")val router31: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router31")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L348-L350 "Go to snippet source")ActorRef router31 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router31");
```

Several more configuration options are available and described in `akka.actor.deployment.default.optimal-size-exploring-resizer` section of the reference [configuration](general/configuration.html).

Note
Resizing is triggered by sending messages to the actor pool, but it is not completed synchronously; instead a message is sent to the “head” `RouterActor` to perform the size change. Thus you cannot rely on resizing to instantaneously create new workers when all others are busy, because the message just sent will be queued to the mailbox of a busy actor. To remedy this, configure the pool to use a balancing dispatcher, see [Configuring Dispatchers](#configuring-dispatchers) for more information.

## How Routing is Designed within Akka

On the surface routers look like normal actors, but they are actually implemented differently. Routers are designed to be extremely efficient at receiving messages and passing them quickly on to routees.

A normal actor can be used for routing messages, but an actor’s single\-threaded processing can become a bottleneck. Routers can achieve much higher throughput with an optimization to the usual message\-processing pipeline that allows concurrent routing. This is achieved by embedding routers’ routing logic directly in their [`ActorRef`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef") rather than in the router actor. Messages sent to a router’s `ActorRef` can be immediately routed to the routee, bypassing the single\-threaded router actor entirely.

The cost to this is that the internals of routing code are more complicated than if routers were implemented with normal actors. Fortunately all of this complexity is invisible to consumers of the routing API. However, it is something to be aware of when implementing your own routers.

## Custom Router

You can create your own router should you not find any of the ones provided by Akka sufficient for your needs. In order to roll your own router you have to fulfill certain criteria which are explained in this section.

Before creating your own router you should consider whether a normal actor with router\-like behavior might do the job just as well as a full\-blown router. As explained [above](#router-design), the primary benefit of routers over normal actors is their higher performance. But they are somewhat more complicated to write than normal actors. Therefore if lower maximum throughput is acceptable in your application you may wish to stick with traditional actors. This section, however, assumes that you wish to get maximum performance and so demonstrates how you can create your own router.

The router created in this example is replicating each message to a few destinations.

Start with the routing logic:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/CustomRouterDocSpec.scala#L45-L57 "Go to snippet source")import scala.collection.immutable
import akka.routing.RoundRobinRoutingLogic
import akka.routing.RoutingLogic
import akka.routing.Routee
import akka.routing.SeveralRoutees

class RedundancyRoutingLogic(nbrCopies: Int) extends RoutingLogic {
  val roundRobin = RoundRobinRoutingLogic()
  def select(message: Any, routees: immutable.IndexedSeq[Routee]): Routee = {
    val targets = (1 to nbrCopies).map(_ => roundRobin.select(message, routees))
    SeveralRoutees(targets)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/CustomRouterDocTest.java#L49-L66 "Go to snippet source")static class RedundancyRoutingLogic implements RoutingLogic {
  private final int nbrCopies;

  public RedundancyRoutingLogic(int nbrCopies) {
    this.nbrCopies = nbrCopies;
  }

  RoundRobinRoutingLogic roundRobin = new RoundRobinRoutingLogic();

  @Override
  public Routee select(Object message, IndexedSeq<Routee> routees) {
    List<Routee> targets = new ArrayList<Routee>();
    for (int i = 0; i < nbrCopies; i++) {
      targets.add(roundRobin.select(message, routees));
    }
    return new SeveralRoutees(targets);
  }
}
```

`select` will be called for each message and in this example pick a few destinations by round\-robin, by reusing the existing [`RoundRobinRoutingLogic`](https://doc.akka.io/api/akka-core/2.10/akka/routing/RoundRobinRoutingLogic.html "akka.routing.RoundRobinRoutingLogic")[`RoundRobinRoutingLogic`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/RoundRobinRoutingLogic.html "akka.routing.RoundRobinRoutingLogic") and wrap the result in a [`SeveralRoutees`](https://doc.akka.io/api/akka-core/2.10/akka/routing/SeveralRoutees.html "akka.routing.SeveralRoutees")[`SeveralRoutees`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/SeveralRoutees.html "akka.routing.SeveralRoutees") instance. `SeveralRoutees` will send the message to all of the supplied routes.

The implementation of the routing logic must be thread safe, since it might be used outside of actors.

A unit test of the routing logic: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/CustomRouterDocSpec.scala#L67-L113 "Go to snippet source")final case class TestRoutee(n: Int) extends Routee {
  override def send(message: Any, sender: ActorRef): Unit = ()
}

  val logic = new RedundancyRoutingLogic(nbrCopies = 3)

  val routees = for (n <- 1 to 7) yield TestRoutee(n)

  val r1 = logic.select("msg", routees)
  r1.asInstanceOf[SeveralRoutees].routees should be(Vector(TestRoutee(1), TestRoutee(2), TestRoutee(3)))

  val r2 = logic.select("msg", routees)
  r2.asInstanceOf[SeveralRoutees].routees should be(Vector(TestRoutee(4), TestRoutee(5), TestRoutee(6)))

  val r3 = logic.select("msg", routees)
  r3.asInstanceOf[SeveralRoutees].routees should be(Vector(TestRoutee(7), TestRoutee(1), TestRoutee(2)))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/CustomRouterDocTest.java#L71-L131 "Go to snippet source")static final class TestRoutee implements Routee {
  public final int n;

  public TestRoutee(int n) {
    this.n = n;
  }

  @Override
  public void send(Object message, ActorRef sender) {}

  @Override
  public int hashCode() {
    return n;
  }

  @Override
  public boolean equals(Object obj) {
    return (obj instanceof TestRoutee) && n == ((TestRoutee) obj).n;
  }
}

  RedundancyRoutingLogic logic = new RedundancyRoutingLogic(3);

  List<Routee> routeeList = new ArrayList<Routee>();
  for (int n = 1; n <= 7; n++) {
    routeeList.add(new TestRoutee(n));
  }
  IndexedSeq<Routee> routees = immutableIndexedSeq(routeeList);

  SeveralRoutees r1 = (SeveralRoutees) logic.select("msg", routees);
  assertEquals(r1.getRoutees().get(0), routeeList.get(0));
  assertEquals(r1.getRoutees().get(1), routeeList.get(1));
  assertEquals(r1.getRoutees().get(2), routeeList.get(2));

  SeveralRoutees r2 = (SeveralRoutees) logic.select("msg", routees);
  assertEquals(r2.getRoutees().get(0), routeeList.get(3));
  assertEquals(r2.getRoutees().get(1), routeeList.get(4));
  assertEquals(r2.getRoutees().get(2), routeeList.get(5));

  SeveralRoutees r3 = (SeveralRoutees) logic.select("msg", routees);
  assertEquals(r3.getRoutees().get(0), routeeList.get(6));
  assertEquals(r3.getRoutees().get(1), routeeList.get(0));
  assertEquals(r3.getRoutees().get(2), routeeList.get(1));

```

You could stop here and use the `RedundancyRoutingLogic` with a `akka.routing.Router` as described in [A Simple Router](routing.html#simple-router).

Let us continue and make this into a self contained, configurable, router actor.

Create a class that extends [`Pool`](https://doc.akka.io/api/akka-core/2.10/akka/routing/Pool.html "akka.routing.Pool")[`Pool`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Pool.html "akka.routing.Pool"), [`Group`](https://doc.akka.io/api/akka-core/2.10/akka/routing/Group.html "akka.routing.Group")[`Group`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/Group.html "akka.routing.Group") or [`CustomRouterConfig`](https://doc.akka.io/api/akka-core/2.10/akka/routing/CustomRouterConfig.html "akka.routing.CustomRouterConfig")[`CustomRouterConfig`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/CustomRouterConfig.html "akka.routing.CustomRouterConfig"). That class is a factory for the routing logic and holds the configuration for the router. Here we make it a `Group`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/CustomRouterDocSpec.scala#L75-L92 "Go to snippet source")import akka.dispatch.Dispatchers
import akka.routing.Group
import akka.routing.Router
import akka.japi.Util.immutableSeq
import com.typesafe.config.Config

final case class RedundancyGroup(routeePaths: immutable.Iterable[String], nbrCopies: Int) extends Group {

  def this(config: Config) =
    this(routeePaths = immutableSeq(config.getStringList("routees.paths")), nbrCopies = config.getInt("nbr-copies"))

  override def paths(system: ActorSystem): immutable.Iterable[String] = routeePaths

  override def createRouter(system: ActorSystem): Router =
    new Router(new RedundancyRoutingLogic(nbrCopies))

  override val routerDispatcher: String = Dispatchers.DefaultDispatcherId
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RedundancyGroup.java#L8-L44 "Go to snippet source")import static jdocs.routing.CustomRouterDocTest.RedundancyRoutingLogic;

import akka.actor.ActorSystem;
import akka.dispatch.Dispatchers;
import akka.routing.GroupBase;
import akka.routing.Router;
import com.typesafe.config.Config;
import java.util.List;

public class RedundancyGroup extends GroupBase {
  private final List<String> paths;
  private final int nbrCopies;

  public RedundancyGroup(List<String> paths, int nbrCopies) {
    this.paths = paths;
    this.nbrCopies = nbrCopies;
  }

  public RedundancyGroup(Config config) {
    this(config.getStringList("routees.paths"), config.getInt("nbr-copies"));
  }

  @Override
  public java.lang.Iterable<String> getPaths(ActorSystem system) {
    return paths;
  }

  @Override
  public Router createRouter(ActorSystem system) {
    return new Router(new RedundancyRoutingLogic(nbrCopies));
  }

  @Override
  public String routerDispatcher() {
    return Dispatchers.DefaultDispatcherId();
  }
}
```

This can be used exactly as the router actors provided by Akka.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/CustomRouterDocSpec.scala#L120-L125 "Go to snippet source")for (n <- 1 to 10) system.actorOf(Props[Storage](), "s" + n)

val paths = for (n <- 1 to 10) yield ("/user/s" + n)
val redundancy1: ActorRef =
  system.actorOf(RedundancyGroup(paths, nbrCopies = 3).props(), name = "redundancy1")
redundancy1 ! "important"
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/CustomRouterDocTest.java#L140-L150 "Go to snippet source")for (int n = 1; n <= 10; n++) {
  system.actorOf(Props.create(Storage.class), "s" + n);
}

List<String> paths = new ArrayList<String>();
for (int n = 1; n <= 10; n++) {
  paths.add("/user/s" + n);
}

ActorRef redundancy1 = system.actorOf(new RedundancyGroup(paths, 3).props(), "redundancy1");
redundancy1.tell("important", getTestActor());
```

Note that we added a constructor in `RedundancyGroup` that takes a [`Config`](https://javadoc.io/doc/com.typesafe/config/latest/com/typesafe/config/Config.html "com.typesafe.config.Config") parameter. That makes it possible to define it in configuration.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/CustomRouterDocSpec.scala#L22-L28 "Go to snippet source")akka.actor.deployment {
  /redundancy2 {
    router = "jdocs.routing.RedundancyGroup"
    routees.paths = ["/user/s1", "/user/s2", "/user/s3"]
    nbr-copies = 5
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/CustomRouterDocSpec.scala#L34-L40 "Go to snippet source")akka.actor.deployment {
  /redundancy2 {
    router = "jdocs.routing.RedundancyGroup"
    routees.paths = ["/user/s1", "/user/s2", "/user/s3"]
    nbr-copies = 5
  }
}
```

Note the fully qualified class name in the `router` property. The router class must extend `akka.routing.RouterConfig` (`Pool`, `Group` or `CustomRouterConfig`) and have constructor with one `com.typesafe.config.Config` parameter. The deployment section of the configuration is passed to the constructor.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/CustomRouterDocSpec.scala#L131-L132 "Go to snippet source")val redundancy2: ActorRef = system.actorOf(FromConfig.props(), name = "redundancy2")
redundancy2 ! "very important"
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/CustomRouterDocTest.java#L158-L159 "Go to snippet source")ActorRef redundancy2 = system.actorOf(FromConfig.getInstance().props(), "redundancy2");
redundancy2.tell("very important", getTestActor());
```

## Configuring Dispatchers

The dispatcher for created children of the pool will be taken from [`Props`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html "akka.actor.Props")[`Props`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html "akka.actor.Props") as described in [Dispatchers](dispatchers.html).

To make it easy to define the dispatcher of the routees of the pool you can define the dispatcher inline in the deployment section of the config.

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L281-L290 "Go to snippet source")akka.actor.deployment {
  /poolWithDispatcher {
    router = random-pool
    nr-of-instances = 5
    pool-dispatcher {
      fork-join-executor.parallelism-min = 5
      fork-join-executor.parallelism-max = 5
    }
  }
}
```

That is the only thing you need to do enable a dedicated dispatcher for a pool.

Note
If you use a group of actors and route to their paths, then they will still use the same dispatcher that was configured for them in their `Props`, it is not possible to change an actors dispatcher after it has been created.

The “head” router cannot always run on the same dispatcher, because it does not process the same type of messages, hence this special actor does not use the dispatcher configured in [`Props`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html "akka.actor.Props")[`Props`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html "akka.actor.Props"), but takes the `routerDispatcher` from the [`RouterConfig`](https://doc.akka.io/api/akka-core/2.10/akka/routing/RouterConfig.html "akka.routing.RouterConfig")[`RouterConfig`](https://doc.akka.io/japi/akka-core/2.10/akka/routing/RouterConfig.html "akka.routing.RouterConfig") instead, which defaults to the actor system’s default dispatcher. All standard routers allow setting this property in their constructor or factory method, custom routers have to implement the method in a suitable way.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/routing/RouterDocSpec.scala#L543-L547 "Go to snippet source")val router: ActorRef = system.actorOf(
  // “head” router actor will run on "router-dispatcher" dispatcher
  // Worker routees will run on "pool-dispatcher" dispatcher
  RandomPool(5, routerDispatcher = "router-dispatcher").props(Props[Worker]()),
  name = "poolWithDispatcher")
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/routing/RouterDocTest.java#L373-L377 "Go to snippet source")Props props =
    // “head” router actor will run on "router-dispatcher" dispatcher
    // Worker routees will run on "pool-dispatcher" dispatcher
    new RandomPool(5).withDispatcher("router-dispatcher").props(Props.create(Worker.class));
ActorRef router = system.actorOf(props, "poolWithDispatcher");
```

Note
It is not allowed to configure the `routerDispatcher` to be a [`BalancingDispatcherConfigurator`](https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BalancingDispatcherConfigurator.html "akka.dispatch.BalancingDispatcherConfigurator")[`BalancingDispatcherConfigurator`](https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BalancingDispatcherConfigurator.html "akka.dispatch.BalancingDispatcherConfigurator") since the messages meant for the special router actor cannot be processed by any other actor.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-actor_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-actor_${versions.ScalaBinary}"
}
```

### Example 4: A Simple Router

```scala
import akka.routing.{ ActorRefRoutee, RoundRobinRoutingLogic, Router }

class Master extends Actor {
  var router = {
    val routees = Vector.fill(5) {
      val r = context.actorOf(Props[Worker]())
      context.watch(r)
      ActorRefRoutee(r)
    }
    Router(RoundRobinRoutingLogic(), routees)
  }

  def receive = {
    case w: Work =>
      router.route(w, sender())
    case Terminated(a) =>
      router = router.removeRoutee(a)
      val r = context.actorOf(Props[Worker]())
      context.watch(r)
      router = router.addRoutee(r)
  }
}
```

### Example 5: A Simple Router

```java
static final class Work implements Serializable {
  private static final long serialVersionUID = 1L;
  public final String payload;

  public Work(String payload) {
    this.payload = payload;
  }
}

static class Master extends AbstractActor {

  Router router;

  {
    List<Routee> routees = new ArrayList<Routee>();
    for (int i = 0; i < 5; i++) {
      ActorRef r = getContext().actorOf(Props.create(Worker.class));
      getContext().watch(r);
      routees.add(new ActorRefRoutee(r));
    }
    router = new Router(new RoundRobinRoutingLogic(), routees);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Work.class,
            message -> {
              router.route(message, getSender());
            })
        .match(
            Terminated.class,
            message -> {
              router = router.removeRoutee(message.actor());
              ActorRef r = getContext().actorOf(Props.create(Worker.class));
              getContext().watch(r);
              router = router.addRoutee(new ActorRefRoutee(r));
            })
        .build();
  }
}
```

### Example 6: Pool

```scala
akka.actor.deployment {
  /parent/router1 {
    router = round-robin-pool
    nr-of-instances = 5
  }
}
```

### Example 7: Pool

```scala
val router1: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router1")
```

### Example 8: Pool

```java
ActorRef router1 =
    getContext().actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router1");
```

### Example 9: Pool

```scala
val router2: ActorRef =
  context.actorOf(RoundRobinPool(5).props(Props[Worker]()), "router2")
```

### Example 10: Pool

```java
ActorRef router2 =
    getContext().actorOf(new RoundRobinPool(5).props(Props.create(Worker.class)), "router2");
```

### Example 11: Remote Deployed Routees

```scala
import akka.actor.{ Address, AddressFromURIString }
import akka.remote.routing.RemoteRouterConfig
val addresses =
  Seq(Address("akka", "remotesys", "otherhost", 1234), AddressFromURIString("akka://othersys@anotherhost:1234"))
val routerRemote = system.actorOf(RemoteRouterConfig(RoundRobinPool(5), addresses).props(Props[Echo]()))
```

### Example 12: Remote Deployed Routees

```java
Address[] addresses = {
  new Address("akka", "remotesys", "otherhost", 1234),
  AddressFromURIString.parse("akka://othersys@anotherhost:1234")
};
ActorRef routerRemote =
    system.actorOf(
        new RemoteRouterConfig(new RoundRobinPool(5), addresses)
            .props(Props.create(Echo.class)));
```

### Example 13: Senders

```scala
sender() ! x // replies will go to this actor
```

### Example 14: Senders

```java
getSender().tell("reply", getSelf());
```

### Example 15: Senders

```scala
sender().tell("reply", context.parent) // replies will go back to parent
sender().!("reply")(context.parent) // alternative syntax
```

### Example 16: Senders

```java
getSender().tell("reply", getContext().getParent());
```

### Example 17: Supervision

```scala
val escalator = OneForOneStrategy() {
  case e => testActor ! e; SupervisorStrategy.Escalate
}
val router =
  system.actorOf(RoundRobinPool(1, supervisorStrategy = escalator).props(routeeProps = Props[TestActor]()))
```

### Example 18: Supervision

```java
final SupervisorStrategy strategy =
    new OneForOneStrategy(
        5,
        Duration.ofMinutes(1),
        Collections.<Class<? extends Throwable>>singletonList(Exception.class));
final ActorRef router =
    system.actorOf(
        new RoundRobinPool(5).withSupervisorStrategy(strategy).props(Props.create(Echo.class)));
```

### Example 19: Group

```scala
akka.actor.deployment {
  /parent/router3 {
    router = round-robin-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
  }
}
```

### Example 20: Group

```scala
val router3: ActorRef =
  context.actorOf(FromConfig.props(), "router3")
```

### Example 21: Group

```java
ActorRef router3 = getContext().actorOf(FromConfig.getInstance().props(), "router3");
```

### Example 22: Group

```scala
val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router4: ActorRef =
  context.actorOf(RoundRobinGroup(paths).props(), "router4")
```

### Example 23: Group

```java
List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
ActorRef router4 = getContext().actorOf(new RoundRobinGroup(paths).props(), "router4");
```

### Example 24: Group

```scala
system.actorOf(Props[Workers](), "workers")
```

### Example 25: Group

```java
system.actorOf(Props.create(Workers.class), "workers");
```

### Example 26: Group

```scala
class Workers extends Actor {
  context.actorOf(Props[Worker](), name = "w1")
  context.actorOf(Props[Worker](), name = "w2")
  context.actorOf(Props[Worker](), name = "w3")
  // ...
```

### Example 27: Group

```java
static class Workers extends AbstractActor {
  @Override
  public void preStart() {
    getContext().actorOf(Props.create(Worker.class), "w1");
    getContext().actorOf(Props.create(Worker.class), "w2");
    getContext().actorOf(Props.create(Worker.class), "w3");
  }
  // ...
```

### Example 28: Group

```scala
akka.actor.deployment {
  /parent/remoteGroup {
    router = round-robin-group
    routees.paths = [
      "akka://[email protected]:2552/user/workers/w1",
      "akka://[email protected]:2552/user/workers/w1",
      "akka://[email protected]:2552/user/workers/w1"]
  }
}
```

### Example 29: Router usage

```scala
system.actorOf(Props[Parent](), "parent")
```

### Example 30: Router usage

```java
system.actorOf(Props.create(Parent.class), "parent");
```

### Example 31: RoundRobinPool and RoundRobinGroup

```scala
akka.actor.deployment {
  /parent/router1 {
    router = round-robin-pool
    nr-of-instances = 5
  }
}
```

### Example 32: RoundRobinPool and RoundRobinGroup

```scala
val router1: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router1")
```

### Example 33: RoundRobinPool and RoundRobinGroup

```java
ActorRef router1 =
    getContext().actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router1");
```

### Example 34: RoundRobinPool and RoundRobinGroup

```scala
val router2: ActorRef =
  context.actorOf(RoundRobinPool(5).props(Props[Worker]()), "router2")
```

### Example 35: RoundRobinPool and RoundRobinGroup

```java
ActorRef router2 =
    getContext().actorOf(new RoundRobinPool(5).props(Props.create(Worker.class)), "router2");
```

### Example 36: RoundRobinPool and RoundRobinGroup

```scala
akka.actor.deployment {
  /parent/router3 {
    router = round-robin-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
  }
}
```

### Example 37: RoundRobinPool and RoundRobinGroup

```scala
val router3: ActorRef =
  context.actorOf(FromConfig.props(), "router3")
```

### Example 38: RoundRobinPool and RoundRobinGroup

```java
ActorRef router3 = getContext().actorOf(FromConfig.getInstance().props(), "router3");
```

### Example 39: RoundRobinPool and RoundRobinGroup

```scala
val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router4: ActorRef =
  context.actorOf(RoundRobinGroup(paths).props(), "router4")
```

### Example 40: RoundRobinPool and RoundRobinGroup

```java
List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
ActorRef router4 = getContext().actorOf(new RoundRobinGroup(paths).props(), "router4");
```

### Example 41: RandomPool and RandomGroup

```scala
akka.actor.deployment {
  /parent/router5 {
    router = random-pool
    nr-of-instances = 5
  }
}
```

### Example 42: RandomPool and RandomGroup

```scala
val router5: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router5")
```

### Example 43: RandomPool and RandomGroup

```java
ActorRef router5 =
    getContext().actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router5");
```

### Example 44: RandomPool and RandomGroup

```scala
val router6: ActorRef =
  context.actorOf(RandomPool(5).props(Props[Worker]()), "router6")
```

### Example 45: RandomPool and RandomGroup

```java
ActorRef router6 =
    getContext().actorOf(new RandomPool(5).props(Props.create(Worker.class)), "router6");
```

### Example 46: RandomPool and RandomGroup

```scala
akka.actor.deployment {
  /parent/router7 {
    router = random-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
  }
}
```

### Example 47: RandomPool and RandomGroup

```scala
val router7: ActorRef =
  context.actorOf(FromConfig.props(), "router7")
```

### Example 48: RandomPool and RandomGroup

```java
ActorRef router7 = getContext().actorOf(FromConfig.getInstance().props(), "router7");
```

### Example 49: RandomPool and RandomGroup

```scala
val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router8: ActorRef =
  context.actorOf(RandomGroup(paths).props(), "router8")
```

### Example 50: RandomPool and RandomGroup

```java
List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
ActorRef router8 = getContext().actorOf(new RandomGroup(paths).props(), "router8");
```

### Example 51: BalancingPool

```scala
akka.actor.deployment {
  /parent/router9 {
    router = balancing-pool
    nr-of-instances = 5
  }
}
```

### Example 52: BalancingPool

```scala
val router9: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router9")
```

### Example 53: BalancingPool

```java
ActorRef router9 =
    getContext().actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router9");
```

### Example 54: BalancingPool

```scala
val router10: ActorRef =
  context.actorOf(BalancingPool(5).props(Props[Worker]()), "router10")
```

### Example 55: BalancingPool

```java
ActorRef router10 =
    getContext().actorOf(new BalancingPool(5).props(Props.create(Worker.class)), "router10");
```

### Example 56: BalancingPool

```scala
akka.actor.deployment {
  /parent/router9b {
    router = balancing-pool
    nr-of-instances = 5
    pool-dispatcher {
      attempt-teamwork = off
    }
  }
}
```

### Example 57: BalancingPool

```scala
akka.actor.deployment {
  /parent/router10b {
    router = balancing-pool
    nr-of-instances = 5
    pool-dispatcher {
      executor = "thread-pool-executor"

      # allocate exactly 5 threads for this pool
      thread-pool-executor {
        core-pool-size-min = 5
        core-pool-size-max = 5
      }
    }
  }
}
```

### Example 58: BalancingPool

```scala
akka.actor.deployment {
  /parent/router10c {
    router = balancing-pool
    nr-of-instances = 5
    pool-dispatcher {
      mailbox = myapp.myprioritymailbox
    }
  }
}
```

### Example 59: SmallestMailboxPool

```scala
akka.actor.deployment {
  /parent/router11 {
    router = smallest-mailbox-pool
    nr-of-instances = 5
  }
}
```

### Example 60: SmallestMailboxPool

```scala
val router11: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router11")
```

### Example 61: SmallestMailboxPool

```java
ActorRef router11 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router11");
```

### Example 62: SmallestMailboxPool

```scala
val router12: ActorRef =
  context.actorOf(SmallestMailboxPool(5).props(Props[Worker]()), "router12")
```

### Example 63: SmallestMailboxPool

```java
ActorRef router12 =
    getContext()
        .actorOf(new SmallestMailboxPool(5).props(Props.create(Worker.class)), "router12");
```

### Example 64: BroadcastPool and BroadcastGroup

```scala
akka.actor.deployment {
  /parent/router13 {
    router = broadcast-pool
    nr-of-instances = 5
  }
}
```

### Example 65: BroadcastPool and BroadcastGroup

```scala
val router13: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router13")
```

### Example 66: BroadcastPool and BroadcastGroup

```java
ActorRef router13 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router13");
```

### Example 67: BroadcastPool and BroadcastGroup

```scala
val router14: ActorRef =
  context.actorOf(BroadcastPool(5).props(Props[Worker]()), "router14")
```

### Example 68: BroadcastPool and BroadcastGroup

```java
ActorRef router14 =
    getContext().actorOf(new BroadcastPool(5).props(Props.create(Worker.class)), "router14");
```

### Example 69: BroadcastPool and BroadcastGroup

```scala
akka.actor.deployment {
  /parent/router15 {
    router = broadcast-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
  }
}
```

### Example 70: BroadcastPool and BroadcastGroup

```scala
val router15: ActorRef =
  context.actorOf(FromConfig.props(), "router15")
```

### Example 71: BroadcastPool and BroadcastGroup

```java
ActorRef router15 = getContext().actorOf(FromConfig.getInstance().props(), "router15");
```

### Example 72: BroadcastPool and BroadcastGroup

```scala
val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router16: ActorRef =
  context.actorOf(BroadcastGroup(paths).props(), "router16")
```

### Example 73: BroadcastPool and BroadcastGroup

```java
List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
ActorRef router16 = getContext().actorOf(new BroadcastGroup(paths).props(), "router16");
```

### Example 74: ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

```scala
akka.actor.deployment {
  /parent/router17 {
    router = scatter-gather-pool
    nr-of-instances = 5
    within = 10 seconds
  }
}
```

### Example 75: ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

```scala
val router17: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router17")
```

### Example 76: ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

```java
ActorRef router17 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router17");
```

### Example 77: ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

```scala
val router18: ActorRef =
  context.actorOf(ScatterGatherFirstCompletedPool(5, within = 10.seconds).props(Props[Worker]()), "router18")
```

### Example 78: ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

```java
Duration within = Duration.ofSeconds(10);
ActorRef router18 =
    getContext()
        .actorOf(
            new ScatterGatherFirstCompletedPool(5, within).props(Props.create(Worker.class)),
            "router18");
```

### Example 79: ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

```scala
akka.actor.deployment {
  /parent/router19 {
    router = scatter-gather-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
    within = 10 seconds
  }
}
```

### Example 80: ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

```scala
val router19: ActorRef =
  context.actorOf(FromConfig.props(), "router19")
```

### Example 81: ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

```java
ActorRef router19 = getContext().actorOf(FromConfig.getInstance().props(), "router19");
```

### Example 82: ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

```scala
val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router20: ActorRef =
  context.actorOf(ScatterGatherFirstCompletedGroup(paths, within = 10.seconds).props(), "router20")
```

### Example 83: ScatterGatherFirstCompletedPool and ScatterGatherFirstCompletedGroup

```java
List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
Duration within2 = Duration.ofSeconds(10);
ActorRef router20 =
    getContext()
        .actorOf(new ScatterGatherFirstCompletedGroup(paths, within2).props(), "router20");
```

### Example 84: TailChoppingPool and TailChoppingGroup

```scala
akka.actor.deployment {
  /parent/router21 {
    router = tail-chopping-pool
    nr-of-instances = 5
    within = 10 seconds
    tail-chopping-router.interval = 20 milliseconds
  }
}
```

### Example 85: TailChoppingPool and TailChoppingGroup

```scala
val router21: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router21")
```

### Example 86: TailChoppingPool and TailChoppingGroup

```java
ActorRef router21 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router21");
```

### Example 87: TailChoppingPool and TailChoppingGroup

```scala
val router22: ActorRef =
  context.actorOf(TailChoppingPool(5, within = 10.seconds, interval = 20.millis).props(Props[Worker]()), "router22")
```

### Example 88: TailChoppingPool and TailChoppingGroup

```java
Duration within3 = Duration.ofSeconds(10);
Duration interval = Duration.ofMillis(20);
ActorRef router22 =
    getContext()
        .actorOf(
            new TailChoppingPool(5, within3, interval).props(Props.create(Worker.class)),
            "router22");
```

### Example 89: TailChoppingPool and TailChoppingGroup

```scala
akka.actor.deployment {
  /parent/router23 {
    router = tail-chopping-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
    within = 10 seconds
    tail-chopping-router.interval = 20 milliseconds
  }
}
```

### Example 90: TailChoppingPool and TailChoppingGroup

```scala
val router23: ActorRef =
  context.actorOf(FromConfig.props(), "router23")
```

### Example 91: TailChoppingPool and TailChoppingGroup

```java
ActorRef router23 = getContext().actorOf(FromConfig.getInstance().props(), "router23");
```

### Example 92: TailChoppingPool and TailChoppingGroup

```scala
val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router24: ActorRef =
  context.actorOf(TailChoppingGroup(paths, within = 10.seconds, interval = 20.millis).props(), "router24")
```

### Example 93: TailChoppingPool and TailChoppingGroup

```java
List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
Duration within4 = Duration.ofSeconds(10);
Duration interval2 = Duration.ofMillis(20);
ActorRef router24 =
    getContext().actorOf(new TailChoppingGroup(paths, within4, interval2).props(), "router24");
```

### Example 94: ConsistentHashingPool and ConsistentHashingGroup

```scala
import akka.actor.Actor
import akka.routing.ConsistentHashingRouter.ConsistentHashable

class Cache extends Actor {
  var cache = Map.empty[String, String]

  def receive = {
    case Entry(key, value) => cache += (key -> value)
    case Get(key)          => sender() ! cache.get(key)
    case Evict(key)        => cache -= key
  }
}

final case class Evict(key: String)

final case class Get(key: String) extends ConsistentHashable {
  override def consistentHashKey: Any = key
}

final case class Entry(key: String, value: String)
```

### Example 95: ConsistentHashingPool and ConsistentHashingGroup

```java
static class Cache extends AbstractActor {
  Map<String, String> cache = new HashMap<String, String>();

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            Entry.class,
            entry -> {
              cache.put(entry.key, entry.value);
            })
        .match(
            Get.class,
            get -> {
              Object value = cache.get(get.key);
              getSender().tell(value == null ? NOT_FOUND : value, getSelf());
            })
        .match(
            Evict.class,
            evict -> {
              cache.remove(evict.key);
            })
        .build();
  }
}

static final class Evict implements Serializable {
  private static final long serialVersionUID = 1L;
  public final String key;

  public Evict(String key) {
    this.key = key;
  }
}

static final class Get implements Serializable, ConsistentHashable {
  private static final long serialVersionUID = 1L;
  public final String key;

  public Get(String key) {
    this.key = key;
  }

  public Object consistentHashKey() {
    return key;
  }
}

static final class Entry implements Serializable {
  private static final long serialVersionUID = 1L;
  public final String key;
  public final String value;

  public Entry(String key, String value) {
    this.key = key;
    this.value = value;
  }
}

static final String NOT_FOUND = "NOT_FOUND";
```

### Example 96: ConsistentHashingPool and ConsistentHashingGroup

```scala
import akka.actor.Props
import akka.routing.ConsistentHashingPool
import akka.routing.ConsistentHashingRouter.ConsistentHashMapping
import akka.routing.ConsistentHashingRouter.ConsistentHashableEnvelope

def hashMapping: ConsistentHashMapping = {
  case Evict(key) => key
}

val cache: ActorRef =
  context.actorOf(ConsistentHashingPool(10, hashMapping = hashMapping).props(Props[Cache]()), name = "cache")

cache ! ConsistentHashableEnvelope(message = Entry("hello", "HELLO"), hashKey = "hello")
cache ! ConsistentHashableEnvelope(message = Entry("hi", "HI"), hashKey = "hi")

cache ! Get("hello")
expectMsg(Some("HELLO"))

cache ! Get("hi")
expectMsg(Some("HI"))

cache ! Evict("hi")
cache ! Get("hi")
expectMsg(None)
```

### Example 97: ConsistentHashingPool and ConsistentHashingGroup

```java
final ConsistentHashMapper hashMapper =
    new ConsistentHashMapper() {
      @Override
      public Object hashKey(Object message) {
        if (message instanceof Evict) {
          return ((Evict) message).key;
        } else {
          return null;
        }
      }
    };

ActorRef cache =
    system.actorOf(
        new ConsistentHashingPool(10)
            .withHashMapper(hashMapper)
            .props(Props.create(Cache.class)),
        "cache");

cache.tell(new ConsistentHashableEnvelope(new Entry("hello", "HELLO"), "hello"), getRef());
cache.tell(new ConsistentHashableEnvelope(new Entry("hi", "HI"), "hi"), getRef());

cache.tell(new Get("hello"), getRef());
expectMsgEquals("HELLO");

cache.tell(new Get("hi"), getRef());
expectMsgEquals("HI");

cache.tell(new Evict("hi"), getRef());
cache.tell(new Get("hi"), getRef());
expectMsgEquals(NOT_FOUND);
```

### Example 98: ConsistentHashingPool and ConsistentHashingGroup

```scala
akka.actor.deployment {
  /parent/router25 {
    router = consistent-hashing-pool
    nr-of-instances = 5
    virtual-nodes-factor = 10
  }
}
```

### Example 99: ConsistentHashingPool and ConsistentHashingGroup

```scala
val router25: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router25")
```

### Example 100: ConsistentHashingPool and ConsistentHashingGroup

```java
ActorRef router25 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router25");
```

### Example 101: ConsistentHashingPool and ConsistentHashingGroup

```scala
val router26: ActorRef =
  context.actorOf(ConsistentHashingPool(5).props(Props[Worker]()), "router26")
```

### Example 102: ConsistentHashingPool and ConsistentHashingGroup

```java
ActorRef router26 =
    getContext()
        .actorOf(new ConsistentHashingPool(5).props(Props.create(Worker.class)), "router26");
```

### Example 103: ConsistentHashingPool and ConsistentHashingGroup

```scala
akka.actor.deployment {
  /parent/router27 {
    router = consistent-hashing-group
    routees.paths = ["/user/workers/w1", "/user/workers/w2", "/user/workers/w3"]
    virtual-nodes-factor = 10
  }
}
```

### Example 104: ConsistentHashingPool and ConsistentHashingGroup

```scala
val router27: ActorRef =
  context.actorOf(FromConfig.props(), "router27")
```

### Example 105: ConsistentHashingPool and ConsistentHashingGroup

```java
ActorRef router27 = getContext().actorOf(FromConfig.getInstance().props(), "router27");
```

### Example 106: ConsistentHashingPool and ConsistentHashingGroup

```scala
val paths = List("/user/workers/w1", "/user/workers/w2", "/user/workers/w3")
val router28: ActorRef =
  context.actorOf(ConsistentHashingGroup(paths).props(), "router28")
```

### Example 107: ConsistentHashingPool and ConsistentHashingGroup

```java
List<String> paths = Arrays.asList("/user/workers/w1", "/user/workers/w2", "/user/workers/w3");
ActorRef router28 = getContext().actorOf(new ConsistentHashingGroup(paths).props(), "router28");
```

### Example 108: Broadcast Messages

```scala
import akka.routing.Broadcast
router ! Broadcast("Watch out for Davy Jones' locker")
```

### Example 109: Broadcast Messages

```java
router.tell(new Broadcast("Watch out for Davy Jones' locker"), getTestActor());
```

### Example 110: PoisonPill Messages

```scala
import akka.actor.PoisonPill
router ! PoisonPill
```

### Example 111: PoisonPill Messages

```java
router.tell(PoisonPill.getInstance(), getTestActor());
```

### Example 112: PoisonPill Messages

```scala
import akka.actor.PoisonPill
import akka.routing.Broadcast
router ! Broadcast(PoisonPill)
```

### Example 113: PoisonPill Messages

```java
router.tell(new Broadcast(PoisonPill.getInstance()), getTestActor());
```

### Example 114: Kill Messages

```scala
import akka.actor.Kill
router ! Kill
```

### Example 115: Kill Messages

```java
router.tell(Kill.getInstance(), getTestActor());
```

### Example 116: Kill Messages

```scala
import akka.actor.Kill
import akka.routing.Broadcast
router ! Broadcast(Kill)
```

### Example 117: Kill Messages

```java
router.tell(new Broadcast(Kill.getInstance()), getTestActor());
```

### Example 118: Default Resizer

```scala
akka.actor.deployment {
  /parent/router29 {
    router = round-robin-pool
    resizer {
      lower-bound = 2
      upper-bound = 15
      messages-per-resize = 100
    }
  }
}
```

### Example 119: Default Resizer

```scala
val router29: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router29")
```

### Example 120: Default Resizer

```java
ActorRef router29 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router29");
```

### Example 121: Default Resizer

```scala
val resizer = DefaultResizer(lowerBound = 2, upperBound = 15)
val router30: ActorRef =
  context.actorOf(RoundRobinPool(5, Some(resizer)).props(Props[Worker]()), "router30")
```

### Example 122: Default Resizer

```java
DefaultResizer resizer = new DefaultResizer(2, 15);
ActorRef router30 =
    getContext()
        .actorOf(
            new RoundRobinPool(5).withResizer(resizer).props(Props.create(Worker.class)),
            "router30");
```

### Example 123: Optimal Size Exploring Resizer

```scala
akka.actor.deployment {
  /parent/router31 {
    router = round-robin-pool
    optimal-size-exploring-resizer {
      enabled = on
      action-interval = 5s
      downsize-after-underutilized-for = 72h
    }
  }
}
```

### Example 124: Optimal Size Exploring Resizer

```scala
val router31: ActorRef =
  context.actorOf(FromConfig.props(Props[Worker]()), "router31")
```

### Example 125: Optimal Size Exploring Resizer

```java
ActorRef router31 =
    getContext()
        .actorOf(FromConfig.getInstance().props(Props.create(Worker.class)), "router31");
```

### Example 126: Custom Router

```scala
import scala.collection.immutable
import akka.routing.RoundRobinRoutingLogic
import akka.routing.RoutingLogic
import akka.routing.Routee
import akka.routing.SeveralRoutees

class RedundancyRoutingLogic(nbrCopies: Int) extends RoutingLogic {
  val roundRobin = RoundRobinRoutingLogic()
  def select(message: Any, routees: immutable.IndexedSeq[Routee]): Routee = {
    val targets = (1 to nbrCopies).map(_ => roundRobin.select(message, routees))
    SeveralRoutees(targets)
  }
}
```

### Example 127: Custom Router

```java
static class RedundancyRoutingLogic implements RoutingLogic {
  private final int nbrCopies;

  public RedundancyRoutingLogic(int nbrCopies) {
    this.nbrCopies = nbrCopies;
  }

  RoundRobinRoutingLogic roundRobin = new RoundRobinRoutingLogic();

  @Override
  public Routee select(Object message, IndexedSeq<Routee> routees) {
    List<Routee> targets = new ArrayList<Routee>();
    for (int i = 0; i < nbrCopies; i++) {
      targets.add(roundRobin.select(message, routees));
    }
    return new SeveralRoutees(targets);
  }
}
```

### Example 128: Custom Router

```scala
final case class TestRoutee(n: Int) extends Routee {
  override def send(message: Any, sender: ActorRef): Unit = ()
}

  val logic = new RedundancyRoutingLogic(nbrCopies = 3)

  val routees = for (n <- 1 to 7) yield TestRoutee(n)

  val r1 = logic.select("msg", routees)
  r1.asInstanceOf[SeveralRoutees].routees should be(Vector(TestRoutee(1), TestRoutee(2), TestRoutee(3)))

  val r2 = logic.select("msg", routees)
  r2.asInstanceOf[SeveralRoutees].routees should be(Vector(TestRoutee(4), TestRoutee(5), TestRoutee(6)))

  val r3 = logic.select("msg", routees)
  r3.asInstanceOf[SeveralRoutees].routees should be(Vector(TestRoutee(7), TestRoutee(1), TestRoutee(2)))
```

### Example 129: Custom Router

```java
static final class TestRoutee implements Routee {
  public final int n;

  public TestRoutee(int n) {
    this.n = n;
  }

  @Override
  public void send(Object message, ActorRef sender) {}

  @Override
  public int hashCode() {
    return n;
  }

  @Override
  public boolean equals(Object obj) {
    return (obj instanceof TestRoutee) && n == ((TestRoutee) obj).n;
  }
}

  RedundancyRoutingLogic logic = new RedundancyRoutingLogic(3);

  List<Routee> routeeList = new ArrayList<Routee>();
  for (int n = 1; n <= 7; n++) {
    routeeList.add(new TestRoutee(n));
  }
  IndexedSeq<Routee> routees = immutableIndexedSeq(routeeList);

  SeveralRoutees r1 = (SeveralRoutees) logic.select("msg", routees);
  assertEquals(r1.getRoutees().get(0), routeeList.get(0));
  assertEquals(r1.getRoutees().get(1), routeeList.get(1));
  assertEquals(r1.getRoutees().get(2), routeeList.get(2));

  SeveralRoutees r2 = (SeveralRoutees) logic.select("msg", routees);
  assertEquals(r2.getRoutees().get(0), routeeList.get(3));
  assertEquals(r2.getRoutees().get(1), routeeList.get(4));
  assertEquals(r2.getRoutees().get(2), routeeList.get(5));

  SeveralRoutees r3 = (SeveralRoutees) logic.select("msg", routees);
  assertEquals(r3.getRoutees().get(0), routeeList.get(6));
  assertEquals(r3.getRoutees().get(1), routeeList.get(0));
  assertEquals(r3.getRoutees().get(2), routeeList.get(1));
```

### Example 130: Custom Router

```scala
import akka.dispatch.Dispatchers
import akka.routing.Group
import akka.routing.Router
import akka.japi.Util.immutableSeq
import com.typesafe.config.Config

final case class RedundancyGroup(routeePaths: immutable.Iterable[String], nbrCopies: Int) extends Group {

  def this(config: Config) =
    this(routeePaths = immutableSeq(config.getStringList("routees.paths")), nbrCopies = config.getInt("nbr-copies"))

  override def paths(system: ActorSystem): immutable.Iterable[String] = routeePaths

  override def createRouter(system: ActorSystem): Router =
    new Router(new RedundancyRoutingLogic(nbrCopies))

  override val routerDispatcher: String = Dispatchers.DefaultDispatcherId
}
```

### Example 131: Custom Router

```java
import static jdocs.routing.CustomRouterDocTest.RedundancyRoutingLogic;

import akka.actor.ActorSystem;
import akka.dispatch.Dispatchers;
import akka.routing.GroupBase;
import akka.routing.Router;
import com.typesafe.config.Config;
import java.util.List;

public class RedundancyGroup extends GroupBase {
  private final List<String> paths;
  private final int nbrCopies;

  public RedundancyGroup(List<String> paths, int nbrCopies) {
    this.paths = paths;
    this.nbrCopies = nbrCopies;
  }

  public RedundancyGroup(Config config) {
    this(config.getStringList("routees.paths"), config.getInt("nbr-copies"));
  }

  @Override
  public java.lang.Iterable<String> getPaths(ActorSystem system) {
    return paths;
  }

  @Override
  public Router createRouter(ActorSystem system) {
    return new Router(new RedundancyRoutingLogic(nbrCopies));
  }

  @Override
  public String routerDispatcher() {
    return Dispatchers.DefaultDispatcherId();
  }
}
```

### Example 132: Custom Router

```scala
for (n <- 1 to 10) system.actorOf(Props[Storage](), "s" + n)

val paths = for (n <- 1 to 10) yield ("/user/s" + n)
val redundancy1: ActorRef =
  system.actorOf(RedundancyGroup(paths, nbrCopies = 3).props(), name = "redundancy1")
redundancy1 ! "important"
```

### Example 133: Custom Router

```java
for (int n = 1; n <= 10; n++) {
  system.actorOf(Props.create(Storage.class), "s" + n);
}

List<String> paths = new ArrayList<String>();
for (int n = 1; n <= 10; n++) {
  paths.add("/user/s" + n);
}

ActorRef redundancy1 = system.actorOf(new RedundancyGroup(paths, 3).props(), "redundancy1");
redundancy1.tell("important", getTestActor());
```

### Example 134: Custom Router

```scala
akka.actor.deployment {
  /redundancy2 {
    router = "jdocs.routing.RedundancyGroup"
    routees.paths = ["/user/s1", "/user/s2", "/user/s3"]
    nbr-copies = 5
  }
}
```

### Example 135: Custom Router

```scala
akka.actor.deployment {
  /redundancy2 {
    router = "jdocs.routing.RedundancyGroup"
    routees.paths = ["/user/s1", "/user/s2", "/user/s3"]
    nbr-copies = 5
  }
}
```

### Example 136: Custom Router

```scala
val redundancy2: ActorRef = system.actorOf(FromConfig.props(), name = "redundancy2")
redundancy2 ! "very important"
```

### Example 137: Custom Router

```java
ActorRef redundancy2 = system.actorOf(FromConfig.getInstance().props(), "redundancy2");
redundancy2.tell("very important", getTestActor());
```

### Example 138: Configuring Dispatchers

```scala
akka.actor.deployment {
  /poolWithDispatcher {
    router = random-pool
    nr-of-instances = 5
    pool-dispatcher {
      fork-join-executor.parallelism-min = 5
      fork-join-executor.parallelism-max = 5
    }
  }
}
```

### Example 139: Configuring Dispatchers

```scala
val router: ActorRef = system.actorOf(
  // “head” router actor will run on "router-dispatcher" dispatcher
  // Worker routees will run on "pool-dispatcher" dispatcher
  RandomPool(5, routerDispatcher = "router-dispatcher").props(Props[Worker]()),
  name = "poolWithDispatcher")
```

### Example 140: Configuring Dispatchers

```java
Props props =
    // “head” router actor will run on "router-dispatcher" dispatcher
    // Worker routees will run on "pool-dispatcher" dispatcher
    new RandomPool(5).withDispatcher("router-dispatcher").props(Props.create(Worker.class));
ActorRef router = system.actorOf(props, "poolWithDispatcher");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorKilledException.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Kill.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Status$$Failure.html
- https://doc.akka.io/api/akka-core/2.10/akka/dispatch/BalancingDispatcherConfigurator.html
- https://doc.akka.io/api/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10/akka/remote/routing/RemoteRouterConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ActorRefRoutee.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/AddRoutee.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/AdjustPoolSize.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/BalancingPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Broadcast.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/BroadcastRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingPool.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$$ConsistentHashable.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRouter$$ConsistentHashableEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ConsistentHashingRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/CustomRouterConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/GetRoutees.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Group.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/OptimalSizeExploringResizer.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Pool.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RandomRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RemoveRoutee.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Resizer.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RoundRobinRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Routees.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/Router.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RouterConfig.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/RoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/ScatterGatherFirstCompletedRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/SeveralRoutees.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/SmallestMailboxRoutingLogic.html
- https://doc.akka.io/api/akka-core/2.10/akka/routing/TailChoppingRoutingLogic.html
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorKilledException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Kill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Status.Failure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/dispatch/BalancingDispatcherConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/remote/routing/RemoteRouterConfig.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/ActorRefRoutee.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/routing.html](https://doc.akka.io/libraries/akka-core/current/routing.html)*