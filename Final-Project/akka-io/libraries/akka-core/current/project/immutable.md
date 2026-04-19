---
description: Data immutability using Project Lombok
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:04Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/project/immutable.html
title: Immutability using Lombok • Akka core
---

# Immutability using Lombok • Akka core

> **Summary:** Data immutability using Project Lombok

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Immutability using Lombok

A preferred best practice in Akka is to have immutable messages. Scala provides case class which makes it extremely easy to have short and clean classes for creating immutable objects, but no such facility is easily available in Java. We can make use of several third party libraries which help is achieving this. One good example is Lombok.

Project Lombok is a java library that automatically plugs into your editor and build tools, and helps get rid of much of the boilerplate code for java development.

Lombok handles the following details for you. It:

- modifies fields to be `private` and `final`
- creates getters for each field
- creates correct `equals`, `hashCode` and a human\-friendly `toString`
- creates a constructor requiring all fields.

### Adding Lombok to your project

To add Lombok to a Maven project, declare it as a simple dependency:

Maven
```
<dependencies&gt
  <dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.10</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "org.projectlombok:lombok:1.18.10"
}
```

# Using lombok

```
@Value
public class LombokUser {

  String name;

  String email;
}

```

The example does not demonstrate other useful Lombok features like `@Builder` or `@With` which will help you create builder and copy methods. Be aware that Lombok is not an immutability library but a code generation library which means some setups might not create immutable objects. For example, Lombok’s `@Data` is equivalent to Lombok’s `@Value` but will also synthesize mutable methods. Don’t use Lombok’s `@Data` when creating immutable classes.

Using Lombok for creating a message class for actors is quite simple. In following example, Message class just defines the member variable and Lombok annotation `@Value` takes care of creating methods like getter, toString, hashCode, equals.

```
public class MyActor extends AbstractActor {
        private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

        public Receive createReceive() {
            return receiveBuilder()
            .match(Message.class, message -> {
                System.out.println(message.getMessage());
            })
            .matchAny(o -> log.info("Received unknown message"))
            .build();
        }

        @Value
        public static class Message {
            private String message;

            public Message(String message) {
                this.message = message;
            }
        }
}

```

### Integrating Lombok with an IDE

Lombok integrates with popular IDEs:

- To use Lombok in IntelliJ IDEA you’ll need the [Lombok Plugin for IntelliJ IDEA](https://plugins.jetbrains.com/plugin/6317-lombok) and you’ll also need to enable Annotation Processing (`Settings / Build,Execution,Deployment / Compiler / Annotation Processors` and tick `Enable annotation processing`)
- To Use Lombok in Eclipse, run `java -jar lombok.jar` (see the video at [Project Lombok](https://projectlombok.org/)).

## Code Examples

### Example 1: Adding Lombok to your project

```xml
<dependencies&gt
  <dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.10</version>
  </dependency&gt
</dependencies>
```

### Example 2: Adding Lombok to your project

```gradle
dependencies {
  implementation "org.projectlombok:lombok:1.18.10"
}
```

### Example 3: Using lombok

```text
@Value
public class LombokUser {

  String name;

  String email;
}
```

### Example 4: Using lombok

```text
public class MyActor extends AbstractActor {
        private final LoggingAdapter log = Logging.getLogger(getContext().getSystem(), this);

        public Receive createReceive() {
            return receiveBuilder()
            .match(Message.class, message -> {
                System.out.println(message.getMessage());
            })
            .matchAny(o -> log.info("Received unknown message"))
            .build();
        }

        @Value
        public static class Message {
            private String message;

            public Message(String message) {
                this.message = message;
            }
        }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/additional/ide.html
- https://doc.akka.io/libraries/akka-core/current/project/migration-guides.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/project/immutable.html](https://doc.akka.io/libraries/akka-core/current/project/immutable.html)*