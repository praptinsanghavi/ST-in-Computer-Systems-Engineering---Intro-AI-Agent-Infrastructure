---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:29:03Z'
section: operations
site: akka-io
source_url: https://doc.akka.io/operations/integrating-cicd/github-actions.html
title: 'CI/CD with GitHub Actions :: Akka Documentation'
---

# CI/CD with GitHub Actions :: Akka Documentation

## Content

# CI/CD with GitHub Actions

Use the Akka [setup\-akka\-cli\-action](https://github.com/akka/setup-akka-cli-action) GitHub Action to use GitHub Actions with your Akka project. The action supports commands for installing, authenticating, and invoking the Akka CLI. Releases are tracked [on the GitHub releases page](https://github.com/lightbend/setup-akka-action/releases).

## Prerequisites

To use the Akka GitHub Action, you’ll need to:

- Create a [service token](index.html#create_a_service_token) for your project
- Get the UUID of your project, which can be obtained by running `akka projects list`

## Configure variables

The GitHub Action uses two required variables to authenticate and set the project you want to work on correctly:

- `AKKA_TOKEN`: The Akka service token
- `AKKA_PROJECT_ID`: The project ID for the Akka project you’re using

These variables should be configured as [secrets](https://docs.github.com/en/actions/reference/encrypted-secrets#creating-encrypted-secrets-for-a-repository) for your repository.

## Create a workflow

Follow these steps to create a workflow to invoke the GitHub Action for your project:

1. Create a folder named `.github` at the root of the project folder.
2. Create a file named `config.yml` in the `.github` folder.
3. Open `config.yml` for editing and add:

```
name: akka

on:
  push:
    branches: [ main ]

jobs:
  deploy:
    runs-on: ubuntu-latest
    steps:
      - name: Install Akka CLI
        uses: akka/setup-akka-cli-action@v1
        with:
          token: ${{ secrets.AKKA_TOKEN }} (1)
          project-id: ${{ secrets.AKKA_PROJECT_ID }} (2)
      - name: List services (3)
        run: akka service list (4)
```

| **1** | The Akka authentication token. |
| --- | --- |
| **2** | The UUID of the project to which the service belongs. |
| **3** | A unique name for this workflow step. The example lists Akka services. |
| **4** | The command to execute. |

## Code Examples

### Example 1: Create a workflow

```yaml
name: akka

on:
  push:
    branches: [ main ]

jobs:
  deploy:
    runs-on: ubuntu-latest
    steps:
      - name: Install Akka CLI
        uses: akka/setup-akka-cli-action@v1
        with:
          token: ${{ secrets.AKKA_TOKEN }} (1)
          project-id: ${{ secrets.AKKA_PROJECT_ID }} (2)
      - name: List services (3)
        run: akka service list (4)
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/integrating-cicd/index.html

---
*Source: [https://doc.akka.io/operations/integrating-cicd/github-actions.html](https://doc.akka.io/operations/integrating-cicd/github-actions.html)*