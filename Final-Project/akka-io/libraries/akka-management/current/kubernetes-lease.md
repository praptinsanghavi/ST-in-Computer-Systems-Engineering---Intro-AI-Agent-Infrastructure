---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:37Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/kubernetes-lease.html
title: Kubernetes Lease • Akka Management
---

# Kubernetes Lease • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Kubernetes Lease

Warning
This module is marked as [May Change](https://doc.akka.io/libraries/akka-core/current/common/may-change.html) The API, configuration and behavior may change based on feedback from initial usage.

This module is an implementation of an [Akka Coordination Lease](https://doc.akka.io/libraries/akka-core/current/coordination.html#lease) backed by a [Custom Resource Definition (CRD)](https://kubernetes.io/docs/concepts/extend-kubernetes/api-extension/custom-resources/) in Kubernetes. Resources in Kubernetes offer [concurrency control and consistency](https://kubernetes.io/docs/concepts/extend-kubernetes/api-extension/custom-resources/) that have been used to build a distributed lease/lock.

A lease can be used for:

- [Split Brain Resolver](https://doc.akka.io/libraries/akka-core/current/split-brain-resolver.html#lease). An additional safety measure so that only one SBR instance can make the decision to remain up.
- [Cluster Singleton](https://doc.akka.io/libraries/akka-core/current/typed/cluster-singleton.html#lease). A singleton manager can be configured to acquire a lease before creating the singleton.
- [Cluster Sharding](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html#lease). Each `Shard` can be configured to acquire a lease before creating entity actors.

In all cases the use of the lease increases the consistency of the feature. However, as the Kubernetes API server and its backing `etcd` cluster can also be subject to failure and network issues any use of this lease can reduce availability. 

### Lease Instances

- With [Split Brain Resolver](https://doc.akka.io/libraries/akka-core/current/split-brain-resolver.html#lease) there will be one lease per Akka Cluster
- With multiple Akka Clusters using SBRs in the same namespace, e.g. multiple Lagom applications, you must ensure different `ActorSystem` names because they all need a separate lease.
- With Cluster Sharding and Cluster Singleton there will be more leases
	- For [Cluster Singleton](https://doc.akka.io/libraries/akka-core/current/typed/cluster-singleton.html#lease) there will be one per singleton.
	- For [Cluster Sharding](https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html#lease), there will be one per shard per type.

### Configuring

#### Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.management" %% "akka-lease-kubernetes" % AkkaManagementVersion
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
    <artifactId>akka-lease-kubernetes_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-lease-kubernetes_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

#### Creating the Custom Resource Definition for the lease

This requires admin privileges to your Kubernetes / Open Shift cluster but only needs doing once.

Kubernetes:

```
kubectl apply -f lease.yml

```

Where lease.yml contains:

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/lease-kubernetes/lease.yml "Go to snippet source")apiVersion: apiextensions.k8s.io/v1
kind: CustomResourceDefinition
metadata:
  # name must match the spec fields below, and be in the form: <plural>.<group>
  name: leases.akka.io
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
               owner:
                 type: string
               version:
                 type: string
               time:
                 type: integer
  scope: Namespaced
  names:
    # kind is normally the CamelCased singular type. Your resource manifests use this.
    kind: Lease
    listKind: LeaseList
    # singular name to be used as an alias on the CLI and for display
    singular: lease
    # plural name to be used in the URL: /apis/<group>/<version>/<plural>
    plural: leases
```

#### Role based access control

Each pod needs permission to read/create and update lease resources. They only need access for the namespace they are in.

An example RBAC that can be used:

```
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: lease-access
rules:
  - apiGroups: ["akka.io"]
    resources: ["leases"]
    verbs: ["get", "create", "update", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: lease-access
subjects:
  - kind: User
    name: system:serviceaccount:<YOUR NAMESPACE>:default
roleRef:
  kind: Role
  name: lease-access
  apiGroup: rbac.authorization.k8s.io

```

This defines a `Role` that is allowed to `get`, `create` and `update` lease objects and a `RoleBinding` that gives the default service user this role in `<YOUR NAMESPACE>`.

Future versions may also require `delete` access for cleaning up old resources. Current uses within Akka only create a single lease so cleanup is not an issue.

To avoid giving an application the access to create new leases an empty lease can be created in the same namespace as the application with:

Kubernetes:

```
kubelctl create -f sbr-lease.yml -n <YOUR_NAMESPACE>

```

Where `sbr-lease.yml` contains:

```
apiVersion: "akka.io/v1"
kind: Lease
metadata:
  name: <YOUR_ACTORSYSTEM_NAME>-akka-sbr
spec:
  owner: ""
  time: 0

```
Note
The lease gets created only during an actual Split Brain.

#### Enable in SBR

To enable the lease for use within SBR:

```
  
akka {
  cluster {
    downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"
    split-brain-resolver {
      active-strategy = "lease-majority"
      lease-majority {
        lease-implementation = "akka.coordination.lease.kubernetes"
      }
    }
  }
}

```

#### Full configuration options

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/lease-kubernetes/src/main/resources/reference.conf "Go to snippet source")akka.coordination.lease.kubernetes {

    lease-class = "akka.coordination.lease.kubernetes.KubernetesLease"

    api-ca-path = "/var/run/secrets/kubernetes.io/serviceaccount/ca.crt"
    api-token-path = "/var/run/secrets/kubernetes.io/serviceaccount/token"

    # Host for the Kubernetes API server. Typically this will be set via an environment
    # variable that is set when running inside Kubernetes
    api-service-host = "localhost"
    api-service-host = ${?KUBERNETES_SERVICE_HOST}

    # Port for the Kubernetes API server. Typically this will be set via an environment
    # variable that is set when running inside Kubernetes
    api-service-port = 8080
    api-service-port = ${?KUBERNETES_SERVICE_PORT}

    # Namespace file path. The namespace is to create the lock in. Can be overridden by "namespace"
    #
    # If this path doesn't exist, the namespace will default to "default".
    namespace-path = "/var/run/secrets/kubernetes.io/serviceaccount/namespace"

    # Namespace to create the lock in. If set to something other than "<namespace>" then overrides any value
    # in "namespace-path"
    namespace = "<namespace>"

    # How often to write time into CRD so that if the holder crashes
    # another node can take the lease after a given timeout. If left blank then the default is
    # max(5s, heartbeat-timeout / 10) which will be 12s with the default heartbeat-timeout
    heartbeat-interval = ""

    # How long a lease must not be updated before another node can assume
    # the holder has crashed.
    # If the lease holder hasn't crashed its next heart beat will fail due to the version
    # having been updated
    heartbeat-timeout = 120s

    # The individual timeout for each HTTP request. Defaults to 2/5 of the lease-operation-timeout
    # Can't be greater than then lease-operation-timeout
    api-server-request-timeout = ""

    # Use TLS & auth token for communication with the API server
    # set to false for plain text with no auth
    secure-api-server = true

    # The amount of time to wait for a lease to be acquired or released. This includes all requests to the API
    # server that are required. If this timeout is hit then the lease *may* be taken due to the response being lost
    # on the way back from the API server but will be reported as not taken and can be safely retried.
    lease-operation-timeout = 5s

    # For backwards compatibility to support rolling update. Truncation of lease name may cause conflicting names
    # of different lease resources.
    allow-lease-name-truncation = off

    # The maximum amount of time to cache a token for.
    # Service account tokens are by default in Kubernetes issued with a 1 hour expiry, and are rotated by the kubelet
    # when they reach 80% of it's total TTL. That means, if at any given time a read of a token is done, the token may
    # expire in 12 minutes, so this must be less than that.
    api-token-reload-interval = 10m
}
```

### F.A.Q

Q. What happens if the node that holds the lease crashes?

A. Each lease has a Time To Live (TTL) that is set `akka.coordination.lease.kubernetes.heartbeat-timeout` which defaults to 120s. A lease holder updates the lease every `1/10` of the timeout to keep the lease. If the TTL passes without the lease being updated another node is allowed to take the lease. For ultimate safety this timeout can be set very high but then an operator would need to come and clear the lease if a lease owner crashes with the lease taken.

## Code Examples

### Example 1: Dependency

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.management" %% "akka-lease-kubernetes" % AkkaManagementVersion
```

### Example 2: Dependency

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-lease-kubernetes_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-lease-kubernetes_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 4: Creating the Custom Resource Definition for the lease

```text
kubectl apply -f lease.yml
```

### Example 5: Creating the Custom Resource Definition for the lease

```yml
apiVersion: apiextensions.k8s.io/v1
kind: CustomResourceDefinition
metadata:
  # name must match the spec fields below, and be in the form: <plural>.<group>
  name: leases.akka.io
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
               owner:
                 type: string
               version:
                 type: string
               time:
                 type: integer
  scope: Namespaced
  names:
    # kind is normally the CamelCased singular type. Your resource manifests use this.
    kind: Lease
    listKind: LeaseList
    # singular name to be used as an alias on the CLI and for display
    singular: lease
    # plural name to be used in the URL: /apis/<group>/<version>/<plural>
    plural: leases
```

### Example 6: Role based access control

```yaml
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: lease-access
rules:
  - apiGroups: ["akka.io"]
    resources: ["leases"]
    verbs: ["get", "create", "update", "list"]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: lease-access
subjects:
  - kind: User
    name: system:serviceaccount:<YOUR NAMESPACE>:default
roleRef:
  kind: Role
  name: lease-access
  apiGroup: rbac.authorization.k8s.io
```

### Example 7: Role based access control

```text
kubelctl create -f sbr-lease.yml -n <YOUR_NAMESPACE>
```

### Example 8: Role based access control

```yml
apiVersion: "akka.io/v1"
kind: Lease
metadata:
  name: <YOUR_ACTORSYSTEM_NAME>-akka-sbr
spec:
  owner: ""
  time: 0
```

### Example 9: Enable in SBR

```text
akka {
  cluster {
    downing-provider-class = "akka.cluster.sbr.SplitBrainResolverProvider"
    split-brain-resolver {
      active-strategy = "lease-majority"
      lease-majority {
        lease-implementation = "akka.coordination.lease.kubernetes"
      }
    }
  }
}
```

### Example 10: Full configuration options

```conf
akka.coordination.lease.kubernetes {

    lease-class = "akka.coordination.lease.kubernetes.KubernetesLease"

    api-ca-path = "/var/run/secrets/kubernetes.io/serviceaccount/ca.crt"
    api-token-path = "/var/run/secrets/kubernetes.io/serviceaccount/token"

    # Host for the Kubernetes API server. Typically this will be set via an environment
    # variable that is set when running inside Kubernetes
    api-service-host = "localhost"
    api-service-host = ${?KUBERNETES_SERVICE_HOST}

    # Port for the Kubernetes API server. Typically this will be set via an environment
    # variable that is set when running inside Kubernetes
    api-service-port = 8080
    api-service-port = ${?KUBERNETES_SERVICE_PORT}

    # Namespace file path. The namespace is to create the lock in. Can be overridden by "namespace"
    #
    # If this path doesn't exist, the namespace will default to "default".
    namespace-path = "/var/run/secrets/kubernetes.io/serviceaccount/namespace"

    # Namespace to create the lock in. If set to something other than "<namespace>" then overrides any value
    # in "namespace-path"
    namespace = "<namespace>"

    # How often to write time into CRD so that if the holder crashes
    # another node can take the lease after a given timeout. If left blank then the default is
    # max(5s, heartbeat-timeout / 10) which will be 12s with the default heartbeat-timeout
    heartbeat-interval = ""

    # How long a lease must not be updated before another node can assume
    # the holder has crashed.
    # If the lease holder hasn't crashed its next heart beat will fail due to the version
    # having been updated
    heartbeat-timeout = 120s

    # The individual timeout for each HTTP request. Defaults to 2/5 of the lease-operation-timeout
    # Can't be greater than then lease-operation-timeout
    api-server-request-timeout = ""

    # Use TLS & auth token for communication with the API server
    # set to false for plain text with no auth
    secure-api-server = true

    # The amount of time to wait for a lease to be acquired or released. This includes all requests to the API
    # server that are required. If this timeout is hit then the lease *may* be taken due to the response being lost
    # on the way back from the API server but will be reported as not taken and can be safely retried.
    lease-operation-timeout = 5s

    # For backwards compatibility to support rolling update. Truncation of lease name may cause conflicting names
    # of different lease resources.
    allow-lease-name-truncation = off

    # The maximum amount of time to cache a token for.
    # Service account tokens are by default in Kubernetes issued with a 1 hour expiry, and are rotated by the kubelet
    # when they reach 80% of it's total TTL. That means, if at any given time a read of a token is done, the token may
    # expire in 12 minutes, so this must be less than that.
    api-token-reload-interval = 10m
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/common/may-change.html
- https://doc.akka.io/libraries/akka-core/current/coordination.html
- https://doc.akka.io/libraries/akka-core/current/split-brain-resolver.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-singleton.html
- https://doc.akka.io/libraries/akka-management/current/loglevels/log4j2.html
- https://doc.akka.io/libraries/akka-management/current/native-image.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/kubernetes-lease.html](https://doc.akka.io/libraries/akka-management/current/kubernetes-lease.html)*