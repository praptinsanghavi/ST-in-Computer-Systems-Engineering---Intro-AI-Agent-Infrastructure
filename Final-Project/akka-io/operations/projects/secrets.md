---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:44Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/projects/secrets.html
title: 'Manage secrets :: Akka Documentation'
---

# Manage secrets :: Akka Documentation

## Content

# Manage secrets

Akka provides secret management for each project. Secrets are for passwords, login credentials, API keys, etc. You can provide secrets to your services through environment variables. When you display the service information, the content of the secrets will not display.

## Understanding Akka secrets structure

|  | Each Akka secret has a two\-level structure:   1. **Secret name** — The container for one or more key\-value pairs 2. **Key(s)** — One or more named values within the secret     When you reference a secret in an environment variable, you use the format: `SECRET_NAME/KEY_NAME`   This allows you to group related credentials together (e.g., a database secret with `username` and `password` keys) or use a simple single\-key pattern for individual values (e.g., an API key). |
| --- | --- |

## Quick start example

Here’s a common pattern for storing and using a single API key:

```
# 1. Create a secret with a single key-value pair
akka secret create generic openai-key --literal value=sk-abc123...

# 2. Deploy your service with the secret as an environment variable
akka service deploy my-service my-image:latest \
  --secret-env OPENAI_API_KEY=openai-key/value
```

In your service code, you can now access `OPENAI_API_KEY` as a regular environment variable. The mapping works like this:

```
Environment Variable Name: OPENAI_API_KEY
           ↓
Secret Name: openai-key
           ↓
Key Name: value
           ↓
Actual Value: sk-abc123... (the API key)
```

## Manage secrets in a project

### Adding secrets

To add secrets to your Akka project, you can use the Akka CLI.

|  | To mark your project as the target of subsequent commands, use the following command:     ``` akka config set project sample-project ``` |
| --- | --- |

When you create a secret, it contains:

- secret name
- contents (as key/value pairs)

#### Example 1: Single\-value secret (API key)

The most common pattern is to create a secret with a single key\-value pair:

```
akka secret create generic openai-key \ (1)
  --literal value=sk-abc123... (2)
```

| **1** | Secret name: `openai-key` |
| --- | --- |
| **2** | Single key\-value pair where the key is `value` and the value is your API key |

This pattern works well for API keys, tokens, or any single credential.

#### Example 2: Multi\-key secret (database credentials)

You can also group related credentials together in a single secret:

```
akka secret create generic db-secret \ (1)
  --literal username=admin \
  --literal password=my_passwd \
  --literal host=db.example.com (2)
```

| **1** | Secret name: `db-secret` |
| --- | --- |
| **2** | Multiple key\-value pairs for related database credentials |

You can also set a secret from a file, using the `--from-file` argument:

```
akka secret create generic tls-cert \
  --from-file cert=path/to/certificate.pem
```

### Updating secrets

CLI

Secrets can be updated using the `akka secret update` command, in the same way as the `akka secret create` command:

```
akka secret update generic db-secret \
  --literal username=new-username \
  --literal password=new-password
```

### Listing secrets

To list the secrets in your Akka project, you can use the Akka CLI or the Akka Console. For security purposes, they only show content keys. Neither the CLI nor the Console will show content values of a secret.

CLI

Use the `akka secret list` command:

```
akka secret list
```

The results should look something like:

```
NAME          TYPE      KEYS
db-secret     generic   username,password,host
openai-key    generic   value
```

Console

1. Sign in to your Akka account at: <https://console.akka.io>
2. Click the project for which you want to see the secrets.
3. Using the left pane or top navigation bar, click **Secrets** to open the Secrets page which lists the secrets.

### Display secret contents

To display secret contents for your Akka project, you can use the Akka CLI or the Akka Console. For security purposes, they only show content keys. Neither the CLI nor the Console will show content values of a secret.

CLI

Use the `akka secret get` command:

```
akka secret get <secret-name>
```

The results should look something like:

```
NAME: db-secret
KEYS:
   username
   password
   host
```

Console

1. Sign in to your Akka account at: <https://console.akka.io>
2. Click the project for which you want to see the secrets.
3. Using the left pane or top navigation bar, click **Secrets** to open the Secrets page which lists the secrets.
4. Click the secret you wish to review.

### Removing secrets

To remove the secret for your Akka project, you can use the Akka CLI.

CLI

`akka secret delete` command:

```
akka secret delete <secret-name>
```

## Using secrets in service deployments

To use secrets in your service, you reference them as environment variables. The format is always: `ENV_VAR_NAME=SECRET_NAME/KEY_NAME`

### Deploy with secrets using CLI

CLI

Use the `akka service deploy` command with the `--secret-env` parameter:

**Example 1: Single API key**

```
akka service deploy my-service my-image:latest \
  --secret-env OPENAI_API_KEY=openai-key/value (1)
```

| **1** | Maps environment variable `OPENAI_API_KEY` to the `value` key in the `openai-key` secret  **Example 2: Multiple database credentials**     ``` akka service deploy my-service my-image:latest \   --secret-env DB_USER=db-secret/username,DB_PASS=db-secret/password,DB_HOST=db-secret/host (2) ``` |
| --- | --- |
| **2** | Maps three environment variables to three different keys within the same `db-secret` |

### Deploy with secrets using a deploy file

You can also specify secrets in a deployment descriptor file:

```
secretEnv:
  - name: OPENAI_API_KEY
    secretName: openai-key
    secretKey: value
  - name: DB_USER
    secretName: db-secret
    secretKey: username
  - name: DB_PASS
    secretName: db-secret
    secretKey: password
  - name: DB_HOST
    secretName: db-secret
    secretKey: host
```

Then deploy with:

```
akka service apply -f deployment.yaml
```

## Display secrets as environment variables for a service

To view how secrets are configured as environment variables for a service, you can use the Akka CLI or the Akka Console.

CLI

`akka service get`:

```
akka service get <service-name>
```

The results should look something like:

```
Service:     <service-name>
Created:     24s
Description:
Status:      Running
Image:       <container-image-path>
Env variables:
        OPENAI_API_KEY=openai-key/value
        DB_USER=db-secret/username
        DB_PASS=db-secret/password
        DB_HOST=db-secret/host

Generation:  1
Store:       <store-name>
```

|  | The output shows the reference path (`secret-name/key-name`), not the actual secret values. This is for security purposes. |
| --- | --- |

Console

1. Sign in to your Akka account at: <https://console.akka.io>
2. Click the project to which your service belongs.
3. Click the service.
4. In the `Properties: <service-name>` panel, you should see the environment variables.

## Common patterns and best practices

### Single\-value secrets

For individual credentials like API keys or tokens, use the pattern:

```
akka secret create generic <secret-name> --literal value=<your-secret>
```

Then reference it as:

```
--secret-env ENV_VAR_NAME=<secret-name>/value
```

### Multi\-value secrets

For grouped credentials (e.g., database, OAuth), create a secret with multiple keys:

```
akka secret create generic oauth-creds \
  --literal client_id=abc123 \
  --literal client_secret=xyz789 \
  --literal tenant_id=def456
```

Then reference each key separately:

```
--secret-env OAUTH_CLIENT_ID=oauth-creds/client_id,OAUTH_CLIENT_SECRET=oauth-creds/client_secret,OAUTH_TENANT_ID=oauth-creds/tenant_id
```

### Why the two\-level structure?

The `SECRET_NAME/KEY_NAME` pattern provides flexibility:

- **Single credentials**: Use a simple `secret-name/value` pattern
- **Grouped credentials**: Store related values together (e.g., all database credentials in one secret)
- **Key rotation**: Update individual keys without changing the secret name or environment variable mapping

## See also

- [`akka secrets` commands](../../reference/cli/akka-cli/akka_secrets.html#_see_also)

## Code Examples

### Example 1: Quick start example

```command
# 1. Create a secret with a single key-value pair
akka secret create generic openai-key --literal value=sk-abc123...

# 2. Deploy your service with the secret as an environment variable
akka service deploy my-service my-image:latest \
  --secret-env OPENAI_API_KEY=openai-key/value
```

### Example 2: Adding secrets

```command
akka config set project sample-project
```

### Example 3: Example 1: Single-value secret (API key)

```command
akka secret create generic openai-key \ (1)
  --literal value=sk-abc123... (2)
```

### Example 4: Example 2: Multi-key secret (database credentials)

```command
akka secret create generic db-secret \ (1)
  --literal username=admin \
  --literal password=my_passwd \
  --literal host=db.example.com (2)
```

### Example 5: Example 2: Multi-key secret (database credentials)

```command
akka secret create generic tls-cert \
  --from-file cert=path/to/certificate.pem
```

### Example 6: Updating secrets

```command
akka secret update generic db-secret \
  --literal username=new-username \
  --literal password=new-password
```

### Example 7: Listing secrets

```command
akka secret list
```

### Example 8: Display secret contents

```command
akka secret get <secret-name>
```

### Example 9: Removing secrets

```command
akka secret delete <secret-name>
```

### Example 10: Deploy with secrets using CLI

```command
akka service deploy my-service my-image:latest \
  --secret-env OPENAI_API_KEY=openai-key/value (1)
```

### Example 11: Deploy with secrets using CLI

```command
akka service deploy my-service my-image:latest \
  --secret-env DB_USER=db-secret/username,DB_PASS=db-secret/password,DB_HOST=db-secret/host (2)
```

### Example 12: Deploy with secrets using a deploy file

```yaml
secretEnv:
  - name: OPENAI_API_KEY
    secretName: openai-key
    secretKey: value
  - name: DB_USER
    secretName: db-secret
    secretKey: username
  - name: DB_PASS
    secretName: db-secret
    secretKey: password
  - name: DB_HOST
    secretName: db-secret
    secretKey: host
```

### Example 13: Deploy with secrets using a deploy file

```command
akka service apply -f deployment.yaml
```

### Example 14: Display secrets as environment variables for a service

```command
akka service get <service-name>
```

### Example 15: Single-value secrets

```command
akka secret create generic <secret-name> --literal value=<your-secret>
```

### Example 16: Single-value secrets

```command
--secret-env ENV_VAR_NAME=<secret-name>/value
```

### Example 17: Multi-value secrets

```command
akka secret create generic oauth-creds \
  --literal client_id=abc123 \
  --literal client_secret=xyz789 \
  --literal tenant_id=def456
```

### Example 18: Multi-value secrets

```command
--secret-env OAUTH_CLIENT_ID=oauth-creds/client_id,OAUTH_CLIENT_SECRET=oauth-creds/client_secret,OAUTH_TENANT_ID=oauth-creds/tenant_id
```

## Related Pages (Internal Links)

- https://doc.akka.io/reference/cli/akka-cli/akka_secrets.html

---
*Source: [https://doc.akka.io/operations/projects/secrets.html](https://doc.akka.io/operations/projects/secrets.html)*