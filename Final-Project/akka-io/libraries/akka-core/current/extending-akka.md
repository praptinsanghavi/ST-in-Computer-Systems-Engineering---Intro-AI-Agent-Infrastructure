---
description: How to extend Akka with Akka Extensions.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/extending-akka.html
title: Classic Akka Extensions • Akka core
---

# Classic Akka Extensions • Akka core

> **Summary:** How to extend Akka with Akka Extensions.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Classic Akka Extensions

If you want to add features to Akka, there is a very elegant, but powerful mechanism for doing so. It’s called Akka Extensions and comprises 2 basic components: an [`Extension`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html "akka.actor.Extension")[`Extension`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html "akka.actor.Extension") and an [`ExtensionId`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html "akka.actor.ExtensionId")[`ExtensionId`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html "akka.actor.ExtensionId").

Extensions will only be loaded once per [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem"), which will be managed by Akka. You can choose to have your Extension loaded on\-demand or at [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") creation time through the Akka configuration. Details on how to make that happens are below, in the [Loading from Configuration](extending-akka.html#loading) section.

Warning
Since an extension is a way to hook into Akka itself, the implementor of the extension needs to ensure the thread safety of his/her extension.

## Building an Extension

So let’s create a sample extension that lets us count the number of times something has happened.

First, we define what our [`Extension`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html "akka.actor.Extension")[`Extension`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html "akka.actor.Extension") should do:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/extension/ExtensionDocSpec.scala#L15-L24 "Go to snippet source")import akka.actor.Extension

class CountExtensionImpl extends Extension {
  //Since this Extension is a shared instance
  // per ActorSystem we need to be threadsafe
  private val counter = new AtomicLong(0)

  //This is the operation this Extension provides
  def increment() = counter.incrementAndGet()
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/extension/ExtensionDocTest.java#L8-L10 "Go to snippet source")import akka.actor.*;
import java.util.concurrent.atomic.AtomicLong;

static class CountExtensionImpl implements Extension {
  // Since this Extension is a shared instance
  // per ActorSystem we need to be threadsafe
  private final AtomicLong counter = new AtomicLong(0);

  // This is the operation this Extension provides
  public long increment() {
    return counter.incrementAndGet();
  }
}

```

Then we need to create an [`ExtensionId`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html "akka.actor.ExtensionId")[`ExtensionId`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html "akka.actor.ExtensionId") for our extension so we can grab a hold of it.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/extension/ExtensionDocSpec.scala#L28-L49 "Go to snippet source")import akka.actor.ActorSystem
import akka.actor.ExtensionId
import akka.actor.ExtensionIdProvider
import akka.actor.ExtendedActorSystem

object CountExtension extends ExtensionId[CountExtensionImpl] with ExtensionIdProvider {
  //The lookup method is required by ExtensionIdProvider,
  // so we return ourselves here, this allows us
  // to configure our extension to be loaded when
  // the ActorSystem starts up
  override def lookup = CountExtension

  //This method will be called by Akka
  // to instantiate our Extension
  override def createExtension(system: ExtendedActorSystem) = new CountExtensionImpl

  /**
   * Java API: retrieve the Count extension for the given system.
   */
  override def get(system: ActorSystem): CountExtensionImpl = super.get(system)
  override def get(system: ClassicActorSystemProvider): CountExtensionImpl = super.get(system)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/extension/ExtensionDocTest.java#L8-L10 "Go to snippet source")import akka.actor.*;
import java.util.concurrent.atomic.AtomicLong;

static class CountExtension extends AbstractExtensionId<CountExtensionImpl>
    implements ExtensionIdProvider {
  // This will be the identifier of our CountExtension
  public static final CountExtension CountExtensionProvider = new CountExtension();

  private CountExtension() {}

  // The lookup method is required by ExtensionIdProvider,
  // so we return ourselves here, this allows us
  // to configure our extension to be loaded when
  // the ActorSystem starts up
  public CountExtension lookup() {
    return CountExtension.CountExtensionProvider; // The public static final
  }

  // This method will be called by Akka
  // to instantiate our Extension
  public CountExtensionImpl createExtension(ExtendedActorSystem system) {
    return new CountExtensionImpl();
  }
}

```

Wicked! Now all we need to do is to actually use it:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/extension/ExtensionDocSpec.scala#L90 "Go to snippet source")CountExtension(system).increment()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/extension/ExtensionDocTest.java#L82-L84 "Go to snippet source")// typically you would use static import of the
// CountExtension.CountExtensionProvider field
CountExtension.CountExtensionProvider.get(system).increment();
```

Or from inside of an Akka Actor:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/extension/ExtensionDocSpec.scala#L64-L70 "Go to snippet source")  
class MyActor extends Actor {
  def receive = {
    case someMessage =>
      CountExtension(context.system).increment()
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/extension/ExtensionDocTest.java#L61-L74 "Go to snippet source")static class MyActor extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchAny(
            msg -> {
              // typically you would use static import of the
              // CountExtension.CountExtensionProvider field
              CountExtension.CountExtensionProvider.get(getContext().getSystem()).increment();
            })
        .build();
  }
}

```

You can also hide extension behind traits:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/extension/ExtensionDocSpec.scala#L74-L82 "Go to snippet source")  
trait Counting { self: Actor =>
  def increment() = CountExtension(context.system).increment()
}
class MyCounterActor extends Actor with Counting {
  def receive = {
    case someMessage => increment()
  }
}
```

That’s all there is to it!

## Loading from Configuration

To be able to load extensions from your Akka configuration you must add FQCNs of implementations of either [`ExtensionId`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html "akka.actor.ExtensionId")[`ExtensionId`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html "akka.actor.ExtensionId") or [`ExtensionIdProvider`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html "akka.actor.ExtensionIdProvider")[`ExtensionIdProvider`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionIdProvider.html "akka.actor.ExtensionIdProvider") in the `akka.extensions` section of the config you provide to your [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/extension/ExtensionDocSpec.scala#L57-L59 "Go to snippet source")akka {
  extensions = ["docs.extension.CountExtension"]
}
```

Java

```
akka {
  extensions = ["docs.extension.ExtensionDocTest.CountExtension"]
}

```

## Applicability

The sky is the limit! By the way, did you know that Akka [Cluster](cluster-usage.html), [Serialization](serialization.html) and other features are implemented as Akka Extensions?

### Application specific settings

The [configuration](general/configuration.html) can be used for application specific settings. A good practice is to place those settings in an Extension.

Sample configuration:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/extension/SettingsExtensionDocSpec.scala#L56-L63 "Go to snippet source")myapp {
  db {
    uri = "mongodb://example1.com:27017,example2.com:27017"
  }
  circuit-breaker {
    timeout = 30 seconds
  }
}
```

The [`Extension`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html "akka.actor.Extension")[`Extension`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html "akka.actor.Extension"):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/extension/SettingsExtensionDocSpec.scala#L8-L21 "Go to snippet source")import akka.actor.ActorSystem
import akka.actor.Extension
import akka.actor.ExtensionId
import akka.actor.ExtensionIdProvider
import akka.actor.ExtendedActorSystem

import scala.concurrent.duration.Duration
import com.typesafe.config.Config

import java.util.concurrent.TimeUnit
import akka.actor.ClassicActorSystemProvider

import scala.annotation.nowarn

class SettingsImpl(config: Config) extends Extension {
  val DbUri: String = config.getString("myapp.db.uri")
  val CircuitBreakerTimeout: Duration =
    Duration(config.getDuration("myapp.circuit-breaker.timeout", TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS)
}
object Settings extends ExtensionId[SettingsImpl] with ExtensionIdProvider {

  override def lookup = Settings

  override def createExtension(system: ExtendedActorSystem) =
    new SettingsImpl(system.settings.config)

  /**
   * Java API: retrieve the Settings extension for the given system.
   */
  override def get(system: ActorSystem): SettingsImpl = super.get(system)
  override def get(system: ClassicActorSystemProvider): SettingsImpl = super.get(system)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/extension/SettingsExtensionDocTest.java#L8-L16 "Go to snippet source")import akka.actor.Extension;
import akka.actor.AbstractExtensionId;
import akka.actor.ExtensionIdProvider;
import akka.actor.ActorSystem;
import akka.actor.ExtendedActorSystem;
import com.typesafe.config.Config;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

static class SettingsImpl implements Extension {

  public final String DB_URI;
  public final Duration CIRCUIT_BREAKER_TIMEOUT;

  public SettingsImpl(Config config) {
    DB_URI = config.getString("myapp.db.uri");
    CIRCUIT_BREAKER_TIMEOUT =
        Duration.ofMillis(
            config.getDuration("myapp.circuit-breaker.timeout", TimeUnit.MILLISECONDS));
  }
}

static class Settings extends AbstractExtensionId<SettingsImpl> implements ExtensionIdProvider {
  public static final Settings SettingsProvider = new Settings();

  private Settings() {}

  public Settings lookup() {
    return Settings.SettingsProvider;
  }

  public SettingsImpl createExtension(ExtendedActorSystem system) {
    return new SettingsImpl(system.settings().config());
  }
}

```

Use it:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/extension/SettingsExtensionDocSpec.scala#L68-L72 "Go to snippet source")  
class MyActor extends Actor {
  val settings = Settings(context.system)
  val connection = connect(settings.DbUri, settings.CircuitBreakerTimeout)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/extension/SettingsExtensionDocTest.java#L62-L78 "Go to snippet source")static class MyActor extends AbstractActor {
  // typically you would use static import of the Settings.SettingsProvider field
  final SettingsImpl settings = Settings.SettingsProvider.get(getContext().getSystem());
  Connection connection = connect(settings.DB_URI, settings.CIRCUIT_BREAKER_TIMEOUT);

}
```

## Library extensions

A third part library may register its extension for auto\-loading on actor system startup by appending it to `akka.library-extensions` in its `reference.conf`.

```
akka.library-extensions += "docs.extension.ExampleExtension"

```

As there is no way to selectively remove such extensions, it should be used with care and only when there is no case where the user would ever want it disabled or have specific support for disabling such sub\-features. One example where this could be important is in tests.

Warning
The`akka.library-extensions` must never be assigned (`= ["Extension"]`) instead of appending as this will break the library\-extension mechanism and make behavior depend on class path ordering.

## Code Examples

### Example 1: Building an Extension

```scala
import akka.actor.Extension

class CountExtensionImpl extends Extension {
  //Since this Extension is a shared instance
  // per ActorSystem we need to be threadsafe
  private val counter = new AtomicLong(0)

  //This is the operation this Extension provides
  def increment() = counter.incrementAndGet()
}
```

### Example 2: Building an Extension

```java
import akka.actor.*;
import java.util.concurrent.atomic.AtomicLong;

static class CountExtensionImpl implements Extension {
  // Since this Extension is a shared instance
  // per ActorSystem we need to be threadsafe
  private final AtomicLong counter = new AtomicLong(0);

  // This is the operation this Extension provides
  public long increment() {
    return counter.incrementAndGet();
  }
}
```

### Example 3: Building an Extension

```scala
import akka.actor.ActorSystem
import akka.actor.ExtensionId
import akka.actor.ExtensionIdProvider
import akka.actor.ExtendedActorSystem

object CountExtension extends ExtensionId[CountExtensionImpl] with ExtensionIdProvider {
  //The lookup method is required by ExtensionIdProvider,
  // so we return ourselves here, this allows us
  // to configure our extension to be loaded when
  // the ActorSystem starts up
  override def lookup = CountExtension

  //This method will be called by Akka
  // to instantiate our Extension
  override def createExtension(system: ExtendedActorSystem) = new CountExtensionImpl

  /**
   * Java API: retrieve the Count extension for the given system.
   */
  override def get(system: ActorSystem): CountExtensionImpl = super.get(system)
  override def get(system: ClassicActorSystemProvider): CountExtensionImpl = super.get(system)
}
```

### Example 4: Building an Extension

```java
import akka.actor.*;
import java.util.concurrent.atomic.AtomicLong;

static class CountExtension extends AbstractExtensionId<CountExtensionImpl>
    implements ExtensionIdProvider {
  // This will be the identifier of our CountExtension
  public static final CountExtension CountExtensionProvider = new CountExtension();

  private CountExtension() {}

  // The lookup method is required by ExtensionIdProvider,
  // so we return ourselves here, this allows us
  // to configure our extension to be loaded when
  // the ActorSystem starts up
  public CountExtension lookup() {
    return CountExtension.CountExtensionProvider; // The public static final
  }

  // This method will be called by Akka
  // to instantiate our Extension
  public CountExtensionImpl createExtension(ExtendedActorSystem system) {
    return new CountExtensionImpl();
  }
}
```

### Example 5: Building an Extension

```scala
CountExtension(system).increment()
```

### Example 6: Building an Extension

```java
// typically you would use static import of the
// CountExtension.CountExtensionProvider field
CountExtension.CountExtensionProvider.get(system).increment();
```

### Example 7: Building an Extension

```scala
class MyActor extends Actor {
  def receive = {
    case someMessage =>
      CountExtension(context.system).increment()
  }
}
```

### Example 8: Building an Extension

```java
static class MyActor extends AbstractActor {
  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchAny(
            msg -> {
              // typically you would use static import of the
              // CountExtension.CountExtensionProvider field
              CountExtension.CountExtensionProvider.get(getContext().getSystem()).increment();
            })
        .build();
  }
}
```

### Example 9: Building an Extension

```scala
trait Counting { self: Actor =>
  def increment() = CountExtension(context.system).increment()
}
class MyCounterActor extends Actor with Counting {
  def receive = {
    case someMessage => increment()
  }
}
```

### Example 10: Loading from Configuration

```scala
akka {
  extensions = ["docs.extension.CountExtension"]
}
```

### Example 11: Loading from Configuration

```text
akka {
  extensions = ["docs.extension.ExtensionDocTest.CountExtension"]
}
```

### Example 12: Application specific settings

```scala
myapp {
  db {
    uri = "mongodb://example1.com:27017,example2.com:27017"
  }
  circuit-breaker {
    timeout = 30 seconds
  }
}
```

### Example 13: Application specific settings

```scala
import akka.actor.ActorSystem
import akka.actor.Extension
import akka.actor.ExtensionId
import akka.actor.ExtensionIdProvider
import akka.actor.ExtendedActorSystem

import scala.concurrent.duration.Duration
import com.typesafe.config.Config

import java.util.concurrent.TimeUnit
import akka.actor.ClassicActorSystemProvider

import scala.annotation.nowarn

class SettingsImpl(config: Config) extends Extension {
  val DbUri: String = config.getString("myapp.db.uri")
  val CircuitBreakerTimeout: Duration =
    Duration(config.getDuration("myapp.circuit-breaker.timeout", TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS)
}
object Settings extends ExtensionId[SettingsImpl] with ExtensionIdProvider {

  override def lookup = Settings

  override def createExtension(system: ExtendedActorSystem) =
    new SettingsImpl(system.settings.config)

  /**
   * Java API: retrieve the Settings extension for the given system.
   */
  override def get(system: ActorSystem): SettingsImpl = super.get(system)
  override def get(system: ClassicActorSystemProvider): SettingsImpl = super.get(system)
}
```

### Example 14: Application specific settings

```java
import akka.actor.Extension;
import akka.actor.AbstractExtensionId;
import akka.actor.ExtensionIdProvider;
import akka.actor.ActorSystem;
import akka.actor.ExtendedActorSystem;
import com.typesafe.config.Config;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

static class SettingsImpl implements Extension {

  public final String DB_URI;
  public final Duration CIRCUIT_BREAKER_TIMEOUT;

  public SettingsImpl(Config config) {
    DB_URI = config.getString("myapp.db.uri");
    CIRCUIT_BREAKER_TIMEOUT =
        Duration.ofMillis(
            config.getDuration("myapp.circuit-breaker.timeout", TimeUnit.MILLISECONDS));
  }
}

static class Settings extends AbstractExtensionId<SettingsImpl> implements ExtensionIdProvider {
  public static final Settings SettingsProvider = new Settings();

  private Settings() {}

  public Settings lookup() {
    return Settings.SettingsProvider;
  }

  public SettingsImpl createExtension(ExtendedActorSystem system) {
    return new SettingsImpl(system.settings().config());
  }
}
```

### Example 15: Application specific settings

```scala
class MyActor extends Actor {
  val settings = Settings(context.system)
  val connection = connect(settings.DbUri, settings.CircuitBreakerTimeout)
```

### Example 16: Application specific settings

```java
static class MyActor extends AbstractActor {
  // typically you would use static import of the Settings.SettingsProvider field
  final SettingsImpl settings = Settings.SettingsProvider.get(getContext().getSystem());
  Connection connection = connect(settings.DB_URI, settings.CIRCUIT_BREAKER_TIMEOUT);

}
```

### Example 17: Library extensions

```text
akka.library-extensions += "docs.extension.ExampleExtension"
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/libraries/akka-core/current/cluster-usage.html
- https://doc.akka.io/libraries/akka-core/current/extending-akka.html
- https://doc.akka.io/libraries/akka-core/current/general/configuration.html
- https://doc.akka.io/libraries/akka-core/current/scheduler.html
- https://doc.akka.io/libraries/akka-core/current/serialization.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/extending-akka.html](https://doc.akka.io/libraries/akka-core/current/extending-akka.html)*