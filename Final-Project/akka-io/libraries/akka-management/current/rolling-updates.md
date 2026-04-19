---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/rolling-updates.html
title: Rolling Updates • Akka Management
---

# Rolling Updates • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Rolling Updates

Rolling updates allow you to update an application by gradually replacing old nodes with new ones. This ensures that the application remains available throughout the update process, with minimal disruption to clients.

## Graceful shutdown

Akka Cluster can handle hard failures using a downing provider such as Lightbend’s [Split Brain Resolver](https://doc.akka.io/libraries/akka-core/current/split-brain-resolver.html). However, this should not be relied upon for regular rolling redeploys. Features such as `ClusterSingleton`s and `ClusterSharding` can safely restart actors on new nodes far quicker when it is certain that a node has shutdown rather than crashed.

Graceful leaving will happen with the default settings as it is part of [Coordinated Shutdown](https://doc.akka.io/libraries/akka-core/current/actors.html#coordinated-shutdown). Just ensure that a node is sent a `SIGTERM` and not a `SIGKILL`. Environments such as Kubernetes will do this, it is important to ensure that if JVM is wrapped with a script that it forwards the signal.

Upon receiving a `SIGTERM` Coordinated Shutdown will:

- Perform a `Cluster(system).leave` on itself
- The status of the member will be changed to Exiting while allowing any shards to be shutdown gracefully and `ClusterSingleton`s to be migrated if this was the oldest node. Finally, the node is removed from the Akka Cluster membership.

## Number of nodes to redeploy at once

Akka bootstrap requires a `stable-period` where service discovery returns a stable set of contact points. When doing rolling updates it is best to wait for a node (or group of nodes) to finish joining the cluster before adding and removing other nodes.

## Cluster Singletons

`ClusterSingleton`s run on the oldest node in the cluster. To avoid singletons moving during every node deployment it is advised to start a rolling redeploy starting at the newest node. Then `ClusterSingleton`s only move once. Cluster Sharding uses a singleton internally so this is important even if not using singletons directly.

## Kubernetes Rolling Updates

Starting from Kubernetes v1\.22, ReplicaSets are not scaled down with the youngest node first (see details [here](https://github.com/kubernetes/enhancements/tree/master/keps/sig-apps/2185-random-pod-select-on-replicaset-downscale)). That is because after some time all nodes that were brought up in the same time bucket are treated as equally old and the node to scale down first is chosen randomly.

As mentioned previously, the oldest node in an Akka cluster has a special role as it hosts singletons. If the oldest node in a cluster changes frequently, singletons need to be moved around as well which can have undesired consequences.

This module provides the Pod Deletion Cost extension which automatically annotates older pods so that they are selected last when removing nodes, providing for better overall stability for the cluster operations.

### Project Info

| Project Info: Akka Rolling Update Kubernetes | |
| --- | --- |
| Artifact | com.lightbend.akka.management akka\-rolling\-update\-kubernetes 1\.6\.4 [Akka library snapshot repository](https://repo.akka.io/snapshots) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| License | [BUSL\-1\.1](https://github.com/akka/akka-management/blob/v1.6.4/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.3\.0, 2023\-04\-01 |
| Home page | <https://akka.io/> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-management/1.6.4/akka/index.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-management/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-management/issues) |
| Sources | [https://github.com/akka/akka\-management](https://github.com/akka/akka-management) |

### Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Add `akka-rolling-update-kubernetes` to your dependency management tool:

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.management" %% "akka-rolling-update-kubernetes" % AkkaManagementVersion
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-rolling-update-kubernetes_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
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
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-rolling-update-kubernetes_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Using

Akka Pod Deletion Cost extension must be started, this can either be done through config or programmatically.

**Through config**

Listing the `PodDeletionCost` extension among the autoloaded `akka.extensions` in `application.conf` will also cause it to autostart:

```
akka.extensions = ["akka.rollingupdate.kubernetes.PodDeletionCost"]

```

If management or bootstrap configuration is incorrect, the autostart will log an error and terminate the actor system.

**Programmatically**

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/rolling-update-kubernetes/src/test/scala/doc/akka/rollingupdate/kubernetes/PodDeletionCostCompileOnly.scala#L15-L16 "Go to snippet source")// Starting the pod deletion cost annotator
PodDeletionCost(system).start()
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/rolling-update-kubernetes/src/test/java/jdoc/akka/rollingupdate/kubernetes/PodDeletionCostCompileOnly.java#L16-L17 "Go to snippet source")// Starting the pod deletion cost annotator
PodDeletionCost.get(system).start();
```

#### Configuration

The following configuration is required, more details for each and additional configurations can be found in [reference.conf](https://github.com/akka/akka-management/blob/main/rolling-updates-kubernetes/src/main/resources/reference.conf):

- `akka.rollingupdate.kubernetes.pod-name`: this can be provided by setting `KUBERNETES_POD_NAME` environment variable to `metadata.name` on the Kubernetes container spec.

```
        env:
        - name: KUBERNETES_POD_NAME
          valueFrom:
            fieldRef:
              fieldPath: metadata.name

```

Additionally, the pod annotator needs to know which namespace the pod belongs to. By default, this will be detected by reading the namespace from the service account secret, in `/var/run/secrets/kubernetes.io/serviceaccount/namespace`, but can be overridden by setting `akka.rollingupdate.kubernetes.namespace` or by providing `KUBERNETES_NAMESPACE` environment variable.

```
        env:
        - name: KUBERNETES_NAMESPACE
          valueFrom:
            fieldRef:
              fieldPath: metadata.namespace

```

#### Role based access control

Warning
This extension uses the Kubernetes API to set the `pod-deletion-cost` annotation on its own pod. To be able to do that, it requires special permission to be able to `patch` the pod configuration. Each pod only needs access to the namespace they are in. If this is a security concern in your environment you may instead use [Alternative with Custom Resource Definition](rolling-updates.html#alternative-with-custom-resource-definition).

An example RBAC that can be used:

```
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-patcher
rules:
  - apiGroups: [""] # "" indicates the core API group
    resources: ["pods"]
    verbs: ["patch"] # requires "patch" to annotate the pod
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: annotate-pods
subjects:
  - kind: User
    name: system:serviceaccount:<YOUR NAMESPACE>:default
roleRef:
  kind: Role
  name: pod-patcher
  apiGroup: rbac.authorization.k8s.io

```

This defines a `Role` that is allowed to `patch` pod objects and a `RoleBinding` that gives the default service user this role in `<YOUR NAMESPACE>`.

Note
This RBAC example covers only the permissions needed for this `PodDeletionCost` extension specifically. However, usually you’ll also be using [Kubernetes API](bootstrap/kubernetes-api.html) for discovery and boostrap of your cluster, so you’ll need to combine this with any other role required already configured, either by keeping them separately or merging them into a single role.

#### Alternative with Custom Resource Definition

If it’s a security concern in your environment to allow “patch” in RBAC as described above, you can instead use an intermediate Custom Resource Definition (CRD). Instead of updating the `controller.kubernetes.io/pod-deletion-cost` annotation directly it will update a `PodCost` custom resource and then you would have an operator that reconciles that and updates the pod\-deletion\-cost annotation of the pod resource. 

Note
You would have to write the Kubernetes operator that watches the `PodCost` resource and updates the `controller.kubernetes.io/pod-deletion-cost` annotation of the corresponding pod resource. This operator is not provided by Akka.

Enable updates of custom resource with configuration:

```
akka.rollingupdate.kubernetes.custom-resource.enabled = true

```

The `PodCost` CRD:

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/rolling-update-kubernetes/pod-cost.yml "Go to snippet source")apiVersion: apiextensions.k8s.io/v1
kind: CustomResourceDefinition
metadata:
  # name must match the spec fields below, and be in the form: <plural>.<group>
  name: podcosts.akka.io
spec:
  group: akka.io
  versions:
   - name: v1
     storage: true
     served: true
     schema:
       openAPIV3Schema:
         type: object
         properties:
           spec:
             type: object
             properties:
               version:
                 type: string
               pods:
                 type: array
                 items:
                   type: object
                   properties:
                     # the name of the pod that should be updated with the pod-deletion-cost annotation
                     podName:
                       type: string
                     # the value of the controller.kubernetes.io/pod-deletion-cost annotation
                     cost:
                       type: integer
                     # address, uid and time are used for cleanup of removed members
                     address:
                       type: string
                     # address, uid and time are used for cleanup of removed members
                     uid:
                       type: integer
                     # address, uid and time are used for cleanup of removed members
                     time:
                       type: integer
  scope: Namespaced
  names:
    # kind is normally the CamelCased singular type. Your resource manifests use this.
    kind: PodCost
    listKind: PodCostList
    # singular name to be used as an alias on the CLI and for display
    singular: podcost
    # plural name to be used in the URL: /apis/<group>/<version>/<plural>
    plural: podcosts
```

The RBAC for the application to update the `PodCost` CR, instead of “patch” of the “pods” resources:

```
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: podcost-access
rules:
  - apiGroups: ["akka.io"]
    resources: ["podcosts"]
    verbs: ["get", "create", "update", "delete", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: podcost-access
subjects:
  - kind: User
    name: system:serviceaccount:<YOUR NAMESPACE>:default
roleRef:
  kind: Role
  name: podcost-access
  apiGroup: rbac.authorization.k8s.io

```

## app\-version from Deployment

When using Cluster Sharding, it is [recommended](https://doc.akka.io/libraries/akka-core/current/additional/rolling-updates.html#cluster-sharding) to define an increasing `akka.cluster.app-version` configuration property for each roll out. 

This works well unless you use `kubectl rollout undo` which deploys the previous ReplicaSet configuration which contains the previous value for that config. 

To fix this, you can use `AppVersionRevision` to read the current annotation `deployment.kubernetes.io/revision` (part of the ReplicaSet) from the Kubernetes Deployment via the Kubernetes api which always increases, also during a rollback.

### Using

The AppVersionRevision extension must be started, this can either be done through config or programmatically.

**Through config**

Listing the `AppVersionRevision` extension among the autoloaded `akka.extensions` in `application.conf` will also cause it to autostart:

```
akka.extensions = ["akka.rollingupdate.kubernetes.AppVersionRevision"]

```

If the extension configuration is incorrect, the autostart will log an error and terminate the actor system.

**Programmatically**

Scala

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/rolling-update-kubernetes/src/test/scala/doc/akka/rollingupdate/kubernetes/AppVersionRevisionCompileOnly.scala#L15-L17 "Go to snippet source")// Starting the AppVersionRevision extension
// preferred to be called before ClusterBootstrap
AppVersionRevision(system).start()
```

Java

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/rolling-update-kubernetes/src/test/java/jdoc/akka/rollingupdate/kubernetes/AppVersionRevisionCompileOnly.java#L15-L17 "Go to snippet source")// Starting the AppVersionRevision extension
// preferred to be called before ClusterBootstrap
AppVersionRevision.get(system).start();
```

#### Configuration

The following configuration is required, more details for each and additional configurations can be found in [reference.conf](https://github.com/akka/akka-management/blob/main/rolling-update-kubernetes/src/main/resources/reference.conf):

- `akka.rollingupdate.kubernetes.pod-name`: this can be provided by setting `KUBERNETES_POD_NAME` environment variable to `metadata.name` on the Kubernetes container spec.

```
        env:
        - name: KUBERNETES_POD_NAME
          valueFrom:
            fieldRef:
              fieldPath: metadata.name

```

Additionally, the pod annotator needs to know which namespace the pod belongs to. By default, this will be detected by reading the namespace from the service account secret, in `/var/run/secrets/kubernetes.io/serviceaccount/namespace`, but can be overridden by setting `akka.rollingupdate.kubernetes.namespace` or by providing `KUBERNETES_NAMESPACE` environment variable.

```
        env:
        - name: KUBERNETES_NAMESPACE
          valueFrom:
            fieldRef:
              fieldPath: metadata.namespace

```

#### Role based access control

Make sure to provide access to corresponding rbac rules `apiGroups` and `resources` like this:

```
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
rules:
- apiGroups: [""]
  resources: ["pods"]
  verbs: ["get", "list"]
- apiGroups: ["apps"]
  resources: ["replicasets"]
  verbs: ["get", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
subjects: 
- kind: ServiceAccount
  name: default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io

```

## Code Examples

### Example 1: Dependency

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.management" %% "akka-rolling-update-kubernetes" % AkkaManagementVersion
```

### Example 2: Dependency

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-rolling-update-kubernetes_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 3: Dependency

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-rolling-update-kubernetes_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 4: Using

```text
akka.extensions = ["akka.rollingupdate.kubernetes.PodDeletionCost"]
```

### Example 5: Using

```scala
// Starting the pod deletion cost annotator
PodDeletionCost(system).start()
```

### Example 6: Using

```java
// Starting the pod deletion cost annotator
PodDeletionCost.get(system).start();
```

### Example 7: Configuration

```yaml
env:
        - name: KUBERNETES_POD_NAME
          valueFrom:
            fieldRef:
              fieldPath: metadata.name
```

### Example 8: Configuration

```yaml
env:
        - name: KUBERNETES_NAMESPACE
          valueFrom:
            fieldRef:
              fieldPath: metadata.namespace
```

### Example 9: Role based access control

```yaml
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-patcher
rules:
  - apiGroups: [""] # "" indicates the core API group
    resources: ["pods"]
    verbs: ["patch"] # requires "patch" to annotate the pod
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: annotate-pods
subjects:
  - kind: User
    name: system:serviceaccount:<YOUR NAMESPACE>:default
roleRef:
  kind: Role
  name: pod-patcher
  apiGroup: rbac.authorization.k8s.io
```

### Example 10: Alternative with Custom Resource Definition

```text
akka.rollingupdate.kubernetes.custom-resource.enabled = true
```

### Example 11: Alternative with Custom Resource Definition

```yml
apiVersion: apiextensions.k8s.io/v1
kind: CustomResourceDefinition
metadata:
  # name must match the spec fields below, and be in the form: <plural>.<group>
  name: podcosts.akka.io
spec:
  group: akka.io
  versions:
   - name: v1
     storage: true
     served: true
     schema:
       openAPIV3Schema:
         type: object
         properties:
           spec:
             type: object
             properties:
               version:
                 type: string
               pods:
                 type: array
                 items:
                   type: object
                   properties:
                     # the name of the pod that should be updated with the pod-deletion-cost annotation
                     podName:
                       type: string
                     # the value of the controller.kubernetes.io/pod-deletion-cost annotation
                     cost:
                       type: integer
                     # address, uid and time are used for cleanup of removed members
                     address:
                       type: string
                     # address, uid and time are used for cleanup of removed members
                     uid:
                       type: integer
                     # address, uid and time are used for cleanup of removed members
                     time:
                       type: integer
  scope: Namespaced
  names:
    # kind is normally the CamelCased singular type. Your resource manifests use this.
    kind: PodCost
    listKind: PodCostList
    # singular name to be used as an alias on the CLI and for display
    singular: podcost
    # plural name to be used in the URL: /apis/<group>/<version>/<plural>
    plural: podcosts
```

### Example 12: Alternative with Custom Resource Definition

```text
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: podcost-access
rules:
  - apiGroups: ["akka.io"]
    resources: ["podcosts"]
    verbs: ["get", "create", "update", "delete", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: podcost-access
subjects:
  - kind: User
    name: system:serviceaccount:<YOUR NAMESPACE>:default
roleRef:
  kind: Role
  name: podcost-access
  apiGroup: rbac.authorization.k8s.io
```

### Example 13: Using

```text
akka.extensions = ["akka.rollingupdate.kubernetes.AppVersionRevision"]
```

### Example 14: Using

```scala
// Starting the AppVersionRevision extension
// preferred to be called before ClusterBootstrap
AppVersionRevision(system).start()
```

### Example 15: Using

```java
// Starting the AppVersionRevision extension
// preferred to be called before ClusterBootstrap
AppVersionRevision.get(system).start();
```

### Example 16: Configuration

```yaml
env:
        - name: KUBERNETES_POD_NAME
          valueFrom:
            fieldRef:
              fieldPath: metadata.name
```

### Example 17: Configuration

```yaml
env:
        - name: KUBERNETES_NAMESPACE
          valueFrom:
            fieldRef:
              fieldPath: metadata.namespace
```

### Example 18: Role based access control

```text
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
rules:
- apiGroups: [""]
  resources: ["pods"]
  verbs: ["get", "list"]
- apiGroups: ["apps"]
  resources: ["replicasets"]
  verbs: ["get", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
subjects: 
- kind: ServiceAccount
  name: default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-management/1.6.4/akka/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/current/actors.html
- https://doc.akka.io/libraries/akka-core/current/additional/rolling-updates.html
- https://doc.akka.io/libraries/akka-core/current/split-brain-resolver.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes-api.html
- https://doc.akka.io/libraries/akka-management/current/cluster-http-management.html
- https://doc.akka.io/libraries/akka-management/current/discovery/consul.html
- https://doc.akka.io/libraries/akka-management/current/rolling-updates.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/rolling-updates.html](https://doc.akka.io/libraries/akka-management/current/rolling-updates.html)*