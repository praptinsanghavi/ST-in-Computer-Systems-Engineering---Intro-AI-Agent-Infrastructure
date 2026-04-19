---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:09Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/4-deploying.html
title: 'Part 4: Deploying with Kubernetes • Akka Distributed Cluster'
---

# Part 4: Deploying with Kubernetes • Akka Distributed Cluster

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Part 4: Deploying with Kubernetes

In this part we will deploy [Service to Service eventing](2-service-to-service.html) and [Active\-active](3-active-active.html) parts of the guide to Kubernetes in two separate regions.

## Setup Kubernetes cluster

Use instructions from your preferred cloud provider of how to start two Kubernetes clusters in two separate regions.

As an example, we use Amazon EKS in regions `us-east-2` and `eu-central-1`:

```
eksctl create cluster \
  --name eks-akka-us-east-2 \
  --version 1.24 \
  --region us-east-2 \
  --nodegroup-name linux-nodes \
  --node-type m5.xlarge \
  --nodes 3 \
  --nodes-min 1 \
  --nodes-max 4 \
  --with-oidc \
  --managed

eksctl create cluster \
  --name eks-akka-eu-central-1 \
  --version 1.24 \
  --region eu-central-1 \
  --nodegroup-name linux-nodes \
  --node-type m5.xlarge \
  --nodes 3 \
  --nodes-min 1 \
  --nodes-max 4 \
  --with-oidc \
  --managed

```

## Setup database

Use instructions from your preferred cloud provider of how to run a PostgreSQL database in each of the two regions.

As an example, we use [Amazon RDS Postgres](https://console.aws.amazon.com/rds/home). For a trial PostgreSQL you can select the following aside from defaults:

- Standard create
- PostgreSQL
- Free tier (some regions don’t offer free tier)
- DB instance identifier: `shopping-db-us-east-2`
- Master password: `<a password>`
- Turn off storage autoscaling
- VPC: Use the same as your EKS cluster is running in
- Create new VPC security group: `shopping-db-sg`
- Turn off Automatic Backups in the Additional Configuration section.

To allow the nodes in the EKS cluster to connect to the database you have to add a rule in the security group.

Go to the [VPC console](https://console.aws.amazon.com/vpc/home). Select “Security Groups”.

There are 3 security groups for the EKS cluster and you should select the one with description “EKS created security group …”. The one that has a name that doesn’t contain `ControlPlaneSecurityGroup` and doesn’t contain `ClusterSharedNodeSecurityGroup` . Make a note of this security group id for the EKS cluster.

Go back to the [Amazon RDS console](https://console.aws.amazon.com/rds/home#databases). Select the database that you created. Click on the “VPC security groups” in the tab “Connectivity \& security”.

Edit inbound rules \> add rule \> Custom TCP \> Port 5432 \> Source custom. Add the security group for the EKS cluster. Save rules.

More details in [A DB instance in a VPC accessed by an EC2 instance in the same VPC](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_VPC.Scenarios.html#USER_VPC.Scenario1)

## Namespace

Define a Kubernetes namespace with a `namespace.json` file: 

JSON

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/kubernetes/namespace.json "Go to snippet source"){
  "kind": "Namespace",
  "apiVersion": "v1",
  "metadata": {
    "name": "shopping-cart-namespace",
    "labels": {
      "name": "shopping-cart-namespace"
    }
  }
}

```

Create the namespace with:

```
kubectl apply -f kubernetes/namespace.json

```

For convenience, you can use this namespace by default:

```
kubectl config set-context --current --namespace=shopping-cart-namespace

```

## Role based access control

For Akka Cluster bootstrap we need to define access control with a `rbac.yml` file:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/kubernetes/rbac.yml "Go to snippet source")kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
  namespace: shopping-cart-namespace
rules:
  - apiGroups: [""] # "" indicates the core API group
    resources: ["pods"]
    verbs: ["get", "watch", "list"]
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
```

Apply the access control with:

```
kubectl apply -f kubernetes/rbac.yml

```

## Database secret

Create a Kubernetes secret with the connection details and credentials to the database:

```
kubectl create secret generic \
    db-secret \
    --from-literal=DB_HOST=shopping-db-us-east-2.cgrtpi2lqrw8.us-east-2.rds.amazonaws.com \
    --from-literal=DB_USER=postgres \
    --from-literal=DB_PASSWORD=<the password>

```

## Database schema

You can run `psql` from the Kubernetes cluster with 

```
kubectl run -i --tty db-mgmt --image=postgres --restart=Never --rm \
  --env=PGPASSWORD=<the password> -- \
  psql -h shopping-db-us-east-2.cgrtpi2lqrw8.us-east-2.rds.amazonaws.com -U postgres

```

Paste the DDL statements from the `ddl-scripts/create-tables.sql` to the `psql` prompt:

SQL

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/ddl-scripts/create_tables.sql "Go to snippet source")CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id, seq_nr)
);

CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice, entity_type, db_timestamp, seq_nr);

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id)
);

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);

-- Primitive offset types are stored in this table.
-- If only timestamp based offsets are used this table is optional.
-- Configure akka.projection.r2dbc.offset-store.offset-table="" if the table is not created.
CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(32) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

-- Timestamp based offsets are stored in this table.
CREATE TABLE IF NOT EXISTS akka_projection_timestamp_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  slice INT NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  -- timestamp_offset is the db_timestamp of the original event
  timestamp_offset timestamp with time zone NOT NULL,
  -- timestamp_consumed is when the offset was stored
  -- the consumer lag is timestamp_consumed - timestamp_offset
  timestamp_consumed timestamp with time zone NOT NULL,
  PRIMARY KEY(slice, projection_name, timestamp_offset, persistence_id, seq_nr)
);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

## Repeat for the other region

If you haven’t already, repeat the steps for namespace, rbac, database secret, and database schema in the other region.

## Deploy shopping\-cart\-service

We are going to deploy the `shopping-cart-service` in region `us-east-2`.

The complete sample can be downloaded:

- Scala: [shopping\-scala.zip](../attachments/shopping-scala.zip)
- Java: [shopping\-java.zip](../attachments/shopping-java.zip)

Build the image in `shopping-cart-service` directory:

Scala

```
sbt -Ddocker.username=<username> -Ddocker.registry=docker.io docker:publish

```

Java

```
mvn -DskipTests -Ddocker.registry=<username> clean package docker:push

```

The Kubernetes `Deployment` in `deployment.yml` file:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/kubernetes/deployment.yml "Go to snippet source")apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: shopping-cart-service
  name: shopping-cart-service
  namespace: shopping-cart-namespace
spec:
  replicas: 1
  selector:
    matchLabels:
      app: shopping-cart-service
  template:
    metadata:
      labels:
        app: shopping-cart-service
        actorSystemName: shopping-cart-service
    spec:
      containers:
        - name: shopping-cart-service
          # use specific image version from docker publish
          image: shopping-cart-service:latest
          # these will need to be increased tuned for production environments!
          resources:
            limits:
              memory: "2Gi"
            requests:
              memory: "2Gi"
              cpu: "1000m"
          readinessProbe:
            httpGet:
              path: /ready
              port: management
            periodSeconds: 10
            failureThreshold: 3
            initialDelaySeconds: 10
          livenessProbe:
            httpGet:
              path: "/alive"
              port: management
            periodSeconds: 10
            failureThreshold: 5
            initialDelaySeconds: 20
          ports:
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
            - name: grpc
              containerPort: 8101
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75 -Dakka.persistence.r2dbc.connection-factory.ssl.enabled=true -Dakka.persistence.r2dbc.connection-factory.ssl.mode=require"
            - name: DB_HOST
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_HOST
                  optional: true
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

```
kubectl apply -f kubernetes/deployment.yml

```

### Port forward

Create a Kubernetes `Service` and port forward to simplify access to the pods from your local machine:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/kubernetes/service.yml "Go to snippet source")apiVersion: v1
kind: Service
metadata:
  name: shopping-cart-service-svc
spec:
  selector:
    app: shopping-cart-service
  type: NodePort
  ports:
    - protocol: TCP
      port: 8101
      targetPort: 8101
```

```
kubectl apply -f kubernetes/service.yml

```

Start port forward with:

```
kubectl port-forward svc/shopping-cart-service-svc 8101:8101

```

### Exercise the shopping\-cart\-service

Use [grpcurl](https://github.com/fullstorydev/grpcurl) to exercise the service.

Add 7 socks to a cart:

```
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":7}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

```

Add 3 t\-shirts to the same cart:

```
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

```

## Load balancer

To access the `shopping-cart-service` from `shopping-analytics-service` running in another region we need an Internet facing load balancer.

There are many alternatives for secure access with a load balancer. An incomplete list of options:

- Network load balancer such as [AWS Load Balancer Controller](https://docs.aws.amazon.com/eks/latest/userguide/network-load-balancing.html) with TLS all the way between the services.
- Application load balancer such as [AWS Load Balancer Controller](https://docs.aws.amazon.com/prescriptive-guidance/latest/patterns/deploy-a-grpc-based-application-on-an-amazon-eks-cluster-and-access-it-with-an-application-load-balancer.html), which terminates TLS.
- [NGINX Ingress Controller](https://docs.nginx.com/nginx-ingress-controller/)
- [Contour](https://projectcontour.io)
- [Linkerd multi\-cluster](https://linkerd.io/2.13/features/multicluster/)

Mutual authentication with TLS (mTLS) can be very useful where only other known services are allowed to interact with a service, and public access should be denied. See [Akka gRPC documentation](https://doc.akka.io/libraries/akka-grpc/current/mtls.html).

We are going to use a network load balancer for simplicity of this example, and we are not using TLS. Real applications would of course require TLS.

Follow the instructions of how to [install the AWS Load Balancer Controller add\-on](https://docs.aws.amazon.com/eks/latest/userguide/aws-load-balancer-controller.html).

Create a Kubernetes `Service` that is configured for the load balancer:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/kubernetes/service-nlb.yml "Go to snippet source")# Network load balancer https://docs.aws.amazon.com/eks/latest/userguide/network-load-balancing.html
apiVersion: v1
kind: Service
metadata:
  name: shopping-cart-service-nlb
  annotations:
    service.beta.kubernetes.io/aws-load-balancer-type: external
    service.beta.kubernetes.io/aws-load-balancer-nlb-target-type: ip
    service.beta.kubernetes.io/aws-load-balancer-scheme: internet-facing
spec:
  selector:
    app: shopping-cart-service
  type: LoadBalancer
  ports:
    - protocol: TCP
      port: 80
      targetPort: 8101
```

The external DNS name is shown by:

```
kubectl get services

```

## Deploy shopping\-analytics\-service

We are going to deploy the `shopping-analytics-service` in region `eu-central-1`.

The complete sample can be downloaded:

- Scala: [shopping\-scala.zip](../attachments/shopping-scala.zip)
- Java: [shopping\-java.zip](../attachments/shopping-java.zip)

Build the image in `shopping-analytics-service` directory:

Scala

```
sbt -Ddocker.username=<username> -Ddocker.registry=docker.io docker:publish

```

Java

```
mvn -DskipTests -Ddocker.registry=<username> clean package docker:push

```

The Kubernetes `Deployment` in `deployment.yml` file:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-scala/kubernetes/deployment.yml "Go to snippet source")apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: shopping-analytics-service
  name: shopping-analytics-service
  namespace: shopping-cart-namespace
spec:
  replicas: 1
  selector:
    matchLabels:
      app: shopping-analytics-service
  template:
    metadata:
      labels:
        app: shopping-analytics-service
        actorSystemName: shopping-analytics-service
    spec:
      containers:
        - name: shopping-analytics-service
          # use specific image version from docker publish
          image: shopping-analytics-service:latest
          # these will need to be increased tuned for production environments!
          resources:
            limits:
              memory: "2Gi"
            requests:
              memory: "2Gi"
              cpu: "1000m"
          readinessProbe:
            httpGet:
              path: /ready
              port: management
            periodSeconds: 10
            failureThreshold: 3
            initialDelaySeconds: 10
          livenessProbe:
            httpGet:
              path: "/alive"
              port: management
            periodSeconds: 10
            failureThreshold: 5
            initialDelaySeconds: 20
          ports:
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
            - name: grpc
              containerPort: 8101
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75 -Dakka.persistence.r2dbc.connection-factory.ssl.enabled=true -Dakka.persistence.r2dbc.connection-factory.ssl.mode=require"
            - name: SHOPPING_CART_SERVICE_GRPC_HOST
              value: "shopping-cart-service-svc"
            - name: SHOPPING_CART_SERVICE_GRPC_PORT
              value: "8101"
            - name: DB_HOST
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_HOST
                  optional: true
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

Update the image in the `deployment.yml` with the specific image version and location you published.

Update the `SHOPPING_CART_SERVICE_GRPC_HOST` and `SHOPPING_CART_SERVICE_GRPC_PORT` in `deployment.yml` to correspond to the load balancer that you created, for example:

```
            - name: SHOPPING_CART_SERVICE_GRPC_HOST
              value: "k8s-shopping-shopping-b4157add0d-54780992c148fa88.elb.us-east-2.amazonaws.com"
            - name: SHOPPING_CART_SERVICE_GRPC_PORT
              value: "80"

```

Run the service:

```
kubectl apply -f kubernetes/debployment.yml

```

### Exercise the shopping\-analytics\-service

You can watch the logs of the `shopping-analytics-service` with

```
kubectl get pods
kubectl logs -f <pod name>

```

Add some more items to the cart or create more carts as described for the `shopping-cart-service`. In the logs of the `shopping-analytics-service` you should see entries such as:

```
Projection [cart-events-cart-768-1023] consumed ItemQuantityAdjusted for cart cart2, changed 3 socks. Total [8] events.

```

## Deploy replicated shopping\-cart\-service

This step is for deploying `replicated-shopping-cart-service`:

The complete sample can be downloaded:

- Scala: [replicated\-shopping\-scala.zip](../attachments/replicated-shopping-scala.zip)
- Java: [replicated\-shopping\-java.zip](../attachments/replicated-shopping-java.zip)

Now there will be connections in both directions, so install the [load balancer](4-deploying.html#load-balancer) in the other region too.

Create a Kubernetes `Secret` with the gRPC connection details for the load balancers:

Example for `us-east-2`:

```
kubectl create secret generic \
    replication-secret \
    --from-literal=SELF_REPLICA_ID=replica1 \
    --from-literal=REPLICA2_GRPC_HOST=k8s-shopping-shopping-19708e1324-24617530ddc6d2cb.elb.eu-central-1.amazonaws.com \
    --from-literal=REPLICA2_GRPC_PORT=80

```

Example for `eu-central-1`:

```
kubectl create secret generic \
replication-secret \
--from-literal=SELF_REPLICA_ID=replica2 \
--from-literal=REPLICA1_GRPC_HOST=k8s-shopping-shopping-b4157add0d-54780992c148fa88.elb.us-east-2.amazonaws.com \
--from-literal=REPLICA1_GRPC_PORT=80

```

This secret is referenced from configuration environment variables from the `deployment.yml`:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/kubernetes/deployment.yml "Go to snippet source")apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: shopping-cart-service
  name: shopping-cart-service
  namespace: shopping-cart-namespace
spec:
  replicas: 1
  selector:
    matchLabels:
      app: shopping-cart-service
  template:
    metadata:
      labels:
        app: shopping-cart-service
        actorSystemName: shopping-cart-service
    spec:
      containers:
        - name: shopping-cart-service
          # use specific image version from docker publish
          image: shopping-cart-service:latest
          # these will need to be increased tuned for production environments!
          resources:
            limits:
              memory: "2Gi"
            requests:
              memory: "2Gi"
              cpu: "1000m"
          readinessProbe:
            httpGet:
              path: /ready
              port: management
            periodSeconds: 10
            failureThreshold: 3
            initialDelaySeconds: 10
          livenessProbe:
            httpGet:
              path: "/alive"
              port: management
            periodSeconds: 10
            failureThreshold: 5
            initialDelaySeconds: 20
          ports:
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
            - name: grpc
              containerPort: 8101
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75 -Dakka.persistence.r2dbc.connection-factory.ssl.enabled=true -Dakka.persistence.r2dbc.connection-factory.ssl.mode=require"
            - name: SELF_REPLICA_ID
              valueFrom:
                secretKeyRef:
                  name: replication-secret
                  key: SELF_REPLICA_ID
            - name: REPLICA1_GRPC_HOST
              valueFrom:
                secretKeyRef:
                  name: replication-secret
                  key: REPLICA1_GRPC_HOST
                  optional: true
            - name: REPLICA1_GRPC_PORT
              valueFrom:
                secretKeyRef:
                  name: replication-secret
                  key: REPLICA1_GRPC_PORT
                  optional: true
            - name: REPLICA2_GRPC_HOST
              valueFrom:
                secretKeyRef:
                  name: replication-secret
                  key: REPLICA2_GRPC_HOST
                  optional: true
            - name: REPLICA2_GRPC_PORT
              valueFrom:
                secretKeyRef:
                  name: replication-secret
                  key: REPLICA2_GRPC_PORT
                  optional: true
            - name: DB_HOST
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_HOST
                  optional: true
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

Build the image in `replicated-shopping-cart-service` directory and deploy in the same way as described previously.

Scala

```
sbt -Ddocker.username=<username> -Ddocker.registry=docker.io docker:publish

```

Java

```
mvn -DskipTests -Ddocker.registry=<username> clean package docker:push

```

Update the `image:` in the `deployment.yml` with the specific image version and location you published.

```
kubectl apply -f kubernetes/debployment.yml

```

### Port forwards

Create a Kubernetes `Service` and port forward to simplify access to the pods from your local machine:

YAML

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/kubernetes/service.yml "Go to snippet source")apiVersion: v1
kind: Service
metadata:
  name: shopping-cart-service-svc
spec:
  selector:
    app: shopping-cart-service
  type: NodePort
  ports:
    - protocol: TCP
      port: 8101
      targetPort: 8101
```

```
kubectl apply -f kubernetes/service.yml

```

Start port forward with:

```
kubectl port-forward svc/shopping-cart-service-svc 8101:8101

```

Switch `kubectl` context to the other region and apply the `service.yml` and start the port forward on another port:

```
kubectl port-forward svc/shopping-cart-service-svc 8201:8101

```

### Exercise the replicated shopping\-cart\-service

Use [grpcurl](https://github.com/fullstorydev/grpcurl) to exercise the service.

Add 7 socks to a cart:

```
grpcurl -d '{"cartId":"cart2", "itemId":"socks", "quantity":7}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem

```

Add 3 t\-shirts to the same cart but in the other region (port 8201\):

```
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":3}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.AddItem

```

Retrieve the cart:

```
grpcurl -d '{"cartId":"cart2"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart
grpcurl -d '{"cartId":"cart2"}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.GetCart

```

## Code Examples

### Example 1: Setup Kubernetes cluster

```text
eksctl create cluster \
  --name eks-akka-us-east-2 \
  --version 1.24 \
  --region us-east-2 \
  --nodegroup-name linux-nodes \
  --node-type m5.xlarge \
  --nodes 3 \
  --nodes-min 1 \
  --nodes-max 4 \
  --with-oidc \
  --managed

eksctl create cluster \
  --name eks-akka-eu-central-1 \
  --version 1.24 \
  --region eu-central-1 \
  --nodegroup-name linux-nodes \
  --node-type m5.xlarge \
  --nodes 3 \
  --nodes-min 1 \
  --nodes-max 4 \
  --with-oidc \
  --managed
```

### Example 2: Namespace

```json
{
  "kind": "Namespace",
  "apiVersion": "v1",
  "metadata": {
    "name": "shopping-cart-namespace",
    "labels": {
      "name": "shopping-cart-namespace"
    }
  }
}
```

### Example 3: Namespace

```text
kubectl apply -f kubernetes/namespace.json
```

### Example 4: Namespace

```text
kubectl config set-context --current --namespace=shopping-cart-namespace
```

### Example 5: Role based access control

```yml
kind: Role
apiVersion: rbac.authorization.k8s.io/v1
metadata:
  name: pod-reader
  namespace: shopping-cart-namespace
rules:
  - apiGroups: [""] # "" indicates the core API group
    resources: ["pods"]
    verbs: ["get", "watch", "list"]
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
```

### Example 6: Role based access control

```text
kubectl apply -f kubernetes/rbac.yml
```

### Example 7: Database secret

```text
kubectl create secret generic \
    db-secret \
    --from-literal=DB_HOST=shopping-db-us-east-2.cgrtpi2lqrw8.us-east-2.rds.amazonaws.com \
    --from-literal=DB_USER=postgres \
    --from-literal=DB_PASSWORD=<the password>
```

### Example 8: Database schema

```text
kubectl run -i --tty db-mgmt --image=postgres --restart=Never --rm \
  --env=PGPASSWORD=<the password> -- \
  psql -h shopping-db-us-east-2.cgrtpi2lqrw8.us-east-2.rds.amazonaws.com -U postgres
```

### Example 9: Database schema

```sql
CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id, seq_nr)
);

CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice, entity_type, db_timestamp, seq_nr);

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id)
);

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);

-- Primitive offset types are stored in this table.
-- If only timestamp based offsets are used this table is optional.
-- Configure akka.projection.r2dbc.offset-store.offset-table="" if the table is not created.
CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(32) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

-- Timestamp based offsets are stored in this table.
CREATE TABLE IF NOT EXISTS akka_projection_timestamp_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  slice INT NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  -- timestamp_offset is the db_timestamp of the original event
  timestamp_offset timestamp with time zone NOT NULL,
  -- timestamp_consumed is when the offset was stored
  -- the consumer lag is timestamp_consumed - timestamp_offset
  timestamp_consumed timestamp with time zone NOT NULL,
  PRIMARY KEY(slice, projection_name, timestamp_offset, persistence_id, seq_nr)
);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

### Example 10: Deploy shopping-cart-service

```text
sbt -Ddocker.username=<username> -Ddocker.registry=docker.io docker:publish
```

### Example 11: Deploy shopping-cart-service

```text
mvn -DskipTests -Ddocker.registry=<username> clean package docker:push
```

### Example 12: Deploy shopping-cart-service

```yml
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: shopping-cart-service
  name: shopping-cart-service
  namespace: shopping-cart-namespace
spec:
  replicas: 1
  selector:
    matchLabels:
      app: shopping-cart-service
  template:
    metadata:
      labels:
        app: shopping-cart-service
        actorSystemName: shopping-cart-service
    spec:
      containers:
        - name: shopping-cart-service
          # use specific image version from docker publish
          image: shopping-cart-service:latest
          # these will need to be increased tuned for production environments!
          resources:
            limits:
              memory: "2Gi"
            requests:
              memory: "2Gi"
              cpu: "1000m"
          readinessProbe:
            httpGet:
              path: /ready
              port: management
            periodSeconds: 10
            failureThreshold: 3
            initialDelaySeconds: 10
          livenessProbe:
            httpGet:
              path: "/alive"
              port: management
            periodSeconds: 10
            failureThreshold: 5
            initialDelaySeconds: 20
          ports:
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
            - name: grpc
              containerPort: 8101
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75 -Dakka.persistence.r2dbc.connection-factory.ssl.enabled=true -Dakka.persistence.r2dbc.connection-factory.ssl.mode=require"
            - name: DB_HOST
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_HOST
                  optional: true
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

### Example 13: Deploy shopping-cart-service

```text
kubectl apply -f kubernetes/deployment.yml
```

### Example 14: Port forward

```yml
apiVersion: v1
kind: Service
metadata:
  name: shopping-cart-service-svc
spec:
  selector:
    app: shopping-cart-service
  type: NodePort
  ports:
    - protocol: TCP
      port: 8101
      targetPort: 8101
```

### Example 15: Port forward

```text
kubectl apply -f kubernetes/service.yml
```

### Example 16: Port forward

```text
kubectl port-forward svc/shopping-cart-service-svc 8101:8101
```

### Example 17: Exercise the shopping-cart-service

```text
grpcurl -d '{"cartId":"cart1", "itemId":"socks", "quantity":7}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 18: Exercise the shopping-cart-service

```text
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":3}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 19: Load balancer

```yml
# Network load balancer https://docs.aws.amazon.com/eks/latest/userguide/network-load-balancing.html
apiVersion: v1
kind: Service
metadata:
  name: shopping-cart-service-nlb
  annotations:
    service.beta.kubernetes.io/aws-load-balancer-type: external
    service.beta.kubernetes.io/aws-load-balancer-nlb-target-type: ip
    service.beta.kubernetes.io/aws-load-balancer-scheme: internet-facing
spec:
  selector:
    app: shopping-cart-service
  type: LoadBalancer
  ports:
    - protocol: TCP
      port: 80
      targetPort: 8101
```

### Example 20: Load balancer

```text
kubectl get services
```

### Example 21: Deploy shopping-analytics-service

```text
sbt -Ddocker.username=<username> -Ddocker.registry=docker.io docker:publish
```

### Example 22: Deploy shopping-analytics-service

```text
mvn -DskipTests -Ddocker.registry=<username> clean package docker:push
```

### Example 23: Deploy shopping-analytics-service

```yml
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: shopping-analytics-service
  name: shopping-analytics-service
  namespace: shopping-cart-namespace
spec:
  replicas: 1
  selector:
    matchLabels:
      app: shopping-analytics-service
  template:
    metadata:
      labels:
        app: shopping-analytics-service
        actorSystemName: shopping-analytics-service
    spec:
      containers:
        - name: shopping-analytics-service
          # use specific image version from docker publish
          image: shopping-analytics-service:latest
          # these will need to be increased tuned for production environments!
          resources:
            limits:
              memory: "2Gi"
            requests:
              memory: "2Gi"
              cpu: "1000m"
          readinessProbe:
            httpGet:
              path: /ready
              port: management
            periodSeconds: 10
            failureThreshold: 3
            initialDelaySeconds: 10
          livenessProbe:
            httpGet:
              path: "/alive"
              port: management
            periodSeconds: 10
            failureThreshold: 5
            initialDelaySeconds: 20
          ports:
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
            - name: grpc
              containerPort: 8101
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75 -Dakka.persistence.r2dbc.connection-factory.ssl.enabled=true -Dakka.persistence.r2dbc.connection-factory.ssl.mode=require"
            - name: SHOPPING_CART_SERVICE_GRPC_HOST
              value: "shopping-cart-service-svc"
            - name: SHOPPING_CART_SERVICE_GRPC_PORT
              value: "8101"
            - name: DB_HOST
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_HOST
                  optional: true
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

### Example 24: Deploy shopping-analytics-service

```text
- name: SHOPPING_CART_SERVICE_GRPC_HOST
              value: "k8s-shopping-shopping-b4157add0d-54780992c148fa88.elb.us-east-2.amazonaws.com"
            - name: SHOPPING_CART_SERVICE_GRPC_PORT
              value: "80"
```

### Example 25: Deploy shopping-analytics-service

```text
kubectl apply -f kubernetes/debployment.yml
```

### Example 26: Exercise the shopping-analytics-service

```text
kubectl get pods
kubectl logs -f <pod name>
```

### Example 27: Exercise the shopping-analytics-service

```text
Projection [cart-events-cart-768-1023] consumed ItemQuantityAdjusted for cart cart2, changed 3 socks. Total [8] events.
```

### Example 28: Deploy replicated shopping-cart-service

```text
kubectl create secret generic \
    replication-secret \
    --from-literal=SELF_REPLICA_ID=replica1 \
    --from-literal=REPLICA2_GRPC_HOST=k8s-shopping-shopping-19708e1324-24617530ddc6d2cb.elb.eu-central-1.amazonaws.com \
    --from-literal=REPLICA2_GRPC_PORT=80
```

### Example 29: Deploy replicated shopping-cart-service

```text
kubectl create secret generic \
replication-secret \
--from-literal=SELF_REPLICA_ID=replica2 \
--from-literal=REPLICA1_GRPC_HOST=k8s-shopping-shopping-b4157add0d-54780992c148fa88.elb.us-east-2.amazonaws.com \
--from-literal=REPLICA1_GRPC_PORT=80
```

### Example 30: Deploy replicated shopping-cart-service

```yml
apiVersion: apps/v1
kind: Deployment
metadata:
  labels:
    app: shopping-cart-service
  name: shopping-cart-service
  namespace: shopping-cart-namespace
spec:
  replicas: 1
  selector:
    matchLabels:
      app: shopping-cart-service
  template:
    metadata:
      labels:
        app: shopping-cart-service
        actorSystemName: shopping-cart-service
    spec:
      containers:
        - name: shopping-cart-service
          # use specific image version from docker publish
          image: shopping-cart-service:latest
          # these will need to be increased tuned for production environments!
          resources:
            limits:
              memory: "2Gi"
            requests:
              memory: "2Gi"
              cpu: "1000m"
          readinessProbe:
            httpGet:
              path: /ready
              port: management
            periodSeconds: 10
            failureThreshold: 3
            initialDelaySeconds: 10
          livenessProbe:
            httpGet:
              path: "/alive"
              port: management
            periodSeconds: 10
            failureThreshold: 5
            initialDelaySeconds: 20
          ports:
            # akka-management and bootstrap
            - name: management
              containerPort: 8558
              protocol: TCP
            - name: grpc
              containerPort: 8101
              protocol: TCP
          env:
            - name: NAMESPACE
              valueFrom:
                fieldRef:
                  fieldPath: metadata.namespace
            - name: REQUIRED_CONTACT_POINT_NR
              value: "1"
            - name: JAVA_TOOL_OPTIONS
              value: "-XX:InitialRAMPercentage=75 -XX:MaxRAMPercentage=75 -Dakka.persistence.r2dbc.connection-factory.ssl.enabled=true -Dakka.persistence.r2dbc.connection-factory.ssl.mode=require"
            - name: SELF_REPLICA_ID
              valueFrom:
                secretKeyRef:
                  name: replication-secret
                  key: SELF_REPLICA_ID
            - name: REPLICA1_GRPC_HOST
              valueFrom:
                secretKeyRef:
                  name: replication-secret
                  key: REPLICA1_GRPC_HOST
                  optional: true
            - name: REPLICA1_GRPC_PORT
              valueFrom:
                secretKeyRef:
                  name: replication-secret
                  key: REPLICA1_GRPC_PORT
                  optional: true
            - name: REPLICA2_GRPC_HOST
              valueFrom:
                secretKeyRef:
                  name: replication-secret
                  key: REPLICA2_GRPC_HOST
                  optional: true
            - name: REPLICA2_GRPC_PORT
              valueFrom:
                secretKeyRef:
                  name: replication-secret
                  key: REPLICA2_GRPC_PORT
                  optional: true
            - name: DB_HOST
              valueFrom:
                secretKeyRef:
                  name: db-secret
                  key: DB_HOST
                  optional: true
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

### Example 31: Deploy replicated shopping-cart-service

```text
sbt -Ddocker.username=<username> -Ddocker.registry=docker.io docker:publish
```

### Example 32: Deploy replicated shopping-cart-service

```text
mvn -DskipTests -Ddocker.registry=<username> clean package docker:push
```

### Example 33: Deploy replicated shopping-cart-service

```text
kubectl apply -f kubernetes/debployment.yml
```

### Example 34: Port forwards

```yml
apiVersion: v1
kind: Service
metadata:
  name: shopping-cart-service-svc
spec:
  selector:
    app: shopping-cart-service
  type: NodePort
  ports:
    - protocol: TCP
      port: 8101
      targetPort: 8101
```

### Example 35: Port forwards

```text
kubectl apply -f kubernetes/service.yml
```

### Example 36: Port forwards

```text
kubectl port-forward svc/shopping-cart-service-svc 8101:8101
```

### Example 37: Port forwards

```text
kubectl port-forward svc/shopping-cart-service-svc 8201:8101
```

### Example 38: Exercise the replicated shopping-cart-service

```text
grpcurl -d '{"cartId":"cart2", "itemId":"socks", "quantity":7}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.AddItem
```

### Example 39: Exercise the replicated shopping-cart-service

```text
grpcurl -d '{"cartId":"cart1", "itemId":"t-shirt", "quantity":3}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.AddItem
```

### Example 40: Exercise the replicated shopping-cart-service

```text
grpcurl -d '{"cartId":"cart2"}' -plaintext 127.0.0.1:8101 shoppingcart.ShoppingCartService.GetCart
grpcurl -d '{"cartId":"cart2"}' -plaintext 127.0.0.1:8201 shoppingcart.ShoppingCartService.GetCart
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-distributed-cluster/current/attachments/replicated-shopping-java.zip
- https://doc.akka.io/libraries/akka-distributed-cluster/current/attachments/replicated-shopping-scala.zip
- https://doc.akka.io/libraries/akka-distributed-cluster/current/attachments/shopping-java.zip
- https://doc.akka.io/libraries/akka-distributed-cluster/current/attachments/shopping-scala.zip
- https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/2-service-to-service.html
- https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/3-active-active.html
- https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/4-deploying.html
- https://doc.akka.io/libraries/akka-grpc/current/mtls.html

---
*Source: [https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/4-deploying.html](https://doc.akka.io/libraries/akka-distributed-cluster/current/guide/4-deploying.html)*