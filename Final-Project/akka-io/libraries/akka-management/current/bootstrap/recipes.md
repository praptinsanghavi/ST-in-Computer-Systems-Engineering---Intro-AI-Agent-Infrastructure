---
description: Akka Management is a suite of tools for operating Akka Clusters.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:04Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-management/current/bootstrap/recipes.html
title: Bootstrap environments • Akka Management
---

# Bootstrap environments • Akka Management

> **Summary:** Akka Management is a suite of tools for operating Akka Clusters.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Bootstrap environments

A set of integration tests projects can be found in [integration\-test folder of the Akka Management project](https://github.com/akka/akka-management/tree/main/integration-test). These test various Akka management features together in various environments such as Kubernetes.

## Local

To run Bootstrap locally without any dependencies such as DNS or Kubernetes see the [`local` example](local-config.html)

## Running Akka Cluster in Kubernetes

The goal of bootstrap is to support running Akka Cluster in Kubernetes as if it is a stateless application. The part bootstrap solves is creating the initial cluster and handling scaling and re\-deploys gracefully.

The recommended approach is to:

- Use a Deployment for creating the pods
- Use either the Kubernetes API or DNS for contact point discovery (details below)
- Optionally use a service or ingress for any traffic coming from outside of the Akka Cluster e.g. gRPC and HTTP

### Example project

To get started, it might be helpful to have a look at the example projects.

- [Akka Cluster bootstrap using the Kubernetes API with Java/Maven](../attachments/akka-sample-cluster-kubernetes-java.zip)
- [Akka Cluster bootstrap using the Kubernetes API with Scala/sbt](../attachments/akka-sample-cluster-kubernetes-scala.zip)

### Kubernetes Deployment

Use a regular deployment (not a StatefulSet) with the following settings.

#### Update strategy

For small clusters it may make sense to set `maxUnavailable` to 0 and `maxSurge` to 1\. This means that a new pod is created before removing any existing pods so if the new pod fails the cluster remains at full strength until a rollback happens. For large clusters it may be too slow to do 1 pod at a time.

If using [Split Brain Resolver](https://doc.akka.io/libraries/akka-core/current/split-brain-resolver.html) have a `maxUnavailable` that will not cause downing

### Cluster singletons

Deployments used to order pods by pod state and then time spent ready when deciding which to remove first. This worked well with cluster singletons as they were typically removed last and then the cluster singletons would move to the oldest new pod. However, since Kubernetes v1\.22, this is no longer the default behaviour for Kubernetes deployments thus we advise the use of `PodDeletionCost` extension from [Akka Kubernetes Rolling Update](../rolling-updates.html#kubernetes-rolling-updates).

### External traffic

For production traffic e.g. HTTP use a regular service or an alternative ingress mechanism. With an appropriate readiness check this results in traffic not being routed until bootstrap has finished.

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-dns/kubernetes/akka-cluster.yml#L86-L100 "Go to snippet source")apiVersion: v1
kind: Service
metadata:
  labels:
    app: akka-bootstrap-demo
  name: "integration-test-kubernetes-dns"
spec:
  ports:
  - name: http
    port: 8080
    protocol: TCP
    targetPort: 8080
  selector:
    app: "akka-bootstrap-demo"
  type: LoadBalancer
```

This will result in a ClusterIP being created and only added to `Endpoints` when the pods are `ready`

Note that the `app` is the same for both services as they both refer to the same pods.

### Health checks

`akka-management` includes a HTTP route for readiness and liveness checks. `akka-management-cluster-http` includes readiness check for the Akka Cluster membership.

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependency as below.

sbt
```
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.management" %% "akka-management-cluster-http" % AkkaManagementVersion
```
Gradle
```
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-management-cluster-http_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
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
    <artifactId>akka-management-cluster-http_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

Akka Cluster HTTP Management can be used with Akka 2\.10\.11 or later. You have to override the following Akka dependencies by defining them explicitly in your build and define the Akka version to the one that you are using. Latest patch version of Akka is recommended and a later version than 2\.10\.11 can be used.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster-sharding" % AkkaVersion,
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
  implementation "com.typesafe.akka:akka-cluster-sharding_${versions.ScalaBinary}:${versions.AkkaVersion}"
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
    <artifactId>akka-cluster-sharding_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

The readiness check is exposed on the Akka Management port as a `GET` on `/ready` and the liveness check is a `GET` on `/alive`

Configure them to be used in your deployment:

```
[source](https://github.com/akka/akka-management/tree/v1.6.4/integration-test/kubernetes-dns/kubernetes/akka-cluster.yml#L32-L39 "Go to snippet source")readinessProbe:
  httpGet:
    path: /ready
    port: management
livenessProbe:
  httpGet:
    path: /alive
    port: management
```

This will mean that a pod won’t get traffic until it is part of a cluster, which is important if either `ClusterSharding` or `ClusterSingleton` are used.

### Contact point discovery

Contact point discovery can use either `kubernetes` or `akka-dns` service discovery. Details on additional resources required and how they work:

- [Kubernetes using `kubernetes-api` discovery](kubernetes-api.html)
- [Kubernetes using `akka-dns` discovery](kubernetes.html)

Kubernetes\-api is the more battle tested mechanism, DNS was added in Akka 2\.5\.15 and Akka Management 0\.18\. DNS has the benefit that it is agnostic of Kubernetes so does not require pods be able to communicate with the API server. However it requires a headless service that supports the `publishNotReadyAddresses` feature. If your Kubernetes setup does not support `publishNotReadyAddresses` yet then use the `kubernetes-api` discovery mechanism.

### Running in Istio

For considerations and configuration necessary for bootstrapping an Akka cluster in Istio, see [Bootstrapping an Akka cluster in Istio](istio.html).

### Running the Kubernetes demos

The following steps work for the `integration-test/kubernetes-api` or the `integration-test/kubernetes-dns` sub\-project:

To run the demo in a real Kubernetes or OpenShift cluster the images must be pushed to a registry that cluster has access to and then `kubernetes/akka-cluster.yml` (in either sub\-project) modified with the full image path.

The following shows how the sample can be run in a local cluster using either `minishift` or `minikube`. Unless explicitly stated `minikube` can be replaced with `minishift` and `kubectl` with `oc` in any of the commands below.

Start [minikube](https://github.com/kubernetes/minikube) make sure you have installed and is running:

```
$ minikube start

```

Make sure your shell is configured to target the docker daemon running inside the VM:

```
$ eval $(minikube docker-env)

```

Publish the application docker image locally. If running this project in a real cluster you’ll need to publish the image to a repository that is accessible from your Kubernetes cluster and update the `kubernetes/akka-cluster.yml` with the new image name.

```
$ sbt shell
> project integration-test-kubernetes-api (or integration-test-kubernetes-dns)
> docker:publishLocal

```

You can run multiple different Akka Bootstrap\-based applications in the same namespace, alongside any other containers that belong to the same logical application. The resources in `kubernetes/akka-cluster.yml` are configured to run in the `akka-bootstrap-demo-ns` namespace. Change that to the namespace you want to deploy to. If you do not have a namespace to run your application in yet, create it:

```
kubectl create namespace <insert-namespace-name-here>

# and set it as the default for subsequent commands
kubectl config set-context $(kubectl config current-context) --namespace=<insert-namespace-name-here>

```

Or if running with `minishift`:

```
oc new-project <insert-namespace-name-here>

# and switch to that project to make it the default for subsequent comments
oc project <insert-namespace-name-here>

```

Next deploy the application:

```
# minikube using Kubernetes API
kubectl apply -f integration-test/kubernetes-api/kubernetes/akka-cluster.yml

or

# minikube using DNS
kubectl apply -f integration-test/kubernetes-dns/kubernetes/akka-cluster.yml

or

# minishift using Kubernetes API
oc apply -f integration-test/kubernetes-api/kubernetes/akka-cluster.yaml

or

# minishift using DNS
oc apply -f integration-test/kubernetes-dns/kubernetes/akka-cluster.yaml

```

This will create and start running a number of Pods hosting the application. The application nodes will form a cluster.

In order to observe the logs during the cluster formation you can pick one of the pods and issue the kubectl logs command on it:

```
$ POD=$(kubectl get pods | grep akka-bootstrap | grep Running | head -n1 | awk '{ print $1 }'); echo $POD
akka-integration-test-bcc456d8c-6qx87

$ kubectl logs $POD --follow | less

```

```
[INFO] [12/13/2018 07:13:42.867] [main] [ClusterBootstrap(akka://default)] Initiating bootstrap procedure using akka.discovery.akka-dns method...
[DEBUG] [12/13/2018 07:13:42.906] [default-akka.actor.default-dispatcher-2] [TimerScheduler(akka://default)] Start timer [resolve-key] with generation [1]
[DEBUG] [12/13/2018 07:13:42.919] [default-akka.actor.default-dispatcher-2] [TimerScheduler(akka://default)] Start timer [decide-key] with generation [2]
[INFO] [12/13/2018 07:13:42.924] [default-akka.actor.default-dispatcher-2] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/system/bootstrapCoordinator] Locating service members. Using discovery [akka.discovery.dns.DnsSimpleServiceDiscovery], join decider [akka.management.cluster.bootstrap.LowestAddressJoinDecider]
[INFO] [12/13/2018 07:13:42.933] [default-akka.actor.default-dispatcher-2] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/system/bootstrapCoordinator] Looking up [Lookup(integration-test-kubernetes-dns-internal.akka-bootstrap.svc.cluster.local,Some(management),Some(tcp))]
[DEBUG] [12/13/2018 07:13:42.936] [default-akka.actor.default-dispatcher-2] [DnsSimpleServiceDiscovery(akka://default)] Lookup [Lookup(integration-test-kubernetes-dns-internal.akka-bootstrap-demo-ns.svc.cluster.local,Some(management),Some(tcp))] translated to SRV query [_management._tcp.integration-test-kubernetes-dns-internal.akka-bootstrap-demo-ns.svc.cluster.local] as contains portName and protocol
[DEBUG] [12/13/2018 07:13:42.995] [default-akka.actor.default-dispatcher-18] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/system/IO-DNS] Resolution request for _management._tcp.integration-test-kubernetes-dns-internal.akka-bootstrap-demo-ns.svc.cluster.local Srv from Actor[akka://default/temp/$a]
[DEBUG] [12/13/2018 07:13:43.011] [default-akka.actor.default-dispatcher-6] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/system/IO-DNS/async-dns/$a] Attempting to resolve _management._tcp.integration-test-kubernetes-dns-internal.akka-bootstrap-demo-ns.svc.cluster.local with Actor[akka://default/system/IO-DNS/async-dns/$a/$a#1272991285]
[DEBUG] [12/13/2018 07:13:43.049] [default-akka.actor.default-dispatcher-18] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/system/IO-TCP/selectors/$a/0] Successfully bound to /0.0.0.0:8558
[DEBUG] [12/13/2018 07:13:43.134] [default-akka.actor.default-dispatcher-18] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/system/IO-DNS/async-dns/$a/$a] Resolving [_management._tcp.integration-test-kubernetes-dns-internal.akka-bootstrap-demo-ns.svc.cluster.local] (SRV)
[INFO] [12/13/2018 07:13:43.147] [default-akka.actor.default-dispatcher-6] [AkkaManagement(akka://default)] Bound Akka Management (HTTP) endpoint to: 0.0.0.0:8558
[DEBUG] [12/13/2018 07:13:43.156] [default-akka.actor.default-dispatcher-5] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/system/IO-TCP/selectors/$a/1] Successfully bound to /0.0.0.0:8080
[INFO] [12/13/2018 07:13:43.180] [main] [akka.actor.ActorSystemImpl(default)] Server online at http://localhost:8080/
....
[INFO] [12/13/2018 07:13:50.631] [default-akka.actor.default-dispatcher-5] [akka.cluster.Cluster(akka://default)] Cluster Node [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552] - Welcome from [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552]
[DEBUG] [12/13/2018 07:13:50.644] [default-akka.remote.default-remote-dispatcher-22] [akka.serialization.Serialization(akka://default)] Using serializer [akka.cluster.protobuf.ClusterMessageSerializer] for message [akka.cluster.GossipEnvelope]
[INFO] [12/13/2018 07:13:50.659] [default-akka.actor.default-dispatcher-18] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/user/$b] Cluster akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552 >>> MemberUp(Member(address = akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552, status = Up))
[INFO] [12/13/2018 07:13:50.676] [default-akka.actor.default-dispatcher-20] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/user/$b] Cluster akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552 >>> MemberJoined(Member(address = akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552, status = Joining))
[INFO] [12/13/2018 07:13:50.716] [default-akka.actor.default-dispatcher-6] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/user/$b] Cluster akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552 >>> LeaderChanged(Some(akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552))
[INFO] [12/13/2018 07:13:50.720] [default-akka.actor.default-dispatcher-3] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/user/$b] Cluster akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552 >>> RoleLeaderChanged(dc-default,Some(akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552))
[INFO] [12/13/2018 07:13:50.727] [default-akka.actor.default-dispatcher-6] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/user/$b] Cluster akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552 >>> SeenChanged(true,Set(akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552, akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552))
[INFO] [12/13/2018 07:13:50.733] [default-akka.actor.default-dispatcher-5] [akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552/user/$b] Cluster akka.tcp://[[email protected]](/cdn-cgi/l/email-protection):2552 >>> ReachabilityChanged()

```

## Code Examples

### Example 1: External traffic

```yml
apiVersion: v1
kind: Service
metadata:
  labels:
    app: akka-bootstrap-demo
  name: "integration-test-kubernetes-dns"
spec:
  ports:
  - name: http
    port: 8080
    protocol: TCP
    targetPort: 8080
  selector:
    app: "akka-bootstrap-demo"
  type: LoadBalancer
```

### Example 2: Health checks

```scala
val AkkaManagementVersion = "1.6.4"
libraryDependencies += "com.lightbend.akka.management" %% "akka-management-cluster-http" % AkkaManagementVersion
```

### Example 3: Health checks

```gradle
def versions = [
  AkkaManagementVersion: "1.6.4",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka.management:akka-management-cluster-http_${versions.ScalaBinary}:${versions.AkkaManagementVersion}"
}
```

### Example 4: Health checks

```xml
<properties>
  <akka.management.version>1.6.4</akka.management.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka.management</groupId>
    <artifactId>akka-management-cluster-http_${scala.binary.version}</artifactId>
    <version>${akka.management.version}</version>
  </dependency&gt
</dependencies>
```

### Example 5: Health checks

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster-sharding" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
)
```

### Example 6: Health checks

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster-sharding_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 7: Health checks

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 8: Health checks

```yml
readinessProbe:
  httpGet:
    path: /ready
    port: management
livenessProbe:
  httpGet:
    path: /alive
    port: management
```

### Example 9: Running the Kubernetes demos

```text
$ minikube start
```

### Example 10: Running the Kubernetes demos

```text
$ eval $(minikube docker-env)
```

### Example 11: Running the Kubernetes demos

```text
$ sbt shell
> project integration-test-kubernetes-api (or integration-test-kubernetes-dns)
> docker:publishLocal
```

### Example 12: Running the Kubernetes demos

```text
kubectl create namespace <insert-namespace-name-here>

# and set it as the default for subsequent commands
kubectl config set-context $(kubectl config current-context) --namespace=<insert-namespace-name-here>
```

### Example 13: Running the Kubernetes demos

```text
oc new-project <insert-namespace-name-here>

# and switch to that project to make it the default for subsequent comments
oc project <insert-namespace-name-here>
```

### Example 14: Running the Kubernetes demos

```text
# minikube using Kubernetes API
kubectl apply -f integration-test/kubernetes-api/kubernetes/akka-cluster.yml

or

# minikube using DNS
kubectl apply -f integration-test/kubernetes-dns/kubernetes/akka-cluster.yml

or

# minishift using Kubernetes API
oc apply -f integration-test/kubernetes-api/kubernetes/akka-cluster.yaml

or

# minishift using DNS
oc apply -f integration-test/kubernetes-dns/kubernetes/akka-cluster.yaml
```

### Example 15: Running the Kubernetes demos

```text
$ POD=$(kubectl get pods | grep akka-bootstrap | grep Running | head -n1 | awk '{ print $1 }'); echo $POD
akka-integration-test-bcc456d8c-6qx87

$ kubectl logs $POD --follow | less
```

### Example 16: Running the Kubernetes demos

```text
[INFO] [12/13/2018 07:13:42.867] [main] [ClusterBootstrap(akka://default)] Initiating bootstrap procedure using akka.discovery.akka-dns method...
[DEBUG] [12/13/2018 07:13:42.906] [default-akka.actor.default-dispatcher-2] [TimerScheduler(akka://default)] Start timer [resolve-key] with generation [1]
[DEBUG] [12/13/2018 07:13:42.919] [default-akka.actor.default-dispatcher-2] [TimerScheduler(akka://default)] Start timer [decide-key] with generation [2]
[INFO] [12/13/2018 07:13:42.924] [default-akka.actor.default-dispatcher-2] [akka.tcp://[email protected]:2552/system/bootstrapCoordinator] Locating service members. Using discovery [akka.discovery.dns.DnsSimpleServiceDiscovery], join decider [akka.management.cluster.bootstrap.LowestAddressJoinDecider]
[INFO] [12/13/2018 07:13:42.933] [default-akka.actor.default-dispatcher-2] [akka.tcp://[email protected]:2552/system/bootstrapCoordinator] Looking up [Lookup(integration-test-kubernetes-dns-internal.akka-bootstrap.svc.cluster.local,Some(management),Some(tcp))]
[DEBUG] [12/13/2018 07:13:42.936] [default-akka.actor.default-dispatcher-2] [DnsSimpleServiceDiscovery(akka://default)] Lookup [Lookup(integration-test-kubernetes-dns-internal.akka-bootstrap-demo-ns.svc.cluster.local,Some(management),Some(tcp))] translated to SRV query [_management._tcp.integration-test-kubernetes-dns-internal.akka-bootstrap-demo-ns.svc.cluster.local] as contains portName and protocol
[DEBUG] [12/13/2018 07:13:42.995] [default-akka.actor.default-dispatcher-18] [akka.tcp://[email protected]:2552/system/IO-DNS] Resolution request for _management._tcp.integration-test-kubernetes-dns-internal.akka-bootstrap-demo-ns.svc.cluster.local Srv from Actor[akka://default/temp/$a]
[DEBUG] [12/13/2018 07:13:43.011] [default-akka.actor.default-dispatcher-6] [akka.tcp://[email protected]:2552/system/IO-DNS/async-dns/$a] Attempting to resolve _management._tcp.integration-test-kubernetes-dns-internal.akka-bootstrap-demo-ns.svc.cluster.local with Actor[akka://default/system/IO-DNS/async-dns/$a/$a#1272991285]
[DEBUG] [12/13/2018 07:13:43.049] [default-akka.actor.default-dispatcher-18] [akka.tcp://[email protected]:2552/system/IO-TCP/selectors/$a/0] Successfully bound to /0.0.0.0:8558
[DEBUG] [12/13/2018 07:13:43.134] [default-akka.actor.default-dispatcher-18] [akka.tcp://[email protected]:2552/system/IO-DNS/async-dns/$a/$a] Resolving [_management._tcp.integration-test-kubernetes-dns-internal.akka-bootstrap-demo-ns.svc.cluster.local] (SRV)
[INFO] [12/13/2018 07:13:43.147] [default-akka.actor.default-dispatcher-6] [AkkaManagement(akka://default)] Bound Akka Management (HTTP) endpoint to: 0.0.0.0:8558
[DEBUG] [12/13/2018 07:13:43.156] [default-akka.actor.default-dispatcher-5] [akka.tcp://[email protected]:2552/system/IO-TCP/selectors/$a/1] Successfully bound to /0.0.0.0:8080
[INFO] [12/13/2018 07:13:43.180] [main] [akka.actor.ActorSystemImpl(default)] Server online at http://localhost:8080/
....
[INFO] [12/13/2018 07:13:50.631] [default-akka.actor.default-dispatcher-5] [akka.cluster.Cluster(akka://default)] Cluster Node [akka.tcp://[email protected]:2552] - Welcome from [akka.tcp://[email protected]:2552]
[DEBUG] [12/13/2018 07:13:50.644] [default-akka.remote.default-remote-dispatcher-22] [akka.serialization.Serialization(akka://default)] Using serializer [akka.cluster.protobuf.ClusterMessageSerializer] for message [akka.cluster.GossipEnvelope]
[INFO] [12/13/2018 07:13:50.659] [default-akka.actor.default-dispatcher-18] [akka.tcp://[email protected]:2552/user/$b] Cluster akka.tcp://[email protected]:2552 >>> MemberUp(Member(address = akka.tcp://[email protected]:2552, status = Up))
[INFO] [12/13/2018 07:13:50.676] [default-akka.actor.default-dispatcher-20] [akka.tcp://[email protected]:2552/user/$b] Cluster akka.tcp://[email protected]:2552 >>> MemberJoined(Member(address = akka.tcp://[email protected]:2552, status = Joining))
[INFO] [12/13/2018 07:13:50.716] [default-akka.actor.default-dispatcher-6] [akka.tcp://[email protected]:2552/user/$b] Cluster akka.tcp://[email protected]:2552 >>> LeaderChanged(Some(akka.tcp://[email protected]:2552))
[INFO] [12/13/2018 07:13:50.720] [default-akka.actor.default-dispatcher-3] [akka.tcp://[email protected]:2552/user/$b] Cluster akka.tcp://[email protected]:2552 >>> RoleLeaderChanged(dc-default,Some(akka.tcp://[email protected]:2552))
[INFO] [12/13/2018 07:13:50.727] [default-akka.actor.default-dispatcher-6] [akka.tcp://[email protected]:2552/user/$b] Cluster akka.tcp://[email protected]:2552 >>> SeenChanged(true,Set(akka.tcp://[email protected]:2552, akka.tcp://[email protected]:2552))
[INFO] [12/13/2018 07:13:50.733] [default-akka.actor.default-dispatcher-5] [akka.tcp://[email protected]:2552/user/$b] Cluster akka.tcp://[email protected]:2552 >>> ReachabilityChanged()
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/cdn-cgi/l/email-protection
- https://doc.akka.io/libraries/akka-core/current/split-brain-resolver.html
- https://doc.akka.io/libraries/akka-management/current/attachments/akka-sample-cluster-kubernetes-java.zip
- https://doc.akka.io/libraries/akka-management/current/attachments/akka-sample-cluster-kubernetes-scala.zip
- https://doc.akka.io/libraries/akka-management/current/bootstrap/details.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/index.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/istio.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes-api.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/kubernetes.html
- https://doc.akka.io/libraries/akka-management/current/bootstrap/local-config.html
- https://doc.akka.io/libraries/akka-management/current/rolling-updates.html

---
*Source: [https://doc.akka.io/libraries/akka-management/current/bootstrap/recipes.html](https://doc.akka.io/libraries/akka-management/current/bootstrap/recipes.html)*