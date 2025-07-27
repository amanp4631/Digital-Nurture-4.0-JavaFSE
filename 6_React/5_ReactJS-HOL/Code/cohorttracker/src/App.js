import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      name: 'NIAID/DI/04 .NET FSD',
      startDate: '01-May-2025',
      endDate: '30-June-2025',
      status: 'Ongoing',
    },
    {
      name: 'ADH/141/014 Java FSD',
      startDate: '15-Apr-2025',
      endDate: '15-June-2025',
      status: 'Completed',
    },
    {
      name: 'CIB/072/045 Java FSD',
      startDate: '01-Mar-2025',
      endDate: '30-Apr-2025',
      status: 'Completed',
    },
  ];

  return (
    <div style={{ padding: '30px', fontFamily: 'Arial' }}>
      <h2 style={{ textAlign: 'center' }}>Cohorts Details</h2>
      <div style={{ display: 'flex', justifyContent: 'center', gap: '20px', flexWrap: 'wrap' }}>
        {cohorts.map((cohort, index) => (
          <CohortDetails key={index} cohort={cohort} />
        ))}
      </div>
    </div>
  );
}

export default App;