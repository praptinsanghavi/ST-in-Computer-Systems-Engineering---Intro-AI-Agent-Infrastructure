---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/discovery/kubernetes.html
title: Kubernetes API • Akka Management
---

# Kubernetes API • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

## Kubernetes API

If you want to use Kubernetes for [Cluster Bootstrap](../bootstrap/index.html), please follow the [Cluster Bootstrap Kubernetes API](../bootstrap/kubernetes-api.html) documentation that is tailored for that use case.

The typical way to consume a service in Kubernetes is to discover it through DNS: this will take into account liveness/readiness checks, and depending on the configuration take care of load balancing (removing the need for client\-side load balancing). For this reason, for general usage the [`akka-dns`](https://doc.akka.io/libraries/akka-core/current/discovery/index.html#discovery-method-dns) implementation is usually a better fit for discovering services in Kubernetes.

However, in some cases, such as for [Cluster Bootstrap](../bootstrap/index.html), it is desirable to connect to the pods directly, bypassing any liveness/readiness checks or load balancing. For such situations we provide a discovery implementation that uses the Kubernetes API.

In even fewer cases, it may be desirable to use the the Kubernetes API to discover other services to consume and perform client\-side load balancing. For such situations, we also provide a [variant implementation, which is not suitable for use with cluster bootstrap](kubernetes.html#using-the-kubernetes-api-to-support-client-side-load-balancing).

## Project Info

| Project Info: Akka Discovery Kubernetes | |
| --- | --- |
| Artifact | com.lightbend.akka.discovery akka\-discovery\-kubernetes\-api 1\.6\.4 [Akka library snapshot repository](https://repo.akka.io/snapshots) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| License | [BUSL\-1\.1](https://github.com/akka/akka-management/blob/v1.6.4/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2019\-03\-15 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-management/1.6.4/akka/index.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-management/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-management/issues) |
| Sources | [https://github.com/akka/akka\-management](https://github.com/akka/akka-management) |

### Dependencies and usage

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-kubernetes-api" % AkkaManagementVersion
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery-kubernetes-api_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```
Maven
```
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-kubernetes-api_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

`akka-discovery-kubernetes-api` can be used with Akka 2\.10\.11 or later. You have to override the following Akka dependencies by defining them explicitly in your build and define the Akka version to the one that you are using. Latest patch version of Akka is recommended and a later version than 2\.10\.11 can be used.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

As described above, it is uncommon to use the Kubernetes API discovery mechanism as your default discovery mechanism. When using it with Akka Cluster Bootstrap, it is sufficient to configure it as described [here](../bootstrap/kubernetes-api.html). Otherwise, to load it manually, use `loadServiceDiscovery` on the `Discovery` extension:

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/discovery-kubernetes-api/src/test/scala/akka/discovery/kubernetes/KubernetesApiServiceDiscoverySpec.scala#L386 "Go to snippet source")val discovery = Discovery(system).loadServiceDiscovery("kubernetes-api")
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/discovery-kubernetes-api/src/test/java/docs/KubernetesApiDiscoveryDocsTest.java#L15 "Go to snippet source")ServiceDiscovery discovery = Discovery.get(system).loadServiceDiscovery("kubernetes-api");
```

To find other pods, this method needs to know how they are labeled, what the name of the target port is, and what namespace they reside in. Below, you’ll find the default configuration. It can be customized by changing these values in your `application.conf`.

```
akka.discovery {
  kubernetes-api {
    # Namespace discovery path
    #
    # If this path doesn't exist, the namespace will default to "default".
    pod-namespace-path = "/var/run/secrets/kubernetes.io/serviceaccount/namespace"

    # Namespace to query for pods.
    #
    # Set this value to a specific string to override discovering the namespace using pod-namespace-path.
    pod-namespace = "<pod-namespace>"

    # Selector value to query pod API with.
    # `%s` will be replaced with the configured effective name, which defaults to the actor system name
    pod-label-selector = "app=%s"
  }
}

```

This configuration complements the following Deployment specification:

```
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: example
  name: example
spec:
  replicas: 4
  selector:
    matchLabels:
      app: example
  template:
    metadata:
      labels:
        app: example
    spec:
      containers:
      - name: example
        image: example/image:1.0.0
        imagePullPolicy: IfNotPresent
        ports:
        # akka remoting
        - name: remoting
          containerPort: 2552
          protocol: TCP
        # When
        # akka.management.cluster.bootstrap.contact-point-discovery.port-name
        # is defined, it must correspond to this name:
        - name: management
          containerPort: 8558
          protocol: TCP

```

### Role\-Based Access Control

If your Kubernetes cluster has [Role\-Based Access Control (RBAC)](https://kubernetes.io/docs/reference/access-authn-authz/rbac/) enabled, you’ll also have to grant the Service Account that your pods run under access to list pods. The following configuration can be used as a starting point. It creates a `Role`, `pod-reader`, which grants access to query pod information. It then binds the default Service Account to the `Role` by creating a `RoleBinding`. Adjust as necessary.

> Using Google Kubernetes Engine? Your user will need permission to grant roles. See [Google’s Documentation](https://cloud.google.com/kubernetes-engine/docs/how-to/role-based-access-control#prerequisites_for_using_role-based_access_control) for more information.

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-api/kubernetes/akka-cluster.yml#L59-L87 "Go to snippet source")#
# Create a role, `pod-reader`, that can list pods and
# bind the default service account in the namespace
# that the binding is deployed to to that role.
#

kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
rules:
- apiGroups: [""] # "" indicates the core API group
  resources: ["pods"]
  verbs: ["get", "watch", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: read-pods
subjects:
  # Uses the default service account.
  # Consider creating a dedicated service account to run your
  # Akka Cluster services and binding the role to that one.
- kind: ServiceAccount
  name: default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
```

### Using the Kubernetes API to support client\-side load balancing

The primary (`kubernetes-api`) discovery mechanism is intended to support use\-cases like Cluster Bootstrap (especially when, as is typical, a service is not able to serve traffic until the cluster has bootstrapped). This intent implies that the `kubernetes-api` discovery mechanism is unsuitable for client\-side load balancing. For situations where the Kubernetes API would be preferable to DNS\-based discovery (e.g. if it’s impractical to configure DNS for the Kubernetes cluster to support client\-side load balancing), the `kubernetes-api-for-client` discovery mechanism is available. Unlike `kubernetes-api`, this mechanism is suitable for use as the default discovery mechanism (though unsuitable for use with Cluster Bootstrap):

```
# in application.conf, for example
akka.management.cluster.bootstrap.contact-point-discovery.discovery-method = kubernetes-api
akka.discovery.method = kubernetes-api-for-client

```

Or to programmatically load:

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/discovery-kubernetes-api/src/test/scala/akka/discovery/kubernetes/KubernetesApiServiceDiscoverySpec.scala#L395 "Go to snippet source")val discovery = Discovery(system).loadServiceDiscovery("kubernetes-api-for-client")
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/discovery-kubernetes-api/src/test/java/docs/KubernetesApiDiscoveryDocsTest.java#L22 "Go to snippet source")ServiceDiscovery discovery = Discovery.get(system).loadServiceDiscovery("kubernetes-api-for-client");
```

## Code Examples

### Example 1: Dependencies and usage

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.discovery" %% "akka-discovery-kubernetes-api" % AkkaManagementVersion
```

### Example 2: Dependencies and usage

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.discovery:akka-discovery-kubernetes-api_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 3: Dependencies and usage

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.discovery</groupId>
    <artifactId>akka-discovery-kubernetes-api_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 4: Dependencies and usage

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
)
```

### Example 5: Dependencies and usage

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 6: Dependencies and usage

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 7: Dependencies and usage

```scala
val discovery = Discovery(system).loadServiceDiscovery("kubernetes-api")
```

### Example 8: Dependencies and usage

```java
ServiceDiscovery discovery = Discovery.get(system).loadServiceDiscovery("kubernetes-api");
```

### Example 9: Dependencies and usage

```text
akka.discovery {
  kubernetes-api {
    # Namespace discovery path
    #
    # If this path doesn't exist, the namespace will default to "default".
    pod-namespace-path = "/var/run/secrets/kubernetes.io/serviceaccount/namespace"

    # Namespace to query for pods.
    #
    # Set this value to a specific string to override discovering the namespace using pod-namespace-path.
    pod-namespace = "<pod-namespace>"

    # Selector value to query pod API with.
    # `%s` will be replaced with the configured effective name, which defaults to the actor system name
    pod-label-selector = "app=%s"
  }
}
```

### Example 10: Dependencies and usage

```text
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: example
  name: example
spec:
  replicas: 4
  selector:
    matchLabels:
      app: example
  template:
    metadata:
      labels:
        app: example
    spec:
      containers:
      - name: example
        image: example/image:1.0.0
        imagePullPolicy: IfNotPresent
        ports:
        # akka remoting
        - name: remoting
          containerPort: 2552
          protocol: TCP
        # When
        # akka.management.cluster.bootstrap.contact-point-discovery.port-name
        # is defined, it must correspond to this name:
        - name: management
          containerPort: 8558
          protocol: TCP
```

### Example 11: Role-Based Access Control

```yml
#
# Create a role, `pod-reader`, that can list pods and
# bind the default service account in the namespace
# that the binding is deployed to to that role.
#

kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
rules:
- apiGroups: [""] # "" indicates the core API group
  resources: ["pods"]
  verbs: ["get", "watch", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: read-pods
subjects:
  # Uses the default service account.
  # Consider creating a dedicated service account to run your
  # Akka Cluster services and binding the role to that one.
- kind: ServiceAccount
  name: default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
```

### Example 12: Using the Kubernetes API to support client-side load balancing

```text
# in application.conf, for example
akka.management.cluster.bootstrap.contact-point-discovery.discovery-method = kubernetes-api
akka.discovery.method = kubernetes-api-for-client
```

### Example 13: Using the Kubernetes API to support client-side load balancing

```scala
val discovery = Discovery(system).loadServiceDiscovery("kubernetes-api-for-client")
```

### Example 14: Using the Kubernetes API to support client-side load balancing

```java
ServiceDiscovery discovery = Discovery.get(system).loadServiceDiscovery("kubernetes-api-for-client");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/current/discovery/index.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/index.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes-api.html
- https://doc.akka.io/libraries/akka-management/current/discovery/aws.html
- https://doc.akka.io/libraries/akka-management/current/discovery/index.html
- https://doc.akka.io/libraries/akka-management/current/discovery/kubernetes.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/discovery/kubernetes.html](https://doc.akka.io/libraries/akka-management/current/discovery/kubernetes.html)*