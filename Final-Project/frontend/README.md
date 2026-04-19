# Supply Chain Dashboard — Frontend

React 18 + Vite dashboard for the Supply Chain Disruption Management System.

## Stack

| Package | Role |
|---|---|
| React 18 | UI framework |
| Vite | Dev server + bundler |
| Lucide React | Icons (`Package`, `Activity`, `Send`) |

## Running

```bash
npm install      # first time only
npm run dev      # http://localhost:5173
```

The backend must be running on `http://localhost:8080` (see root README).

## Components

| File | Purpose |
|---|---|
| `src/App.jsx` | Root layout, SSE client (`EventSource`), POST handler, state management |
| `src/components/NetworkMap.jsx` | SVG supply chain topology — nodes highlight on disruption |
| `src/components/DisruptionFeed.jsx` | Left sidebar incident list |
| `src/components/AnalysisView.jsx` | Right panel — extracted event, impact summary, mitigation actions |

## SSE Connection

`App.jsx` opens a persistent `EventSource` to `GET /disruption/stream`. Each `data:` event is a complete `DisruptionReport` JSON object pushed by the backend `BroadcastHub`. New incidents appear in the feed in real time without polling.
