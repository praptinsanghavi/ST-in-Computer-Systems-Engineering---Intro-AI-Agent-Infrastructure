---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:38Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/general/configuration.html
title: Configuration • Akka core
---

# Configuration • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Configuration

You can start using Akka without defining any configuration, since sensible default values are provided. Later on you might need to amend the settings to change the default behavior or adapt for specific runtime environments. Typical examples of settings that you might amend:

- [log level and logger backend](../typed/logging.html)
- [enable Cluster](../typed/cluster.html)
- [message serializers](../serialization.html)
- [tuning of dispatchers](../typed/dispatchers.html)

Akka uses the [Typesafe Config Library](https://github.com/lightbend/config), which might also be a good choice for the configuration of your own application or library built with or without Akka. This library is implemented in Java with no external dependencies; This is only a summary of the most important parts for more details see [the config library docs](https://github.com/lightbend/config/blob/master/README.md).

## Where configuration is read from

All configuration for Akka is held within instances of [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem"), or put differently, as viewed from the outside, [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") is the only consumer of configuration information. While constructing an actor system, you can either pass in a [Config](https://lightbend.github.io/config/latest/api/index.html?com/typesafe/config/Config.html) object or not, where the second case is equivalent to passing [ConfigFactory.load()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#load-java.lang.ClassLoader-) (with the right class loader). This means roughly that the default is to parse all `application.conf`, `application.json` and `application.properties` found at the root of the class path—please refer to the aforementioned documentation for details. The actor system then merges in all `reference.conf` resources found at the root of the class path to form the fallback configuration, i.e. it internally uses

```
appConfig.withFallback(ConfigFactory.defaultReference(classLoader))

```

The philosophy is that code never contains default values, but instead relies upon their presence in the `reference.conf` supplied with the library in question.

Highest precedence is given to overrides given as system properties, see [the HOCON specification](https://github.com/typesafehub/config/blob/master/HOCON.md) (near the bottom). Also noteworthy is that the application configuration—which defaults to `application`—may be overridden using the `config.resource` property (there are more, please refer to the [Config docs](https://github.com/typesafehub/config/blob/master/README.md)).

Note
If you are writing an Akka application, keep your configuration in `application.conf` at the root of the class path. If you are writing an Akka\-based library, keep its configuration in `reference.conf` at the root of the JAR file. It’s not supported to override a config property owned by one library in a `reference.conf` of another library.

## License key

Akka requires a license key for use in production. Free keys can be obtained at <https://akka.io/key>. Add the key to the configuration property `akka.license-key`.

For local development, Akka can be used without a key, but be aware that the `ActorSystem` will terminate after a while when a key isn’t configured.

If the license key has expired when the `ActorSystem` is started the system will terminate after a while. The expiry date is exposed by [`ActorSystem.licenseKeyExpiry`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html#licenseKeyExpiry "akka.actor.typed.ActorSystem")[`ActorSystem.getLicenseKeyExpiry`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html#getLicenseKeyExpiry() "akka.actor.typed.ActorSystem") so that you can write a test to remind yourself that it is time for renewal before it has expired.

To verify that your license key is still valid (for example during CI/CD integration), you can use the following test that will start to fail one month before the license key will expire:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/config/ConfigDocSpec.scala#L115-L123 "Go to snippet source")val system = ActorSystem(rootBehavior, "name")
val licenseKey = system.licenseKeyExpiry
licenseKey.isEmpty shouldBe false

import java.time.LocalDate
val nextMonth = LocalDate.now().plusMonths(1)
licenseKey.get.isAfter(nextMonth) shouldBe true

system.terminate()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/config/ConfigDocTest.java#L18-L89 "Go to snippet source")import java.time.LocalDate;
import java.util.Optional;

ActorSystem<Void> system = ActorSystem.create(rootBehavior, "name");
Optional<LocalDate> licenseKey = system.getLicenseKeyExpiry();

assertFalse(licenseKey.isEmpty());

LocalDate nextMonth = LocalDate.now().plusMonths(1);
assertTrue(licenseKey.get().isAfter(nextMonth));

system.terminate();
```

## When using JarJar, OneJar, Assembly or any jar\-bundler

Warning
Akka’s configuration approach relies heavily on the notion of every module/jar having its own `reference.conf` file. All of these will be discovered by the configuration and loaded. Unfortunately this also means that if you put/merge multiple jars into the same jar, you need to merge all the `reference.conf` files as well: otherwise all defaults will be lost.

See the [deployment documentation](../additional/deploy.html) for information on how to merge the `reference.conf` resources while bundling.

## Custom application.conf

A custom `application.conf` might look like this:

```
# In this file you can override any option defined in the reference files.
# Copy in parts of the reference files and modify as you please.

akka {

  # Logger config for Akka internals and classic actors, the new API relies
  # directly on SLF4J and your config for the logger backend.

  # Loggers to register at boot time (akka.event.Logging$DefaultLogger logs
  # to STDOUT)
  loggers = ["akka.event.slf4j.Slf4jLogger"]

  # Log level used by the configured loggers (see "loggers") as soon
  # as they have been started; before that, see "stdout-loglevel"
  # Options: OFF, ERROR, WARNING, INFO, DEBUG
  loglevel = "DEBUG"

  # Log level for the very basic logger activated during ActorSystem startup.
  # This logger prints the log messages to stdout (System.out).
  # Options: OFF, ERROR, WARNING, INFO, DEBUG
  stdout-loglevel = "DEBUG"

  # Filter of log events that is used by the LoggingAdapter before
  # publishing log events to the eventStream.
  logging-filter = "akka.event.slf4j.Slf4jLoggingFilter"

  actor {
    provider = "cluster"

    default-dispatcher {
      # Throughput for default Dispatcher, set to 1 for as fair as possible
      throughput = 10
    }
  }

  remote.artery {
    # The port clients should connect to.
    canonical.port = 4711
  }
}

```

## Including files

Sometimes it can be useful to include another configuration file, for example if you have one `application.conf` with all environment independent settings and then override some settings for specific environments.

Specifying system property with `-Dconfig.resource=/dev.conf` will load the `dev.conf` file, which includes the `application.conf`

### dev.conf

```
include "application"

akka {
  loglevel = "DEBUG"
}

```

More advanced include and substitution mechanisms are explained in the [HOCON](https://github.com/typesafehub/config/blob/master/HOCON.md) specification.

## Logging of Configuration

If the system or config property `akka.log-config-on-start` is set to `on`, then the complete configuration is logged at INFO level when the actor system is started. This is useful when you are uncertain of what configuration is used.

If in doubt, you can inspect your configuration objects before or after using them to construct an actor system:

```
Welcome to Scala 2.12 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0).
Type in expressions to have them evaluated.
Type :help for more information.

scala> import com.typesafe.config._
import com.typesafe.config._

scala> ConfigFactory.parseString("a.b=12")
res0: com.typesafe.config.Config = Config(SimpleConfigObject({"a" : {"b" : 12}}))

scala> res0.root.render
res1: java.lang.String =
{
    # String: 1
    "a" : {
        # String: 1
        "b" : 12
    }
}

```

The comments preceding every item give detailed information about the origin of the setting (file \& line number) plus possible comments which were present, e.g. in the reference configuration. The settings as merged with the reference and parsed by the actor system can be displayed like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/config/ConfigDocSpec.scala#L36-L37 "Go to snippet source")val system = ActorSystem(rootBehavior, "MySystem")
system.logConfiguration()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/config/ConfigDocTest.java#L43-L44 "Go to snippet source")ActorSystem<Void> system = ActorSystem.create(rootBehavior, "MySystem");
system.logConfiguration();
```

## A Word About ClassLoaders

In several places of the configuration file it is possible to specify the fully\-qualified class name of something to be instantiated by Akka. This is done using Java reflection, which in turn uses a [`ClassLoader`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html "java.lang.ClassLoader"). Getting the right one in challenging environments like application containers or OSGi bundles is not always trivial, the current approach of Akka is that each [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") implementation stores the current thread’s context class loader (if available, otherwise just its own loader as in [`this.getClass.getClassLoader`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#getClassLoader() "java.lang.Class")) and uses that for all reflective accesses. This implies that putting Akka on the boot class path will yield [`NullPointerException`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/NullPointerException.html "java.lang.NullPointerException") from strange places: this is not supported.

## Application specific settings

The configuration can also be used for application specific settings. A good practice is to place those settings in an [Extension](../extending-akka.html#extending-akka-settings). 

## Configuring multiple ActorSystem

If you have more than one [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") (or you’re writing a library and have an [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") that may be separate from the application’s) you may want to separate the configuration for each system.

Given that [ConfigFactory.load()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#load--) merges all resources with matching name from the whole class path, it is easiest to utilize that functionality and differentiate actor systems within the hierarchy of the configuration:

```
myapp1 {
  akka.loglevel = "WARNING"
  my.own.setting = 43
}
myapp2 {
  akka.loglevel = "ERROR"
  app2.setting = "appname"
}
my.own.setting = 42
my.other.setting = "hello"

```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/config/ConfigDocSpec.scala#L43-L45 "Go to snippet source")val config = ConfigFactory.load()
val app1 = ActorSystem(rootBehavior, "MyApp1", config.getConfig("myapp1").withFallback(config))
val app2 = ActorSystem(rootBehavior, "MyApp2", config.getConfig("myapp2").withOnlyPath("akka").withFallback(config))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/config/ConfigDocTest.java#L50-L57 "Go to snippet source")Config config = ConfigFactory.load();
ActorSystem<Void> app1 =
    ActorSystem.create(rootBehavior, "MyApp1", config.getConfig("myapp1").withFallback(config));
ActorSystem<Void> app2 =
    ActorSystem.create(
        rootBehavior,
        "MyApp2",
        config.getConfig("myapp2").withOnlyPath("akka").withFallback(config));
```

These two samples demonstrate different variations of the “lift\-a\-subtree” trick: in the first case, the configuration accessible from within the actor system is this

```
akka.loglevel = "WARNING"
my.own.setting = 43
my.other.setting = "hello"
// plus myapp1 and myapp2 subtrees

```

while in the second one, only the “akka” subtree is lifted, with the following result

```
akka.loglevel = "ERROR"
my.own.setting = 42
my.other.setting = "hello"
// plus myapp1 and myapp2 subtrees

```
Note
The configuration library is really powerful, explaining all features exceeds the scope affordable here. In particular not covered are how to include other configuration files within other files (see a small example at [Including files](#including-files)) and copying parts of the configuration tree by way of path substitutions.

You may also specify and parse the configuration programmatically in other ways when instantiating the [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/config/ConfigDocSpec.scala#L15-L16 "Go to snippet source")import akka.actor.typed.ActorSystem
import com.typesafe.config.ConfigFactory
val customConf = ConfigFactory.parseString("""
  akka.log-config-on-start = on
""")
// ConfigFactory.load sandwiches customConfig between default reference
// config and default overrides, and then resolves it.
val system = ActorSystem(rootBehavior, "MySystem", ConfigFactory.load(customConf))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/config/ConfigDocTest.java#L8-L13 "Go to snippet source")import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.Behaviors;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

Config customConf = ConfigFactory.parseString("akka.log-config-on-start = on");
// ConfigFactory.load sandwiches customConfig between default reference
// config and default overrides, and then resolves it.
ActorSystem<Void> system =
    ActorSystem.create(rootBehavior, "MySystem", ConfigFactory.load(customConf));
```

## Reading configuration from a custom location

You can replace or supplement `application.conf` either in code or using system properties.

If you’re using [ConfigFactory.load()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#load--) (which Akka does by default) you can replace `application.conf` by defining `-Dconfig.resource=whatever`, `-Dconfig.file=whatever`, or `-Dconfig.url=whatever`.

From inside your replacement file specified with `-Dconfig.resource` and friends, you can `include
"application"` if you still want to use `application.{conf,json,properties}` as well. Settings specified before `include "application"` would be overridden by the included file, while those after would override the included file.

In code, there are many customization options.

There are several overloads of [ConfigFactory.load()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#load--); these allow you to specify something to be sandwiched between system properties (which override) and the defaults (from `reference.conf`), replacing the usual `application.{conf,json,properties}` and replacing `-Dconfig.file` and friends.

The simplest variant of [ConfigFactory.load()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#load-java.lang.String-) takes a resource basename (instead of `application`); `myname.conf`, `myname.json`, and `myname.properties` would then be used instead of `application.{conf,json,properties}`.

The most flexible variant takes a [Config](https://lightbend.github.io/config/latest/api/com/typesafe/config/Config.html) object, which you can load using any method in [ConfigFactory](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html). For example you could put a config string in code using [ConfigFactory.parseString()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#parseString-java.lang.String-) or you could make a map and [ConfigFactory.parseMap()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#parseMap-java.util.Map-), or you could load a file.

You can also combine your custom config with the usual config, that might look like:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/config/ConfigDocSpec.scala#L51-L62 "Go to snippet source")// make a Config with just your special setting
val myConfig = ConfigFactory.parseString("something=somethingElse");
// load the normal config stack (system props,
// then application.conf, then reference.conf)
val regularConfig = ConfigFactory.load();
// override regular stack with myConfig
val combined = myConfig.withFallback(regularConfig);
// put the result in between the overrides
// (system props) and defaults again
val complete = ConfigFactory.load(combined);
// create ActorSystem
val system = ActorSystem(rootBehavior, "myname", complete);
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/config/ConfigDocTest.java#L63-L74 "Go to snippet source")// make a Config with just your special setting
Config myConfig = ConfigFactory.parseString("something=somethingElse");
// load the normal config stack (system props,
// then application.conf, then reference.conf)
Config regularConfig = ConfigFactory.load();
// override regular stack with myConfig
Config combined = myConfig.withFallback(regularConfig);
// put the result in between the overrides
// (system props) and defaults again
Config complete = ConfigFactory.load(combined);
// create ActorSystem
ActorSystem system = ActorSystem.create(rootBehavior, "myname", complete);
```

When working with [Config](https://lightbend.github.io/config/latest/api/com/typesafe/config/Config.html) objects, keep in mind that there are three “layers” in the cake:

- [ConfigFactory.defaultOverrides()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#defaultOverrides--) (system properties)
- the app’s settings
- [ConfigFactory.defaultReference()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#defaultReference--) (reference.conf)

The normal goal is to customize the middle layer while leaving the other two alone.

- [ConfigFactory.load()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#load--) loads the whole stack
- the overloads of [ConfigFactory.load()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html) let you specify a different middle layer
- the [ConfigFactory.parse](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html) variations load single files or resources

To stack two layers, use [override.withFallback(fallback)](https://lightbend.github.io/config/latest/api/com/typesafe/config/Config.html#withFallback-com.typesafe.config.ConfigMergeable-); try to keep system props ([defaultOverrides()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#defaultOverrides--)) on top and `reference.conf` ([defaultReference()](https://lightbend.github.io/config/latest/api/com/typesafe/config/ConfigFactory.html#defaultReference--)) on the bottom.

Do keep in mind, you can often just add another `include` statement in `application.conf` rather than writing code. Includes at the top of `application.conf` will be overridden by the rest of `application.conf`, while those at the bottom will override the earlier stuff.

## Listing of the Reference Configuration

Each Akka module has a reference configuration file with the default values. Those `reference.conf` files are listed in [Default configuration](configuration-reference.html)

## Code Examples

### Example 1: Where configuration is read from

```scala
appConfig.withFallback(ConfigFactory.defaultReference(classLoader))
```

### Example 2: License key

```scala
val system = ActorSystem(rootBehavior, "name")
val licenseKey = system.licenseKeyExpiry
licenseKey.isEmpty shouldBe false

import java.time.LocalDate
val nextMonth = LocalDate.now().plusMonths(1)
licenseKey.get.isAfter(nextMonth) shouldBe true

system.terminate()
```

### Example 3: License key

```java
import java.time.LocalDate;
import java.util.Optional;

ActorSystem<Void> system = ActorSystem.create(rootBehavior, "name");
Optional<LocalDate> licenseKey = system.getLicenseKeyExpiry();

assertFalse(licenseKey.isEmpty());

LocalDate nextMonth = LocalDate.now().plusMonths(1);
assertTrue(licenseKey.get().isAfter(nextMonth));

system.terminate();
```

### Example 4: Custom application.conf

```text
# In this file you can override any option defined in the reference files.
# Copy in parts of the reference files and modify as you please.

akka {

  # Logger config for Akka internals and classic actors, the new API relies
  # directly on SLF4J and your config for the logger backend.

  # Loggers to register at boot time (akka.event.Logging$DefaultLogger logs
  # to STDOUT)
  loggers = ["akka.event.slf4j.Slf4jLogger"]

  # Log level used by the configured loggers (see "loggers") as soon
  # as they have been started; before that, see "stdout-loglevel"
  # Options: OFF, ERROR, WARNING, INFO, DEBUG
  loglevel = "DEBUG"

  # Log level for the very basic logger activated during ActorSystem startup.
  # This logger prints the log messages to stdout (System.out).
  # Options: OFF, ERROR, WARNING, INFO, DEBUG
  stdout-loglevel = "DEBUG"

  # Filter of log events that is used by the LoggingAdapter before
  # publishing log events to the eventStream.
  logging-filter = "akka.event.slf4j.Slf4jLoggingFilter"

  actor {
    provider = "cluster"

    default-dispatcher {
      # Throughput for default Dispatcher, set to 1 for as fair as possible
      throughput = 10
    }
  }

  remote.artery {
    # The port clients should connect to.
    canonical.port = 4711
  }
}
```

### Example 5: dev.conf

```text
include "application"

akka {
  loglevel = "DEBUG"
}
```

### Example 6: Logging of Configuration

```text
Welcome to Scala 2.12 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0).
Type in expressions to have them evaluated.
Type :help for more information.

scala> import com.typesafe.config._
import com.typesafe.config._

scala> ConfigFactory.parseString("a.b=12")
res0: com.typesafe.config.Config = Config(SimpleConfigObject({"a" : {"b" : 12}}))

scala> res0.root.render
res1: java.lang.String =
{
    # String: 1
    "a" : {
        # String: 1
        "b" : 12
    }
}
```

### Example 7: Logging of Configuration

```scala
val system = ActorSystem(rootBehavior, "MySystem")
system.logConfiguration()
```

### Example 8: Logging of Configuration

```java
ActorSystem<Void> system = ActorSystem.create(rootBehavior, "MySystem");
system.logConfiguration();
```

### Example 9: Configuring multiple ActorSystem

```text
myapp1 {
  akka.loglevel = "WARNING"
  my.own.setting = 43
}
myapp2 {
  akka.loglevel = "ERROR"
  app2.setting = "appname"
}
my.own.setting = 42
my.other.setting = "hello"
```

### Example 10: Configuring multiple ActorSystem

```scala
val config = ConfigFactory.load()
val app1 = ActorSystem(rootBehavior, "MyApp1", config.getConfig("myapp1").withFallback(config))
val app2 = ActorSystem(rootBehavior, "MyApp2", config.getConfig("myapp2").withOnlyPath("akka").withFallback(config))
```

### Example 11: Configuring multiple ActorSystem

```java
Config config = ConfigFactory.load();
ActorSystem<Void> app1 =
    ActorSystem.create(rootBehavior, "MyApp1", config.getConfig("myapp1").withFallback(config));
ActorSystem<Void> app2 =
    ActorSystem.create(
        rootBehavior,
        "MyApp2",
        config.getConfig("myapp2").withOnlyPath("akka").withFallback(config));
```

### Example 12: Configuring multiple ActorSystem

```ruby
akka.loglevel = "WARNING"
my.own.setting = 43
my.other.setting = "hello"
// plus myapp1 and myapp2 subtrees
```

### Example 13: Configuring multiple ActorSystem

```ruby
akka.loglevel = "ERROR"
my.own.setting = 42
my.other.setting = "hello"
// plus myapp1 and myapp2 subtrees
```

### Example 14: Configuring multiple ActorSystem

```scala
import akka.actor.typed.ActorSystem
import com.typesafe.config.ConfigFactory
val customConf = ConfigFactory.parseString("""
  akka.log-config-on-start = on
""")
// ConfigFactory.load sandwiches customConfig between default reference
// config and default overrides, and then resolves it.
val system = ActorSystem(rootBehavior, "MySystem", ConfigFactory.load(customConf))
```

### Example 15: Configuring multiple ActorSystem

```java
import akka.actor.typed.ActorSystem;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.Behaviors;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

Config customConf = ConfigFactory.parseString("akka.log-config-on-start = on");
// ConfigFactory.load sandwiches customConfig between default reference
// config and default overrides, and then resolves it.
ActorSystem<Void> system =
    ActorSystem.create(rootBehavior, "MySystem", ConfigFactory.load(customConf));
```

### Example 16: Reading configuration from a custom location

```scala
// make a Config with just your special setting
val myConfig = ConfigFactory.parseString("something=somethingElse");
// load the normal config stack (system props,
// then application.conf, then reference.conf)
val regularConfig = ConfigFactory.load();
// override regular stack with myConfig
val combined = myConfig.withFallback(regularConfig);
// put the result in between the overrides
// (system props) and defaults again
val complete = ConfigFactory.load(combined);
// create ActorSystem
val system = ActorSystem(rootBehavior, "myname", complete);
```

### Example 17: Reading configuration from a custom location

```java
// make a Config with just your special setting
Config myConfig = ConfigFactory.parseString("something=somethingElse");
// load the normal config stack (system props,
// then application.conf, then reference.conf)
Config regularConfig = ConfigFactory.load();
// override regular stack with myConfig
Config combined = myConfig.withFallback(regularConfig);
// put the result in between the overrides
// (system props) and defaults again
Config complete = ConfigFactory.load(combined);
// create ActorSystem
ActorSystem system = ActorSystem.create(rootBehavior, "myname", complete);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/libraries/akka-core/2.10/additional/deploy.html
- https://doc.akka.io/libraries/akka-core/2.10/extending-akka.html
- https://doc.akka.io/libraries/akka-core/2.10/general/configuration-reference.html
- https://doc.akka.io/libraries/akka-core/2.10/general/message-delivery-reliability.html
- https://doc.akka.io/libraries/akka-core/2.10/serialization.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/dispatchers.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/logging.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/general/configuration.html](https://doc.akka.io/libraries/akka-core/2.10/general/configuration.html)*