---
description: 'Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and
  client.'
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:39Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-http/current/../quickstart-java/backend-actor.html
title: Backend Actor logic • Akka HTTP Quickstart for Java
---

# Backend Actor logic • Akka HTTP Quickstart for Java

> **Summary:** Akka Http: Modern, fast, asynchronous, streaming-first HTTP server and client.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

## Backend Actor logic

In this example, the backend only uses one basic actor. In a real system, we would have many actors interacting with each other and perhaps, multiple data stores and microservices. 

An interesting side\-note to add here is about when using actors in applications like this adds value over just providing functions that would return `CompletionStage`s. In fact, if your logic is stateless and very simple request/reply style, you may not need to back it with an Actor. Actors do shine when you need to keep some form of state and allow various requests to access something in (or *through*) an Actor. The other stellar feature of actors, that futures would not handle, is scaling\-out onto a cluster very easily, by using [Cluster Sharding](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html) or other [location\-transparent](https://doc.akka.io/libraries/akka-core/2.10/general/remoting.html) techniques.

However, the focus of this tutorial is on how to interact with an Actor backend from within Akka HTTP – not on the actor itself, so we’ll keep it very simple.

The sample code in the `UserRegistry` is very simple. It keeps registered users in a `Set`. Once it receives messages it matches them to the defined cases to determine which action to take:

```
[source](https://github.com/akka/akka-http/tree/v10.7.4/samples/akka-http-quickstart-java/src/main/java/com/example/UserRegistry.java#L15-L87 "Go to snippet source")public class UserRegistry extends AbstractBehavior<UserRegistry.Command>  {

  // actor protocol
  sealed interface Command {}

  public final static record GetUsers(ActorRef<Users> replyTo) implements Command {}

  public final static record CreateUser(User user, ActorRef<ActionPerformed> replyTo) implements Command {}

  public final static record GetUserResponse(Optional<User> maybeUser) {}

  public final static record GetUser(String name, ActorRef<GetUserResponse> replyTo) implements Command {}

  public final static record DeleteUser(String name, ActorRef<ActionPerformed> replyTo) implements Command {}

  public final static record ActionPerformed(String description) implements Command {}

  public final static record User(String name, int age, String countryOfResidence) {}

  public final static record Users(List<User> users) {}

  private final List<User> users = new ArrayList<>();

  private UserRegistry(ActorContext<Command> context) {
    super(context);
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(UserRegistry::new);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(GetUsers.class, this::onGetUsers)
        .onMessage(CreateUser.class, this::onCreateUser)
        .onMessage(GetUser.class, this::onGetUser)
        .onMessage(DeleteUser.class, this::onDeleteUser)
        .build();
  }

  private Behavior<Command> onGetUsers(GetUsers command) {
    // We must be careful not to send out users since it is mutable
    // so for this response we need to make a defensive copy
    command.replyTo().tell(new Users(Collections.unmodifiableList(new ArrayList<>(users))));
    return this;
  }

  private Behavior<Command> onCreateUser(CreateUser command) {
    users.add(command.user());
    command.replyTo().tell(new ActionPerformed(String.format("User %s created.", command.user().name())));
    return this;
  }

  private Behavior<Command> onGetUser(GetUser command) {
    Optional<User> maybeUser = users.stream()
        .filter(user -> user.name().equals(command.name()))
        .findFirst();
    command.replyTo().tell(new GetUserResponse(maybeUser));
    return this;
  }

  private Behavior<Command> onDeleteUser(DeleteUser command) {
    users.removeIf(user -> user.name().equals(command.name()));
    command.replyTo().tell(new ActionPerformed(String.format("User %s deleted.", command.name)));
    return this;
  }

}
```

If you feel you need to brush up on your Akka Actor knowledge, the [Getting Started Guide](https://doc.akka.io/libraries/akka-core/2.10/guide/index.html)reviews actor concepts in the context of a simple Internet of Things (IoT) example.

## Code Examples

### Example 1: Backend Actor logic

```java
public class UserRegistry extends AbstractBehavior<UserRegistry.Command>  {

  // actor protocol
  sealed interface Command {}

  public final static record GetUsers(ActorRef<Users> replyTo) implements Command {}

  public final static record CreateUser(User user, ActorRef<ActionPerformed> replyTo) implements Command {}

  public final static record GetUserResponse(Optional<User> maybeUser) {}

  public final static record GetUser(String name, ActorRef<GetUserResponse> replyTo) implements Command {}


  public final static record DeleteUser(String name, ActorRef<ActionPerformed> replyTo) implements Command {}


  public final static record ActionPerformed(String description) implements Command {}

  public final static record User(String name, int age, String countryOfResidence) {}

  public final static record Users(List<User> users) {}

  private final List<User> users = new ArrayList<>();

  private UserRegistry(ActorContext<Command> context) {
    super(context);
  }

  public static Behavior<Command> create() {
    return Behaviors.setup(UserRegistry::new);
  }

  @Override
  public Receive<Command> createReceive() {
    return newReceiveBuilder()
        .onMessage(GetUsers.class, this::onGetUsers)
        .onMessage(CreateUser.class, this::onCreateUser)
        .onMessage(GetUser.class, this::onGetUser)
        .onMessage(DeleteUser.class, this::onDeleteUser)
        .build();
  }

  private Behavior<Command> onGetUsers(GetUsers command) {
    // We must be careful not to send out users since it is mutable
    // so for this response we need to make a defensive copy
    command.replyTo().tell(new Users(Collections.unmodifiableList(new ArrayList<>(users))));
    return this;
  }

  private Behavior<Command> onCreateUser(CreateUser command) {
    users.add(command.user());
    command.replyTo().tell(new ActionPerformed(String.format("User %s created.", command.user().name())));
    return this;
  }

  private Behavior<Command> onGetUser(GetUser command) {
    Optional<User> maybeUser = users.stream()
        .filter(user -> user.name().equals(command.name()))
        .findFirst();
    command.replyTo().tell(new GetUserResponse(maybeUser));
    return this;
  }

  private Behavior<Command> onDeleteUser(DeleteUser command) {
    users.removeIf(user -> user.name().equals(command.name()));
    command.replyTo().tell(new ActionPerformed(String.format("User %s deleted.", command.name)));
    return this;
  }

}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/general/remoting.html
- https://doc.akka.io/libraries/akka-core/2.10/guide/index.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-http/current/quickstart-java/http-server.html
- https://doc.akka.io/libraries/akka-http/current/quickstart-java/index.html

---
*Source: [https://doc.akka.io/libraries/akka-http/current/quickstart-java/backend-actor.html](https://doc.akka.io/libraries/akka-http/current/quickstart-java/backend-actor.html)*