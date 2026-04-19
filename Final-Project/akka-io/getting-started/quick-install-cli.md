---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:05Z'
section: getting-started
site: akka-io
source_url: https://doc.akka.io/getting-started/quick-install-cli.html
title: 'Install the Akka CLI :: Akka Documentation'
---

# Install the Akka CLI :: Akka Documentation

## Content

# Install the Akka CLI

|  | In case there is any trouble with installing the CLI when following these instructions, please check the [detailed CLI installation instructions](../operations/cli/installation.html). |
| --- | --- |

Linux

Install the `akka` CLI using the Debian package repository:

```
curl -1sLf \
  'https://downloads.akka.io/setup.deb.sh' \
  | sudo -E bash
sudo apt install akka
```

macOS

The recommended approach to install `akka` on macOS, is using [brew](https://brew.sh)

```
brew install akka/brew/akka
```

Windows

Install the `akka` CLI using [winget](https://learn.microsoft.com/en-us/windows/package-manager/winget/):

```
winget install Akka.Cli
```

|  | By downloading and using this software you agree to Akka’s [Privacy Policy](https://akka.io/legal/privacy) and [Software Terms of Use](https://trust.akka.io/cloud-terms-of-service). |
| --- | --- |

Verify that the Akka CLI has been installed successfully by running the following to list all available commands:

```
akka help
```

## Code Examples

### Example 1: Install the Akka CLI

```bash
curl -1sLf \
  'https://downloads.akka.io/setup.deb.sh' \
  | sudo -E bash
sudo apt install akka
```

### Example 2: Install the Akka CLI

```bash
brew install akka/brew/akka
```

### Example 3: Install the Akka CLI

```powershell
winget install Akka.Cli
```

### Example 4: Install the Akka CLI

```command
akka help
```

## Related Pages (Internal Links)

- https://doc.akka.io/operations/cli/installation.html

---
*Source: [https://doc.akka.io/getting-started/quick-install-cli.html](https://doc.akka.io/getting-started/quick-install-cli.html)*