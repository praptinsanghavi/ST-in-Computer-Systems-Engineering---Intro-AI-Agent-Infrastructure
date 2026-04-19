---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:21Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/integrating-cicd/index.html
title: 'Integrating with CI/CD tools :: Akka Documentation'
---

# Integrating with CI/CD tools :: Akka Documentation

## Content

# Integrating with CI/CD tools

Akka development projects can be integrated into a Continuous Integration/Continuous Delivery (CI/CD) process using the Akka CLI. To use the Akka CLI in your CI/CD workflow, you’ll need a service token. A service token is a token tied to a single project, that allows authenticating and performing actions on that project. Service tokens have the following permissions on the project they are created for:

| View project | ✅ |
| --- | --- |
| Admin project | ❌ |
| View/deploy/update services | ✅ |
| Delete services | ❌ |
| Manage routes | ✅ |
| Manage secrets | ✅ |
| Backoffice functions | ❌ |

## Create a service token

You will need an Akka authentication token to set up any CI/CD process. To create the service token, run the command below:

```
akka project token create --description "My CI/CD system"
```

The description can be anything, but you should choose a description that will allow you to easily identify that token and what its purpose is.

The output will look similar to:

```
Token created: cst4.48dcc76ecd5f8a7786267714875c7037395f46aa4206bae1712d89fff37ad123
```

Copy and paste the token to a safe location. You will not be able to view the token again.

A token may be restricted to certain scopes with the `--scopes` flag. The available scopes are `all`, `container_registry`, `execution`, and `projects`.

## Configure `akka` in a CI/CD process

The basic steps to configure the Akka CLI to run in your CI/CD environment are:

- Configure the `AKKA_TOKEN` and `AKKA_PROJECT` environment variables in your CI/CD environment.
- Install the Akka CLI

The mechanism for configuring the environment variables will be specific to your CI/CD environment. Most cloud based CI/CD services have a mechanism for configuring secrets which get passed by environment variable.

To install the Akka CLI in your CI/CD environment, configure the environment to run the following command using `curl`:

```
curl -sL https://doc.akka.io/install-cli.sh | bash
```

## Managing service tokens

You can view a list of all the service tokens for a project using the `akka project tokens list` command:

```
$ akka project tokens list
ID                                     DESCRIPTION   SCOPES   CREATED
308147ea-9b04-47e4-a308-dc2b4aab0c7d   My token      [all]    1h0m
```

To revoke a token, use the `akka project token revoke` command, passing the ID of the token you want to revoke:

```
$ akka project token revoke 308147ea-9b04-47e4-a308-dc2b4aab0c7d
Token revoked
```

## Code Examples

### Example 1: Create a service token

```command
akka project token create --description "My CI/CD system"
```

### Example 2: Configureakkain a CI/CD process

```command
curl -sL https://doc.akka.io/install-cli.sh | bash
```

### Example 3: Managing service tokens

```command
$ akka project tokens list
ID                                     DESCRIPTION   SCOPES   CREATED
308147ea-9b04-47e4-a308-dc2b4aab0c7d   My token      [all]    1h0m
```

### Example 4: Managing service tokens

```command
$ akka project token revoke 308147ea-9b04-47e4-a308-dc2b4aab0c7d
Token revoked
```

---
*Source: [https://doc.akka.io/operations/integrating-cicd/index.html](https://doc.akka.io/operations/integrating-cicd/index.html)*