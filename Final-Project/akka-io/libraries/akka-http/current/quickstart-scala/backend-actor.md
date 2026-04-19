---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/../quickstart-scala/backend-actor.html
title: Backend Actor logic • Akka HTTP Quickstart for Scala
---

# Backend Actor logic • Akka HTTP Quickstart for Scala

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

## Backend Actor logic

In this example, the backend only uses one basic actor. In a real system, we would have many actors interacting with each other and perhaps, multiple data stores and microservices. 

An interesting side\-note to add here is about when using actors in applications like this adds value over just providing functions that would return `Future`s. In fact, if your logic is stateless and very simple request/reply style, you may not need to back it with an Actor. Actors do shine however when you need to keep some form of state and allow various requests to access something in (or *through*) an Actor. The other stellar feature of actors, that futures would not handle, is scaling\-out onto a cluster very easily, by using [Cluster Sharding](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html) or other [location\-transparent](https://doc.akka.io/libraries/akka-core/2.10/general/remoting.html) techniques.

However, the focus of this tutorial is on how to interact with an Actor backend from within Akka HTTP – not on the actor itself, so we’ll keep it very simple.

The sample code in the `UserRegistry` is very simple. It keeps registered users in a `Set`. Once it receives messages it matches them to the defined cases to determine which action to take:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/samples/akka-http-quickstart-scala/src/main/scala/com/example/UserRegistry.scala#L4-L42 "Go to snippet source")import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors
import scala.collection.immutable

final case class User(name: String, age: Int, countryOfResidence: String)
final case class Users(users: immutable.Seq[User])

object UserRegistry {
  // actor protocol
  sealed trait Command
  final case class GetUsers(replyTo: ActorRef[Users]) extends Command
  final case class CreateUser(user: User, replyTo: ActorRef[ActionPerformed]) extends Command
  final case class GetUser(name: String, replyTo: ActorRef[GetUserResponse]) extends Command
  final case class DeleteUser(name: String, replyTo: ActorRef[ActionPerformed]) extends Command

  final case class GetUserResponse(maybeUser: Option[User])
  final case class ActionPerformed(description: String)

  def apply(): Behavior[Command] = registry(Set.empty)

  private def registry(users: Set[User]): Behavior[Command] =
    Behaviors.receiveMessage {
      case GetUsers(replyTo) =>
        replyTo ! Users(users.toSeq)
        Behaviors.same
      case CreateUser(user, replyTo) =>
        replyTo ! ActionPerformed(s"User ${user.name} created.")
        registry(users + user)
      case GetUser(name, replyTo) =>
        replyTo ! GetUserResponse(users.find(_.name == name))
        Behaviors.same
      case DeleteUser(name, replyTo) =>
        replyTo ! ActionPerformed(s"User $name deleted.")
        registry(users.filterNot(_.name == name))
    }
}
```

If you feel you need to brush up on your Akka Actor knowledge, the [Getting Started Guide](https://doc.akka.io/libraries/akka-core/2.10/guide/index.html) reviews actor concepts in the context of a simple Internet of Things (IoT) example.

## Code Examples

### Example 1: Backend Actor logic

```scala
import akka.actor.typed.ActorRef
import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors
import scala.collection.immutable

final case class User(name: String, age: Int, countryOfResidence: String)
final case class Users(users: immutable.Seq[User])

object UserRegistry {
  // actor protocol
  sealed trait Command
  final case class GetUsers(replyTo: ActorRef[Users]) extends Command
  final case class CreateUser(user: User, replyTo: ActorRef[ActionPerformed]) extends Command
  final case class GetUser(name: String, replyTo: ActorRef[GetUserResponse]) extends Command
  final case class DeleteUser(name: String, replyTo: ActorRef[ActionPerformed]) extends Command

  final case class GetUserResponse(maybeUser: Option[User])
  final case class ActionPerformed(description: String)

  def apply(): Behavior[Command] = registry(Set.empty)

  private def registry(users: Set[User]): Behavior[Command] =
    Behaviors.receiveMessage {
      case GetUsers(replyTo) =>
        replyTo ! Users(users.toSeq)
        Behaviors.same
      case CreateUser(user, replyTo) =>
        replyTo ! ActionPerformed(s"User ${user.name} created.")
        registry(users + user)
      case GetUser(name, replyTo) =>
        replyTo ! GetUserResponse(users.find(_.name == name))
        Behaviors.same
      case DeleteUser(name, replyTo) =>
        replyTo ! ActionPerformed(s"User $name deleted.")
        registry(users.filterNot(_.name == name))
    }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/general/remoting.html
- https://doc.akka.io/libraries/akka-core/2.10/guide/index.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-http/current/quickstart-scala/http-server.html
- https://doc.akka.io/libraries/akka-http/current/quickstart-scala/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/quickstart-scala/backend-actor.html](https://doc.akka.io/libraries/akka-http/current/quickstart-scala/backend-actor.html)*