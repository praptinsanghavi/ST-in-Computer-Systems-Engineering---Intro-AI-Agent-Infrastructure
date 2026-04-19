import React from 'react';
import { motion } from 'framer-motion';

const NODES = [
  { id: 'S1', type: 'SUPPLIER',   x: 80,  y: 140 },
  { id: 'S2', type: 'SUPPLIER',   x: 80,  y: 290 },
  { id: 'S3', type: 'SUPPLIER',   x: 80,  y: 440 },

  { id: 'T1', type: 'TRUCK',      x: 230, y: 100 },
  { id: 'T2', type: 'TRUCK',      x: 230, y: 200 },
  { id: 'T3', type: 'TRUCK',      x: 230, y: 350 },
  { id: 'T4', type: 'TRUCK',      x: 230, y: 450 },

  { id: 'W1', type: 'WAREHOUSE',  x: 420, y: 200 },
  { id: 'W2', type: 'WAREHOUSE',  x: 420, y: 390 },

  { id: 'ST1', type: 'STORE',     x: 640, y: 95  },
  { id: 'ST2', type: 'STORE',     x: 640, y: 170 },
  { id: 'ST3', type: 'STORE',     x: 640, y: 245 },
  { id: 'ST4', type: 'STORE',     x: 640, y: 320 },
  { id: 'ST5', type: 'STORE',     x: 640, y: 395 },
  { id: 'ST6', type: 'STORE',     x: 640, y: 470 },
];

const EDGES = [
  { from: 'S1', to: 'W1' }, { from: 'S3', to: 'W1' },
  { from: 'S2', to: 'W2' }, { from: 'S3', to: 'W2' },
  { from: 'T1', to: 'W1' }, { from: 'T2', to: 'W1' },
  { from: 'T3', to: 'W2' }, { from: 'T4', to: 'W2' },
  { from: 'W1', to: 'ST1' }, { from: 'W1', to: 'ST2' }, { from: 'W1', to: 'ST3' },
  { from: 'W2', to: 'ST4' }, { from: 'W2', to: 'ST5' }, { from: 'W2', to: 'ST6' },
];

const NODE_COLORS = {
  SUPPLIER:  '#60a5fa',
  WAREHOUSE: '#a78bfa',
  TRUCK:     '#fbbf24',
  STORE:     '#22c55e',
};

const getCoords = (id) => NODES.find(n => n.id === id) || { x: 0, y: 0 };

const NetworkMap = ({ affectedNodes = [] }) => (
  <div style={{ width: '100%', height: '100%', overflow: 'hidden' }}>
    <svg
      style={{ width: '100%', height: '100%' }}
      viewBox="0 0 760 580"
      preserveAspectRatio="xMidYMid meet"
    >
      <defs>
        {/* Subtle glow for affected nodes only */}
        <filter id="affected-glow" x="-50%" y="-50%" width="200%" height="200%">
          <feGaussianBlur stdDeviation="4" result="blur" />
          <feMerge><feMergeNode in="blur" /><feMergeNode in="SourceGraphic" /></feMerge>
        </filter>
      </defs>

      {/* Edges */}
      {EDGES.map((edge, i) => {
        const s = getCoords(edge.from);
        const e = getCoords(edge.to);
        const affected = affectedNodes.includes(edge.from) || affectedNodes.includes(edge.to);
        return (
          <motion.line
            key={i}
            x1={s.x} y1={s.y} x2={e.x} y2={e.y}
            stroke={affected ? 'rgba(248,113,113,0.5)' : 'rgba(255,255,255,0.06)'}
            strokeWidth={affected ? 1.5 : 1}
            initial={{ opacity: 0 }}
            animate={{ opacity: 1 }}
            transition={{ duration: 0.6, delay: i * 0.03 }}
          />
        );
      })}

      {/* Nodes */}
      {NODES.map((node, i) => {
        const affected = affectedNodes.includes(node.id);
        const color = affected ? '#f87171' : NODE_COLORS[node.type];
        const r = node.type === 'WAREHOUSE' ? 10 : 7;

        return (
          <motion.g
            key={node.id}
            initial={{ opacity: 0, scale: 0.5 }}
            animate={{ opacity: 1, scale: 1 }}
            transition={{ duration: 0.3, delay: 0.1 + i * 0.03 }}
            style={{ filter: affected ? 'url(#affected-glow)' : 'none' }}
          >
            {/* Pulse ring on affected nodes */}
            {affected && (
              <motion.circle
                cx={node.x} cy={node.y} r={r + 6}
                fill="none"
                stroke={color}
                strokeWidth={1}
                animate={{ r: [r + 4, r + 12], opacity: [0.5, 0] }}
                transition={{ duration: 2, repeat: Infinity }}
              />
            )}

            {/* Node body */}
            <circle
              cx={node.x} cy={node.y} r={r}
              fill={affected ? 'rgba(248,113,113,0.15)' : 'rgba(0,0,0,0.4)'}
              stroke={color}
              strokeWidth={1.5}
            />

            {/* Label */}
            <text
              x={node.x} y={node.y + r + 13}
              textAnchor="middle"
              style={{
                fill: affected ? '#f87171' : 'rgba(255,255,255,0.3)',
                fontSize: 9,
                fontFamily: "'JetBrains Mono', monospace",
                fontWeight: 500,
                letterSpacing: '0.05em',
              }}
            >
              {node.id}
            </text>
          </motion.g>
        );
      })}
    </svg>
  </div>
);

export default NetworkMap;
