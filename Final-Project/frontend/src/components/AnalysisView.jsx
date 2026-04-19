import React from 'react';
import { motion, AnimatePresence } from 'framer-motion';
import { AlertTriangle, ArrowRight } from 'lucide-react';

const Row = ({ label, value, mono }) => (
  <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'baseline', padding: '5px 0', borderBottom: '1px solid var(--border)' }}>
    <span style={{ fontSize: 11, color: 'var(--text-3)', textTransform: 'uppercase', letterSpacing: '0.05em' }}>{label}</span>
    <span className={mono ? 'mono' : ''} style={{ fontSize: 12, color: 'var(--text-1)', fontWeight: 500 }}>{value}</span>
  </div>
);

const priorityLabel = (p) => p === 1 ? 'Critical' : p === 2 ? 'High' : 'Normal';
const priorityColor = (p) => p === 1 ? 'var(--red)' : p === 2 ? 'var(--amber)' : 'var(--text-2)';

const AnalysisView = ({ activeCase }) => {
  if (!activeCase) {
    return (
      <div style={{
        height: '100%', display: 'flex', flexDirection: 'column',
        alignItems: 'center', justifyContent: 'center', gap: 12,
        color: 'var(--text-3)',
      }}>
        <AlertTriangle size={28} style={{ opacity: 0.3 }} />
        <p style={{ fontSize: 12, textAlign: 'center', maxWidth: 200, lineHeight: 1.5 }}>
          Select an incident to view AI analysis
        </p>
      </div>
    );
  }

  const ev = activeCase.extractedEvent;
  const impact = activeCase.impactSummary;
  const mitigations = activeCase.mitigations || [];
  const confidence = ev ? Math.round((ev.confidence || 0) * 100) : null;

  return (
    <AnimatePresence mode="wait">
      <motion.div
        key={activeCase.caseId}
        initial={{ opacity: 0 }}
        animate={{ opacity: 1 }}
        exit={{ opacity: 0 }}
        transition={{ duration: 0.15 }}
        style={{ display: 'flex', flexDirection: 'column', gap: 20 }}
      >

        {/* Event details */}
        {ev && (
          <section>
            <p style={{ fontSize: 11, fontWeight: 600, color: 'var(--text-2)', textTransform: 'uppercase', letterSpacing: '0.07em', marginBottom: 8 }}>
              Detected Event
            </p>
            <div style={{ background: 'var(--surface-2)', borderRadius: 'var(--r)', border: '1px solid var(--border)', padding: '4px 12px' }}>
              <Row label="Type"     value={ev.eventType}   mono />
              <Row label="Entity"   value={ev.entityId}    mono />
              <Row label="Severity" value={ev.severity}    mono />
              {ev.durationHours > 0 && <Row label="Duration" value={`${ev.durationHours}h`} mono />}
              {confidence !== null && (
                <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', padding: '5px 0' }}>
                  <span style={{ fontSize: 11, color: 'var(--text-3)', textTransform: 'uppercase', letterSpacing: '0.05em' }}>Confidence</span>
                  <div style={{ display: 'flex', alignItems: 'center', gap: 8 }}>
                    <div style={{ width: 60, height: 3, background: 'var(--border)', borderRadius: 2, overflow: 'hidden' }}>
                      <motion.div
                        initial={{ width: 0 }}
                        animate={{ width: `${confidence}%` }}
                        transition={{ duration: 0.5 }}
                        style={{ height: '100%', background: 'var(--green)', borderRadius: 2 }}
                      />
                    </div>
                    <span className="mono" style={{ fontSize: 12, color: 'var(--text-1)', fontWeight: 500 }}>{confidence}%</span>
                  </div>
                </div>
              )}
            </div>

            {ev.reasoning && (
              <p style={{
                marginTop: 8, fontSize: 12, color: 'var(--text-2)',
                lineHeight: 1.6, fontStyle: 'italic',
                padding: '8px 12px', background: 'var(--surface)',
                borderRadius: 'var(--r)', border: '1px solid var(--border)',
              }}>
                "{ev.reasoning}"
              </p>
            )}
          </section>
        )}

        {/* Affected nodes */}
        {impact?.affectedEntities?.length > 0 && (
          <section>
            <p style={{ fontSize: 11, fontWeight: 600, color: 'var(--text-2)', textTransform: 'uppercase', letterSpacing: '0.07em', marginBottom: 8 }}>
              Impact — {impact.affectedEntities.length} node{impact.affectedEntities.length !== 1 ? 's' : ''}
              {impact.isPartial && <span style={{ color: 'var(--amber)', marginLeft: 6, fontWeight: 400 }}>(partial)</span>}
            </p>
            <div style={{ display: 'flex', flexWrap: 'wrap', gap: 5 }}>
              {impact.affectedEntities.map((e, i) => (
                <span key={i} className="mono" style={{
                  fontSize: 11, padding: '2px 8px', borderRadius: 'var(--r-sm)',
                  background: 'var(--surface-2)', border: '1px solid var(--border)',
                  color: 'var(--text-2)',
                }}>
                  {e.entityId}
                </span>
              ))}
            </div>
          </section>
        )}

        {/* Mitigations */}
        <section>
          <p style={{ fontSize: 11, fontWeight: 600, color: 'var(--text-2)', textTransform: 'uppercase', letterSpacing: '0.07em', marginBottom: 8 }}>
            Recovery Actions
          </p>

          {mitigations.length === 0 ? (
            <div style={{
              padding: '16px', textAlign: 'center', fontSize: 12,
              color: 'var(--text-3)', border: '1px dashed var(--border)',
              borderRadius: 'var(--r)',
            }}>
              No actions yet
            </div>
          ) : (
            <div style={{ display: 'flex', flexDirection: 'column', gap: 6 }}>
              {mitigations.map((action, i) => (
                <motion.div
                  key={i}
                  initial={{ opacity: 0, y: 4 }}
                  animate={{ opacity: 1, y: 0 }}
                  transition={{ delay: i * 0.05 }}
                  style={{
                    padding: '10px 12px',
                    background: 'var(--surface)',
                    border: '1px solid var(--border)',
                    borderRadius: 'var(--r)',
                  }}
                >
                  <div style={{ display: 'flex', alignItems: 'center', justifyContent: 'space-between', marginBottom: 5 }}>
                    <div style={{ display: 'flex', alignItems: 'center', gap: 6 }}>
                      <ArrowRight size={11} style={{ color: priorityColor(action.priority), flexShrink: 0 }} />
                      <span className="mono" style={{ fontSize: 11, fontWeight: 600, color: 'var(--text-1)', textTransform: 'uppercase' }}>
                        {action.actionType}
                      </span>
                    </div>
                    <div style={{ display: 'flex', alignItems: 'center', gap: 6 }}>
                      <span className="mono" style={{ fontSize: 10, color: 'var(--border-2)', border: '1px solid var(--border)', padding: '1px 5px', borderRadius: 3 }}>
                        {action.targetEntity}
                      </span>
                      <span style={{ fontSize: 10, color: priorityColor(action.priority) }}>
                        {priorityLabel(action.priority)}
                      </span>
                    </div>
                  </div>
                  <p style={{ fontSize: 12, color: 'var(--text-2)', lineHeight: 1.5 }}>
                    {action.description}
                  </p>
                </motion.div>
              ))}
            </div>
          )}
        </section>

      </motion.div>
    </AnimatePresence>
  );
};

export default AnalysisView;
