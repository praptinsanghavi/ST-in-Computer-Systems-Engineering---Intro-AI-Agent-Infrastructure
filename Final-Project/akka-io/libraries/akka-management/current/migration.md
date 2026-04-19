---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:04Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/migration.html
title: Migration guide • Akka Management
---

# Migration guide • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Migration guide

## 1\.0

Version requirements:

- Akka 2\.5\.19 or later
- Akka HTTP 10\.1\.7 or later

### Source changes

- `AkkaManagement` moved to package `akka.management.scaladsl.AkkaManagement`, if using from Java use `akka.management.javadsl.AkkaManagement`
- If implementing custom ManagementRouteProvider the package changed to `akka.management.scaladsl.ManagementRouteProvider`/`akka.management.javadsl.ManagementRouteProvider`
- `AkkaManagement.start` and `AkkaManagement.routes` may throw IllegalArgumentException instead of returning Try
- Auth and HTTPS has changed by using overloaded methods of `AkkaManagement.start` and `AkkaManagement.routes`, see the [docs for more details](akka-management.html#enabling-basic-authentication)

### Configuration changes

- `akka.management.cluster.http.healthcheck.ready-states` moved to `akka.management.cluster.health-check.ready-states`
- `akka.management.cluster.bootstrap.form-new-cluster` renamed to `akka.management.cluster.bootstrap.new-cluster-enabled`

#### route\-providers

`akka.management.cluster.route-providers` changed from being a list of fully qualified class names to a configuration object `akka.management.cluster.routes` with named route providers. The reason for the change was to be able to exclude a route provider that was included by a library (from reference.conf) by using `""` or `null` as the FQCN of the named entry, for example:

```
akka.management.http.routes {
  health-checks = ""
}

```

By default the `akka.management.HealthCheckRoutes` is enabled.

### Akka Discovery

For Akka Management version 1\.0 Service Discovery as well as the config, DNS and aggregate discovery methods were made core Akka module. The following steps are required when upgrading to 1\.0 of Akka Management.

Remove dependencies for:

sbt
```
libraryDependencies ++= Seq(
  "com.lightbend.akka.discovery" % "akka-discovery" % "old_akka_management_version",
  "com.lightbend.akka.discovery" % "akka-discovery-dns" % "old_akka_management_version",
  "com.lightbend.akka.discovery" % "akka-discovery-config" % "old_akka_management_version",
  "com.lightbend.akka.discovery" % "akka-discovery-aggregate" % "old_akka_management_version"
)
```
Gradle
```
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery:old_akka_management_version"
  implementation "com.lightbend.akka.discovery:akka-discovery-dns:old_akka_management_version"
  implementation "com.lightbend.akka.discovery:akka-discovery-config:old_akka_management_version"
  implementation "com.lightbend.akka.discovery:akka-discovery-aggregate:old_akka_management_version"
}
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery</artifactId>
    <version>old_akka_management_version</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-dns</artifactId>
    <version>old_akka_management_version</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-config</artifactId>
    <version>old_akka_management_version</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-aggregate</artifactId>
    <version>old_akka_management_version</version>
  </dependency&gt
</dependencies>
```

If using Cluster Bootstrap the new dependency will be brought in automatically. If using Service Discovery directly add the following dependency:

sbt
```
libraryDependencies += "com.typesafe.akka" % "akka-discovery" % "latest_akka_version"
```
Gradle
```
dependencies {
  implementation "com.typesafe.akka:akka-discovery:latest_akka_version"
}
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery</artifactId>
    <version>latest_akka_version</version>
  </dependency&gt
</dependencies>
```

Setting the service discovery method now has to be the unqualified name e.g `kubernetes-api` rather than `akka.discovery.kubernets-api`. If using a custom discovery method the configuration for the discovery method must live under `akka.discovery`. 

For bootstrap it is recommended to set the service discovery method via `akka.management.cluster.bootstrap.contact-point-discovery.discovery-method` rather then overriding the global service discovery mechanism with `akka.discovery.method` 

### DNS

If using DNS service discovery it is no longer required to override the global Akka DNS resolver. Remove `akka.io.dns.resolver = async-dns` from your configuration to avoid setting the `async-dns` as the global DNS resolver as it still lacks some features. The DNS discovery mechanism now uses an isolated resolver internally to support SRV records. 

### Kubernetes

Kubernetes service discovery now automatically picks up the namespace at runtime. If previously hard coded or an environment variable used this can be removed from configuration and the deployment.

Unless used for something other than service discovery / bootstrap the following can be removed from your deployment 

```
- name: NAMESPACE	
   valueFrom:	
     fieldRef:	
       fieldPath: metadata.namespace

```

If `pod-namespace` is set remove from your configuration as it will be automatically picked up from the `/var/run/secrets/kubernetes.io/serviceaccount/namespace` file that is mounted to each Kubernetes container. The namespace can be overridden with `pod-namespace` if this isn’t the desired behavior.

### Cluster HTTP

The `cluster-http` module now only exposes read only routes by default. To enable destructive operations such as downing members set `akka.management.http.route-providers-read-only` to `false`.

## Code Examples

### Example 1: route-providers

```text
akka.management.http.routes {
  health-checks = ""
}
```

### Example 2: Akka Discovery

```scala
libraryDependencies ++= Seq(
  "com.lightbend.akka.discovery" % "akka-discovery" % "old_akka_management_version",
  "com.lightbend.akka.discovery" % "akka-discovery-dns" % "old_akka_management_version",
  "com.lightbend.akka.discovery" % "akka-discovery-config" % "old_akka_management_version",
  "com.lightbend.akka.discovery" % "akka-discovery-aggregate" % "old_akka_management_version"
)
```

### Example 3: Akka Discovery

```gradle
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery:old_akka_management_version"
  implementation "com.lightbend.akka.discovery:akka-discovery-dns:old_akka_management_version"
  implementation "com.lightbend.akka.discovery:akka-discovery-config:old_akka_management_version"
  implementation "com.lightbend.akka.discovery:akka-discovery-aggregate:old_akka_management_version"
}
```

### Example 4: Akka Discovery

```xml
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery</artifactId>
    <version>old_akka_management_version</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-dns</artifactId>
    <version>old_akka_management_version</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-config</artifactId>
    <version>old_akka_management_version</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-aggregate</artifactId>
    <version>old_akka_management_version</version>
  </dependency&gt
</dependencies>
```

### Example 5: Akka Discovery

```scala
libraryDependencies += "com.typesafe.akka" % "akka-discovery" % "latest_akka_version"
```

### Example 6: Akka Discovery

```gradle
dependencies {
  implementation "com.typesafe.akka:akka-discovery:latest_akka_version"
}
```

### Example 7: Akka Discovery

```xml
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery</artifactId>
    <version>latest_akka_version</version>
  </dependency&gt
</dependencies>
```

### Example 8: Kubernetes

```text
- name: NAMESPACE	
   valueFrom:	
     fieldRef:	
       fieldPath: metadata.namespace
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-management/current/akka-management.html
- https://doc.akka.io/libraries/akka-management/current/healthchecks.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/migration.html](https://doc.akka.io/libraries/akka-management/current/migration.html)*