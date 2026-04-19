import React, { useState, useEffect } from 'react';
import { Activity, Send, Package } from 'lucide-react';
import NetworkMap from './components/NetworkMap';
import DisruptionFeed from './components/DisruptionFeed';
import AnalysisView from './components/AnalysisView';
import './index.css';

const API_BASE = '';

function App() {
  const [cases, setCases] = useState([]);
  const [activeCase, setActiveCase] = useState(null);
  const [inputText, setInputText] = useState('');
  const [isSubmitting, setIsSubmitting] = useState(false);
  const [submitError, setSubmitError] = useState(null);
  const [clusterStatus, setClusterStatus] = useState(null);

  useEffect(() => {
    fetch(`${API_BASE}/disruption`)
      .then(r => r.ok ? r.json() : [])
      .then(data => {
        if (data.length > 0) {
          setCases(data);
          setActiveCase(a => a ?? data[0]);
        }
      })
      .catch(() => {});
  }, []);

  useEffect(() => {
    const es = new EventSource(`${API_BASE}/disruption/stream`);
    es.onmessage = (e) => {
      try {
        const report = JSON.parse(e.data);
        setCases(prev => {
          if (prev.find(c => c.caseId === report.caseId)) return prev;
          return [report, ...prev];
        });
        setActiveCase(report);
      } catch (_) {}
    };
    return () => es.close();
  }, []);

  useEffect(() => {
    const fetchCluster = () => {
      fetch(`${API_BASE}/cluster/status`)
        .then(r => r.ok ? r.json() : null)
        .then(d => d && setClusterStatus(d))
        .catch(() => {});
    };
    fetchCluster();
    const id = setInterval(fetchCluster, 15000);
    return () => clearInterval(id);
  }, []);

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (!inputText.trim() || isSubmitting) return;
    setIsSubmitting(true);
    setSubmitError(null);
    try {
      const response = await fetch(`${API_BASE}/disruption`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ reportText: inputText }),
      });
      if (response.ok) {
        const report = await response.json();
        setCases(prev => prev.find(c => c.caseId === report.caseId) ? prev : [report, ...prev]);
        setActiveCase(report);
        setInputText('');
      } else {
        const err = await response.json().catch(() => ({}));
        setSubmitError(err.error || `Error ${response.status}`);
      }
    } catch {
      setSubmitError('Backend unreachable');
    } finally {
      setIsSubmitting(false);
    }
  };

  const affectedEntityIds = [...new Set([
    ...(activeCase?.impactSummary?.affectedEntities.map(e => e.entityId) || []),
    ...(activeCase?.extractedEvent?.entityId ? [activeCase.extractedEvent.entityId] : []),
  ])];

  return (
    <div style={{ display: 'flex', flexDirection: 'column', height: '100%', width: '100%', background: 'var(--bg)' }}>

      {/* ── HEADER ──────────────────────────────────────────────── */}
      <header style={{
        display: 'flex', alignItems: 'center', gap: 16,
        padding: '0 20px', height: 52,
        borderBottom: '1px solid var(--border)',
        background: 'var(--bg)',
        flexShrink: 0,
      }}>
        {/* Logo */}
        <div style={{ display: 'flex', alignItems: 'center', gap: 10, flexShrink: 0 }}>
          <div style={{
            width: 28, height: 28, borderRadius: 7,
            background: 'var(--green)',
            display: 'flex', alignItems: 'center', justifyContent: 'center',
          }}>
            <Package size={15} color="#000" />
          </div>
          <span style={{ fontWeight: 600, fontSize: 14, letterSpacing: '-0.02em', color: 'var(--text-1)' }}>
            Supply Chain AI
          </span>
        </div>

        {/* Cluster pill */}
        {clusterStatus && (
          <div style={{
            display: 'flex', alignItems: 'center', gap: 6,
            padding: '3px 10px', borderRadius: 99,
            background: 'var(--surface-2)', border: '1px solid var(--border)',
          }}>
            <div style={{
              width: 6, height: 6, borderRadius: '50%', background: 'var(--green)',
              boxShadow: '0 0 0 2px var(--green-bg)',
            }} />
            <span className="mono" style={{ fontSize: 11, color: 'var(--text-2)' }}>
              {clusterStatus.nodeCount} node{clusterStatus.nodeCount !== 1 ? 's' : ''}
            </span>
          </div>
        )}

        {/* Spacer */}
        <div style={{ flex: 1 }} />

        {/* Submit form */}
        <div style={{ position: 'relative', width: 480 }}>
          <form onSubmit={handleSubmit} style={{ position: 'relative' }}>
            <input
              type="text"
              value={isSubmitting ? 'Processing...' : inputText}
              onChange={e => { setInputText(e.target.value); setSubmitError(null); }}
              placeholder="Describe a supply chain disruption..."
              className="disruption-input"
              disabled={isSubmitting}
            />
            <button
              type="submit"
              disabled={isSubmitting || !inputText.trim()}
              style={{
                position: 'absolute', right: 10, top: '50%', transform: 'translateY(-50%)',
                background: 'none', border: 'none', cursor: 'pointer', padding: 4,
                color: isSubmitting || !inputText.trim() ? 'var(--text-3)' : 'var(--text-2)',
                display: 'flex', alignItems: 'center', transition: 'color 0.15s',
              }}
            >
              <Send size={13} />
            </button>
          </form>
          {submitError && (
            <div style={{
              position: 'absolute', top: '100%', marginTop: 4, width: '100%', zIndex: 20,
              fontSize: 12, color: 'var(--red)',
              background: 'var(--red-bg)', border: '1px solid var(--red-border)',
              borderRadius: 6, padding: '5px 10px',
            }}>
              {submitError}
            </div>
          )}
        </div>

        <div style={{ flexShrink: 0 }}>
          <span className="mono" style={{ fontSize: 11, color: 'var(--text-3)' }}>
            {cases.length} incident{cases.length !== 1 ? 's' : ''}
          </span>
        </div>
      </header>

      {/* ── BODY ────────────────────────────────────────────────── */}
      <div style={{ display: 'flex', flex: 1, overflow: 'hidden' }}>

        {/* Left: Incident feed */}
        <aside style={{
          width: 280, flexShrink: 0,
          borderRight: '1px solid var(--border)',
          display: 'flex', flexDirection: 'column', overflow: 'hidden',
        }}>
          <div style={{
            padding: '0 16px', height: 44,
            display: 'flex', alignItems: 'center', justifyContent: 'space-between',
            borderBottom: '1px solid var(--border)', flexShrink: 0,
          }}>
            <span className="section-label">Incidents</span>
            {cases.length > 0 && (
              <span className="mono" style={{ fontSize: 11, color: 'var(--text-3)' }}>{cases.length}</span>
            )}
          </div>
          <div style={{ flex: 1, overflowY: 'auto', padding: 8 }}>
            <DisruptionFeed cases={cases} onSelectCase={setActiveCase} activeCaseId={activeCase?.caseId} />
          </div>
        </aside>

        {/* Center: Network map */}
        <main style={{ flex: 1, display: 'flex', flexDirection: 'column', overflow: 'hidden' }}>
          <div style={{
            padding: '0 20px', height: 44,
            display: 'flex', alignItems: 'center', justifyContent: 'space-between',
            borderBottom: '1px solid var(--border)', flexShrink: 0,
          }}>
            <span className="section-label">Network Topology</span>
            <div style={{ display: 'flex', alignItems: 'center', gap: 16 }}>
              {[
                { color: 'var(--blue)',   label: 'Supplier' },
                { color: 'var(--purple)', label: 'Warehouse' },
                { color: 'var(--amber)',  label: 'Truck' },
                { color: 'var(--green)',  label: 'Store' },
              ].map(({ color, label }) => (
                <div key={label} style={{ display: 'flex', alignItems: 'center', gap: 5 }}>
                  <div style={{ width: 7, height: 7, borderRadius: '50%', background: color, opacity: 0.8 }} />
                  <span style={{ fontSize: 11, color: 'var(--text-2)' }}>{label}</span>
                </div>
              ))}
            </div>
          </div>
          <div style={{ flex: 1, overflow: 'hidden' }}>
            <NetworkMap affectedNodes={affectedEntityIds} />
          </div>
        </main>

        {/* Right: Analysis */}
        <aside style={{
          width: 360, flexShrink: 0,
          borderLeft: '1px solid var(--border)',
          display: 'flex', flexDirection: 'column', overflow: 'hidden',
        }}>
          <div style={{
            padding: '0 16px', height: 44,
            display: 'flex', alignItems: 'center', justifyContent: 'space-between',
            borderBottom: '1px solid var(--border)', flexShrink: 0,
          }}>
            <span className="section-label">Analysis</span>
            {activeCase && (
              <span className="mono" style={{ fontSize: 10, color: 'var(--text-3)' }}>
                {activeCase.caseId}
              </span>
            )}
          </div>
          <div style={{ flex: 1, overflowY: 'auto', padding: 16 }}>
            <AnalysisView activeCase={activeCase} />
          </div>
        </aside>

      </div>
    </div>
  );
}

export default App;
