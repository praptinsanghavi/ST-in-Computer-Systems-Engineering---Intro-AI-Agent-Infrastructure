---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:26Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/configuring.html
title: 'Operate Akka in a self-managed environment :: Akka Documentation'
---

# Operate Akka in a self-managed environment :: Akka Documentation

## Content

# Operate Akka in a self\-managed environment

For organizations that want control over how Akka services are installed, updated, and maintained. Akka services are packaged into standalone binaries with Akka clustering for scaling. You are responsible for separately managing secure connectivity, routes, installation, deployment, and persistence.

## License key

You can retrieve a free license key from [akka.io/key](https://account.akka.io/key).

Define the key in your `application.conf`:

```
akka.license-key = "<your key>"
```

## Database

Akka requires a Postgres database. The tables will be created automatically, but you need to create the database and the credentials to connect to the database.

You define a connection configuration in your `application.conf` or use the predefined environment variables.

```
akka.persistence.r2dbc {
  connection-factory {
    host = "localhost"
    host = ${?DB_HOST}
    port = 5432
    port = ${?DB_PORT}
    database = "postgres"
    database = ${?DB_DATABASE}
    user = "postgres"
    user = ${?DB_USER}
    password = ${?DB_PASSWORD}
  }
}
```

Supported environment variables:

- DB\_HOST
- DB\_PORT
- DB\_DATABASE
- DB\_USER
- DB\_SSL\_ENABLED \- `true` to enable SSL
- DB\_SSL\_MODE \- allow, prefer, require, verify\-ca, verify\-full, tunnel
- DB\_SSL\_ROOT\_CERT \- Server root certificate. Can point to either a resource within the classpath or a file.
- DB\_SSL\_CERT \- Client certificate. Can point to either a resource within the classpath or a file.
- DB\_SSL\_KEY \- Key for client certificate. Can point to either a resource within the classpath or a file.
- DB\_SSL\_PASSWORD \- Password for client key.

You find more configuration options in [reference documentation](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/config.html).

## Build a container image

Build a container image of the service for standalone use by activating the `standalone` maven profile:

```
mvn clean install -DskipTests -Pstandalone
```

Push the image to your container registry.

## Try it locally

You can try running the image locally with docker compose:

1. docker\-compose.yml

```
version: "3"
services:
  postgres-db:
    image: postgres:latest
    container_name: postgres_db
    ports:
      - 5432:5432
    environment:
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: postgres
    healthcheck:
      test: [ 'CMD', 'pg_isready', "-q", "-d", "postgres", "-U", "postgres" ]
      interval: 5s
      retries: 5
      start_period: 5s
      timeout: 5s

  shopping-cart-service:
    image: shopping-cart-quickstart:1.0-SNAPSHOT-20250407061652
    container_name: shopping-cart-service
    depends_on:
      - postgres-db
    ports:
      - "9000:9000"
    extra_hosts:
      - "host.docker.internal:host-gateway"
    environment:
      # jvm -D properties can be added under this environment map (note: remove this comment when adding properties)
      JAVA_TOOL_OPTIONS: >

      # those variables are defined in the .env file
      STANDALONE_SINGLE_NODE:
        true
      DB_HOST:
        "postgres-db"
```

Update the `image:` of the `shopping-cart-service` in the `docker-compose.yml` with the specific image name and version you installed.

Run with:

```
docker compose -f docker-compose.yml up
```

## Deploy to Kubernetes

You need to create and operate the Kubernetes cluster yourself. Cloud and on\-premises Kubernetes are supported.

You need the following Kubernetes files:

1. namespace.yml

```
apiVersion: v1
kind: Namespace
metadata:
  name: shopping-cart-namespace
```
2. rbac.yml

For Akka Cluster bootstrap and rolling updates we need to define role based access control.

```
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
  namespace: shopping-cart-namespace
rules:
  - apiGroups: [""] # "" indicates the core API group
    resources: ["pods"]
    verbs: ["get", "watch", "list"]
  - apiGroups: [ "apps" ]
    resources: [ "replicasets" ]
    verbs: [ "get", "list" ]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: read-pods
  namespace: shopping-cart-namespace
subjects:
  # Note the `name` line below. The first default refers to the namespace. The second refers to the service account name.
  # For instance, `name: system:serviceaccount:myns:default` would refer to the default service account in namespace `myns`
  - kind: User
    name: system:serviceaccount:shopping-cart-namespace:default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
---
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
    name: system:serviceaccount:shopping-cart-namespace:default
roleRef:
  kind: Role
  name: pod-patcher
  apiGroup: rbac.authorization.k8s.io
```
3. deployment.yml

```
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: shopping-cart-service
  name: shopping-cart-service
  namespace: shopping-cart-namespace
spec:
  replicas: 3
  selector:
    matchLabels:
      app: shopping-cart-service
  strategy:
    rollingUpdate:
      maxSurge: 25%
      maxUnavailable: 25%
    type: RollingUpdate
  template:
    metadata:
      labels:
        app: shopping-cart-service
    spec:
      containers:
        - name: shopping-cart-service
          # use specific image version from docker publish
          image: shopping-cart-quickstart:1.0-SNAPSHOT-20250326155510
          imagePullPolicy: IfNotPresent
          # these will need to be tuned for production environments!
          #resources:
          #  limits:
          #    memory: "2Gi"
          #  requests:
          #    memory: "2Gi"
          #    cpu: "1000m"
          readinessProbe:
            failureThreshold: 5
            httpGet:
              path: /ready
              port: 8558
              scheme: HTTP
            periodSeconds: 10
            successThreshold: 1
            timeoutSeconds: 1
          livenessProbe:
            failureThreshold: 5
            httpGet:
              path: /alive
              port: 8558
              scheme: HTTP
            periodSeconds: 10
            successThreshold: 1
            timeoutSeconds: 1
          ports:
            - name: http
              containerPort: 9000
              protocol: TCP
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
          env:
            - name: KUBERNETES_NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: KUBERNETES_POD_NAME
              valueFrom:
                fieldRef:
                  fieldPath: metadata.name
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: SELECTOR_LABEL_VALUE
              value: "shopping-cart-service"
            - name: JAVA_TOOL_OPTIONS
              value: "-Xms1024m -Xmx1024m"
              # With proper memory resource limits the JVM heap can be a percentage
              # value: "-XX:InitialRAMPercentage=60 -XX:MaxRAMPercentage=60 -XX:MaxHeapFreeRatio=100 -XX:+AlwaysPreTouch"
            - name: DB_HOST
              value: "host.minikube.internal"
            - name: DB_USER
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_USER
                  optional: true
            - name: DB_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_PASSWORD
                  optional: true
```

Update the `image:` in the `deployment.yml` with the specific image version and location you published.
4. service.yml

```
apiVersion: v1
kind: Service
metadata:
  name: shopping-cart-service-svc
  namespace: shopping-cart-namespace
spec:
  selector:
    app: shopping-cart-service
  type: ClusterIP
  ports:
    - protocol: TCP
      port: 9000
      targetPort: 9000
```

Update all `shopping-cart` naming to your own names.

### Apply with kubectl

Deploy to Kubernetes with:

```
kubectl apply -f namespace.yml
kubectl config set-context --current --namespace=shopping-cart-namespace
kubectl apply -f rbac.yml
kubectl apply -f deployment.yml
kubectl apply -f service.yml

# all should be in ready state
kubectl get pods
```

As a first test you can create a port forward with:

```
kubectl port-forward svc/shopping-cart-service-svc 9000:9000
```

Then you can access the endpoints at `http:localhost:9000/`.

## Deploy to any other container image platform

The standalone image can be run in most container image platforms.

When running more than one instance of the service they must form an Akka cluster. This is done automatically in a Kubernetes environment, but must be configured within container runtime platforms.. Many container platforms are not designed to support cluster\-based systems that need discovery and network connectivity to enable scale and resilience. The nodes must support peer\-to\-peer TCP connectivity, by default on port 25520\. See [reference documentation](https://doc.akka.io/libraries/akka-core/current/typed/cluster.html#joining) for more details about cluster formation.

If clustering is not an option in your environment you can run it as a single instance by defining the following configuration in your `application.conf`:

```
akka.runtime.standalone.single-node = true
```

Make sure that there is only one instance running at the same time, for example rolling updates would not be supported.

## Configuration

### Endpoint configuration

The port that the HTTP server binds to can be configured with environment variable `HTTP_PORT` or:

```
kalix.proxy.http-port = 9000
```

### Service to Service Eventing configuration

By default, the service name defined in `@Consume.FromServiceStream` is used as the host name when connecting to the producing service. That can be logical dns name such as a Kubernetes service name.

You can define gRPC client configuration for a service name in the `application.conf`, such as:

```
akka.grpc.client {
  "shopping-cart-service" {
    host = "shopping-cart-service-svc"
    port = 9000
    use-tls = false
  }
}
```

Note that you are responsible for setting up access control and TLS between services.

You find more configuration options in [reference documentation](https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html#by-configuration).

### Kafka message broker configuration

If you use Kafka as message broker the configuration can be defined in your `application.conf`:

```
 akka.runtime.message-broker {
    support = "kafka"
    kafka {
      consumer = ${akka.kafka.consumer}
      producer = ${akka.kafka.producer}
      committer = ${akka.kafka.committer}
      connection-checker {
        enable = on
        max-retries = 5
        check-interval = 1 second
        backoff-factor = 2
      }

      # One or more bootstrap servers, comma separated.
      bootstrap-servers = ""
      bootstrap-servers = ${?BROKER_SERVERS}

      # Supported are
      # NONE (for easy local/dev mode with no auth at all)
      # PLAIN (for easy local/dev mode - plaintext, for non dev-mode TLS)
      # SCRAM-SHA-256 and SCRAM-SHA-512 (TLS)
      auth-mechanism = "NONE"
      auth-mechanism = ${?BROKER_AUTH_MECHANISM}
      auth-username = ""
      auth-username = ${?BROKER_USERNAME}
      auth-password = ""
      auth-password = ${?BROKER_PASS}
      broker-ca-pem-file = ""
      broker-ca-pem-file = ${?BROKER_CA_CERT}
   }
}
```

You find more configuration options in reference documentation:

- [producer settings](https://doc.akka.io/libraries/alpakka-kafka/current/producer.html#settings)
- [consumer settings](https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html#settings)

### More advanced configuration

There are many things that can be configured to control the Akka runtime behavior. Please [ask support](https://akka.io/contact-us). and we will guide you to the right way to adjust the configuration for what you need.

A few examples of things that can be configured:

- Akka Cluster and TLS within the cluster
- Akka Cluster Sharding
- Persistence and Projections
- TLS for communication between services
- Metrics

## Code Examples

### Example 1: License key

```none
akka.license-key = "<your key>"
```

### Example 2: Database

```none
akka.persistence.r2dbc {
  connection-factory {
    host = "localhost"
    host = ${?DB_HOST}
    port = 5432
    port = ${?DB_PORT}
    database = "postgres"
    database = ${?DB_DATABASE}
    user = "postgres"
    user = ${?DB_USER}
    password = ${?DB_PASSWORD}
  }
}
```

### Example 3: Build a container image

```command
mvn clean install -DskipTests -Pstandalone
```

### Example 4: Try it locally

```yml
version: "3"
services:
  postgres-db:
    image: postgres:latest
    container_name: postgres_db
    ports:
      - 5432:5432
    environment:
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: postgres
    healthcheck:
      test: [ 'CMD', 'pg_isready', "-q", "-d", "postgres", "-U", "postgres" ]
      interval: 5s
      retries: 5
      start_period: 5s
      timeout: 5s

  shopping-cart-service:
    image: shopping-cart-quickstart:1.0-SNAPSHOT-20250407061652
    container_name: shopping-cart-service
    depends_on:
      - postgres-db
    ports:
      - "9000:9000"
    extra_hosts:
      - "host.docker.internal:host-gateway"
    environment:
      # jvm -D properties can be added under this environment map (note: remove this comment when adding properties)
      JAVA_TOOL_OPTIONS: >

      # those variables are defined in the .env file
      STANDALONE_SINGLE_NODE:
        true
      DB_HOST:
        "postgres-db"
```

### Example 5: Try it locally

```command
docker compose -f docker-compose.yml up
```

### Example 6: Deploy to Kubernetes

```yml
apiVersion: v1
kind: Namespace
metadata:
  name: shopping-cart-namespace
```

### Example 7: Deploy to Kubernetes

```yaml
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
  namespace: shopping-cart-namespace
rules:
  - apiGroups: [""] # "" indicates the core API group
    resources: ["pods"]
    verbs: ["get", "watch", "list"]
  - apiGroups: [ "apps" ]
    resources: [ "replicasets" ]
    verbs: [ "get", "list" ]
---
kind: RoleBinding
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: read-pods
  namespace: shopping-cart-namespace
subjects:
  # Note the `name` line below. The first default refers to the namespace. The second refers to the service account name.
  # For instance, `name: system:serviceaccount:myns:default` would refer to the default service account in namespace `myns`
  - kind: User
    name: system:serviceaccount:shopping-cart-namespace:default
roleRef:
  kind: Role
  name: pod-reader
  apiGroup: rbac.authorization.k8s.io
---
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
    name: system:serviceaccount:shopping-cart-namespace:default
roleRef:
  kind: Role
  name: pod-patcher
  apiGroup: rbac.authorization.k8s.io
```

### Example 8: Deploy to Kubernetes

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: shopping-cart-service
  name: shopping-cart-service
  namespace: shopping-cart-namespace
spec:
  replicas: 3
  selector:
    matchLabels:
      app: shopping-cart-service
  strategy:
    rollingUpdate:
      maxSurge: 25%
      maxUnavailable: 25%
    type: RollingUpdate
  template:
    metadata:
      labels:
        app: shopping-cart-service
    spec:
      containers:
        - name: shopping-cart-service
          # use specific image version from docker publish
          image: shopping-cart-quickstart:1.0-SNAPSHOT-20250326155510
          imagePullPolicy: IfNotPresent
          # these will need to be tuned for production environments!
          #resources:
          #  limits:
          #    memory: "2Gi"
          #  requests:
          #    memory: "2Gi"
          #    cpu: "1000m"
          readinessProbe:
            failureThreshold: 5
            httpGet:
              path: /ready
              port: 8558
              scheme: HTTP
            periodSeconds: 10
            successThreshold: 1
            timeoutSeconds: 1
          livenessProbe:
            failureThreshold: 5
            httpGet:
              path: /alive
              port: 8558
              scheme: HTTP
            periodSeconds: 10
            successThreshold: 1
            timeoutSeconds: 1
          ports:
            - name: http
              containerPort: 9000
              protocol: TCP
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
          env:
            - name: KUBERNETES_NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: KUBERNETES_POD_NAME
              valueFrom:
                fieldRef:
                  fieldPath: metadata.name
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: SELECTOR_LABEL_VALUE
              value: "shopping-cart-service"
            - name: JAVA_TOOL_OPTIONS
              value: "-Xms1024m -Xmx1024m"
              # With proper memory resource limits the JVM heap can be a percentage
              # value: "-XX:InitialRAMPercentage=60 -XX:MaxRAMPercentage=60 -XX:MaxHeapFreeRatio=100 -XX:+AlwaysPreTouch"
            - name: DB_HOST
              value: "host.minikube.internal"
            - name: DB_USER
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_USER
                  optional: true
            - name: DB_PASSWORD
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_PASSWORD
                  optional: true
```

### Example 9: Deploy to Kubernetes

```yaml
apiVersion: v1
kind: Service
metadata:
  name: shopping-cart-service-svc
  namespace: shopping-cart-namespace
spec:
  selector:
    app: shopping-cart-service
  type: ClusterIP
  ports:
    - protocol: TCP
      port: 9000
      targetPort: 9000
```

### Example 10: Apply with kubectl

```shell
kubectl apply -f namespace.yml
kubectl config set-context --current --namespace=shopping-cart-namespace
kubectl apply -f rbac.yml
kubectl apply -f deployment.yml
kubectl apply -f service.yml

# all should be in ready state
kubectl get pods
```

### Example 11: Apply with kubectl

```shell
kubectl port-forward svc/shopping-cart-service-svc 9000:9000
```

### Example 12: Deploy to any other container image platform

```none
akka.runtime.standalone.single-node = true
```

### Example 13: Endpoint configuration

```none
kalix.proxy.http-port = 9000
```

### Example 14: Service to Service Eventing configuration

```none
akka.grpc.client {
  "shopping-cart-service" {
    host = "shopping-cart-service-svc"
    port = 9000
    use-tls = false
  }
}
```

### Example 15: Kafka message broker configuration

```none
akka.runtime.message-broker {
    support = "kafka"
    kafka {
      consumer = ${akka.kafka.consumer}
      producer = ${akka.kafka.producer}
      committer = ${akka.kafka.committer}
      connection-checker {
        enable = on
        max-retries = 5
        check-interval = 1 second
        backoff-factor = 2
      }

      # One or more bootstrap servers, comma separated.
      bootstrap-servers = ""
      bootstrap-servers = ${?BROKER_SERVERS}

      # Supported are
      # NONE (for easy local/dev mode with no auth at all)
      # PLAIN (for easy local/dev mode - plaintext, for non dev-mode TLS)
      # SCRAM-SHA-256 and SCRAM-SHA-512 (TLS)
      auth-mechanism = "NONE"
      auth-mechanism = ${?BROKER_AUTH_MECHANISM}
      auth-username = ""
      auth-username = ${?BROKER_USERNAME}
      auth-password = ""
      auth-password = ${?BROKER_PASS}
      broker-ca-pem-file = ""
      broker-ca-pem-file = ${?BROKER_CA_CERT}
   }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/current/typed/cluster.html
- https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/config.html
- https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html
- https://doc.akka.io/libraries/alpakka-kafka/current/producer.html

---
*Source: [https://doc.akka.io/operations/configuring.html](https://doc.akka.io/operations/configuring.html)*